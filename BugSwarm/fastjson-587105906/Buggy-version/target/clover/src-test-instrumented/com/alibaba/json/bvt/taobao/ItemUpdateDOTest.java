/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.taobao;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

public class ItemUpdateDOTest extends TestCase {static class __CLR4_1_101yfu1yfuluszwg2l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,91306,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_1() throws Exception {__CLR4_1_101yfu1yfuluszwg2l.R.globalSliceStart(getClass().getName(),91290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1yfu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yfu1yfuluszwg2l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yfu1yfuluszwg2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.taobao.ItemUpdateDOTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91290,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1yfu() throws Exception{try{__CLR4_1_101yfu1yfuluszwg2l.R.inc(91290);
        __CLR4_1_101yfu1yfuluszwg2l.R.inc(91291);SerializeConfig config = new SerializeConfig();
        __CLR4_1_101yfu1yfuluszwg2l.R.inc(91292);config.setAsmEnable(false);
        __CLR4_1_101yfu1yfuluszwg2l.R.inc(91293);Model item = new Model();
        __CLR4_1_101yfu1yfuluszwg2l.R.inc(91294);JSON.toJSONString(item, config, SerializerFeature.IgnoreErrorGetter,
                SerializerFeature.IgnoreNonFieldGetter, SerializerFeature.WriteClassName,
                SerializerFeature.WriteMapNullValue);

        __CLR4_1_101yfu1yfuluszwg2l.R.inc(91295);System.out.println(JSON.toJSONString(""));
    }finally{__CLR4_1_101yfu1yfuluszwg2l.R.flushNeeded();}}

    public static class Model {
        private long f0 = 1;
        private long f1;

        public long getF0() {try{__CLR4_1_101yfu1yfuluszwg2l.R.inc(91296);
            __CLR4_1_101yfu1yfuluszwg2l.R.inc(91297);return f0;
        }finally{__CLR4_1_101yfu1yfuluszwg2l.R.flushNeeded();}}

        public void setF0(long f0) {try{__CLR4_1_101yfu1yfuluszwg2l.R.inc(91298);
            __CLR4_1_101yfu1yfuluszwg2l.R.inc(91299);this.f0 = f0;
        }finally{__CLR4_1_101yfu1yfuluszwg2l.R.flushNeeded();}}

        public long getF1() {try{__CLR4_1_101yfu1yfuluszwg2l.R.inc(91300);
            __CLR4_1_101yfu1yfuluszwg2l.R.inc(91301);return f1;
        }finally{__CLR4_1_101yfu1yfuluszwg2l.R.flushNeeded();}}

        public void setF1(long f1) {try{__CLR4_1_101yfu1yfuluszwg2l.R.inc(91302);
            __CLR4_1_101yfu1yfuluszwg2l.R.inc(91303);this.f1 = f1;
        }finally{__CLR4_1_101yfu1yfuluszwg2l.R.flushNeeded();}}

        /** @deprecated */
        @Deprecated
        public long getUpdateFeatureCc() {try{__CLR4_1_101yfu1yfuluszwg2l.R.inc(91304);
            __CLR4_1_101yfu1yfuluszwg2l.R.inc(91305);throw new IllegalArgumentException("updateFeatureCc\u4e0d\u518d\u4f7f\u7528");
        }finally{__CLR4_1_101yfu1yfuluszwg2l.R.flushNeeded();}}
    }
}
