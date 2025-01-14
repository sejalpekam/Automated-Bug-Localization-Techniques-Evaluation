/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.util.TypeUtils;

public class TypeUtilsTest_castToDate extends TestCase {static class __CLR4_1_101jwc1jwcluszwcu8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,72464,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_101jwc1jwcluszwcu8.R.inc(72444);
        __CLR4_1_101jwc1jwcluszwcu8.R.inc(72445);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_101jwc1jwcluszwcu8.R.inc(72446);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_1_101jwc1jwcluszwcu8.R.flushNeeded();}}
    
    public void test_castToDate() throws Exception {__CLR4_1_101jwc1jwcluszwcu8.R.globalSliceStart(getClass().getName(),72447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pzfmhw1jwf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jwc1jwcluszwcu8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jwc1jwcluszwcu8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToDate.test_castToDate",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72447,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pzfmhw1jwf() throws Exception{try{__CLR4_1_101jwc1jwcluszwcu8.R.inc(72447);
        __CLR4_1_101jwc1jwcluszwcu8.R.inc(72448);JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
        __CLR4_1_101jwc1jwcluszwcu8.R.inc(72449);Date date = TypeUtils.castToDate("2012-07-15 12:12:11");
        
        __CLR4_1_101jwc1jwcluszwcu8.R.inc(72450);SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        __CLR4_1_101jwc1jwcluszwcu8.R.inc(72451);format.setTimeZone(JSON.defaultTimeZone);
        __CLR4_1_101jwc1jwcluszwcu8.R.inc(72452);Assert.assertEquals(format.parseObject("2012-07-15 12:12:11"), date);
        __CLR4_1_101jwc1jwcluszwcu8.R.inc(72453);JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    }finally{__CLR4_1_101jwc1jwcluszwcu8.R.flushNeeded();}}

    public void test_castToDate_error() throws Exception {__CLR4_1_101jwc1jwcluszwcu8.R.globalSliceStart(getClass().getName(),72454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ds2zk51jwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jwc1jwcluszwcu8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jwc1jwcluszwcu8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToDate.test_castToDate_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72454,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ds2zk51jwm() throws Exception{try{__CLR4_1_101jwc1jwcluszwcu8.R.inc(72454);
        __CLR4_1_101jwc1jwcluszwcu8.R.inc(72455);Exception error = null;
        __CLR4_1_101jwc1jwcluszwcu8.R.inc(72456);try {
            __CLR4_1_101jwc1jwcluszwcu8.R.inc(72457);TypeUtils.castToDate("\u4f60\u5988\u4f60\u5988-MM-dd");
        } catch (Exception ex) {
            __CLR4_1_101jwc1jwcluszwcu8.R.inc(72458);error = ex;
        }
        __CLR4_1_101jwc1jwcluszwcu8.R.inc(72459);Assert.assertNotNull(error);
    }finally{__CLR4_1_101jwc1jwcluszwcu8.R.flushNeeded();}}

    public void test_castToDate_zero() throws Exception {__CLR4_1_101jwc1jwcluszwcu8.R.globalSliceStart(getClass().getName(),72460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hrij2f1jws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jwc1jwcluszwcu8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jwc1jwcluszwcu8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToDate.test_castToDate_zero",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72460,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hrij2f1jws() throws Exception{try{__CLR4_1_101jwc1jwcluszwcu8.R.inc(72460);
        __CLR4_1_101jwc1jwcluszwcu8.R.inc(72461);Assert.assertEquals(new Date(0), TypeUtils.castToDate("0"));
    }finally{__CLR4_1_101jwc1jwcluszwcu8.R.flushNeeded();}}

    public void test_castToDate_negative() throws Exception {__CLR4_1_101jwc1jwcluszwcu8.R.globalSliceStart(getClass().getName(),72462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10eu1o2i1jwu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jwc1jwcluszwcu8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jwc1jwcluszwcu8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToDate.test_castToDate_negative",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72462,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10eu1o2i1jwu() throws Exception{try{__CLR4_1_101jwc1jwcluszwcu8.R.inc(72462);
        __CLR4_1_101jwc1jwcluszwcu8.R.inc(72463);Assert.assertEquals(new Date(-1), TypeUtils.castToDate(-1));
    }finally{__CLR4_1_101jwc1jwcluszwcu8.R.flushNeeded();}}

}
