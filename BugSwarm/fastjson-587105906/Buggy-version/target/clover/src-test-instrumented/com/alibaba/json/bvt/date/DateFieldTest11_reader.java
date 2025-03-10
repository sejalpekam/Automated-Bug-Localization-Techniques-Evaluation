/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.date;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONReader;
import junit.framework.TestCase;
import org.junit.Assert;

import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by wenshao on 07/04/2017.
 */
public class DateFieldTest11_reader extends TestCase {static class __CLR4_1_1019jc19jcluszwa7f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,59059,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_1019jc19jcluszwa7f.R.inc(59016);
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59017);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59018);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_1_1019jc19jcluszwa7f.R.flushNeeded();}}

    public void test_cn() throws Exception {__CLR4_1_1019jc19jcluszwa7f.R.globalSliceStart(getClass().getName(),59019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tfiqgx19jf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019jc19jcluszwa7f.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019jc19jcluszwa7f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest11_reader.test_cn",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59019,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tfiqgx19jf() throws Exception{try{__CLR4_1_1019jc19jcluszwa7f.R.inc(59019);
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59020);Model vo = new JSONReader(new StringReader("{\"date0\":\"2016-05-06\",\"date1\":\"2017-03-01\"}")).readObject(Model.class);

        __CLR4_1_1019jc19jcluszwa7f.R.inc(59021);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);

        __CLR4_1_1019jc19jcluszwa7f.R.inc(59022);calendar.setTime(vo.date0);
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59023);assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59024);assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59025);assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59026);assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59027);assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59028);assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59029);assertEquals(0, calendar.get(Calendar.MILLISECOND));

        __CLR4_1_1019jc19jcluszwa7f.R.inc(59030);calendar.setTime(vo.date1);
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59031);assertEquals(2017, calendar.get(Calendar.YEAR));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59032);assertEquals(2, calendar.get(Calendar.MONTH));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59033);assertEquals(1, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59034);assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59035);assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59036);assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59037);assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1019jc19jcluszwa7f.R.flushNeeded();}}

    public void test_cn_1() throws Exception {__CLR4_1_1019jc19jcluszwa7f.R.globalSliceStart(getClass().getName(),59038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108tih3j19jy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019jc19jcluszwa7f.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019jc19jcluszwa7f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest11_reader.test_cn_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59038,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108tih3j19jy() throws Exception{try{__CLR4_1_1019jc19jcluszwa7f.R.inc(59038);
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59039);Model vo = new JSONReader(new StringReader("{\"date0\":1462464000000,\"date1\":1488297600000}")).readObject(Model.class);

        __CLR4_1_1019jc19jcluszwa7f.R.inc(59040);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);

        __CLR4_1_1019jc19jcluszwa7f.R.inc(59041);calendar.setTime(vo.date0);
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59042);assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59043);assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59044);assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59045);assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59046);assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59047);assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59048);assertEquals(0, calendar.get(Calendar.MILLISECOND));

        __CLR4_1_1019jc19jcluszwa7f.R.inc(59049);calendar.setTime(vo.date1);
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59050);assertEquals(2017, calendar.get(Calendar.YEAR));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59051);assertEquals(2, calendar.get(Calendar.MONTH));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59052);assertEquals(1, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59053);assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59054);assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59055);assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59056);assertEquals(0, calendar.get(Calendar.MILLISECOND));

        __CLR4_1_1019jc19jcluszwa7f.R.inc(59057);System.out.println(vo.date0.getTime());
        __CLR4_1_1019jc19jcluszwa7f.R.inc(59058);System.out.println(vo.date1.getTime());
    }finally{__CLR4_1_1019jc19jcluszwa7f.R.flushNeeded();}}

    public static class Model {
        public Date date0;
        public Date date1;
    }
}
