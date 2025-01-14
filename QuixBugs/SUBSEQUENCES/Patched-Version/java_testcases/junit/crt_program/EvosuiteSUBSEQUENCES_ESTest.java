/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 01 06:44:18 GMT 2024
 */

package correct_java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import correct_java_programs.SUBSEQUENCES;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EvosuiteSUBSEQUENCES_ESTest extends EvosuiteSUBSEQUENCES_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SUBSEQUENCES.subsequences(0, (-2398), 0);
      SUBSEQUENCES.subsequences(0, 0, 1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
      // Undeclared exception!
      SUBSEQUENCES.subsequences((-4793), 50, 50);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = 279;
      // Undeclared exception!
      SUBSEQUENCES.subsequences(43, 279, 43);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayList<ArrayList> arrayList0 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(1956, 312, 312);
      assertEquals(0, arrayList0.size());
  }
}
