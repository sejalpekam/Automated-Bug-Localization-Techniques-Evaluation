/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class WriteClassNameTest extends TestCase {static class __CLR4_5_21to11to1lusyjv7h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,85126,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_writeClassName() throws Exception {__CLR4_5_21to11to1lusyjv7h.R.globalSliceStart(getClass().getName(),85105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2te5coo1to1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21to11to1lusyjv7h.R.rethrow($CLV_t2$);}finally{__CLR4_5_21to11to1lusyjv7h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.WriteClassNameTest.test_writeClassName",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85105,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2te5coo1to1() throws Exception{try{__CLR4_5_21to11to1lusyjv7h.R.inc(85105);
        __CLR4_5_21to11to1lusyjv7h.R.inc(85106);Entity object = new Entity();
        __CLR4_5_21to11to1lusyjv7h.R.inc(85107);object.setId(123);
        __CLR4_5_21to11to1lusyjv7h.R.inc(85108);object.setName("jobs");
        __CLR4_5_21to11to1lusyjv7h.R.inc(85109);object.setAverage(3.21F);
        
        __CLR4_5_21to11to1lusyjv7h.R.inc(85110);SerializeConfig config = new SerializeConfig();
        __CLR4_5_21to11to1lusyjv7h.R.inc(85111);config.setAsmEnable(false);
        __CLR4_5_21to11to1lusyjv7h.R.inc(85112);String text = JSON.toJSONString(object, config, SerializerFeature.WriteClassName);
        __CLR4_5_21to11to1lusyjv7h.R.inc(85113);System.out.println(text);
    }finally{__CLR4_5_21to11to1lusyjv7h.R.flushNeeded();}}

    public static class Entity {

        private int    id;
        private String name;
        private float  average;

        public int getId() {try{__CLR4_5_21to11to1lusyjv7h.R.inc(85114);
            __CLR4_5_21to11to1lusyjv7h.R.inc(85115);return id;
        }finally{__CLR4_5_21to11to1lusyjv7h.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21to11to1lusyjv7h.R.inc(85116);
            __CLR4_5_21to11to1lusyjv7h.R.inc(85117);this.id = id;
        }finally{__CLR4_5_21to11to1lusyjv7h.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21to11to1lusyjv7h.R.inc(85118);
            __CLR4_5_21to11to1lusyjv7h.R.inc(85119);return name;
        }finally{__CLR4_5_21to11to1lusyjv7h.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21to11to1lusyjv7h.R.inc(85120);
            __CLR4_5_21to11to1lusyjv7h.R.inc(85121);this.name = name;
        }finally{__CLR4_5_21to11to1lusyjv7h.R.flushNeeded();}}

        public float getAverage() {try{__CLR4_5_21to11to1lusyjv7h.R.inc(85122);
            __CLR4_5_21to11to1lusyjv7h.R.inc(85123);return average;
        }finally{__CLR4_5_21to11to1lusyjv7h.R.flushNeeded();}}

        public void setAverage(float average) {try{__CLR4_5_21to11to1lusyjv7h.R.inc(85124);
            __CLR4_5_21to11to1lusyjv7h.R.inc(85125);this.average = average;
        }finally{__CLR4_5_21to11to1lusyjv7h.R.flushNeeded();}}

    }
}
