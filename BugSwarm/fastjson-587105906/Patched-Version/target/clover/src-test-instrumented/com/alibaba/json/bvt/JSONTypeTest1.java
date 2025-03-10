/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;

public class JSONTypeTest1 extends TestCase {static class __CLR4_5_2yd4yd4lusyjq1h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,44597,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_ignores() throws Exception {__CLR4_5_2yd4yd4lusyjq1h.R.globalSliceStart(getClass().getName(),44536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2onpkatyd4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yd4yd4lusyjq1h.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yd4yd4lusyjq1h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTypeTest1.test_ignores",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44536,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2onpkatyd4() throws Exception{try{__CLR4_5_2yd4yd4lusyjq1h.R.inc(44536);
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44537);A a = new A();
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44538);a.setF1(1001);
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44539);a.setF2(1002);
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44540);a.setF3(1003);

        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44541);Assert.assertEquals("{\"f1\":1001,\"f3\":1003}", JSON.toJSONString(a));
    }finally{__CLR4_5_2yd4yd4lusyjq1h.R.flushNeeded();}}

    public void test_ignoresParent() throws Exception {__CLR4_5_2yd4yd4lusyjq1h.R.globalSliceStart(getClass().getName(),44542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bqtqbpyda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yd4yd4lusyjq1h.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yd4yd4lusyjq1h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTypeTest1.test_ignoresParent",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44542,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bqtqbpyda() throws Exception{try{__CLR4_5_2yd4yd4lusyjq1h.R.inc(44542);
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44543);B b = new B();
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44544);b.setF1(1001);
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44545);b.setF2(1002);
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44546);b.setF3(1003);
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44547);b.setF4(1004);
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44548);b.setF5(1005);

        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44549);Assert.assertEquals("{\"f1\":1001,\"f3\":1003,\"f5\":1005}", JSON.toJSONString(b));
    }finally{__CLR4_5_2yd4yd4lusyjq1h.R.flushNeeded();}}
    
    public void test_ignoresParent2() throws Exception {__CLR4_5_2yd4yd4lusyjq1h.R.globalSliceStart(getClass().getName(),44550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jamf5xydi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yd4yd4lusyjq1h.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yd4yd4lusyjq1h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTypeTest1.test_ignoresParent2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44550,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jamf5xydi() throws Exception{try{__CLR4_5_2yd4yd4lusyjq1h.R.inc(44550);
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44551);C c = new C();
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44552);c.setF1(1001);
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44553);c.setF2(1002);
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44554);c.setF3(1003);
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44555);c.setF4(1004);
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44556);c.setF5(1005);
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44557);c.setF6(1006);
        
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44558);Assert.assertEquals("{\"f1\":1001,\"f3\":1003,\"f5\":1005,\"f6\":1006}", JSON.toJSONString(c));
    }finally{__CLR4_5_2yd4yd4lusyjq1h.R.flushNeeded();}}
    
    public void test_ignoresParent3() throws Exception {__CLR4_5_2yd4yd4lusyjq1h.R.globalSliceStart(getClass().getName(),44559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g1mgdgydr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yd4yd4lusyjq1h.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yd4yd4lusyjq1h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTypeTest1.test_ignoresParent3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44559,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g1mgdgydr() throws Exception{try{__CLR4_5_2yd4yd4lusyjq1h.R.inc(44559);
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44560);D d = new D();
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44561);d.setF1(1001);
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44562);d.setF2(1002);
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44563);d.setF3(1003);
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44564);d.setF4(1004);
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44565);d.setF5(1005);
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44566);d.setF6(1006);
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44567);d.setF7(1007);
        
        __CLR4_5_2yd4yd4lusyjq1h.R.inc(44568);Assert.assertEquals("{\"f1\":1001,\"f3\":1003,\"f5\":1005,\"f6\":1006,\"f7\":1007}", JSON.toJSONString(d));
    }finally{__CLR4_5_2yd4yd4lusyjq1h.R.flushNeeded();}}

    @JSONType(ignores = "f2")
    public static class A {

        private int f1;
        private int f2;
        private int f3;

        public int getF1() {try{__CLR4_5_2yd4yd4lusyjq1h.R.inc(44569);
            __CLR4_5_2yd4yd4lusyjq1h.R.inc(44570);return f1;
        }finally{__CLR4_5_2yd4yd4lusyjq1h.R.flushNeeded();}}

        public void setF1(int f1) {try{__CLR4_5_2yd4yd4lusyjq1h.R.inc(44571);
            __CLR4_5_2yd4yd4lusyjq1h.R.inc(44572);this.f1 = f1;
        }finally{__CLR4_5_2yd4yd4lusyjq1h.R.flushNeeded();}}

        public int getF2() {try{__CLR4_5_2yd4yd4lusyjq1h.R.inc(44573);
            __CLR4_5_2yd4yd4lusyjq1h.R.inc(44574);return f2;
        }finally{__CLR4_5_2yd4yd4lusyjq1h.R.flushNeeded();}}

        public void setF2(int f2) {try{__CLR4_5_2yd4yd4lusyjq1h.R.inc(44575);
            __CLR4_5_2yd4yd4lusyjq1h.R.inc(44576);this.f2 = f2;
        }finally{__CLR4_5_2yd4yd4lusyjq1h.R.flushNeeded();}}

        public int getF3() {try{__CLR4_5_2yd4yd4lusyjq1h.R.inc(44577);
            __CLR4_5_2yd4yd4lusyjq1h.R.inc(44578);return f3;
        }finally{__CLR4_5_2yd4yd4lusyjq1h.R.flushNeeded();}}

        public void setF3(int f3) {try{__CLR4_5_2yd4yd4lusyjq1h.R.inc(44579);
            __CLR4_5_2yd4yd4lusyjq1h.R.inc(44580);this.f3 = f3;
        }finally{__CLR4_5_2yd4yd4lusyjq1h.R.flushNeeded();}}

    }

    @JSONType(ignores = { "f4" })
    public static class B extends A {

        private int f4;
        private int f5;

        public int getF4() {try{__CLR4_5_2yd4yd4lusyjq1h.R.inc(44581);
            __CLR4_5_2yd4yd4lusyjq1h.R.inc(44582);return f4;
        }finally{__CLR4_5_2yd4yd4lusyjq1h.R.flushNeeded();}}

        public void setF4(int f4) {try{__CLR4_5_2yd4yd4lusyjq1h.R.inc(44583);
            __CLR4_5_2yd4yd4lusyjq1h.R.inc(44584);this.f4 = f4;
        }finally{__CLR4_5_2yd4yd4lusyjq1h.R.flushNeeded();}}

        public int getF5() {try{__CLR4_5_2yd4yd4lusyjq1h.R.inc(44585);
            __CLR4_5_2yd4yd4lusyjq1h.R.inc(44586);return f5;
        }finally{__CLR4_5_2yd4yd4lusyjq1h.R.flushNeeded();}}

        public void setF5(int f5) {try{__CLR4_5_2yd4yd4lusyjq1h.R.inc(44587);
            __CLR4_5_2yd4yd4lusyjq1h.R.inc(44588);this.f5 = f5;
        }finally{__CLR4_5_2yd4yd4lusyjq1h.R.flushNeeded();}}

    }

    public static class C extends B {

        private int f6;

        public int getF6() {try{__CLR4_5_2yd4yd4lusyjq1h.R.inc(44589);
            __CLR4_5_2yd4yd4lusyjq1h.R.inc(44590);return f6;
        }finally{__CLR4_5_2yd4yd4lusyjq1h.R.flushNeeded();}}

        public void setF6(int f6) {try{__CLR4_5_2yd4yd4lusyjq1h.R.inc(44591);
            __CLR4_5_2yd4yd4lusyjq1h.R.inc(44592);this.f6 = f6;
        }finally{__CLR4_5_2yd4yd4lusyjq1h.R.flushNeeded();}}

    }

    public static class D extends C {

        private int f7;

        public int getF7() {try{__CLR4_5_2yd4yd4lusyjq1h.R.inc(44593);
            __CLR4_5_2yd4yd4lusyjq1h.R.inc(44594);return f7;
        }finally{__CLR4_5_2yd4yd4lusyjq1h.R.flushNeeded();}}

        public void setF7(int f7) {try{__CLR4_5_2yd4yd4lusyjq1h.R.inc(44595);
            __CLR4_5_2yd4yd4lusyjq1h.R.inc(44596);this.f7 = f7;
        }finally{__CLR4_5_2yd4yd4lusyjq1h.R.flushNeeded();}}

    }
}
