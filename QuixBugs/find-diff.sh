#!/bin/bash

# Define QuixBugs directory
quixbugs_dir="/Users/sejalpekam/MCS/Spring 24/CS 527 Topics in SE/QuixBugs Test/QuixBugs"

# Function to generate diff file
generate_diff() {
    local buggy_file="$1"
    local fixed_file="$2"
    local diff_file="$3"
    
    # diff --color -ur "$buggy_file" "$fixed_file" > "$diff_file"
    git diff --no-index "$buggy_file" "$fixed_file" --output "$diff_file"
}

# Loop through each program directory in QuixBugs directory
for program_dir in "$quixbugs_dir"/*/; do
    if [ -d "$program_dir" ]; then
        program_name_upper=$(basename "$program_dir")
        program_name=$(echo "$program_name_upper" | tr '[:upper:]' '[:lower:]')
        buggy_file="$program_name/Buggy-Version/java_programs/$program_name.java"
        fixed_file="$program_name/Patched-Version/correct_java_programs/$program_name.java"
        
        # Check if both buggy and fixed files exist
        if [ -f "$buggy_file" ] && [ -f "$fixed_file" ]; then
            # Generate diff file
            diff_file="$program_dir/Diff"
            generate_diff "$buggy_file" "$fixed_file" "$diff_file"
        else
            echo "Error: Buggy or fixed file missing for program $program_name"
        fi
    fi
done
