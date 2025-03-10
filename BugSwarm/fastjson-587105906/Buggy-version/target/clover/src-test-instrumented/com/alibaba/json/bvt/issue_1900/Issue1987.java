/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1900;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

import java.time.LocalDateTime;

public class Issue1987 extends TestCase {static class __CLR4_1_101dpd1dpdluszwbdf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,64432,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101dpd1dpdluszwbdf.R.globalSliceStart(getClass().getName(),64417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1dpd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101dpd1dpdluszwbdf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101dpd1dpdluszwbdf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1900.Issue1987.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),64417,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1dpd() throws Exception{try{__CLR4_1_101dpd1dpdluszwbdf.R.inc(64417);
        __CLR4_1_101dpd1dpdluszwbdf.R.inc(64418);JsonExample example = new JsonExample();

        //test1 \u6b63\u786e\u6267\u884c, test2, test3 \u6267\u884c\u51fa\u9519 com.alibaba.fastjson.JSONException: can not cast to : java.time.LocalDateTime
        __CLR4_1_101dpd1dpdluszwbdf.R.inc(64419);example.setTestLocalDateTime(LocalDateTime.now());

        //\u7eb3\u79d2\u6570\u8bbe\u7f6e\u4e3a0 ,test1,test2,test3 \u5168\u90e8\u6b63\u786e\u6267\u884c
        //example.setTestLocalDateTime(LocalDateTime.now().withNano(0));
        __CLR4_1_101dpd1dpdluszwbdf.R.inc(64420);String text = JSON.toJSONString(example, SerializerFeature.PrettyFormat);
        __CLR4_1_101dpd1dpdluszwbdf.R.inc(64421);System.out.println(text);

        //test1, \u5168\u90e8\u53ef\u4ee5\u6b63\u5e38\u6267\u884c
        __CLR4_1_101dpd1dpdluszwbdf.R.inc(64422);JsonExample example1 = JSON.parseObject(text, JsonExample.class);
        __CLR4_1_101dpd1dpdluszwbdf.R.inc(64423);System.out.println(JSON.toJSONString(example1));

        //test2  \u7eb3\u79d2\u6570\u4e3a0, \u53ef\u4ee5\u6b63\u5e38\u6267\u884c, \u4e0d\u4e3a0\u5219\u62a5\u9519
        __CLR4_1_101dpd1dpdluszwbdf.R.inc(64424);JsonExample example2 = JSONObject.parseObject(text).toJavaObject(JsonExample.class);
        __CLR4_1_101dpd1dpdluszwbdf.R.inc(64425);System.out.println(JSON.toJSONString(example2));

        //test3 \u7eb3\u79d2\u6570\u4e3a0, \u53ef\u4ee5\u6b63\u5e38\u6267\u884c, \u4e0d\u4e3a0\u5219\u62a5\u9519
        __CLR4_1_101dpd1dpdluszwbdf.R.inc(64426);JsonExample example3 = JSON.parseObject(text).toJavaObject(JsonExample.class);
        __CLR4_1_101dpd1dpdluszwbdf.R.inc(64427);System.out.println(JSON.toJSONString(example3));
    }finally{__CLR4_1_101dpd1dpdluszwbdf.R.flushNeeded();}}

    public static class JsonExample {

        private LocalDateTime testLocalDateTime;

        public LocalDateTime getTestLocalDateTime() {try{__CLR4_1_101dpd1dpdluszwbdf.R.inc(64428);
            __CLR4_1_101dpd1dpdluszwbdf.R.inc(64429);return testLocalDateTime;
        }finally{__CLR4_1_101dpd1dpdluszwbdf.R.flushNeeded();}}

        public void setTestLocalDateTime(LocalDateTime testLocalDateTime) {try{__CLR4_1_101dpd1dpdluszwbdf.R.inc(64430);
            __CLR4_1_101dpd1dpdluszwbdf.R.inc(64431);this.testLocalDateTime = testLocalDateTime;
        }finally{__CLR4_1_101dpd1dpdluszwbdf.R.flushNeeded();}}
    }
}
