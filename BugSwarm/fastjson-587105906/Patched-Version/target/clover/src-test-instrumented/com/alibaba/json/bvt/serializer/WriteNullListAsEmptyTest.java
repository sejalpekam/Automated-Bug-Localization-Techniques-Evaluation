/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class WriteNullListAsEmptyTest extends TestCase {static class __CLR4_5_21tom1tomlusyjv7j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,85148,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_nullList() {__CLR4_5_21tom1tomlusyjv7j.R.globalSliceStart(getClass().getName(),85126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tp42ef1tom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tom1tomlusyjv7j.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tom1tomlusyjv7j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.WriteNullListAsEmptyTest.test_nullList",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85126,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tp42ef1tom(){try{__CLR4_5_21tom1tomlusyjv7j.R.inc(85126);
        __CLR4_5_21tom1tomlusyjv7j.R.inc(85127);SerializerFeature[] features = { SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullListAsEmpty };
        __CLR4_5_21tom1tomlusyjv7j.R.inc(85128);Assert.assertEquals("{\"names\":[]}", JSON.toJSONString(new VO1(), features));
        __CLR4_5_21tom1tomlusyjv7j.R.inc(85129);Assert.assertEquals("{\"names\":[]}", JSON.toJSONString(new VO2(), features));
        __CLR4_5_21tom1tomlusyjv7j.R.inc(85130);Assert.assertEquals("{\"names\":[]}", JSON.toJSONString(new VO3(), features));
        __CLR4_5_21tom1tomlusyjv7j.R.inc(85131);Assert.assertEquals("{\"names\":[]}", JSON.toJSONString(new VO4(), features));
    }finally{__CLR4_5_21tom1tomlusyjv7j.R.flushNeeded();}}

    public static class VO1 {

        private List<Object> names = null;

        public List<Object> getNames() {try{__CLR4_5_21tom1tomlusyjv7j.R.inc(85132);
            __CLR4_5_21tom1tomlusyjv7j.R.inc(85133);return names;
        }finally{__CLR4_5_21tom1tomlusyjv7j.R.flushNeeded();}}

        public void setNames(List<Object> names) {try{__CLR4_5_21tom1tomlusyjv7j.R.inc(85134);
            __CLR4_5_21tom1tomlusyjv7j.R.inc(85135);this.names = names;
        }finally{__CLR4_5_21tom1tomlusyjv7j.R.flushNeeded();}}
    }

    public static class VO2 {

        private List<String> names = null;

        public List<String> getNames() {try{__CLR4_5_21tom1tomlusyjv7j.R.inc(85136);
            __CLR4_5_21tom1tomlusyjv7j.R.inc(85137);return names;
        }finally{__CLR4_5_21tom1tomlusyjv7j.R.flushNeeded();}}

        public void setNames(List<String> names) {try{__CLR4_5_21tom1tomlusyjv7j.R.inc(85138);
            __CLR4_5_21tom1tomlusyjv7j.R.inc(85139);this.names = names;
        }finally{__CLR4_5_21tom1tomlusyjv7j.R.flushNeeded();}}
    }
    
    public static class VO3 {

        private List<Integer> names = null;

        public List<Integer> getNames() {try{__CLR4_5_21tom1tomlusyjv7j.R.inc(85140);
            __CLR4_5_21tom1tomlusyjv7j.R.inc(85141);return names;
        }finally{__CLR4_5_21tom1tomlusyjv7j.R.flushNeeded();}}

        public void setNames(List<Integer> names) {try{__CLR4_5_21tom1tomlusyjv7j.R.inc(85142);
            __CLR4_5_21tom1tomlusyjv7j.R.inc(85143);this.names = names;
        }finally{__CLR4_5_21tom1tomlusyjv7j.R.flushNeeded();}}
    }
    
    public static class VO4 {
        
        private List<Long> names = null;
        
        public List<Long> getNames() {try{__CLR4_5_21tom1tomlusyjv7j.R.inc(85144);
            __CLR4_5_21tom1tomlusyjv7j.R.inc(85145);return names;
        }finally{__CLR4_5_21tom1tomlusyjv7j.R.flushNeeded();}}
        
        public void setNames(List<Long> names) {try{__CLR4_5_21tom1tomlusyjv7j.R.inc(85146);
            __CLR4_5_21tom1tomlusyjv7j.R.inc(85147);this.names = names;
        }finally{__CLR4_5_21tom1tomlusyjv7j.R.flushNeeded();}}
    }
}
