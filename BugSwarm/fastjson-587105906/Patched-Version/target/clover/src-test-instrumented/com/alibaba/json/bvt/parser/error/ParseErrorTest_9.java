/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.error;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

import junit.framework.TestCase;

public class ParseErrorTest_9 extends TestCase {static class __CLR4_5_21nlu1nlulusyjuej{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,77274,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_error() throws Exception {__CLR4_5_21nlu1nlulusyjuej.R.globalSliceStart(getClass().getName(),77250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qn60r01nlu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nlu1nlulusyjuej.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nlu1nlulusyjuej.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.ParseErrorTest_9.test_for_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77250,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qn60r01nlu() throws Exception{try{__CLR4_5_21nlu1nlulusyjuej.R.inc(77250);
        __CLR4_5_21nlu1nlulusyjuej.R.inc(77251);Exception error = null;
        __CLR4_5_21nlu1nlulusyjuej.R.inc(77252);try {
            __CLR4_5_21nlu1nlulusyjuej.R.inc(77253);JSON.parseObject("{\"value\":33\"}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nlu1nlulusyjuej.R.inc(77254);error = ex;
        }
        __CLR4_5_21nlu1nlulusyjuej.R.inc(77255);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nlu1nlulusyjuej.R.flushNeeded();}}
    
    public void test_for_error_2() throws Exception {__CLR4_5_21nlu1nlulusyjuej.R.globalSliceStart(getClass().getName(),77256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ua5j8h1nm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nlu1nlulusyjuej.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nlu1nlulusyjuej.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.ParseErrorTest_9.test_for_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77256,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ua5j8h1nm0() throws Exception{try{__CLR4_5_21nlu1nlulusyjuej.R.inc(77256);
        __CLR4_5_21nlu1nlulusyjuej.R.inc(77257);Exception error = null;
        __CLR4_5_21nlu1nlulusyjuej.R.inc(77258);try {
            __CLR4_5_21nlu1nlulusyjuej.R.inc(77259);JSON.parseObject("{\"value\":\"33\"", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nlu1nlulusyjuej.R.inc(77260);error = ex;
        }
        __CLR4_5_21nlu1nlulusyjuej.R.inc(77261);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nlu1nlulusyjuej.R.flushNeeded();}}
    
    public void test_for_error_3() throws Exception {__CLR4_5_21nlu1nlulusyjuej.R.globalSliceStart(getClass().getName(),77262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r15kg01nm6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nlu1nlulusyjuej.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nlu1nlulusyjuej.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.ParseErrorTest_9.test_for_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77262,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r15kg01nm6() throws Exception{try{__CLR4_5_21nlu1nlulusyjuej.R.inc(77262);
        __CLR4_5_21nlu1nlulusyjuej.R.inc(77263);Exception error = null;
        __CLR4_5_21nlu1nlulusyjuej.R.inc(77264);try {
            __CLR4_5_21nlu1nlulusyjuej.R.inc(77265);JSON.parseObject("{\"value\":\"33\",", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nlu1nlulusyjuej.R.inc(77266);error = ex;
        }
        __CLR4_5_21nlu1nlulusyjuej.R.inc(77267);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nlu1nlulusyjuej.R.flushNeeded();}}
    
    public void test_for_error_4() throws Exception {__CLR4_5_21nlu1nlulusyjuej.R.globalSliceStart(getClass().getName(),77268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ns5lnj1nmc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nlu1nlulusyjuej.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nlu1nlulusyjuej.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.ParseErrorTest_9.test_for_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77268,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ns5lnj1nmc() throws Exception{try{__CLR4_5_21nlu1nlulusyjuej.R.inc(77268);
        __CLR4_5_21nlu1nlulusyjuej.R.inc(77269);Exception error = null;
        __CLR4_5_21nlu1nlulusyjuej.R.inc(77270);try {
            __CLR4_5_21nlu1nlulusyjuej.R.inc(77271);JSON.parseObject("{\"value\":\"33\"},", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nlu1nlulusyjuej.R.inc(77272);error = ex;
        }
        __CLR4_5_21nlu1nlulusyjuej.R.inc(77273);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nlu1nlulusyjuej.R.flushNeeded();}}
    
    public static class Model {
        public long value;
    }
    
}
