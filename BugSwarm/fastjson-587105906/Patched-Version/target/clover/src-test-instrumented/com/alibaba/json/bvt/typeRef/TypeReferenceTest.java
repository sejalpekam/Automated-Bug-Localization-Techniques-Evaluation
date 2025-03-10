/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.typeRef;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

public class TypeReferenceTest extends TestCase {static class __CLR4_5_21xiv1xivlusyjvq5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,90148,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("rawtypes")
    public void test_0() throws Exception {__CLR4_5_21xiv1xivlusyjvq5.R.globalSliceStart(getClass().getName(),90103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21xiv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xiv1xivlusyjvq5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xiv1xivlusyjvq5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.typeRef.TypeReferenceTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90103,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21xiv() throws Exception{try{__CLR4_5_21xiv1xivlusyjvq5.R.inc(90103);
        __CLR4_5_21xiv1xivlusyjvq5.R.inc(90104);System.out.println(System.getProperties());
        __CLR4_5_21xiv1xivlusyjvq5.R.inc(90105);String text;

        {
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90106);Map<String, Bean> map = new HashMap<String, Bean>();
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90107);map.put("a", new Bean(123, "\u9a6c\u52a0\u7235"));
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90108);map.put("b", new Bean(234, "\u836f\u5bb6\u946b"));
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90109);map.put("c", new Bean(456, "\u5218\u5927\u4f1f"));

            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90110);text = JSON.toJSONString(map);
        }

        __CLR4_5_21xiv1xivlusyjvq5.R.inc(90111);System.out.println(text);

        {
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90112);Map<String, Bean> map = JSON.parseObject(text, new TypeReference<Map<String, Bean>>() {}); // \u6ce8\u610f\u8fd9\u91cc
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90113);Assert.assertEquals(3, map.size());
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90114);Assert.assertEquals(123, ((Bean) map.get("a")).getId());
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90115);Assert.assertEquals(234, ((Bean) map.get("b")).getId());
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90116);Assert.assertEquals(456, ((Bean) map.get("c")).getId());
    
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90117);Assert.assertEquals("\u9a6c\u52a0\u7235", ((Bean) map.get("a")).getName());
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90118);Assert.assertEquals("\u836f\u5bb6\u946b", ((Bean) map.get("b")).getName());
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90119);Assert.assertEquals("\u5218\u5927\u4f1f", ((Bean) map.get("c")).getName());
        }
        
        {
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90120);Map map = JSON.parseObject(text, new TypeReference<Map>() {}); // \u6ce8\u610f\u8fd9\u91cc
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90121);Assert.assertEquals(3, map.size());
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90122);Assert.assertEquals(123, ((JSONObject) map.get("a")).get("id"));
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90123);Assert.assertEquals(234, ((JSONObject) map.get("b")).get("id"));
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90124);Assert.assertEquals(456, ((JSONObject) map.get("c")).get("id"));
            
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90125);Assert.assertEquals("\u9a6c\u52a0\u7235", ((JSONObject) map.get("a")).get("name"));
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90126);Assert.assertEquals("\u836f\u5bb6\u946b", ((JSONObject) map.get("b")).get("name"));
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90127);Assert.assertEquals("\u5218\u5927\u4f1f", ((JSONObject) map.get("c")).get("name"));
        }
        
        {
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90128);Map map = JSON.parseObject(text, new TypeReference<JSONObject>() {}); // \u6ce8\u610f\u8fd9\u91cc
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90129);Assert.assertEquals(3, map.size());
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90130);Assert.assertEquals(123, ((JSONObject) map.get("a")).get("id"));
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90131);Assert.assertEquals(234, ((JSONObject) map.get("b")).get("id"));
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90132);Assert.assertEquals(456, ((JSONObject) map.get("c")).get("id"));
            
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90133);Assert.assertEquals("\u9a6c\u52a0\u7235", ((JSONObject) map.get("a")).get("name"));
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90134);Assert.assertEquals("\u836f\u5bb6\u946b", ((JSONObject) map.get("b")).get("name"));
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90135);Assert.assertEquals("\u5218\u5927\u4f1f", ((JSONObject) map.get("c")).get("name"));
        }
    }finally{__CLR4_5_21xiv1xivlusyjvq5.R.flushNeeded();}}

    public static class Bean {

        private int    id;
        private String name;

        public Bean(){try{__CLR4_5_21xiv1xivlusyjvq5.R.inc(90136);

        }finally{__CLR4_5_21xiv1xivlusyjvq5.R.flushNeeded();}}

        public Bean(int id, String name){try{__CLR4_5_21xiv1xivlusyjvq5.R.inc(90137);
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90138);this.id = id;
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90139);this.name = name;
        }finally{__CLR4_5_21xiv1xivlusyjvq5.R.flushNeeded();}}

        public int getId() {try{__CLR4_5_21xiv1xivlusyjvq5.R.inc(90140);
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90141);return id;
        }finally{__CLR4_5_21xiv1xivlusyjvq5.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21xiv1xivlusyjvq5.R.inc(90142);
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90143);this.id = id;
        }finally{__CLR4_5_21xiv1xivlusyjvq5.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21xiv1xivlusyjvq5.R.inc(90144);
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90145);return name;
        }finally{__CLR4_5_21xiv1xivlusyjvq5.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21xiv1xivlusyjvq5.R.inc(90146);
            __CLR4_5_21xiv1xivlusyjvq5.R.inc(90147);this.name = name;
        }finally{__CLR4_5_21xiv1xivlusyjvq5.R.flushNeeded();}}

    }
    
     
}
