/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.json.bvt.parser.deser.FactoryTest.V1;

import junit.framework.TestCase;

public class FactoryTest_error extends TestCase {static class __CLR4_5_21kta1ktalusyju3f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,73648,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_factory1() throws Exception {__CLR4_5_21kta1ktalusyju3f.R.globalSliceStart(getClass().getName(),73630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rsfwaj1kta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kta1ktalusyju3f.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kta1ktalusyju3f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.FactoryTest_error.test_factory1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73630,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rsfwaj1kta() throws Exception{try{__CLR4_5_21kta1ktalusyju3f.R.inc(73630);
        __CLR4_5_21kta1ktalusyju3f.R.inc(73631);Exception error = null;
        __CLR4_5_21kta1ktalusyju3f.R.inc(73632);try {
            __CLR4_5_21kta1ktalusyju3f.R.inc(73633);JSON.parseObject("{\"b\":true,\"i\":33,\"l\":34,\"f\":45.}").toJavaObject(V1.class);
        } catch (JSONException ex) {
            __CLR4_5_21kta1ktalusyju3f.R.inc(73634);error = ex;
        }
        __CLR4_5_21kta1ktalusyju3f.R.inc(73635);Assert.assertNotNull(error);
    }finally{__CLR4_5_21kta1ktalusyju3f.R.flushNeeded();}}

    public static class V1 {

        private boolean b;
        private int     i;
        private long    l;
        private float   f;

        private V1(boolean b){try{__CLR4_5_21kta1ktalusyju3f.R.inc(73636);
            __CLR4_5_21kta1ktalusyju3f.R.inc(73637);this.b = b;
        }finally{__CLR4_5_21kta1ktalusyju3f.R.flushNeeded();}}

        @JSONCreator
        public static V1 create(@JSONField(name = "b") boolean b, @JSONField(name = "i") int i,
                                @JSONField(name = "l") long l, @JSONField(name = "f") float f) {try{__CLR4_5_21kta1ktalusyju3f.R.inc(73638);
            __CLR4_5_21kta1ktalusyju3f.R.inc(73639);throw new IllegalStateException();
        }finally{__CLR4_5_21kta1ktalusyju3f.R.flushNeeded();}}

        public float getF() {try{__CLR4_5_21kta1ktalusyju3f.R.inc(73640);
            __CLR4_5_21kta1ktalusyju3f.R.inc(73641);return f;
        }finally{__CLR4_5_21kta1ktalusyju3f.R.flushNeeded();}}

        public boolean isB() {try{__CLR4_5_21kta1ktalusyju3f.R.inc(73642);
            __CLR4_5_21kta1ktalusyju3f.R.inc(73643);return b;
        }finally{__CLR4_5_21kta1ktalusyju3f.R.flushNeeded();}}

        public int getI() {try{__CLR4_5_21kta1ktalusyju3f.R.inc(73644);
            __CLR4_5_21kta1ktalusyju3f.R.inc(73645);return i;
        }finally{__CLR4_5_21kta1ktalusyju3f.R.flushNeeded();}}

        public long getL() {try{__CLR4_5_21kta1ktalusyju3f.R.inc(73646);
            __CLR4_5_21kta1ktalusyju3f.R.inc(73647);return l;
        }finally{__CLR4_5_21kta1ktalusyju3f.R.flushNeeded();}}

    }
}
