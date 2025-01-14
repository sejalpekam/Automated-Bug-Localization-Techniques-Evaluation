/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 01 03:37:14 GMT 2024
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.GET_FACTORS;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GET_FACTORS_ESTest extends GET_FACTORS_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayList<Integer> arrayList0 = GET_FACTORS.get_factors(0);
      assertEquals(0, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Integer> arrayList0 = GET_FACTORS.get_factors(1);
      assertFalse(arrayList0.contains(1));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Integer> arrayList0 = GET_FACTORS.get_factors(2020);
      assertFalse(arrayList0.contains(2020));
      assertEquals(3, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GET_FACTORS gET_FACTORS0 = new GET_FACTORS();
  }
}
