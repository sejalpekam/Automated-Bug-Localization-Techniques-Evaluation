/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;
import java.nio.charset.Charset;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.serializer.SerializeWriter;

public class SerializeWriterTest_9 extends TestCase {static class __CLR4_5_21t2y1t2ylusyjv1n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,84386,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_error() throws Exception {__CLR4_5_21t2y1t2ylusyjv1n.R.globalSliceStart(getClass().getName(),84346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1t2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t2y1t2ylusyjv1n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t2y1t2ylusyjv1n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_9.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84346,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1t2y() throws Exception{try{__CLR4_5_21t2y1t2ylusyjv1n.R.inc(84346);
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84347);SerializeWriter writer = new SerializeWriter(new StringWriter());
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84348);Exception error = null;
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84349);try {
            __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84350);writer.writeTo(new StringWriter());
        } catch (Exception ex) {
            __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84351);error = ex;
        }
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84352);Assert.assertNotNull(error);
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84353);writer.close();
    }finally{__CLR4_5_21t2y1t2ylusyjv1n.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21t2y1t2ylusyjv1n.R.globalSliceStart(getClass().getName(),84354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1t36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t2y1t2ylusyjv1n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t2y1t2ylusyjv1n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_9.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84354,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1t36() throws Exception{try{__CLR4_5_21t2y1t2ylusyjv1n.R.inc(84354);
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84355);SerializeWriter writer = new SerializeWriter(new StringWriter());
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84356);Exception error = null;
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84357);try {
            __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84358);writer.writeTo(new ByteArrayOutputStream(), Charset.forName("UTF-8"));
        } catch (Exception ex) {
            __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84359);error = ex;
        }
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84360);Assert.assertNotNull(error);
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84361);writer.close();
    }finally{__CLR4_5_21t2y1t2ylusyjv1n.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_5_21t2y1t2ylusyjv1n.R.globalSliceStart(getClass().getName(),84362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1t3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t2y1t2ylusyjv1n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t2y1t2ylusyjv1n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_9.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84362,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1t3e() throws Exception{try{__CLR4_5_21t2y1t2ylusyjv1n.R.inc(84362);
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84363);SerializeWriter writer = new SerializeWriter(new StringWriter());
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84364);Exception error = null;
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84365);try {
            __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84366);writer.writeTo(new ByteArrayOutputStream(), "UTF-8");
        } catch (Exception ex) {
            __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84367);error = ex;
        }
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84368);Assert.assertNotNull(error);
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84369);writer.close();
    }finally{__CLR4_5_21t2y1t2ylusyjv1n.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_5_21t2y1t2ylusyjv1n.R.globalSliceStart(getClass().getName(),84370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1t3m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t2y1t2ylusyjv1n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t2y1t2ylusyjv1n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_9.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84370,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1t3m() throws Exception{try{__CLR4_5_21t2y1t2ylusyjv1n.R.inc(84370);
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84371);SerializeWriter writer = new SerializeWriter(new StringWriter());
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84372);Exception error = null;
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84373);try {
            __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84374);writer.toCharArray();
        } catch (Exception ex) {
            __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84375);error = ex;
        }
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84376);Assert.assertNotNull(error);
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84377);writer.close();
    }finally{__CLR4_5_21t2y1t2ylusyjv1n.R.flushNeeded();}}
    
    public void test_error_5() throws Exception {__CLR4_5_21t2y1t2ylusyjv1n.R.globalSliceStart(getClass().getName(),84378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw81t3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t2y1t2ylusyjv1n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t2y1t2ylusyjv1n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_9.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84378,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw81t3u() throws Exception{try{__CLR4_5_21t2y1t2ylusyjv1n.R.inc(84378);
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84379);SerializeWriter writer = new SerializeWriter(new StringWriter());
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84380);Exception error = null;
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84381);try {
            __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84382);writer.toBytes("UTF-8");
        } catch (Exception ex) {
            __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84383);error = ex;
        }
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84384);Assert.assertNotNull(error);
        __CLR4_5_21t2y1t2ylusyjv1n.R.inc(84385);writer.close();
    }finally{__CLR4_5_21t2y1t2ylusyjv1n.R.flushNeeded();}}
}
