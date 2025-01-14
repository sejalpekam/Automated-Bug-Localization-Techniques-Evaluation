/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1400;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.json.bvt.issue_1500.Issue1500;
import junit.framework.TestCase;
import org.junit.Assert;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.TimeZone;

public class Issue1493 extends TestCase {static class __CLR4_1_101bld1bldluszwasb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,61710,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_101bld1bldluszwasb.R.inc(61681);
        __CLR4_1_101bld1bldluszwasb.R.inc(61682);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_101bld1bldluszwasb.R.inc(61683);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_1_101bld1bldluszwasb.R.flushNeeded();}}

    public void test_for_issue() throws Exception {__CLR4_1_101bld1bldluszwasb.R.globalSliceStart(getClass().getName(),61684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1blg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101bld1bldluszwasb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101bld1bldluszwasb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1400.Issue1493.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),61684,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1blg() throws Exception{try{__CLR4_1_101bld1bldluszwasb.R.inc(61684);

        __CLR4_1_101bld1bldluszwasb.R.inc(61685);TestBean test = new TestBean();
        __CLR4_1_101bld1bldluszwasb.R.inc(61686);String stime2 = "2017-09-22T15:08:56";

        __CLR4_1_101bld1bldluszwasb.R.inc(61687);LocalDateTime time1 = LocalDateTime.now();
        __CLR4_1_101bld1bldluszwasb.R.inc(61688);time1 = time1.minusNanos(10L);
        __CLR4_1_101bld1bldluszwasb.R.inc(61689);System.out.println(time1.getNano());
        __CLR4_1_101bld1bldluszwasb.R.inc(61690);LocalDateTime time2 = LocalDateTime.parse(stime2);
        __CLR4_1_101bld1bldluszwasb.R.inc(61691);test.setTime1(time1);
        __CLR4_1_101bld1bldluszwasb.R.inc(61692);test.setTime2(time2);
        __CLR4_1_101bld1bldluszwasb.R.inc(61693);String t1 = JSON.toJSONString(time1, SerializerFeature.WriteDateUseDateFormat);

        __CLR4_1_101bld1bldluszwasb.R.inc(61694);String json = JSON.toJSONString(test, SerializerFeature.WriteDateUseDateFormat);
        __CLR4_1_101bld1bldluszwasb.R.inc(61695);Assert.assertEquals("{\"time1\":"+t1+",\"time2\":\""+stime2+"\"}",json);


        //String default_format = JSON.DEFFAULT_LOCAL_DATE_TIME_FORMAT;
        //JSON.DEFFAULT_LOCAL_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
        //String stime1 = DateTimeFormatter.ofPattern(JSON.DEFFAULT_LOCAL_DATE_TIME_FORMAT, Locale.CHINA).format(time1);

        __CLR4_1_101bld1bldluszwasb.R.inc(61696);json = JSON.toJSONString(test, SerializerFeature.WriteDateUseDateFormat);
        __CLR4_1_101bld1bldluszwasb.R.inc(61697);Assert.assertEquals("{\"time1\":"+ JSON.toJSONString(time1, SerializerFeature.WriteDateUseDateFormat) +",\"time2\":\""+stime2+"\"}",json);


        __CLR4_1_101bld1bldluszwasb.R.inc(61698);String pattern = "yyyy-MM-dd'T'HH:mm:ss";
        __CLR4_1_101bld1bldluszwasb.R.inc(61699);String stime1 = DateTimeFormatter.ofPattern(pattern, Locale.CHINA).format(time1);

        __CLR4_1_101bld1bldluszwasb.R.inc(61700);json = JSON.toJSONStringWithDateFormat(test, "yyyy-MM-dd'T'HH:mm:ss", SerializerFeature.WriteDateUseDateFormat);
        __CLR4_1_101bld1bldluszwasb.R.inc(61701);Assert.assertEquals("{\"time1\":\""+stime1+"\",\"time2\":\""+stime2+"\"}",json);

        //JSON.DEFFAULT_LOCAL_DATE_TIME_FORMAT = default_format;
    }finally{__CLR4_1_101bld1bldluszwasb.R.flushNeeded();}}

    public static class TestBean {
        LocalDateTime time1;
        LocalDateTime time2;

        public LocalDateTime getTime1() {try{__CLR4_1_101bld1bldluszwasb.R.inc(61702);
            __CLR4_1_101bld1bldluszwasb.R.inc(61703);return time1;
        }finally{__CLR4_1_101bld1bldluszwasb.R.flushNeeded();}}

        public void setTime1(LocalDateTime time1) {try{__CLR4_1_101bld1bldluszwasb.R.inc(61704);
            __CLR4_1_101bld1bldluszwasb.R.inc(61705);this.time1 = time1;
        }finally{__CLR4_1_101bld1bldluszwasb.R.flushNeeded();}}

        public LocalDateTime getTime2() {try{__CLR4_1_101bld1bldluszwasb.R.inc(61706);
            __CLR4_1_101bld1bldluszwasb.R.inc(61707);return time2;
        }finally{__CLR4_1_101bld1bldluszwasb.R.flushNeeded();}}

        public void setTime2(LocalDateTime time2) {try{__CLR4_1_101bld1bldluszwasb.R.inc(61708);
            __CLR4_1_101bld1bldluszwasb.R.inc(61709);this.time2 = time2;
        }finally{__CLR4_1_101bld1bldluszwasb.R.flushNeeded();}}
    }
}
