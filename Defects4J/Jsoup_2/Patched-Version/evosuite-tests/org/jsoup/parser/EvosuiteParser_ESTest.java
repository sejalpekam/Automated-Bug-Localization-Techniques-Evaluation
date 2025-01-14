/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 11:19:01 GMT 2024
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EvosuiteParser_ESTest extends EvosuiteParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment(" Eo_h[S<BASE", " Eo_h[S<BASE");
      assertEquals("#document", document0.nodeName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Document document0 = Parser.parse("<!0-", "<!0-");
      assertFalse(document0.isBlock());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Document document0 = Parser.parse("<![CDATA[", "<![CDATA[");
      assertEquals("#root", document0.tagName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Document document0 = Parser.parse("<!--%s-->", "<!--%s-->");
      assertEquals("#root", document0.tagName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("d<?b)vy3YiZ6w", "d<?b)vy3YiZ6w");
      assertEquals("d<?b)vy3YiZ6w", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Document document0 = Parser.parse("<gP</YCvwsixV", "<gP</YCvwsixV");
      assertEquals("<gP</YCvwsixV", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Document document0 = Parser.parse("<!--", "<!--");
      assertFalse(document0.isBlock());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("</", "</");
      assertFalse(document0.isBlock());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Document document0 = Parser.parse("<", "<");
      assertEquals("#root", document0.tagName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Document document0 = Parser.parse("<vA7]#<d=%%- /Ih", "<vA7]#<d=%%- /Ih");
      assertEquals("#root", document0.tagName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parser.parse("<Kdq`='\"3psj.qHxM", "<Kdq`='\"3psj.qHxM");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Document document0 = Parser.parse("<Kdq`=\"ipsjI!.qH\"M", "<Kdq`=\"ipsjI!.qH\"M");
      assertEquals("<Kdq`=\"ipsjI!.qH\"M", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parser.parse("<5=5KV<7FA;=GZmRuuI", "<5=5KV<7FA;=GZmRuuI");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Document document0 = Parser.parse(" EK_}[S<BASE", " EK_}[S<BASE");
      assertFalse(document0.isBlock());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("</Nc#m%*Av,QeW:e*", "</Nc#m%*Av,QeW:e*");
      assertEquals("</Nc#m%*Av,QeW:e*", document0.baseUri());
  }
}
