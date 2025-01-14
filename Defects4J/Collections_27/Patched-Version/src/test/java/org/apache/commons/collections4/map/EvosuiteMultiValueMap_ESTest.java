/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 18:36:50 GMT 2024
 */

package org.apache.commons.collections4.map;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.apache.commons.collections4.functors.ExceptionFactory;
import org.apache.commons.collections4.map.MultiValueMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EvosuiteMultiValueMap_ESTest extends EvosuiteMultiValueMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MultiValueMap<ArrayList<String>, Collection<Object>> multiValueMap0 = new MultiValueMap<ArrayList<String>, Collection<Object>>();
      Iterator<Map.Entry<ArrayList<String>, Collection<Object>>> iterator0 = (Iterator<Map.Entry<ArrayList<String>, Collection<Object>>>)multiValueMap0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MultiValueMap<ArrayList<Object>, Object> multiValueMap0 = new MultiValueMap<ArrayList<Object>, Object>();
      multiValueMap0.clear();
      assertTrue(multiValueMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MultiValueMap<Integer, MultiValueMap<String, Integer>> multiValueMap0 = new MultiValueMap<Integer, MultiValueMap<String, Integer>>();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      hashMap0.put((Integer) null, "H{JUGGFU;Lm0bs{B");
      multiValueMap0.putAll((Map<? extends Integer, ?>) hashMap0);
      assertEquals(1, multiValueMap0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MultiValueMap<Collection<String>, Object> multiValueMap0 = new MultiValueMap<Collection<String>, Object>();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      MultiValueMap<AbstractMap.SimpleEntry<Object, Object>, Object> multiValueMap1 = new MultiValueMap<AbstractMap.SimpleEntry<Object, Object>, Object>();
      Collection<Object> collection0 = multiValueMap1.values();
      assertNotNull(collection0);
      
      boolean boolean0 = multiValueMap0.putAll((Collection<String>) arrayList0, collection0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      MultiValueMap<String, Integer> multiValueMap0 = MultiValueMap.multiValueMap((Map<String, ? super Collection<Integer>>) hashMap0);
      Factory<Collection<String>> factory0 = ExceptionFactory.exceptionFactory();
      hashMap0.put("B*q4KL,.pN|@W", (Object) null);
      MultiValueMap<String, LinkedList<Object>> multiValueMap1 = new MultiValueMap<String, LinkedList<Object>>((Map<String, ? super Collection<String>>) multiValueMap0, factory0);
      // Undeclared exception!
      try { 
        multiValueMap1.totalSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.map.MultiValueMap$ValuesIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MultiValueMap<Integer, MultiValueMap<String, Integer>> multiValueMap0 = new MultiValueMap<Integer, MultiValueMap<String, Integer>>();
      MultiValueMap<Integer, AbstractMap.SimpleEntry<Object, Collection<String>>> multiValueMap1 = null;
      try {
        multiValueMap1 = new MultiValueMap<Integer, AbstractMap.SimpleEntry<Object, Collection<String>>>((Map<Integer, ? super LinkedList<Object>>) multiValueMap0, (Factory<LinkedList<Object>>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The factory must not be null
         //
         verifyException("org.apache.commons.collections4.map.MultiValueMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MultiValueMap<Integer, MultiValueMap<String, Integer>> multiValueMap0 = new MultiValueMap<Integer, MultiValueMap<String, Integer>>();
      Integer integer0 = new Integer((-7));
      Object object0 = multiValueMap0.putIfAbsent(integer0, integer0);
      assertFalse(multiValueMap0.isEmpty());
      
      boolean boolean0 = multiValueMap0.removeMapping(object0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MultiValueMap<ArrayList<String>, Collection<Object>> multiValueMap0 = new MultiValueMap<ArrayList<String>, Collection<Object>>();
      MultiValueMap<Object, LinkedList<Integer>> multiValueMap1 = new MultiValueMap<Object, LinkedList<Integer>>();
      boolean boolean0 = multiValueMap1.removeMapping(multiValueMap0, multiValueMap0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MultiValueMap<Collection<Object>, AbstractMap.SimpleEntry<Object, Object>> multiValueMap0 = new MultiValueMap<Collection<Object>, AbstractMap.SimpleEntry<Object, Object>>();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      multiValueMap0.put(arrayList0, arrayList0);
      boolean boolean0 = multiValueMap0.removeMapping(arrayList0, "IteratorChain cannot be changed after the first use of a method from the Iterator interface");
      assertEquals(1, multiValueMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MultiValueMap<Collection<String>, Object> multiValueMap0 = new MultiValueMap<Collection<String>, Object>();
      MultiValueMap<Object, Collection<String>> multiValueMap1 = new MultiValueMap<Object, Collection<String>>();
      multiValueMap1.put(multiValueMap0, multiValueMap0);
      boolean boolean0 = multiValueMap1.containsValue((Object) multiValueMap0);
      assertFalse(multiValueMap1.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MultiValueMap<Object, Integer> multiValueMap0 = new MultiValueMap<Object, Integer>();
      MultiValueMap<Object, Object> multiValueMap1 = MultiValueMap.multiValueMap((Map<Object, ? super Collection<Object>>) multiValueMap0);
      multiValueMap0.put(multiValueMap1, multiValueMap1);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = multiValueMap1.containsValue((Object) arrayList0);
      assertFalse(multiValueMap1.isEmpty());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MultiValueMap<Integer, MultiValueMap<String, Integer>> multiValueMap0 = new MultiValueMap<Integer, MultiValueMap<String, Integer>>();
      MultiValueMap<HashMap<String, String>, Integer> multiValueMap1 = new MultiValueMap<HashMap<String, String>, Integer>();
      MultiValueMap<HashMap<String, String>, Collection<Integer>> multiValueMap2 = MultiValueMap.multiValueMap((Map<HashMap<String, String>, ? super Collection<Collection<Integer>>>) multiValueMap1);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      multiValueMap2.put(hashMap0, "ush(\"N}e#!~");
      multiValueMap2.put(hashMap0, multiValueMap0);
      assertFalse(multiValueMap2.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MultiValueMap<ArrayList<String>, String> multiValueMap0 = new MultiValueMap<ArrayList<String>, String>();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      multiValueMap0.putIfAbsent(arrayList0, arrayList0);
      MultiValueMap<Object, Collection<String>> multiValueMap1 = new MultiValueMap<Object, Collection<String>>();
      multiValueMap1.putAll((Map<?, ?>) multiValueMap0);
      assertEquals(1, multiValueMap0.size());
      assertFalse(multiValueMap1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      MultiValueMap<String, Integer> multiValueMap0 = MultiValueMap.multiValueMap((Map<String, ? super Collection<Integer>>) hashMap0);
      Factory<Collection<String>> factory0 = ExceptionFactory.exceptionFactory();
      MultiValueMap<String, LinkedList<Object>> multiValueMap1 = new MultiValueMap<String, LinkedList<Object>>((Map<String, ? super Collection<String>>) multiValueMap0, factory0);
      multiValueMap1.totalSize();
      int int0 = multiValueMap1.totalSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MultiValueMap<ArrayList<String>, String> multiValueMap0 = new MultiValueMap<ArrayList<String>, String>();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ConstantFactory<LinkedList<Object>> constantFactory0 = new ConstantFactory<LinkedList<Object>>(linkedList0);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      Object object0 = multiValueMap0.putIfAbsent(arrayList0, arrayList0);
      MultiValueMap<ArrayList<String>, Object> multiValueMap1 = MultiValueMap.multiValueMap((Map<ArrayList<String>, ? super LinkedList<Object>>) multiValueMap0, (Factory<LinkedList<Object>>) constantFactory0);
      boolean boolean0 = multiValueMap1.containsValue((Object) arrayList0, object0);
      assertFalse(multiValueMap0.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MultiValueMap<ArrayList<String>, String> multiValueMap0 = new MultiValueMap<ArrayList<String>, String>();
      MultiValueMap<Object, Collection<String>> multiValueMap1 = new MultiValueMap<Object, Collection<String>>();
      MultiValueMap<Object, Collection<Object>> multiValueMap2 = MultiValueMap.multiValueMap((Map<Object, ? super Collection<Collection<Object>>>) multiValueMap1);
      boolean boolean0 = multiValueMap2.containsValue((Object) multiValueMap0, (Object) multiValueMap1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MultiValueMap<Integer, MultiValueMap<String, Integer>> multiValueMap0 = new MultiValueMap<Integer, MultiValueMap<String, Integer>>();
      Integer integer0 = new Integer(4);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      linkedList0.add(integer0);
      MultiValueMap<Object, Integer> multiValueMap1 = new MultiValueMap<Object, Integer>();
      multiValueMap1.putAll((Object) multiValueMap0, (Collection<Integer>) linkedList0);
      LinkedList<String> linkedList1 = new LinkedList<String>();
      Factory<LinkedList<String>> factory0 = ConstantFactory.constantFactory(linkedList1);
      MultiValueMap<Object, AbstractMap.SimpleEntry<Integer, Object>> multiValueMap2 = new MultiValueMap<Object, AbstractMap.SimpleEntry<Integer, Object>>((Map<Object, ? super LinkedList<String>>) multiValueMap1, factory0);
      boolean boolean0 = multiValueMap2.containsValue((Object) multiValueMap0, (Object) null);
      assertEquals(1, multiValueMap1.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MultiValueMap<ArrayList<Object>, String> multiValueMap0 = new MultiValueMap<ArrayList<Object>, String>();
      MultiValueMap<Object, Integer> multiValueMap1 = new MultiValueMap<Object, Integer>();
      MultiValueMap<Object, LinkedList<Object>> multiValueMap2 = MultiValueMap.multiValueMap((Map<Object, ? super Collection<LinkedList<Object>>>) multiValueMap1);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      multiValueMap2.put(multiValueMap0, arrayList0);
      MultiValueMap<Object, AbstractMap.SimpleEntry<Object, Object>> multiValueMap3 = MultiValueMap.multiValueMap((Map<Object, ? super Collection<AbstractMap.SimpleEntry<Object, Object>>>) multiValueMap1);
      int int0 = multiValueMap3.size((Object) multiValueMap0);
      assertFalse(multiValueMap1.isEmpty());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MultiValueMap<Integer, MultiValueMap<String, Integer>> multiValueMap0 = new MultiValueMap<Integer, MultiValueMap<String, Integer>>();
      int int0 = multiValueMap0.size((Object) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MultiValueMap<Object, Object> multiValueMap0 = new MultiValueMap<Object, Object>();
      MultiValueMap<Object, String> multiValueMap1 = MultiValueMap.multiValueMap((Map<Object, ? super Collection<String>>) multiValueMap0);
      boolean boolean0 = multiValueMap1.putAll((Object) multiValueMap0, (Collection<String>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = new Integer(45);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      linkedList0.add(integer0);
      MultiValueMap<Object, Integer> multiValueMap0 = new MultiValueMap<Object, Integer>();
      multiValueMap0.putIfAbsent(integer0, integer0);
      boolean boolean0 = multiValueMap0.putAll((Object) integer0, (Collection<Integer>) linkedList0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MultiValueMap<ArrayList<Object>, Integer> multiValueMap0 = new MultiValueMap<ArrayList<Object>, Integer>();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      multiValueMap0.put(arrayList0, arrayList0);
      ArrayList<String> arrayList1 = new ArrayList<String>();
      multiValueMap0.iterator((Object) arrayList1);
      assertFalse(multiValueMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MultiValueMap<ArrayList<Object>, Integer> multiValueMap0 = new MultiValueMap<ArrayList<Object>, Integer>();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      Iterator<Integer> iterator0 = multiValueMap0.iterator((Object) arrayList0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MultiValueMap<Object, LinkedList<Integer>> multiValueMap0 = new MultiValueMap<Object, LinkedList<Integer>>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      MultiValueMap<String, Integer> multiValueMap1 = MultiValueMap.multiValueMap((Map<String, ? super Collection<Integer>>) hashMap0);
      multiValueMap1.put((String) null, multiValueMap0);
      Factory<Collection<String>> factory0 = ExceptionFactory.exceptionFactory();
      MultiValueMap<String, LinkedList<Object>> multiValueMap2 = new MultiValueMap<String, LinkedList<Object>>((Map<String, ? super Collection<String>>) hashMap0, factory0);
      int int0 = multiValueMap2.totalSize();
      assertFalse(hashMap0.isEmpty());
      assertEquals(1, int0);
  }
}
