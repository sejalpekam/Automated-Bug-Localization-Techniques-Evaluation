/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1300;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import junit.framework.TestCase;

/**
 * Created by wenshao on 30/07/2017.
 */
public class Issue1330 extends TestCase {static class __CLR4_1_101ax01ax0luszwalk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,60825,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101ax01ax0luszwalk.R.globalSliceStart(getClass().getName(),60804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1ax0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ax01ax0luszwalk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ax01ax0luszwalk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1330.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),60804,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1ax0() throws Exception{try{__CLR4_1_101ax01ax0luszwalk.R.inc(60804);
        __CLR4_1_101ax01ax0luszwalk.R.inc(60805);Exception error = null;
        __CLR4_1_101ax01ax0luszwalk.R.inc(60806);try {
            __CLR4_1_101ax01ax0luszwalk.R.inc(60807);JSON.parseObject("{\"value\":\"ABC\"}", Model.class);
        } catch (JSONException e) {
            __CLR4_1_101ax01ax0luszwalk.R.inc(60808);error = e;
        }
        __CLR4_1_101ax01ax0luszwalk.R.inc(60809);assertNotNull(error);
        __CLR4_1_101ax01ax0luszwalk.R.inc(60810);assertTrue(error.getMessage().indexOf("parseInt error, field : value") != -1);
    }finally{__CLR4_1_101ax01ax0luszwalk.R.flushNeeded();}}

    public void test_for_issue_1() throws Exception {__CLR4_1_101ax01ax0luszwalk.R.globalSliceStart(getClass().getName(),60811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uhstn51ax7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ax01ax0luszwalk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ax01ax0luszwalk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1330.test_for_issue_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),60811,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uhstn51ax7() throws Exception{try{__CLR4_1_101ax01ax0luszwalk.R.inc(60811);
        __CLR4_1_101ax01ax0luszwalk.R.inc(60812);Exception error = null;
        __CLR4_1_101ax01ax0luszwalk.R.inc(60813);try {
            __CLR4_1_101ax01ax0luszwalk.R.inc(60814);JSON.parseObject("{\"value\":[]}", Model.class);
        } catch (JSONException e) {
            __CLR4_1_101ax01ax0luszwalk.R.inc(60815);error = e;
        }
        __CLR4_1_101ax01ax0luszwalk.R.inc(60816);assertNotNull(error);
        __CLR4_1_101ax01ax0luszwalk.R.inc(60817);assertTrue(error.getMessage().indexOf("parseInt error, field : value") != -1);
    }finally{__CLR4_1_101ax01ax0luszwalk.R.flushNeeded();}}

    public void test_for_issue_2() throws Exception {__CLR4_1_101ax01ax0luszwalk.R.globalSliceStart(getClass().getName(),60818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10r8suuo1axe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ax01ax0luszwalk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ax01ax0luszwalk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1330.test_for_issue_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),60818,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10r8suuo1axe() throws Exception{try{__CLR4_1_101ax01ax0luszwalk.R.inc(60818);
        __CLR4_1_101ax01ax0luszwalk.R.inc(60819);Exception error = null;
        __CLR4_1_101ax01ax0luszwalk.R.inc(60820);try {
            __CLR4_1_101ax01ax0luszwalk.R.inc(60821);JSON.parseObject("{\"value\":{}}", Model.class);
        } catch (JSONException e) {
            __CLR4_1_101ax01ax0luszwalk.R.inc(60822);error = e;
        }
        __CLR4_1_101ax01ax0luszwalk.R.inc(60823);assertNotNull(error);
        __CLR4_1_101ax01ax0luszwalk.R.inc(60824);assertTrue(error.getMessage().indexOf("parseInt error, field : value") != -1);
    }finally{__CLR4_1_101ax01ax0luszwalk.R.flushNeeded();}}

    public static class Model {
        public int value;
    }
}
