/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 12:32:20 GMT 2024
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EvosuiteElement_ESTest extends EvosuiteElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Document document0 = new Document("iK;kz(RG");
      document0.appendText("iK;kz(RG");
      String string0 = document0.text();
      assertEquals("iK;kz(RG", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Document document0 = new Document("4}lf3B#K3rl\u0007");
      Element element0 = document0.val("beta");
      assertEquals("#document", element0.nodeName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Document document0 = new Document("<Q0/");
      Elements elements0 = document0.getElementsByAttributeValueEnding("j@", "<Q0/");
      assertTrue(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Document document0 = new Document("8706");
      // Undeclared exception!
      try { 
        document0.child((-4569));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Document document0 = new Document("8706");
      Elements elements0 = document0.getElementsByAttributeValueContaining("8706", "8706");
      assertEquals(0, elements0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Tag tag0 = Tag.valueOf("textarea");
      Element element0 = new Element(tag0, "textarea");
      Element element1 = element0.val("forall");
      assertSame(element0, element1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Document document0 = new Document("textarea");
      Element element0 = document0.createElement("textarea");
      String string0 = element0.val();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Document document0 = new Document("4}lf3B#K3rl\u0007");
      Elements elements0 = document0.getElementsByAttributeValueNot("4}lf3B#K3rl\u0007", "4}lf3B#K3rl\u0007");
      assertEquals(1, elements0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Document document0 = new Document("&0~1%~-l");
      String string0 = document0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Document document0 = new Document("m=t'YCa'.COx-\"Z");
      Elements elements0 = document0.getElementsByAttribute("m=t'YCa'.COx-\"Z");
      assertTrue(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Document document0 = new Document("4}lf3B#K3rl\u0007");
      Element element0 = document0.addClass("4}lf3B#K3rl\u0007");
      assertEquals("#root", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Document document0 = new Document("V:DQ!mx\"PHR]&");
      // Undeclared exception!
      try { 
        document0.html("V:DQ!mx\"PHR]&");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Document document0 = new Document("&0~1%~-l");
      Elements elements0 = document0.getElementsByAttributeValue("&0~1%~-l", "&0~1%~-l");
      assertTrue(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Document document0 = new Document("p/**Km3yl'n2");
      // Undeclared exception!
      try { 
        document0.siblingElements();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Document document0 = new Document("iK;kz(RG");
      Elements elements0 = document0.getElementsByAttributeValueStarting("iK;kz(RG", "iK;kz(RG");
      assertEquals(0, elements0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Document document0 = new Document("U.uSo?");
      Element element0 = document0.appendElement("U.uSo?");
      String string0 = element0.nodeName();
      assertEquals("u.uso?", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Document document0 = new Document("8706");
      document0.removeClass("8706");
      Elements elements0 = document0.getElementsByClass("8706");
      assertTrue(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Document document0 = new Document("U.uSo?");
      // Undeclared exception!
      try { 
        document0.select("U.uSo?");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query U.uSo?
         //
         verifyException("org.jsoup.select.Selector", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Document document0 = new Document("4}lf3B#K3rl\u0007");
      Elements elements0 = document0.getAllElements();
      assertEquals(1, elements0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Document document0 = new Document("<");
      Elements elements0 = document0.getElementsByIndexLessThan(6);
      assertEquals(1, elements0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Document document0 = new Document("4}lf3B#K3rl\u0007");
      Element element0 = document0.prependElement("7pXa^nI<4}lf3b#k3rl\u0007>\n</4}lf3b#k3rl\u0007>");
      assertEquals("7pxa^ni<4}lf3b#k3rl\u0007>\n</4}lf3b#k3rl\u0007>", element0.nodeName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Document document0 = new Document("4}lf3B#K3rl\u0007");
      Elements elements0 = document0.getElementsByIndexGreaterThan((-1912331749));
      assertEquals(1, elements0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Document document0 = new Document("4}lf3B#K3rl\u0007");
      Elements elements0 = document0.getElementsByIndexEquals(133);
      assertEquals(0, elements0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Document document0 = new Document("OElig");
      document0.addChild(document0);
      Elements elements0 = document0.parents();
      assertTrue(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Document document0 = new Document("OElig");
      Tag tag0 = Tag.valueOf("4}lf3b#k3rl\u0007");
      Element element0 = new Element(tag0, "4}lf3b#k3rhl\u0007");
      element0.addChild(document0);
      Elements elements0 = document0.parents();
      assertFalse(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Document document0 = new Document("u\".4q#!N");
      Element element0 = document0.appendElement("})E%-rAjDgik%qfU`");
      element0.previousElementSibling();
      assertEquals("})e%-rajdgik%qfu`", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Document document0 = new Document("4}lf3B#K3rl\u0007");
      document0.appendText("4}lf3B#K3rl\u0007");
      Element element0 = document0.getElementById("TM,+#MpOTc7j4sT9");
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Document document0 = new Document("lm=t'YCaqCcOx-\"Z");
      Element element0 = document0.appendElement("lm=t'YCaqCcOx-\"Z");
      Element element1 = element0.nextElementSibling();
      assertNull(element1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Tag tag0 = Tag.valueOf("U.uSo?");
      Element element0 = new Element(tag0, "U.uSo?");
      element0.appendElement("cUJ6MC(s0Y#");
      element0.addChild(element0);
      Element element1 = element0.previousElementSibling();
      assertEquals("cuj6mc(s0y#", element1.nodeName());
      assertNotNull(element1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Document document0 = new Document("4}lf3B#K3rl\u0007");
      document0.addChild(document0);
      Element element0 = document0.firstElementSibling();
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Document document0 = new Document("4}lf3B#K3rl\u0007");
      document0.appendElement("4}lf3B#K3rl\u0007");
      document0.addChild(document0);
      Element element0 = document0.firstElementSibling();
      assertEquals("4}lf3b#k3rl", element0.nodeName());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Document document0 = new Document("4}lf3B#K3rl\u0007");
      Element element0 = document0.appendElement("4}lf3B#K3rl\u0007");
      Elements elements0 = element0.getElementsByIndexEquals(133);
      assertTrue(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Document document0 = new Document("lm=t'YCaqCcOx-\"Z");
      Element element0 = document0.appendElement("lm=t'YCaqCcOx-\"Z");
      Element element1 = element0.lastElementSibling();
      assertNull(element1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Document document0 = new Document("U.uSo?");
      Element element0 = document0.appendElement("U.uSo?");
      document0.addChild(document0);
      Element element1 = element0.lastElementSibling();
      assertSame(document0, element1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Document document0 = new Document("8706");
      DataNode dataNode0 = DataNode.createFromEncoded("8706", ";C");
      document0.addChild(dataNode0);
      String string0 = document0.text();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Document document0 = new Document("lm=t'YCa'CYOx-\"Z");
      document0.appendElement("lm=t'YCa'CYOx-\"Z");
      String string0 = document0.text();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Document document0 = new Document("iK;kz(RG");
      Element element0 = document0.createElement("textarea");
      element0.addChild(document0);
      boolean boolean0 = document0.preserveWhitespace();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Document document0 = new Document("iK;kz(RG");
      Element element0 = document0.appendElement("iK;kz(RG");
      element0.prependText("iK;kz(RG");
      String string0 = document0.html();
      assertEquals("<ik;kz(rg>\niK;kz(RG\n</ik;kz(rg>", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Document document0 = new Document("4}lf3B#K3rl\u0007");
      Comment comment0 = new Comment("TWa8+", "4}lf3B#K3rl\u0007");
      document0.addChild(comment0);
      boolean boolean0 = document0.hasText();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Document document0 = new Document("4}lf3B#K3rl\u0007");
      document0.prependText("");
      boolean boolean0 = document0.hasText();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Document document0 = new Document("U.uSo?");
      document0.appendElement("U.uSo?");
      boolean boolean0 = document0.hasText();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Document document0 = new Document("U.uSo?");
      Element element0 = document0.appendElement("U.uSo?");
      element0.prependText("j3[x xN");
      boolean boolean0 = document0.hasText();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Document document0 = new Document("4}lf3B#K3rl\u0007");
      document0.appendText("4}lf3B#K3rl\u0007");
      String string0 = document0.data();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Document document0 = new Document("4}lf3B#K3rl\u0007");
      DataNode dataNode0 = DataNode.createFromEncoded("dr9b}{)", "4}lf3B#K3rl\u0007");
      Element element0 = document0.prependChild(dataNode0);
      String string0 = element0.data();
      assertEquals("dr9b}{)", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Document document0 = new Document("4}lfGB#3rl\u0007");
      document0.addChild(document0);
      // Undeclared exception!
      try { 
        document0.data();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Document document0 = new Document("10IpoIPd/]n%ovV/");
      document0.removeClass("10IpoIPd/]n%ovV/");
      String string0 = document0.className();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Document document0 = new Document("U.uSo?");
      boolean boolean0 = document0.hasClass("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Document document0 = new Document("8706");
      Element element0 = document0.toggleClass("8706");
      assertSame(document0, element0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Document document0 = new Document("#root");
      Element element0 = document0.toggleClass("");
      assertEquals("#root", element0.baseUri());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Document document0 = new Document("U.uSo?");
      String string0 = document0.val();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Document document0 = new Document("Z-0]]FzkupN`$gMq18");
      // Undeclared exception!
      try { 
        document0.outerHtml((StringBuilder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Document document0 = new Document("4}lf3B#K3rl\u0007");
      document0.appendElement("4}lf3B#K3rl\u0007");
      document0.prependText("7pXa^nI");
      String string0 = document0.html();
      assertEquals("7pXa^nI<4}lf3b#k3rl>\n</4}lf3b#k3rl>", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Document document0 = new Document("lm=t'YCa'CYOx-\"Z");
      document0.appendElement("q");
      String string0 = document0.html();
      assertEquals("<q></q>", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Document document0 = new Document("4}lf3B#K3rl\u0007");
      boolean boolean0 = document0.equals("4}lf3B#K3rl\u0007");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Document document0 = new Document("0x Hg0)Dc#0w");
      document0.hashCode();
  }
}
