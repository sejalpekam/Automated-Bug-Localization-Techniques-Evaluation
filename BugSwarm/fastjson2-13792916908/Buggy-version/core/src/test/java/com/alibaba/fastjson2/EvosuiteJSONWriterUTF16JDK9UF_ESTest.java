/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 03:49:40 GMT 2024
 */

package com.alibaba.fastjson2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class EvosuiteJSONWriterUTF16JDK9UF_ESTest extends EvosuiteJSONWriterUTF16JDK9UF_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JSONWriterUTF16JDK9UF jSONWriterUTF16JDK9UF0 = null;
      try {
        jSONWriterUTF16JDK9UF0 = new JSONWriterUTF16JDK9UF((JSONWriter.Context) null);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson2.JSONWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JSONWriter.Feature[] jSONWriter_FeatureArray0 = new JSONWriter.Feature[4];
      JSONWriter.Feature jSONWriter_Feature0 = JSONWriter.Feature.NotWriteDefaultValue;
      jSONWriter_FeatureArray0[0] = jSONWriter_Feature0;
      jSONWriter_FeatureArray0[1] = jSONWriter_FeatureArray0[0];
      jSONWriter_FeatureArray0[2] = jSONWriter_Feature0;
      jSONWriter_FeatureArray0[3] = jSONWriter_FeatureArray0[2];
      JSONWriter.Context jSONWriter_Context0 = new JSONWriter.Context(jSONWriter_FeatureArray0);
      JSONWriterUTF16JDK9UF jSONWriterUTF16JDK9UF0 = new JSONWriterUTF16JDK9UF(jSONWriter_Context0);
      char[] charArray0 = new char[3];
      jSONWriterUTF16JDK9UF0.chars = charArray0;
      // Undeclared exception!
      try {
        jSONWriterUTF16JDK9UF0.writeString("9z!bFS_le6EUB57");
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson2.JSONWriterUTF16JDK9UF", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JSONWriter.Feature[] jSONWriter_FeatureArray0 = new JSONWriter.Feature[4];
      JSONWriter.Feature jSONWriter_Feature0 = JSONWriter.Feature.NotWriteDefaultValue;
      jSONWriter_FeatureArray0[0] = jSONWriter_Feature0;
      jSONWriter_FeatureArray0[1] = jSONWriter_FeatureArray0[0];
      jSONWriter_FeatureArray0[2] = jSONWriter_Feature0;
      jSONWriter_FeatureArray0[3] = jSONWriter_FeatureArray0[2];
      JSONWriter.Context jSONWriter_Context0 = new JSONWriter.Context(jSONWriter_FeatureArray0);
      JSONWriterUTF16JDK9UF jSONWriterUTF16JDK9UF0 = new JSONWriterUTF16JDK9UF(jSONWriter_Context0);
      // Undeclared exception!
      try {
        jSONWriterUTF16JDK9UF0.writeString("9z!bFS_le6EUB57");
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson2.JSONWriterUTF16JDK9UF", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JSONWriter.Feature[] jSONWriter_FeatureArray0 = new JSONWriter.Feature[4];
      JSONWriter.Feature jSONWriter_Feature0 = JSONWriter.Feature.WriteEnumsUsingName;
      jSONWriter_FeatureArray0[0] = jSONWriter_Feature0;
      jSONWriter_FeatureArray0[1] = jSONWriter_Feature0;
      jSONWriter_FeatureArray0[2] = jSONWriter_Feature0;
      jSONWriter_FeatureArray0[3] = jSONWriter_Feature0;
      JSONWriter.Context jSONWriter_Context0 = new JSONWriter.Context(jSONWriter_FeatureArray0);
      JSONWriterUTF16JDK9UF jSONWriterUTF16JDK9UF0 = new JSONWriterUTF16JDK9UF(jSONWriter_Context0);
      char[] charArray0 = new char[4];
      jSONWriterUTF16JDK9UF0.chars = charArray0;
      String[] stringArray0 = new String[8];
      stringArray0[5] = "BH\toI";
      // Undeclared exception!
      try {
        jSONWriterUTF16JDK9UF0.writeString(stringArray0);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson2.JSONWriterUTF16JDK9UF", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ObjectWriterProvider objectWriterProvider0 = new ObjectWriterProvider();
      JSONWriter.Feature[] jSONWriter_FeatureArray0 = new JSONWriter.Feature[4];
      JSONWriter.Feature jSONWriter_Feature0 = JSONWriter.Feature.EscapeNoneAscii;
      jSONWriter_FeatureArray0[0] = jSONWriter_Feature0;
      jSONWriter_FeatureArray0[1] = jSONWriter_Feature0;
      JSONWriter.Feature jSONWriter_Feature1 = JSONWriter.Feature.BrowserSecure;
      jSONWriter_FeatureArray0[2] = jSONWriter_Feature1;
      jSONWriter_FeatureArray0[3] = jSONWriter_FeatureArray0[1];
      JSONWriter.Context jSONWriter_Context0 = new JSONWriter.Context(objectWriterProvider0, jSONWriter_FeatureArray0);
      JSONWriterUTF16JDK9UF jSONWriterUTF16JDK9UF0 = new JSONWriterUTF16JDK9UF(jSONWriter_Context0);
      // Undeclared exception!
      try {
        jSONWriterUTF16JDK9UF0.writeString("com.alibaba.fastjson2.writer.FieldWriterInt16Method");
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson2.JSONWriterUTF16JDK9UF", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ObjectWriterProvider objectWriterProvider0 = new ObjectWriterProvider();
      JSONWriter.Feature[] jSONWriter_FeatureArray0 = new JSONWriter.Feature[4];
      JSONWriter.Feature jSONWriter_Feature0 = JSONWriter.Feature.EscapeNoneAscii;
      jSONWriter_FeatureArray0[0] = jSONWriter_Feature0;
      jSONWriter_FeatureArray0[1] = jSONWriter_Feature0;
      jSONWriter_FeatureArray0[2] = jSONWriter_FeatureArray0[0];
      jSONWriter_FeatureArray0[3] = jSONWriter_FeatureArray0[0];
      JSONWriter.Context jSONWriter_Context0 = new JSONWriter.Context(objectWriterProvider0, jSONWriter_FeatureArray0);
      JSONWriterUTF16JDK9UF jSONWriterUTF16JDK9UF0 = new JSONWriterUTF16JDK9UF(jSONWriter_Context0);
      jSONWriterUTF16JDK9UF0.writeString((String) null);
      assertTrue(jSONWriterUTF16JDK9UF0.utf16);
  }
}
