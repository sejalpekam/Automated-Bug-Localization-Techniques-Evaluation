import json
import logging
import subprocess
import os
from enum import Enum
from pathlib import Path
import shutil
import tarfile

failed_bug = []

# ----  Set up logging ----
logging.basicConfig(level=logging.DEBUG)
logger = logging.getLogger(__name__)


def run_test(version_path, zippath, bname, output_dir, vname):
    command = ["defects4j", 'coverage', '-w', version_path, '-s', zippath]
    print("\n")
    print("command: ", command)
    try:
        result = subprocess.run(command, check=True, cwd=output_dir, capture_output=True)
        print(result.stdout)
        move_or_copy_file(os.path.join(version_path, 'coverage.xml'), os.path.join(output_dir, f"{vname}.xml"))
        move_or_copy_file(os.path.join(version_path, 'summary.csv'), os.path.join(output_dir, f"{vname}_summary.csv"))
    except subprocess.CalledProcessError as e:
        logger.error(f"Failed to run coverage {e.output}")
        failed_bug.append(bname)


def create_coverage_dirs(output_dir):
    coverage_types = ["Buggy-version-Randoop", "Buggy-version-Evosuite",
                      "Patched-version-Randoop", "Patched-version-Evosuite", "Buggy-version-All", "Patched-version-All"]
    for coverage_type in coverage_types:
        os.makedirs(os.path.join(output_dir, coverage_type), exist_ok=True)


def run_coverage_all(version_path, bname, output_dir, vname):
    command1 = ["defects4j", 'coverage', '-w', version_path, '-r']
    print("\n")
    try:
        result = subprocess.run(command1, check=True, cwd=version_path, capture_output=True)
        print("ran command1: ", command1)
        print(result.stdout)
        move_or_copy_file(os.path.join(version_path, 'coverage.xml'), os.path.join(output_dir, f"{vname}.xml"))
        move_or_copy_file(os.path.join(version_path, 'summary.csv'), os.path.join(output_dir, f"{vname}_summary.csv"))
    except subprocess.CalledProcessError as e:
        logger.error(f"Failed to run all coverage  {e}")
        failed_bug.append(bname)


def getname(root_dir, pname):
    project_name, id = pname.split("_")
    source_dir = os.path.join(root_dir, "evosuite-tests")
    
    if "Buggy-Version" in str(root_dir):
        project_id = id + "b"
    else:
        project_id = id + "f"
    
    dest_filename = f"{project_name}-{project_id}-evosuite.1.tar.bz2"
    dest_path = os.path.join(source_dir, dest_filename)

    return dest_path


def copy_files_to_coverage(source_paths, destination_folder):
    for source_path in source_paths:
        shutil.copy(source_path, destination_folder)


def move_or_copy_file(source, destination):
    try:
        if os.path.exists(source):
            shutil.move(source, destination)
        else:
            logger.warning(f"The file {source} does not exist.")
    except Exception as e:
        logger.error(f"Failed to move or copy file: {e}")


if __name__ == '__main__':
    # Root path for the dataset
    dataset_path = Path("/Users/shrushtijagtap/uiuc/Spring2024/CS527/project_git/CS527-Project/Defects4J")
    version = ["Buggy-Version", "Patched-Version"]
    dpath = str(dataset_path)

    for bug in dataset_path.iterdir():
        print("*******************", bug.name, "***********************")

        if not bug.is_dir() or bug.name == "results" or bug.name == "Math_3":
            print("skipping")
            continue

        version_path_buggy = dpath + "/" + bug.name + "/" + version[0]
        version_path_fixed = dpath + "/" + bug.name + "/" + version[1]

        op_dir = dpath + "/" + bug.name + "/Coverage"
        create_coverage_dirs(op_dir)

        evo_tar_buggy = getname(version_path_buggy, bug.name)
        evo_tar_fixed = getname(version_path_fixed, bug.name)
        rp_tar_buggy = evo_tar_buggy.replace("evosuite", "randoop")
        rp_tar_fixed = evo_tar_fixed.replace("evosuite", "randoop")

        generated_files = []
        if os.path.exists(evo_tar_buggy):
            run_test(version_path_buggy, evo_tar_buggy, bug.name, os.path.join(op_dir, "Buggy-version-Evosuite"),
                     "Buggy-version-Evosuite")
            generated_files.append(evo_tar_buggy)
        if os.path.exists(rp_tar_buggy):
            run_test(version_path_buggy, rp_tar_buggy, bug.name, os.path.join(op_dir, "Buggy-version-Randoop"),
                     "Buggy-version-Randoop")
            generated_files.append(rp_tar_buggy)
        if os.path.exists(evo_tar_fixed):
            run_test(version_path_fixed, evo_tar_fixed, bug.name, os.path.join(op_dir, "Patched-version-Evosuite"),
                     "Patched-version-Evosuite")
            generated_files.append(evo_tar_fixed)
        if os.path.exists(rp_tar_fixed):
            run_test(version_path_fixed, rp_tar_fixed, bug.name, os.path.join(op_dir, "Patched-version-Randoop"),
                     "Patched-version-Randoop")
            generated_files.append(rp_tar_fixed)

        run_coverage_all(version_path_buggy, bug.name, os.path.join(op_dir, "Buggy-version-All"), "Buggy-version-All")
        run_coverage_all(version_path_fixed, bug.name, os.path.join(op_dir, "Patched-version-All"), "Patched-version-All")

        print("\n")

        copy_files_to_coverage(generated_files, op_dir)


    print("Failed bugs: ", failed_bug)