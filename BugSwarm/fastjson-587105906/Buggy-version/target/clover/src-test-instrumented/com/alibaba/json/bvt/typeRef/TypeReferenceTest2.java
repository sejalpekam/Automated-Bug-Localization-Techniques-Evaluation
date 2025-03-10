/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.typeRef;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

public class TypeReferenceTest2 extends TestCase {static class __CLR4_1_101yjs1yjsluszwg3q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,91468,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101yjs1yjsluszwg3q.R.globalSliceStart(getClass().getName(),91432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21yjs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yjs1yjsluszwg3q.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yjs1yjsluszwg3q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.typeRef.TypeReferenceTest2.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91432,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21yjs() throws Exception{try{__CLR4_1_101yjs1yjsluszwg3q.R.inc(91432);
        __CLR4_1_101yjs1yjsluszwg3q.R.inc(91433);String text;

        {
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91434);List<Bean> list = new ArrayList<Bean>();
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91435);list.add(new Bean(123, "\u9a6c\u52a0\u7235"));
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91436);list.add(new Bean(234, "\u836f\u5bb6\u946b"));
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91437);list.add(new Bean(456, "\u5218\u5927\u4f1f"));

            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91438);text = JSON.toJSONString(list);
        }

        __CLR4_1_101yjs1yjsluszwg3q.R.inc(91439);System.out.println(text);

        {
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91440);List<Bean> list = JSON.parseObject(text, new TypeReference<List<Bean>>() {}); // \u6ce8\u610f\u8fd9\u91cc
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91441);Assert.assertEquals(3, list.size());
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91442);Assert.assertEquals(123, ((Bean) list.get(0)).getId());
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91443);Assert.assertEquals(234, ((Bean) list.get(1)).getId());
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91444);Assert.assertEquals(456, ((Bean) list.get(2)).getId());

            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91445);Assert.assertEquals("\u9a6c\u52a0\u7235", ((Bean) list.get(0)).getName());
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91446);Assert.assertEquals("\u836f\u5bb6\u946b", ((Bean) list.get(1)).getName());
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91447);Assert.assertEquals("\u5218\u5927\u4f1f", ((Bean) list.get(2)).getName());
        }
        
        {
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91448);JSONArray list = JSON.parseObject(text, new TypeReference<JSONArray>() {}); // \u6ce8\u610f\u8fd9\u91cc
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91449);Assert.assertEquals(3, list.size());
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91450);Assert.assertEquals(123, ((JSONObject) list.get(0)).get("id"));
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91451);Assert.assertEquals(234, ((JSONObject) list.get(1)).get("id"));
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91452);Assert.assertEquals(456, ((JSONObject) list.get(2)).get("id"));
            
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91453);Assert.assertEquals("\u9a6c\u52a0\u7235", ((JSONObject) list.get(0)).get("name"));
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91454);Assert.assertEquals("\u836f\u5bb6\u946b", ((JSONObject) list.get(1)).get("name"));
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91455);Assert.assertEquals("\u5218\u5927\u4f1f", ((JSONObject) list.get(2)).get("name"));
        }
    }finally{__CLR4_1_101yjs1yjsluszwg3q.R.flushNeeded();}}

    public static class Bean {

        private int    id;
        private String name;

        public Bean(){try{__CLR4_1_101yjs1yjsluszwg3q.R.inc(91456);

        }finally{__CLR4_1_101yjs1yjsluszwg3q.R.flushNeeded();}}

        public Bean(int id, String name){try{__CLR4_1_101yjs1yjsluszwg3q.R.inc(91457);
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91458);this.id = id;
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91459);this.name = name;
        }finally{__CLR4_1_101yjs1yjsluszwg3q.R.flushNeeded();}}

        public int getId() {try{__CLR4_1_101yjs1yjsluszwg3q.R.inc(91460);
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91461);return id;
        }finally{__CLR4_1_101yjs1yjsluszwg3q.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101yjs1yjsluszwg3q.R.inc(91462);
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91463);this.id = id;
        }finally{__CLR4_1_101yjs1yjsluszwg3q.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101yjs1yjsluszwg3q.R.inc(91464);
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91465);return name;
        }finally{__CLR4_1_101yjs1yjsluszwg3q.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101yjs1yjsluszwg3q.R.inc(91466);
            __CLR4_1_101yjs1yjsluszwg3q.R.inc(91467);this.name = name;
        }finally{__CLR4_1_101yjs1yjsluszwg3q.R.flushNeeded();}}

    }
}
