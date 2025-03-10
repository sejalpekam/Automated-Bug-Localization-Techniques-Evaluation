/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 08:56:21 GMT 2024
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EvosuiteDocument_ESTest extends EvosuiteDocument_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Document document0 = new Document("FORM");
      String string0 = document0.outerHtml();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Document document0 = new Document("text");
      // Undeclared exception!
      try { 
        document0.text("text");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Document", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Document document0 = Document.createShell("text");
      String string0 = document0.nodeName();
      assertEquals("#document", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Document document0 = Document.createShell("text");
      Element element0 = document0.createElement("34");
      assertEquals("34", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Document document0 = Document.createShell("");
      String string0 = document0.title();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Document document0 = Document.createShell("text");
      document0.title("NSsDWP]/Lkm");
      String string0 = document0.title();
      assertEquals("NSsDWP]/Lkm", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Document document0 = Document.createShell("text");
      document0.title("NSsDWP]/Lkm");
      document0.title("");
      assertFalse(document0.isBlock());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Document document0 = Document.createShell("text");
      Document document1 = document0.normalise();
      assertEquals("#root", document1.tagName());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Document document0 = new Document("FORM");
      document0.prependText("FORM");
      Document document1 = document0.normalise();
      assertSame(document0, document1);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Document document0 = new Document("FORM");
      document0.prependText("");
      Document document1 = document0.normalise();
      assertSame(document0, document1);
  }
}
