/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.benchmark.basic;

import com.alibaba.fastjson.JSON;

import java.math.BigInteger;

/**
 * Created by wenshao on 04/08/2017.
 */
public class BigIntegerBenchmark {public static class __CLR4_1_1023gq23gqluszwi71{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,97823,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static String json = "{\"v1\":-1883391953414482124,\"v2\":-3019416596934963650,\"v3\":6497525620823745793,\"v4\":2136224289077142499,\"v5\":-2090575024006307745}";
    static String json2 = "{\"v1\":\"-1883391953414482124\",\"v2\":\"-3019416596934963650\",\"v3\":\"6497525620823745793\",\"v4\":\"2136224289077142499\",\"v5\":\"-2090575024006307745\"}";

    public static void main(String[] args) throws Exception {try{__CLR4_1_1023gq23gqluszwi71.R.inc(97802);
//        Model model = new Model();
//        model.v1 = new Random().nextLong();
//        model.v2 = new Random().nextLong();
//        model.v3 = new Random().nextLong();
//        model.v4 = new Random().nextLong();
//        model.v5 = new Random().nextLong();
//
//        System.out.println(JSON.toJSONString(model));

        __CLR4_1_1023gq23gqluszwi71.R.inc(97803);for (int i = 0; (((i < 10)&&(__CLR4_1_1023gq23gqluszwi71.R.iget(97804)!=0|true))||(__CLR4_1_1023gq23gqluszwi71.R.iget(97805)==0&false)); ++i) {{
             __CLR4_1_1023gq23gqluszwi71.R.inc(97806);perf(); // 3162
//            perf2(); // 3265
        }
    }}finally{__CLR4_1_1023gq23gqluszwi71.R.flushNeeded();}}

    public static void perf() {try{__CLR4_1_1023gq23gqluszwi71.R.inc(97807);
        __CLR4_1_1023gq23gqluszwi71.R.inc(97808);long start = System.currentTimeMillis();
        __CLR4_1_1023gq23gqluszwi71.R.inc(97809);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_1_1023gq23gqluszwi71.R.iget(97810)!=0|true))||(__CLR4_1_1023gq23gqluszwi71.R.iget(97811)==0&false)); ++i) {{
            __CLR4_1_1023gq23gqluszwi71.R.inc(97812);JSON.parseObject(json, Model.class);
        }
        }__CLR4_1_1023gq23gqluszwi71.R.inc(97813);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1023gq23gqluszwi71.R.inc(97814);System.out.println("millis : " + millis);
    }finally{__CLR4_1_1023gq23gqluszwi71.R.flushNeeded();}}

    public static void perf2() {try{__CLR4_1_1023gq23gqluszwi71.R.inc(97815);
        __CLR4_1_1023gq23gqluszwi71.R.inc(97816);long start = System.currentTimeMillis();
        __CLR4_1_1023gq23gqluszwi71.R.inc(97817);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_1_1023gq23gqluszwi71.R.iget(97818)!=0|true))||(__CLR4_1_1023gq23gqluszwi71.R.iget(97819)==0&false)); ++i) {{
            __CLR4_1_1023gq23gqluszwi71.R.inc(97820);JSON.parseObject(json2, Model.class);
        }
        }__CLR4_1_1023gq23gqluszwi71.R.inc(97821);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1023gq23gqluszwi71.R.inc(97822);System.out.println("millis : " + millis);
    }finally{__CLR4_1_1023gq23gqluszwi71.R.flushNeeded();}}

    public static class Model {
        public BigInteger v1;
        public BigInteger v2;
        public BigInteger v3;
        public BigInteger v4;
        public BigInteger v5;
    }
}
