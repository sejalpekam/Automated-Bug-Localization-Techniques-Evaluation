/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.date;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class DateTest_ISO8601_TimeZone extends TestCase {static class __CLR4_1_101uso1usoluszwfbj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,86599,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_101uso1usoluszwfbj.R.inc(86568);
        __CLR4_1_101uso1usoluszwfbj.R.inc(86569);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_101uso1usoluszwfbj.R.inc(86570);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_1_101uso1usoluszwfbj.R.flushNeeded();}}
    
    
    public void test_date1() throws Exception {__CLR4_1_101uso1usoluszwfbj.R.globalSliceStart(getClass().getName(),86571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104egm3h1usr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uso1usoluszwfbj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uso1usoluszwfbj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest_ISO8601_TimeZone.test_date1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86571,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104egm3h1usr() throws Exception{try{__CLR4_1_101uso1usoluszwfbj.R.inc(86571);
        __CLR4_1_101uso1usoluszwfbj.R.inc(86572);Map<String,Date> map = new HashMap<String,Date>();
        __CLR4_1_101uso1usoluszwfbj.R.inc(86573);map.put("date", new Date(1425886057586l));

        __CLR4_1_101uso1usoluszwfbj.R.inc(86574);String json = JSON.toJSONString(map, SerializerFeature.UseISO8601DateFormat);
        
        __CLR4_1_101uso1usoluszwfbj.R.inc(86575);Assert.assertEquals("{\"date\":\"2015-03-09T15:27:37.586+08:00\"}", json);

        __CLR4_1_101uso1usoluszwfbj.R.inc(86576);Map<String,Date> newMap = JSON.parseObject(json, new TypeReference<Map<String,Date>>(){});

        __CLR4_1_101uso1usoluszwfbj.R.inc(86577);Assert.assertEquals(1425886057586l, newMap.get("date").getTime());
    }finally{__CLR4_1_101uso1usoluszwfbj.R.flushNeeded();}}

    public void test_date2() throws Exception {__CLR4_1_101uso1usoluszwfbj.R.globalSliceStart(getClass().getName(),86578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107ngkvy1usy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uso1usoluszwfbj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uso1usoluszwfbj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest_ISO8601_TimeZone.test_date2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86578,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107ngkvy1usy() throws Exception{try{__CLR4_1_101uso1usoluszwfbj.R.inc(86578);
        __CLR4_1_101uso1usoluszwfbj.R.inc(86579);Calendar c = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_101uso1usoluszwfbj.R.inc(86580);c.setTimeZone(TimeZone.getTimeZone("GMT+10"));
        __CLR4_1_101uso1usoluszwfbj.R.inc(86581);VO v = new VO();
        __CLR4_1_101uso1usoluszwfbj.R.inc(86582);v.setGmtCreate(c);
        __CLR4_1_101uso1usoluszwfbj.R.inc(86583);String json = JSON.toJSONString(v, SerializerFeature.UseISO8601DateFormat);
        __CLR4_1_101uso1usoluszwfbj.R.inc(86584);System.out.println(json);

        __CLR4_1_101uso1usoluszwfbj.R.inc(86585);Calendar cal = JSON.parseObject(json, VO.class).getGmtCreate();

        __CLR4_1_101uso1usoluszwfbj.R.inc(86586);Assert.assertEquals(10, cal.getTimeZone().getRawOffset() / (3600 * 1000));
    }finally{__CLR4_1_101uso1usoluszwfbj.R.flushNeeded();}}

    public void test_date3() throws Exception {__CLR4_1_101uso1usoluszwfbj.R.globalSliceStart(getClass().getName(),86587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10awgjof1ut7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uso1usoluszwfbj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uso1usoluszwfbj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest_ISO8601_TimeZone.test_date3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86587,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10awgjof1ut7() throws Exception{try{__CLR4_1_101uso1usoluszwfbj.R.inc(86587);
        __CLR4_1_101uso1usoluszwfbj.R.inc(86588);Calendar c = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_101uso1usoluszwfbj.R.inc(86589);VO v = new VO();
        __CLR4_1_101uso1usoluszwfbj.R.inc(86590);v.setGmtCreate(c);
        __CLR4_1_101uso1usoluszwfbj.R.inc(86591);String json = JSON.toJSONString(v, SerializerFeature.UseISO8601DateFormat);
        __CLR4_1_101uso1usoluszwfbj.R.inc(86592);System.out.println(json);

        __CLR4_1_101uso1usoluszwfbj.R.inc(86593);Calendar cal = JSON.parseObject(json, VO.class).getGmtCreate();

        __CLR4_1_101uso1usoluszwfbj.R.inc(86594);Assert.assertEquals(8, cal.getTimeZone().getRawOffset() / (3600 * 1000));
    }finally{__CLR4_1_101uso1usoluszwfbj.R.flushNeeded();}}

    public static class VO {

        private Calendar gmtCreate;

        public Calendar getGmtCreate() {try{__CLR4_1_101uso1usoluszwfbj.R.inc(86595);
            __CLR4_1_101uso1usoluszwfbj.R.inc(86596);return gmtCreate;
        }finally{__CLR4_1_101uso1usoluszwfbj.R.flushNeeded();}}

        public void setGmtCreate(Calendar gmtCreate) {try{__CLR4_1_101uso1usoluszwfbj.R.inc(86597);
            __CLR4_1_101uso1usoluszwfbj.R.inc(86598);this.gmtCreate = gmtCreate;
        }finally{__CLR4_1_101uso1usoluszwfbj.R.flushNeeded();}}

    }
}
