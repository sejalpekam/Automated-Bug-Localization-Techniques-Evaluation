/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.benchmark;

import com.alibaba.fastjson.util.RyuDouble;

public class RyuDoubleBenchmark {public static class __CLR4_5_222g422g4lusyjwom{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,96507,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static int COUNT = 1000 * 1000 * 10;
    public static void main(String[] args) throws Exception {try{__CLR4_5_222g422g4lusyjwom.R.inc(96484);
        __CLR4_5_222g422g4lusyjwom.R.inc(96485);double v = 0.5390050566444644; //new java.util.Random().nextDouble();


        __CLR4_5_222g422g4lusyjwom.R.inc(96486);System.out.println(v);

        __CLR4_5_222g422g4lusyjwom.R.inc(96487);for (int i = 0; (((i < 10)&&(__CLR4_5_222g422g4lusyjwom.R.iget(96488)!=0|true))||(__CLR4_5_222g422g4lusyjwom.R.iget(96489)==0&false)); ++i) {{
            __CLR4_5_222g422g4lusyjwom.R.inc(96490);f0(v); // 2505, 1865
        }

//        System.out.println();
//
//        for (int i = 0; i < 10; ++i) {
//            f1(v); // 752, 571
//        }
    }}finally{__CLR4_5_222g422g4lusyjwom.R.flushNeeded();}}

    public static void f0(double v) throws Exception {try{__CLR4_5_222g422g4lusyjwom.R.inc(96491);
        __CLR4_5_222g422g4lusyjwom.R.inc(96492);long start = System.currentTimeMillis();
        __CLR4_5_222g422g4lusyjwom.R.inc(96493);for (int i = 0; (((i < COUNT)&&(__CLR4_5_222g422g4lusyjwom.R.iget(96494)!=0|true))||(__CLR4_5_222g422g4lusyjwom.R.iget(96495)==0&false)); ++i) {{
            __CLR4_5_222g422g4lusyjwom.R.inc(96496);Double.toString(v);
        }
        }__CLR4_5_222g422g4lusyjwom.R.inc(96497);long millis = System.currentTimeMillis() - start;
        __CLR4_5_222g422g4lusyjwom.R.inc(96498);System.out.println("jdk : " + millis);
    }finally{__CLR4_5_222g422g4lusyjwom.R.flushNeeded();}}

    public static void f1(double v) throws Exception {try{__CLR4_5_222g422g4lusyjwom.R.inc(96499);
        __CLR4_5_222g422g4lusyjwom.R.inc(96500);long start = System.currentTimeMillis();
        __CLR4_5_222g422g4lusyjwom.R.inc(96501);for (int i = 0; (((i < COUNT)&&(__CLR4_5_222g422g4lusyjwom.R.iget(96502)!=0|true))||(__CLR4_5_222g422g4lusyjwom.R.iget(96503)==0&false)); ++i) {{
            __CLR4_5_222g422g4lusyjwom.R.inc(96504);RyuDouble.toString(v);
        }
        }__CLR4_5_222g422g4lusyjwom.R.inc(96505);long millis = System.currentTimeMillis() - start;
        __CLR4_5_222g422g4lusyjwom.R.inc(96506);System.out.println("ryu : " + millis);
    }finally{__CLR4_5_222g422g4lusyjwom.R.flushNeeded();}}
}
