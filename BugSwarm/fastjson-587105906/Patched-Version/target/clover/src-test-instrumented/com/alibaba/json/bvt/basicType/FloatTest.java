/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.basicType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;

/**
 * Created by wenshao on 04/08/2017.
 */
public class FloatTest extends TestCase {static class __CLR4_5_212b412b4lusyjqwo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,49682,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_5_212b412b4lusyjqwo.R.globalSliceStart(getClass().getName(),49648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp212b4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212b412b4lusyjqwo.R.rethrow($CLV_t2$);}finally{__CLR4_5_212b412b4lusyjqwo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.FloatTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49648,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp212b4() throws Exception{try{__CLR4_5_212b412b4lusyjqwo.R.inc(49648);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49649);String json = "{\"v1\":-0.012671709,\"v2\":0.6042485,\"v3\":0.13231707,\"v4\":0.80090785,\"v5\":0.6192943}";
        __CLR4_5_212b412b4lusyjqwo.R.inc(49650);String json2 = "{\"v1\":\"-0.012671709\",\"v2\":\"0.6042485\",\"v3\":\"0.13231707\",\"v4\":\"0.80090785\",\"v5\":\"0.6192943\"}";

        __CLR4_5_212b412b4lusyjqwo.R.inc(49651);Model m1 = JSON.parseObject(json, Model.class);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49652);Model m2 = JSON.parseObject(json2, Model.class);

        __CLR4_5_212b412b4lusyjqwo.R.inc(49653);assertNotNull(m1);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49654);assertNotNull(m2);

        __CLR4_5_212b412b4lusyjqwo.R.inc(49655);assertEquals(-0.012671709f, m1.v1);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49656);assertEquals(0.6042485f, m1.v2);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49657);assertEquals(0.13231707f, m1.v3);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49658);assertEquals(0.80090785f, m1.v4);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49659);assertEquals(0.6192943f, m1.v5);

        __CLR4_5_212b412b4lusyjqwo.R.inc(49660);assertEquals(-0.012671709f, m2.v1);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49661);assertEquals(0.6042485f, m2.v2);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49662);assertEquals(0.13231707f, m2.v3);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49663);assertEquals(0.80090785f, m2.v4);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49664);assertEquals(0.6192943f, m2.v5);
    }finally{__CLR4_5_212b412b4lusyjqwo.R.flushNeeded();}}

    public void test_array_mapping() throws Exception {__CLR4_5_212b412b4lusyjqwo.R.globalSliceStart(getClass().getName(),49665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ekw3xe12bl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212b412b4lusyjqwo.R.rethrow($CLV_t2$);}finally{__CLR4_5_212b412b4lusyjqwo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.FloatTest.test_array_mapping",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49665,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ekw3xe12bl() throws Exception{try{__CLR4_5_212b412b4lusyjqwo.R.inc(49665);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49666);String json = "[-0.012671709,0.6042485,0.13231707,0.80090785,0.6192943]";
        __CLR4_5_212b412b4lusyjqwo.R.inc(49667);String json2 = "[\"-0.012671709\",\"0.6042485\",\"0.13231707\",\"0.80090785\",\"0.6192943\"]";

        __CLR4_5_212b412b4lusyjqwo.R.inc(49668);Model m1 = JSON.parseObject(json, Model.class, Feature.SupportArrayToBean);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49669);Model m2 = JSON.parseObject(json2, Model.class, Feature.SupportArrayToBean);

        __CLR4_5_212b412b4lusyjqwo.R.inc(49670);assertNotNull(m1);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49671);assertNotNull(m2);

        __CLR4_5_212b412b4lusyjqwo.R.inc(49672);assertEquals(-0.012671709f, m1.v1);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49673);assertEquals(0.6042485f, m1.v2);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49674);assertEquals(0.13231707f, m1.v3);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49675);assertEquals(0.80090785f, m1.v4);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49676);assertEquals(0.6192943f, m1.v5);

        __CLR4_5_212b412b4lusyjqwo.R.inc(49677);assertEquals(-0.012671709f, m2.v1);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49678);assertEquals(0.6042485f, m2.v2);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49679);assertEquals(0.13231707f, m2.v3);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49680);assertEquals(0.80090785f, m2.v4);
        __CLR4_5_212b412b4lusyjqwo.R.inc(49681);assertEquals(0.6192943f, m2.v5);
    }finally{__CLR4_5_212b412b4lusyjqwo.R.flushNeeded();}}

    public static class Model {
        public float v1;
        public float v2;
        public float v3;
        public float v4;
        public float v5;
    }
}
