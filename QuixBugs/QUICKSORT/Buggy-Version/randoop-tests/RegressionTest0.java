import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java_programs.QUICKSORT qUICKSORT0 = new java_programs.QUICKSORT();
        java.lang.Class<?> wildcardClass1 = qUICKSORT0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.lang.Class<?> wildcardClass8 = intList3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.lang.Class<?> wildcardClass8 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList1 = java_programs.QUICKSORT.quicksort(intList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList3);
        java.lang.Class<?> wildcardClass9 = intList3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass10 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.lang.Class<?> wildcardClass7 = intList3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.lang.Class<?> wildcardClass7 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass8 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass12 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass9 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass9 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList6);
        java.lang.Class<?> wildcardClass9 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass11 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList3);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass12 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass10 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.QUICKSORT.quicksort(intList2);
        java.lang.Class<?> wildcardClass5 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.QUICKSORT.quicksort(intList2);
        java.lang.Class<?> wildcardClass5 = intList4.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass11 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass10 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.lang.Class<?> wildcardClass6 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass10 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass9 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass12 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass13 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass10 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass9 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass10 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass12 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass11 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass12 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass10 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass11 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass9 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass13 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass9 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass9 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass13 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass7 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass14 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass13 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass12 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass10 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass15 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass15 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass14 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass15 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass14 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass13 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass14 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass11 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass16 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass13 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass8 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass13 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList3);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList6);
        java.lang.Class<?> wildcardClass10 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList6);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass10 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass17 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass12 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass15 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.lang.Class<?> wildcardClass17 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass15 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass10 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass14 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass11 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass14 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass12 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass11 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass13 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.lang.Class<?> wildcardClass18 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass17 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass13 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.lang.Class<?> wildcardClass18 = intList17.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.lang.Class<?> wildcardClass7 = intList3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass14 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass14 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass16 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass18 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass14 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass7 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass11 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass13 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList3);
        java.lang.Class<?> wildcardClass10 = intList3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass15 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass13 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass17 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.lang.Class<?> wildcardClass18 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.lang.Class<?> wildcardClass18 = intList17.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass13 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass18 = intList17.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass13 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass14 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass16 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList6);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass14 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass14 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.QUICKSORT.quicksort(intList16);
        java.lang.Class<?> wildcardClass19 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass12 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass12 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList3);
        java.lang.Class<?> wildcardClass11 = intList3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass17 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.lang.Class<?> wildcardClass17 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.QUICKSORT.quicksort(intList16);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.QUICKSORT.quicksort(intList18);
        java.lang.Class<?> wildcardClass20 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.QUICKSORT.quicksort(intList17);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.lang.Class<?> wildcardClass17 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass14 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass12 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass15 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass15 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass18 = intList17.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList6);
        java.lang.Class<?> wildcardClass9 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList3);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList15);
        java.lang.Class<?> wildcardClass18 = intList17.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass17 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass16 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass16 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass18 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.QUICKSORT.quicksort(intList17);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass16 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.QUICKSORT.quicksort(intList17);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.QUICKSORT.quicksort(intList18);
        java.lang.Class<?> wildcardClass20 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass17 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass16 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.QUICKSORT.quicksort(intList17);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.QUICKSORT.quicksort(intList18);
        java.lang.Class<?> wildcardClass20 = intList19.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass18 = intList17.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass20 = intList19.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass12 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass17 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList6);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass15 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass14 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass12 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass8 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.QUICKSORT.quicksort(intList17);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass17 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass13 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass13 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass11 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass17 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList15);
        java.lang.Class<?> wildcardClass18 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.lang.Class<?> wildcardClass18 = intList17.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.QUICKSORT.quicksort(intList16);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.QUICKSORT.quicksort(intList18);
        java.lang.Class<?> wildcardClass20 = intList19.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass15 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.QUICKSORT.quicksort(intList17);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.QUICKSORT.quicksort(intList18);
        java.lang.Class<?> wildcardClass20 = intList19.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass16 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.lang.Class<?> wildcardClass17 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.lang.Class<?> wildcardClass8 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass13 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.lang.Class<?> wildcardClass18 = intList17.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass17 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.lang.Class<?> wildcardClass17 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass15 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.lang.Class<?> wildcardClass18 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.QUICKSORT.quicksort(intList16);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.QUICKSORT.quicksort(intList16);
        java.lang.Class<?> wildcardClass20 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.lang.Class<?> wildcardClass18 = intList17.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass15 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.QUICKSORT.quicksort(intList17);
        java.lang.Class<?> wildcardClass19 = intList17.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList15);
        java.lang.Class<?> wildcardClass18 = intList17.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.QUICKSORT.quicksort(intList17);
        java.lang.Class<?> wildcardClass19 = intList17.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.lang.Class<?> wildcardClass18 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.lang.Class<?> wildcardClass18 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.lang.Class<?> wildcardClass9 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.lang.Class<?> wildcardClass17 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.QUICKSORT.quicksort(intList17);
        java.lang.Class<?> wildcardClass19 = intList17.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.lang.Class<?> wildcardClass17 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass16 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass15 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.lang.Class<?> wildcardClass18 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass15 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.lang.Class<?> wildcardClass17 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList15);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.QUICKSORT.quicksort(intList17);
        java.lang.Class<?> wildcardClass19 = intList17.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.lang.Class<?> wildcardClass13 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass16 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.lang.Class<?> wildcardClass11 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 10, 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList14);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList12);
        java.lang.Class<?> wildcardClass15 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.QUICKSORT.quicksort(intList16);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.QUICKSORT.quicksort(intList17);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.QUICKSORT.quicksort(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.QUICKSORT.quicksort(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.QUICKSORT.quicksort(intList15);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.QUICKSORT.quicksort(intList3);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.QUICKSORT.quicksort(intList5);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.QUICKSORT.quicksort(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.QUICKSORT.quicksort(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.QUICKSORT.quicksort(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.QUICKSORT.quicksort(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.QUICKSORT.quicksort(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.QUICKSORT.quicksort(intList10);
        java.lang.Class<?> wildcardClass14 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

