/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.basicType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;

/**
 * Created by wenshao on 04/08/2017.
 */
public class DoubleTest2_obj extends TestCase {static class __CLR4_5_2127r127rlusyjqw4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,49561,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_obj() throws Exception {__CLR4_5_2127r127rlusyjqw4.R.globalSliceStart(getClass().getName(),49527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24ckqwf127r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2127r127rlusyjqw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2127r127rlusyjqw4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.DoubleTest2_obj.test_obj",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49527,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24ckqwf127r() throws Exception{try{__CLR4_5_2127r127rlusyjqw4.R.inc(49527);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49528);String json = "{\"v1\":-0.012671709,\"v2\":0.22676692048907365,\"v3\":0.13231707,\"v4\":0.80090785,\"v5\":0.6192943}";
        __CLR4_5_2127r127rlusyjqw4.R.inc(49529);String json2 = "{\"v1\":\"-0.012671709\",\"v2\":\"0.22676692048907365\",\"v3\":\"0.13231707\",\"v4\":\"0.80090785\",\"v5\":\"0.6192943\"}";

        __CLR4_5_2127r127rlusyjqw4.R.inc(49530);Model m1 = JSON.parseObject(json, Model.class);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49531);Model m2 = JSON.parseObject(json2, Model.class);

        __CLR4_5_2127r127rlusyjqw4.R.inc(49532);assertNotNull(m1);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49533);assertNotNull(m2);

        __CLR4_5_2127r127rlusyjqw4.R.inc(49534);assertEquals(-0.012671709D, m1.v1);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49535);assertEquals(0.22676692048907365D, m1.v2);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49536);assertEquals(0.13231707D, m1.v3);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49537);assertEquals(0.80090785D, m1.v4);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49538);assertEquals(0.6192943D, m1.v5);

        __CLR4_5_2127r127rlusyjqw4.R.inc(49539);assertEquals(-0.012671709D, m2.v1);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49540);assertEquals(0.22676692048907365D, m2.v2);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49541);assertEquals(0.13231707D, m2.v3);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49542);assertEquals(0.80090785D, m2.v4);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49543);assertEquals(0.6192943D, m2.v5);
    }finally{__CLR4_5_2127r127rlusyjqw4.R.flushNeeded();}}

    public void test_array_mapping() throws Exception {__CLR4_5_2127r127rlusyjqw4.R.globalSliceStart(getClass().getName(),49544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ekw3xe1288();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2127r127rlusyjqw4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2127r127rlusyjqw4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.DoubleTest2_obj.test_array_mapping",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49544,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ekw3xe1288() throws Exception{try{__CLR4_5_2127r127rlusyjqw4.R.inc(49544);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49545);String json = "[-0.012671709,0.22676692048907365,0.13231707,0.80090785,0.6192943]";
        __CLR4_5_2127r127rlusyjqw4.R.inc(49546);String json2 = "[\"-0.012671709\",\"0.22676692048907365\",\"0.13231707\",\"0.80090785\",\"0.6192943\"]";

        __CLR4_5_2127r127rlusyjqw4.R.inc(49547);Model m1 = JSON.parseObject(json, Model.class, Feature.SupportArrayToBean);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49548);Model m2 = JSON.parseObject(json2, Model.class, Feature.SupportArrayToBean);

        __CLR4_5_2127r127rlusyjqw4.R.inc(49549);assertNotNull(m1);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49550);assertNotNull(m2);

        __CLR4_5_2127r127rlusyjqw4.R.inc(49551);assertEquals(-0.012671709D, m1.v1);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49552);assertEquals(0.22676692048907365D, m1.v2);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49553);assertEquals(0.13231707D, m1.v3);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49554);assertEquals(0.80090785D, m1.v4);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49555);assertEquals(0.6192943D, m1.v5);

        __CLR4_5_2127r127rlusyjqw4.R.inc(49556);assertEquals(-0.012671709D, m2.v1);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49557);assertEquals(0.22676692048907365D, m2.v2);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49558);assertEquals(0.13231707D, m2.v3);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49559);assertEquals(0.80090785D, m2.v4);
        __CLR4_5_2127r127rlusyjqw4.R.inc(49560);assertEquals(0.6192943D, m2.v5);
    }finally{__CLR4_5_2127r127rlusyjqw4.R.flushNeeded();}}

    public static class Model {
        public Double v1;
        public Double v2;
        public Double v3;
        public Double v4;
        public Double v5;
    }
}
