/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.kotlin;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class Issue1750 extends TestCase {static class __CLR4_1_101flx1flxluszwc0x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,66900,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_user() throws Exception {__CLR4_1_101flx1flxluszwc0x.R.globalSliceStart(getClass().getName(),66885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v7yl5r1flx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101flx1flxluszwc0x.R.rethrow($CLV_t2$);}finally{__CLR4_1_101flx1flxluszwc0x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.kotlin.Issue1750.test_user",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66885,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v7yl5r1flx() throws Exception{try{__CLR4_1_101flx1flxluszwc0x.R.inc(66885);
        __CLR4_1_101flx1flxluszwc0x.R.inc(66886);ExtClassLoader classLoader = new ExtClassLoader();
        __CLR4_1_101flx1flxluszwc0x.R.inc(66887);Class clazz = classLoader.loadClass("Issue1750_ProcessBO");

        __CLR4_1_101flx1flxluszwc0x.R.inc(66888);String json = "{\n" +
                "\t\"masterId\": \"1111111111111\",\n" +
                "\t\"processId\": \"222222222222222\",\n" +
                "\t\"taskId\": \"33333333333333\",\n" +
                "\t\"taskName\": \"44444444444444\"\n" +
                "}";
        __CLR4_1_101flx1flxluszwc0x.R.inc(66889);Object obj = JSON.parseObject(json, clazz);
        __CLR4_1_101flx1flxluszwc0x.R.inc(66890);String result = JSON.toJSONString(obj);
        __CLR4_1_101flx1flxluszwc0x.R.inc(66891);System.out.println(result);
        __CLR4_1_101flx1flxluszwc0x.R.inc(66892);assertEquals("{\"masterId\":\"1111111111111\",\"processId\":\"222222222222222\",\"taskId\":\"33333333333333\",\"taskName\":\"44444444444444\"}", result);
    }finally{__CLR4_1_101flx1flxluszwc0x.R.flushNeeded();}}

    private static class ExtClassLoader extends ClassLoader {

        public ExtClassLoader() throws IOException {
            super(Thread.currentThread().getContextClassLoader());__CLR4_1_101flx1flxluszwc0x.R.inc(66894);try{__CLR4_1_101flx1flxluszwc0x.R.inc(66893);

            {
                __CLR4_1_101flx1flxluszwc0x.R.inc(66895);byte[] bytes;
                __CLR4_1_101flx1flxluszwc0x.R.inc(66896);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("kotlin/Issue1750_ProcessBO.clazz");
                __CLR4_1_101flx1flxluszwc0x.R.inc(66897);bytes = IOUtils.toByteArray(is);
                __CLR4_1_101flx1flxluszwc0x.R.inc(66898);is.close();

                __CLR4_1_101flx1flxluszwc0x.R.inc(66899);super.defineClass("Issue1750_ProcessBO", bytes, 0, bytes.length);
            }
        }finally{__CLR4_1_101flx1flxluszwc0x.R.flushNeeded();}}
    }
}
