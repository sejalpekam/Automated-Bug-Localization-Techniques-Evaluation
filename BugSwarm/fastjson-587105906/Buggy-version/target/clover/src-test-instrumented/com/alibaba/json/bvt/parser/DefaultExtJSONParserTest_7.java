/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;

public class DefaultExtJSONParserTest_7 extends TestCase {static class __CLR4_1_101gvf1gvfluszwcck{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,68550,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_parse() throws Exception {__CLR4_1_101gvf1gvfluszwcck.R.globalSliceStart(getClass().getName(),68523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g914tv1gvf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gvf1gvfluszwcck.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gvf1gvfluszwcck.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_7.test_parse",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68523,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g914tv1gvf() throws Exception{try{__CLR4_1_101gvf1gvfluszwcck.R.inc(68523);
        __CLR4_1_101gvf1gvfluszwcck.R.inc(68524);DefaultJSONParser parser = new DefaultJSONParser("1");
        __CLR4_1_101gvf1gvfluszwcck.R.inc(68525);Assert.assertEquals(Integer.valueOf(1), parser.parse());

        __CLR4_1_101gvf1gvfluszwcck.R.inc(68526);Exception error = null;
        __CLR4_1_101gvf1gvfluszwcck.R.inc(68527);try {
            __CLR4_1_101gvf1gvfluszwcck.R.inc(68528);parser.parse();
        } catch (Exception ex) {
            __CLR4_1_101gvf1gvfluszwcck.R.inc(68529);error = ex;
        }
        __CLR4_1_101gvf1gvfluszwcck.R.inc(68530);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gvf1gvfluszwcck.R.flushNeeded();}}

    public void test_parse_str() throws Exception {__CLR4_1_101gvf1gvfluszwcck.R.globalSliceStart(getClass().getName(),68531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10aj6v0h1gvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gvf1gvfluszwcck.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gvf1gvfluszwcck.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_7.test_parse_str",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68531,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10aj6v0h1gvn() throws Exception{try{__CLR4_1_101gvf1gvfluszwcck.R.inc(68531);
        __CLR4_1_101gvf1gvfluszwcck.R.inc(68532);DefaultJSONParser parser = new DefaultJSONParser("\"1\"");
        __CLR4_1_101gvf1gvfluszwcck.R.inc(68533);parser.config(Feature.AllowISO8601DateFormat, true);
        __CLR4_1_101gvf1gvfluszwcck.R.inc(68534);Assert.assertEquals("1", parser.parse());

    }finally{__CLR4_1_101gvf1gvfluszwcck.R.flushNeeded();}}

    public void test_parseArray() throws Exception {__CLR4_1_101gvf1gvfluszwcck.R.globalSliceStart(getClass().getName(),68535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s9r5k61gvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gvf1gvfluszwcck.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gvf1gvfluszwcck.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_7.test_parseArray",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68535,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s9r5k61gvr() throws Exception{try{__CLR4_1_101gvf1gvfluszwcck.R.inc(68535);
        __CLR4_1_101gvf1gvfluszwcck.R.inc(68536);DefaultJSONParser parser = new DefaultJSONParser("[1]");
        __CLR4_1_101gvf1gvfluszwcck.R.inc(68537);parser.config(Feature.AllowArbitraryCommas, false);
        __CLR4_1_101gvf1gvfluszwcck.R.inc(68538);List<String> list = new ArrayList<String>();
        __CLR4_1_101gvf1gvfluszwcck.R.inc(68539);parser.parseArray(String.class, list);
        __CLR4_1_101gvf1gvfluszwcck.R.inc(68540);Assert.assertEquals(1, list.size());
    }finally{__CLR4_1_101gvf1gvfluszwcck.R.flushNeeded();}}

    public void test_parseArray_error() throws Exception {__CLR4_1_101gvf1gvfluszwcck.R.globalSliceStart(getClass().getName(),68541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v0bsub1gvx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gvf1gvfluszwcck.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gvf1gvfluszwcck.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_7.test_parseArray_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68541,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v0bsub1gvx() throws Exception{try{__CLR4_1_101gvf1gvfluszwcck.R.inc(68541);
        __CLR4_1_101gvf1gvfluszwcck.R.inc(68542);DefaultJSONParser parser = new DefaultJSONParser("[1,2}");
        __CLR4_1_101gvf1gvfluszwcck.R.inc(68543);parser.config(Feature.AllowArbitraryCommas, false);
        __CLR4_1_101gvf1gvfluszwcck.R.inc(68544);List<String> list = new ArrayList<String>();

        __CLR4_1_101gvf1gvfluszwcck.R.inc(68545);Exception error = null;
        __CLR4_1_101gvf1gvfluszwcck.R.inc(68546);try {
            __CLR4_1_101gvf1gvfluszwcck.R.inc(68547);parser.parseArray(String.class, list);
        } catch (JSONException ex) {
            __CLR4_1_101gvf1gvfluszwcck.R.inc(68548);error = ex;
        }
        __CLR4_1_101gvf1gvfluszwcck.R.inc(68549);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gvf1gvfluszwcck.R.flushNeeded();}}
}
