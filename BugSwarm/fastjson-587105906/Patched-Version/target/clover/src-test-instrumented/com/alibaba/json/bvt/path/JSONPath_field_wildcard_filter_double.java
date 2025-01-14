/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;

import java.util.Collection;
import java.util.Map;

public class JSONPath_field_wildcard_filter_double extends TestCase {static class __CLR4_5_21pgm1pgmlusyjum9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,79666,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_map_0() throws Exception {__CLR4_5_21pgm1pgmlusyjum9.R.globalSliceStart(getClass().getName(),79654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yct1y81pgm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pgm1pgmlusyjum9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pgm1pgmlusyjum9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_wildcard_filter_double.test_list_map_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79654,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yct1y81pgm() throws Exception{try{__CLR4_5_21pgm1pgmlusyjum9.R.inc(79654);
        __CLR4_5_21pgm1pgmlusyjum9.R.inc(79655);Map<String, Value> jsonObject = JSON.parseObject(text, new TypeReference<Map<String, Value>>(){}, Feature.OrderedField);

        __CLR4_5_21pgm1pgmlusyjum9.R.inc(79656);Collection array = (Collection) JSONPath.eval(jsonObject, "$.*[score>0]");
        __CLR4_5_21pgm1pgmlusyjum9.R.inc(79657);assertEquals("[{\"score\":0.8951322155668501},{\"score\":0.7237896928683851},{\"score\":0.3467174233072834}]", JSON.toJSONString(array));
    }finally{__CLR4_5_21pgm1pgmlusyjum9.R.flushNeeded();}}

    public void test_list_map_1() throws Exception {__CLR4_5_21pgm1pgmlusyjum9.R.globalSliceStart(getClass().getName(),79658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xfb18f1pgq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pgm1pgmlusyjum9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pgm1pgmlusyjum9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_wildcard_filter_double.test_list_map_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79658,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xfb18f1pgq() throws Exception{try{__CLR4_5_21pgm1pgmlusyjum9.R.inc(79658);
        __CLR4_5_21pgm1pgmlusyjum9.R.inc(79659);Map<String, Value> jsonObject = JSON.parseObject(text, new TypeReference<Map<String, Value>>(){}, Feature.OrderedField);

        __CLR4_5_21pgm1pgmlusyjum9.R.inc(79660);Collection array = (Collection) JSONPath.eval(jsonObject, "$.*[score<0]");
        __CLR4_5_21pgm1pgmlusyjum9.R.inc(79661);assertEquals("[{\"score\":-0.3453003960431523}]", JSON.toJSONString(array));
    }finally{__CLR4_5_21pgm1pgmlusyjum9.R.flushNeeded();}}

    public void test_list_map_2() throws Exception {__CLR4_5_21pgm1pgmlusyjum9.R.globalSliceStart(getClass().getName(),79662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u6b2fy1pgu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pgm1pgmlusyjum9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pgm1pgmlusyjum9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_wildcard_filter_double.test_list_map_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79662,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u6b2fy1pgu() throws Exception{try{__CLR4_5_21pgm1pgmlusyjum9.R.inc(79662);
        __CLR4_5_21pgm1pgmlusyjum9.R.inc(79663);Map<String, Value> jsonObject = JSON.parseObject(text, new TypeReference<Map<String, Value>>(){}, Feature.OrderedField);

        __CLR4_5_21pgm1pgmlusyjum9.R.inc(79664);Collection array = (Collection) JSONPath.eval(jsonObject, "$.*[score=0]");
        __CLR4_5_21pgm1pgmlusyjum9.R.inc(79665);assertEquals("[{\"score\":0.0},{\"score\":0.0},{\"score\":0.0},{\"score\":0.0},{\"score\":0.0},{\"score\":0.0},{\"score\":0.0}]", JSON.toJSONString(array));
    }finally{__CLR4_5_21pgm1pgmlusyjum9.R.flushNeeded();}}

    public static class Value {
        public double score;
    }

    public static final String text = "{\n" +
            "\t\"risk_sexy_trade_stream_plus\": {\n" +
            "\t\t\"score\": 0\n" +
            "\t},\n" +
            "\t\"chemical_medicine_stream_plus\": {\n" +
            "\t\t\"score\": 0\n" +
            "\t},\n" +
            "\t\"gambling_trade_stream_plus\": {\n" +
            "\t\t\"score\": 0\n" +
            "\t},\n" +
            "\t\"politics_stream_plus\": {\n" +
            "\t\t\"score\": 0.89513221556685012\n" +
            "\t},\n" +
            "\t\"risk_tool_gun_stream_plus\": {\n" +
            "\t\t\"score\": 0\n" +
            "\t},\n" +
            "\t\"sex_model_stream_plus\": {\n" +
            "\t\t\"score\": 0.7237896928683851\n" +
            "\t},\n" +
            "\t\"risk_tool_cheat_stream_plus\": {\n" +
            "\t\t\"score\": 0\n" +
            "\t},\n" +
            "\t\"risk_tool_certif_stream_plus\": {\n" +
            "\t\t\"score\": 0\n" +
            "\t},\n" +
            "\t\"gamble_model_stream_plus\": {\n" +
            "\t\t\"score\": -0.3453003960431523\n" +
            "\t},\n" +
            "\t\"risk_tool_vpn_stream_plus\": {\n" +
            "\t\t\"score\": 0\n" +
            "\t},\n" +
            "\t\"vpndetect_stream_plus\": {\n" +
            "\t\t\"score\": 0.3467174233072834\n" +
            "\t}\n" +
            "}";

}
