/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1700;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;

public class Issue1739 extends TestCase {static class __CLR4_1_101dao1daoluszwb8a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,63906,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101dao1daoluszwb8a.R.globalSliceStart(getClass().getName(),63888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1dao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101dao1daoluszwb8a.R.rethrow($CLV_t2$);}finally{__CLR4_1_101dao1daoluszwb8a.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1700.Issue1739.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63888,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1dao() throws Exception{try{__CLR4_1_101dao1daoluszwb8a.R.inc(63888);
        __CLR4_1_101dao1daoluszwb8a.R.inc(63889);M0 model = new M0();
        __CLR4_1_101dao1daoluszwb8a.R.inc(63890);model.data = new JSONObject();

        __CLR4_1_101dao1daoluszwb8a.R.inc(63891);String json = JSON.toJSONString(model);
        __CLR4_1_101dao1daoluszwb8a.R.inc(63892);assertEquals("{\"data\":{}}", json);
    }finally{__CLR4_1_101dao1daoluszwb8a.R.flushNeeded();}}

    public void test_for_issue_1() throws Exception {__CLR4_1_101dao1daoluszwb8a.R.globalSliceStart(getClass().getName(),63893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uhstn51dat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101dao1daoluszwb8a.R.rethrow($CLV_t2$);}finally{__CLR4_1_101dao1daoluszwb8a.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1700.Issue1739.test_for_issue_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63893,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uhstn51dat() throws Exception{try{__CLR4_1_101dao1daoluszwb8a.R.inc(63893);
        __CLR4_1_101dao1daoluszwb8a.R.inc(63894);M1 model = new M1();
        __CLR4_1_101dao1daoluszwb8a.R.inc(63895);model.data = new JSONObject();

        __CLR4_1_101dao1daoluszwb8a.R.inc(63896);String json = JSON.toJSONString(model);
        __CLR4_1_101dao1daoluszwb8a.R.inc(63897);assertEquals("{}", json);
    }finally{__CLR4_1_101dao1daoluszwb8a.R.flushNeeded();}}

    public static class M0 {
        private JSONObject data;

        @JSONField(deserialize = false)
        public JSONObject getData() {try{__CLR4_1_101dao1daoluszwb8a.R.inc(63898);
            __CLR4_1_101dao1daoluszwb8a.R.inc(63899);return data;
        }finally{__CLR4_1_101dao1daoluszwb8a.R.flushNeeded();}}

        public void setData(JSONObject data) {try{__CLR4_1_101dao1daoluszwb8a.R.inc(63900);
            __CLR4_1_101dao1daoluszwb8a.R.inc(63901);this.data = data;
        }finally{__CLR4_1_101dao1daoluszwb8a.R.flushNeeded();}}
    }

    public static class M1 {
        private JSONObject data;

        @JSONField(serialize = false)
        public JSONObject getData() {try{__CLR4_1_101dao1daoluszwb8a.R.inc(63902);
            __CLR4_1_101dao1daoluszwb8a.R.inc(63903);return data;
        }finally{__CLR4_1_101dao1daoluszwb8a.R.flushNeeded();}}

        public void setData(JSONObject data) {try{__CLR4_1_101dao1daoluszwb8a.R.inc(63904);
            __CLR4_1_101dao1daoluszwb8a.R.inc(63905);this.data = data;
        }finally{__CLR4_1_101dao1daoluszwb8a.R.flushNeeded();}}
    }
}
