/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 15:42:02 GMT 2024
 */

package org.apache.commons.compress.changes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.changes.ChangeSet;
import org.apache.commons.compress.changes.ChangeSetPerformer;
import org.apache.commons.compress.changes.ChangeSetResults;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EvosuiteChangeSetPerformer_ESTest extends EvosuiteChangeSetPerformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChangeSet changeSet0 = new ChangeSet();
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)80;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)80);
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
      ChangeSetPerformer changeSetPerformer0 = new ChangeSetPerformer(changeSet0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(byteArrayOutputStream0);
      ChangeSetResults changeSetResults0 = changeSetPerformer0.perform(tarArchiveInputStream0, tarArchiveOutputStream0);
      assertNotNull(changeSetResults0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ChangeSet changeSet0 = new ChangeSet();
      byte[] byteArray0 = new byte[19];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 234);
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("");
      changeSet0.add((ArchiveEntry) jarArchiveEntry0, (InputStream) tarArchiveInputStream0, false);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(byteArrayOutputStream0);
      ChangeSetPerformer changeSetPerformer0 = new ChangeSetPerformer(changeSet0);
      // Undeclared exception!
      try { 
        changeSetPerformer0.perform(tarArchiveInputStream0, tarArchiveOutputStream0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ChangeSet changeSet0 = new ChangeSet();
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-513), 2147483645);
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("");
      changeSet0.add((ArchiveEntry) jarArchiveEntry0, (InputStream) tarArchiveInputStream0, true);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(byteArrayOutputStream0);
      ChangeSetPerformer changeSetPerformer0 = new ChangeSetPerformer(changeSet0);
      // Undeclared exception!
      try { 
        changeSetPerformer0.perform(tarArchiveInputStream0, tarArchiveOutputStream0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ChangeSet changeSet0 = new ChangeSet();
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)80;
      changeSet0.deleteDir("");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)80);
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
      ChangeSetPerformer changeSetPerformer0 = new ChangeSetPerformer(changeSet0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(byteArrayOutputStream0);
      ChangeSetResults changeSetResults0 = changeSetPerformer0.perform(tarArchiveInputStream0, tarArchiveOutputStream0);
      assertNotNull(changeSetResults0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ChangeSet changeSet0 = new ChangeSet();
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)80;
      changeSet0.delete("H");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 918);
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
      ChangeSetPerformer changeSetPerformer0 = new ChangeSetPerformer(changeSet0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(byteArrayOutputStream0);
      ChangeSetResults changeSetResults0 = changeSetPerformer0.perform(tarArchiveInputStream0, tarArchiveOutputStream0);
      assertNotNull(changeSetResults0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ChangeSet changeSet0 = new ChangeSet();
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)80;
      changeSet0.delete("");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 234);
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
      ChangeSetPerformer changeSetPerformer0 = new ChangeSetPerformer(changeSet0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(byteArrayOutputStream0);
      ChangeSetResults changeSetResults0 = changeSetPerformer0.perform(tarArchiveInputStream0, tarArchiveOutputStream0);
      assertNotNull(changeSetResults0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ChangeSet changeSet0 = new ChangeSet();
      byte[] byteArray0 = new byte[19];
      byteArray0[3] = (byte)28;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 234);
      TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("");
      changeSet0.add((ArchiveEntry) jarArchiveEntry0, (InputStream) tarArchiveInputStream0, false);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(byteArrayOutputStream0);
      ChangeSetPerformer changeSetPerformer0 = new ChangeSetPerformer(changeSet0);
      ChangeSetResults changeSetResults0 = changeSetPerformer0.perform(tarArchiveInputStream0, tarArchiveOutputStream0);
      assertNotNull(changeSetResults0);
  }
}
