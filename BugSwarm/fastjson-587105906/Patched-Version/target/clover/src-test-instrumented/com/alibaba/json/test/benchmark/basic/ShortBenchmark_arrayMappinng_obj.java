/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.benchmark.basic;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;

import java.util.Random;

/**
 * Created by wenshao on 04/08/2017.
 */
public class ShortBenchmark_arrayMappinng_obj {public static class __CLR4_5_222xj22xjlusyjwqs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,97139,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static String json = "[-5972,5582,-2398,-9859,25417]";
    static String json2 = "[\"-5972\",\"5582\",\"-2398\",\"-9859\",\"25417\"]";

    public static void main(String[] args) throws Exception {try{__CLR4_5_222xj22xjlusyjwqs.R.inc(97111);
        __CLR4_5_222xj22xjlusyjwqs.R.inc(97112);Model model = new Model();
        __CLR4_5_222xj22xjlusyjwqs.R.inc(97113);model.v1 = (short) new Random().nextInt();
        __CLR4_5_222xj22xjlusyjwqs.R.inc(97114);model.v2 = (short) new Random().nextInt();
        __CLR4_5_222xj22xjlusyjwqs.R.inc(97115);model.v3 = (short) new Random().nextInt();
        __CLR4_5_222xj22xjlusyjwqs.R.inc(97116);model.v4 = (short) new Random().nextInt();
        __CLR4_5_222xj22xjlusyjwqs.R.inc(97117);model.v5 = (short) new Random().nextInt();

        __CLR4_5_222xj22xjlusyjwqs.R.inc(97118);System.out.println(JSON.toJSONString(model));

        __CLR4_5_222xj22xjlusyjwqs.R.inc(97119);for (int i = 0; (((i < 10)&&(__CLR4_5_222xj22xjlusyjwqs.R.iget(97120)!=0|true))||(__CLR4_5_222xj22xjlusyjwqs.R.iget(97121)==0&false)); ++i) {{
             __CLR4_5_222xj22xjlusyjwqs.R.inc(97122);perf(); // 1087
//            perf2(); // 1120
        }
    }}finally{__CLR4_5_222xj22xjlusyjwqs.R.flushNeeded();}}

    public static void perf() {try{__CLR4_5_222xj22xjlusyjwqs.R.inc(97123);
        __CLR4_5_222xj22xjlusyjwqs.R.inc(97124);long start = System.currentTimeMillis();
        __CLR4_5_222xj22xjlusyjwqs.R.inc(97125);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_222xj22xjlusyjwqs.R.iget(97126)!=0|true))||(__CLR4_5_222xj22xjlusyjwqs.R.iget(97127)==0&false)); ++i) {{
            __CLR4_5_222xj22xjlusyjwqs.R.inc(97128);JSON.parseObject(json, Model.class, Feature.SupportArrayToBean);
        }
        }__CLR4_5_222xj22xjlusyjwqs.R.inc(97129);long millis = System.currentTimeMillis() - start;
        __CLR4_5_222xj22xjlusyjwqs.R.inc(97130);System.out.println("millis : " + millis);
    }finally{__CLR4_5_222xj22xjlusyjwqs.R.flushNeeded();}}

    public static void perf2() {try{__CLR4_5_222xj22xjlusyjwqs.R.inc(97131);
        __CLR4_5_222xj22xjlusyjwqs.R.inc(97132);long start = System.currentTimeMillis();
        __CLR4_5_222xj22xjlusyjwqs.R.inc(97133);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_222xj22xjlusyjwqs.R.iget(97134)!=0|true))||(__CLR4_5_222xj22xjlusyjwqs.R.iget(97135)==0&false)); ++i) {{
            __CLR4_5_222xj22xjlusyjwqs.R.inc(97136);JSON.parseObject(json2, Model.class, Feature.SupportArrayToBean);
        }
        }__CLR4_5_222xj22xjlusyjwqs.R.inc(97137);long millis = System.currentTimeMillis() - start;
        __CLR4_5_222xj22xjlusyjwqs.R.inc(97138);System.out.println("millis : " + millis);
    }finally{__CLR4_5_222xj22xjlusyjwqs.R.flushNeeded();}}

    public static class Model {
        public Short v1;
        public Short v2;
        public Short v3;
        public Short v4;
        public Short v5;
    }
}
