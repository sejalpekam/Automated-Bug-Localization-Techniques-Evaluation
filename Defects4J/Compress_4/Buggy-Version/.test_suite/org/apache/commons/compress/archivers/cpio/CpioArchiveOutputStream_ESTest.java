/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 15:32:46 GMT 2024
 */

package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CpioArchiveOutputStream_ESTest extends CpioArchiveOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("TK`iN0n-rU@Q=");
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
      MockFile mockFile0 = new MockFile("S3|{]'aP");
      ArchiveEntry archiveEntry0 = cpioArchiveOutputStream0.createArchiveEntry(mockFile0, "TK`iN0n-rU@Q=");
      cpioArchiveOutputStream0.putArchiveEntry(archiveEntry0);
      try { 
        cpioArchiveOutputStream0.finish();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // This archives contains unclosed entries.
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      CpioArchiveOutputStream cpioArchiveOutputStream0 = null;
      try {
        cpioArchiveOutputStream0 = new CpioArchiveOutputStream(pipedOutputStream0, (short)3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown format: 3
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      CpioArchiveOutputStream cpioArchiveOutputStream0 = null;
      try {
        cpioArchiveOutputStream0 = new CpioArchiveOutputStream(pipedOutputStream0, (short)5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown format: 5
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      CpioArchiveOutputStream cpioArchiveOutputStream0 = null;
      try {
        cpioArchiveOutputStream0 = new CpioArchiveOutputStream(pipedOutputStream0, (short)6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown format: 6
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = null;
      try {
        cpioArchiveOutputStream0 = new CpioArchiveOutputStream(pipedOutputStream0, (short)7);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown format: 7
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      File file0 = MockFile.createTempFile("TK`iN0n-rU@Q=", "TK`iN0n-rU@Q=", (File) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
      CpioArchiveOutputStream cpioArchiveOutputStream1 = null;
      try {
        cpioArchiveOutputStream1 = new CpioArchiveOutputStream(cpioArchiveOutputStream0, (short)257);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown format: 257
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("TK`iN0n-rU@Q=");
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
      cpioArchiveOutputStream0.close();
      try { 
        cpioArchiveOutputStream0.finish();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      File file0 = MockFile.createTempFile("TK`iN0n-rU@Q=", "TK`iN0n-rU@Q=", (File) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream("TK`iN0n-rU@Q=");
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
      ArchiveEntry archiveEntry0 = cpioArchiveOutputStream0.createArchiveEntry(file0, "TK`iN0n-rU@Q=");
      cpioArchiveOutputStream0.putArchiveEntry(archiveEntry0);
      try { 
        cpioArchiveOutputStream0.putArchiveEntry(archiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // duplicate entry: TK`iN0n-rU@Q=
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(pipedOutputStream0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("JarMarker doesn't expect any data");
      CpioArchiveOutputStream cpioArchiveOutputStream1 = new CpioArchiveOutputStream(cpioArchiveOutputStream0, (short)8);
      try { 
        cpioArchiveOutputStream1.putArchiveEntry(cpioArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Header format: 1 does not match existing format: 8
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(pipedOutputStream0);
      CpioArchiveOutputStream cpioArchiveOutputStream1 = new CpioArchiveOutputStream(cpioArchiveOutputStream0, (short)2);
      try { 
        cpioArchiveOutputStream1.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no current CPIO entry
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      File file0 = MockFile.createTempFile("TK`iN0n-rU@Q=", "TK`iN0n-rU@Q=", (File) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream("TK`iN0n-rU@Q=");
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
      CpioArchiveEntry cpioArchiveEntry0 = (CpioArchiveEntry)cpioArchiveOutputStream0.createArchiveEntry(file0, "TK`iN0n-rU@Q=");
      cpioArchiveEntry0.setSize(738L);
      cpioArchiveOutputStream0.putArchiveEntry(cpioArchiveEntry0);
      try { 
        cpioArchiveOutputStream0.putArchiveEntry(cpioArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // invalid entry size (expected 738 but got 0 bytes)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.write(byteArray0, (-98), 1073741824);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(bufferedOutputStream0);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.write(byteArray0, 8, (-64));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        cpioArchiveOutputStream0.write(byteArray0, 6, 65535);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[0];
      cpioArchiveOutputStream0.write(byteArray0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      File file0 = MockFile.createTempFile("TK`iN0n-rU@Q=", "TK`iN0n-rU@Q=", (File) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      CpioArchiveOutputStream cpioArchiveOutputStream0 = new CpioArchiveOutputStream(mockPrintStream0);
      cpioArchiveOutputStream0.close();
      cpioArchiveOutputStream0.close();
      assertEquals(124L, file0.length());
  }
}
