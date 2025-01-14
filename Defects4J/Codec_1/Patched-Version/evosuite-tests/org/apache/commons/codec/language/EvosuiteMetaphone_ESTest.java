/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 20:30:47 GMT 2024
 */

package org.apache.commons.codec.language;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.language.Metaphone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EvosuiteMetaphone_ESTest extends EvosuiteMetaphone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.setMaxCodeLen((-871));
      assertEquals((-871), metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.isMetaphoneEqual("CHE", "CHE");
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.encode("whK.eDpSA}LbD>z$C!h");
      assertEquals("KTPX", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.metaphone((String) null);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.metaphone("");
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("K");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("K", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("AP3db");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("APTB", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("GHI");
      assertEquals("K", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("KF");
      assertEquals("KF", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("Parameter supplied to Metaphone encode is not of type java.lang.String");
      assertEquals("PRM0", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("xryVHe-8,&SK");
      assertEquals("XRFH", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("GNED");
      assertEquals("NT", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("AEIOU");
      assertEquals("E", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("wr sD':]x]");
      assertEquals("RSTK", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("WGCK[xR");
      assertEquals("KXKS", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("uUCY+gft,/2]K8");
      assertEquals("UXFK", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("<gzBb|st5Pzf$[");
      assertEquals("SBXX", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("'C{mbC");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("KMBK", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.encode("CMB");
      assertEquals("KM", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("SC");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("SK", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("SC&");
      assertEquals("XK", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.encode("SCE");
      assertEquals("X", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("cyl>S<.`\"");
      assertEquals("SLX", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("org.apache.commons.codec.EncoderException");
      assertEquals("ORPX", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("CH");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("X", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("CHLE");
      assertEquals("XL", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.encode("<;DGO0nE@Njt!*=I\"l");
      assertEquals("TNNJ", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone(":qo74a<gH");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("K", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.encode("GY");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("J", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("CWOGhkQ--iovCI#92");
      assertEquals("KWKK", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.encode("^>Bag");
      assertEquals("BK", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.encode("HW8Aw8t^@I&?0;");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("X", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.encode("&+DhGF'`PHY*~ N");
      assertEquals("TFFN", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("CSPTG");
      assertEquals("KXPT", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      Object object0 = metaphone0.encode((Object) "#qdxWXme");
      assertEquals("KTKS", object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      Object object0 = new Object();
      try { 
        metaphone0.encode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to Metaphone encode is not of type java.lang.String
         //
         verifyException("org.apache.commons.codec.language.Metaphone", e);
      }
  }
}
