/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class ArrayLisMapDeserializerTest extends TestCase {static class __CLR4_5_21mn61mn6lusyjubi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,76016,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_5_21mn61mn6lusyjubi.R.globalSliceStart(getClass().getName(),76002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259ny8i1mn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mn61mn6lusyjubi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mn61mn6lusyjubi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ArrayLisMapDeserializerTest.test_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76002,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259ny8i1mn6() throws Exception{try{__CLR4_5_21mn61mn6lusyjubi.R.inc(76002);
        __CLR4_5_21mn61mn6lusyjubi.R.inc(76003);Entity a = JSON.parseObject("{items:[{}, {a:1}, null]}", Entity.class);
        __CLR4_5_21mn61mn6lusyjubi.R.inc(76004);Assert.assertEquals(0, a.getItems().get(0).size());
        __CLR4_5_21mn61mn6lusyjubi.R.inc(76005);Assert.assertEquals(1, a.getItems().get(1).size());
        __CLR4_5_21mn61mn6lusyjubi.R.inc(76006);Assert.assertEquals(null, a.getItems().get(2));
    }finally{__CLR4_5_21mn61mn6lusyjubi.R.flushNeeded();}}
    
    public void test_list_2() throws Exception {__CLR4_5_21mn61mn6lusyjubi.R.globalSliceStart(getClass().getName(),76007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r959r91mnb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mn61mn6lusyjubi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mn61mn6lusyjubi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ArrayLisMapDeserializerTest.test_list_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76007,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r959r91mnb() throws Exception{try{__CLR4_5_21mn61mn6lusyjubi.R.inc(76007);
        __CLR4_5_21mn61mn6lusyjubi.R.inc(76008);List<Map> list = JSON.parseObject("[{}, {a:1}, null]", new TypeReference<List<Map>>() {});
        __CLR4_5_21mn61mn6lusyjubi.R.inc(76009);Assert.assertEquals(0, list.get(0).size());
        __CLR4_5_21mn61mn6lusyjubi.R.inc(76010);Assert.assertEquals(1, list.get(1).size());
        __CLR4_5_21mn61mn6lusyjubi.R.inc(76011);Assert.assertEquals(null, list.get(2));
    }finally{__CLR4_5_21mn61mn6lusyjubi.R.flushNeeded();}}

    public static class Entity {

        private List<Map> items = new ArrayList<Map>();

        public List<Map> getItems() {try{__CLR4_5_21mn61mn6lusyjubi.R.inc(76012);
            __CLR4_5_21mn61mn6lusyjubi.R.inc(76013);return items;
        }finally{__CLR4_5_21mn61mn6lusyjubi.R.flushNeeded();}}

        public void setItems(List<Map> items) {try{__CLR4_5_21mn61mn6lusyjubi.R.inc(76014);
            __CLR4_5_21mn61mn6lusyjubi.R.inc(76015);this.items = items;
        }finally{__CLR4_5_21mn61mn6lusyjubi.R.flushNeeded();}}

    }
}
