/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.atomic;

import java.util.concurrent.atomic.AtomicLongArray;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class AtomicLongArrayFieldTest extends TestCase {static class __CLR4_5_2122w122wlusyjqt7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,49376,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_codec_null() throws Exception {__CLR4_5_2122w122wlusyjqt7.R.globalSliceStart(getClass().getName(),49352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25ncl18122w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2122w122wlusyjqt7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2122w122wlusyjqt7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.atomic.AtomicLongArrayFieldTest.test_codec_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49352,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25ncl18122w() throws Exception{try{__CLR4_5_2122w122wlusyjqt7.R.inc(49352);
        __CLR4_5_2122w122wlusyjqt7.R.inc(49353);V0 v = new V0();

        __CLR4_5_2122w122wlusyjqt7.R.inc(49354);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_2122w122wlusyjqt7.R.inc(49355);mapping.setAsmEnable(false);

        __CLR4_5_2122w122wlusyjqt7.R.inc(49356);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_2122w122wlusyjqt7.R.inc(49357);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_5_2122w122wlusyjqt7.R.inc(49358);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_2122w122wlusyjqt7.R.inc(49359);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_2122w122wlusyjqt7.R.flushNeeded();}}

    public void test_codec_null_1() throws Exception {__CLR4_5_2122w122wlusyjqt7.R.globalSliceStart(getClass().getName(),49360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2prl16y1234();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2122w122wlusyjqt7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2122w122wlusyjqt7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.atomic.AtomicLongArrayFieldTest.test_codec_null_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49360,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2prl16y1234() throws Exception{try{__CLR4_5_2122w122wlusyjqt7.R.inc(49360);
        __CLR4_5_2122w122wlusyjqt7.R.inc(49361);V0 v = new V0();

        __CLR4_5_2122w122wlusyjqt7.R.inc(49362);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_2122w122wlusyjqt7.R.inc(49363);mapping.setAsmEnable(false);

        __CLR4_5_2122w122wlusyjqt7.R.inc(49364);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullListAsEmpty);
        __CLR4_5_2122w122wlusyjqt7.R.inc(49365);Assert.assertEquals("{\"value\":[]}", text);
    }finally{__CLR4_5_2122w122wlusyjqt7.R.flushNeeded();}}
    
    public void test_codec_null_2() throws Exception {__CLR4_5_2122w122wlusyjqt7.R.globalSliceStart(getClass().getName(),49366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mil2eh123a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2122w122wlusyjqt7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2122w122wlusyjqt7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.atomic.AtomicLongArrayFieldTest.test_codec_null_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49366,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mil2eh123a() throws Exception{try{__CLR4_5_2122w122wlusyjqt7.R.inc(49366);
        __CLR4_5_2122w122wlusyjqt7.R.inc(49367);V0 v = JSON.parseObject("{\"value\":[1,2]}", V0.class);

        __CLR4_5_2122w122wlusyjqt7.R.inc(49368);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_2122w122wlusyjqt7.R.inc(49369);mapping.setAsmEnable(false);

        __CLR4_5_2122w122wlusyjqt7.R.inc(49370);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullListAsEmpty);
        __CLR4_5_2122w122wlusyjqt7.R.inc(49371);Assert.assertEquals("{\"value\":[1,2]}", text);
    }finally{__CLR4_5_2122w122wlusyjqt7.R.flushNeeded();}}

    public static class V0 {

        private AtomicLongArray value;

        public AtomicLongArray getValue() {try{__CLR4_5_2122w122wlusyjqt7.R.inc(49372);
            __CLR4_5_2122w122wlusyjqt7.R.inc(49373);return value;
        }finally{__CLR4_5_2122w122wlusyjqt7.R.flushNeeded();}}

        public void setValue(AtomicLongArray value) {try{__CLR4_5_2122w122wlusyjqt7.R.inc(49374);
            __CLR4_5_2122w122wlusyjqt7.R.inc(49375);this.value = value;
        }finally{__CLR4_5_2122w122wlusyjqt7.R.flushNeeded();}}

    }
}
