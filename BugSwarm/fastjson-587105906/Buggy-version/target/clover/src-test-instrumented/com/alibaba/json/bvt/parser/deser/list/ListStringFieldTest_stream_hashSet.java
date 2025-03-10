/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.io.StringReader;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ListStringFieldTest_stream_hashSet extends TestCase {static class __CLR4_1_101o8b1o8bluszwdw0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,78125,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_1_101o8b1o8bluszwdw0.R.globalSliceStart(getClass().getName(),78059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1059ny8i1o8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o8b1o8bluszwdw0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o8b1o8bluszwdw0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_hashSet.test_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78059,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1059ny8i1o8b() throws Exception{try{__CLR4_1_101o8b1o8bluszwdw0.R.inc(78059);
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78060);String text = "{\"values\":[\"a\",null,\"b\",\"ab\\\\c\"]}";

        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78061);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78062);Model model = reader.readObject(Model.class);
        
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78063);Assert.assertEquals(4, model.values.size());
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78064);Assert.assertTrue(model.values.contains("a"));
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78065);Assert.assertTrue(model.values.contains("b"));
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78066);Assert.assertTrue(model.values.contains(null));
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78067);Assert.assertTrue(model.values.contains("ab\\c"));
    }finally{__CLR4_1_101o8b1o8bluszwdw0.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_1_101o8b1o8bluszwdw0.R.globalSliceStart(getClass().getName(),78068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1o8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o8b1o8bluszwdw0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o8b1o8bluszwdw0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_hashSet.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78068,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1o8k() throws Exception{try{__CLR4_1_101o8b1o8bluszwdw0.R.inc(78068);
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78069);String text = "{\"values\":null}";
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78070);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78071);Model model = reader.readObject(Model.class);
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78072);Assert.assertNull(model.values);
    }finally{__CLR4_1_101o8b1o8bluszwdw0.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_1_101o8b1o8bluszwdw0.R.globalSliceStart(getClass().getName(),78073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m1ch211o8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o8b1o8bluszwdw0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o8b1o8bluszwdw0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_hashSet.test_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78073,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m1ch211o8p() throws Exception{try{__CLR4_1_101o8b1o8bluszwdw0.R.inc(78073);
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78074);String text = "{\"values\":[]}";
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78075);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78076);Model model = reader.readObject(Model.class);
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78077);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101o8b1o8bluszwdw0.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_1_101o8b1o8bluszwdw0.R.globalSliceStart(getClass().getName(),78078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lmhrdw1o8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o8b1o8bluszwdw0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o8b1o8bluszwdw0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_hashSet.test_map_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78078,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lmhrdw1o8u() throws Exception{try{__CLR4_1_101o8b1o8bluszwdw0.R.inc(78078);
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78079);String text = "{\"model\":{\"values\":[]}}";
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78080);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78081);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78082);Model model = (Model) map.get("model");
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78083);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101o8b1o8bluszwdw0.R.flushNeeded();}}

    public void test_notMatch() throws Exception {__CLR4_1_101o8b1o8bluszwdw0.R.globalSliceStart(getClass().getName(),78084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jcmrza1o90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o8b1o8bluszwdw0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o8b1o8bluszwdw0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_hashSet.test_notMatch",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78084,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jcmrza1o90() throws Exception{try{__CLR4_1_101o8b1o8bluszwdw0.R.inc(78084);
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78085);String text = "{\"value\":[]}";
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78086);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78087);Model model = reader.readObject(Model.class);
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78088);Assert.assertNull(model.values);
    }finally{__CLR4_1_101o8b1o8bluszwdw0.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101o8b1o8bluszwdw0.R.globalSliceStart(getClass().getName(),78089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1o95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o8b1o8bluszwdw0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o8b1o8bluszwdw0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_hashSet.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78089,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1o95() throws Exception{try{__CLR4_1_101o8b1o8bluszwdw0.R.inc(78089);
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78090);String text = "{\"values\":[1";
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78091);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78092);Exception error = null;
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78093);try {
            __CLR4_1_101o8b1o8bluszwdw0.R.inc(78094);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101o8b1o8bluszwdw0.R.inc(78095);error = ex;
        }
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78096);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o8b1o8bluszwdw0.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_1_101o8b1o8bluszwdw0.R.globalSliceStart(getClass().getName(),78097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1o9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o8b1o8bluszwdw0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o8b1o8bluszwdw0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_hashSet.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78097,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1o9d() throws Exception{try{__CLR4_1_101o8b1o8bluszwdw0.R.inc(78097);
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78098);String text = "{\"values\":[\"b\"[";
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78099);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78100);Exception error = null;
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78101);try {
            __CLR4_1_101o8b1o8bluszwdw0.R.inc(78102);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101o8b1o8bluszwdw0.R.inc(78103);error = ex;
        }
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78104);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o8b1o8bluszwdw0.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_1_101o8b1o8bluszwdw0.R.globalSliceStart(getClass().getName(),78105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1o9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o8b1o8bluszwdw0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o8b1o8bluszwdw0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_hashSet.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78105,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1o9l() throws Exception{try{__CLR4_1_101o8b1o8bluszwdw0.R.inc(78105);
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78106);String text = "{\"model\":{\"values\":[][";
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78107);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78108);Exception error = null;
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78109);try {
            __CLR4_1_101o8b1o8bluszwdw0.R.inc(78110);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101o8b1o8bluszwdw0.R.inc(78111);error = ex;
        }
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78112);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o8b1o8bluszwdw0.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_1_101o8b1o8bluszwdw0.R.globalSliceStart(getClass().getName(),78113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1o9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o8b1o8bluszwdw0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o8b1o8bluszwdw0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_hashSet.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78113,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1o9t() throws Exception{try{__CLR4_1_101o8b1o8bluszwdw0.R.inc(78113);
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78114);String text = "{\"model\":{\"values\":[]}[";
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78115);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78116);Exception error = null;
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78117);try {
            __CLR4_1_101o8b1o8bluszwdw0.R.inc(78118);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101o8b1o8bluszwdw0.R.inc(78119);error = ex;
        }
        __CLR4_1_101o8b1o8bluszwdw0.R.inc(78120);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o8b1o8bluszwdw0.R.flushNeeded();}}
    

    public static class Model {

        private Set<String> values;

        public Set<String> getValues() {try{__CLR4_1_101o8b1o8bluszwdw0.R.inc(78121);
            __CLR4_1_101o8b1o8bluszwdw0.R.inc(78122);return values;
        }finally{__CLR4_1_101o8b1o8bluszwdw0.R.flushNeeded();}}

        public void setValues(Set<String> values) {try{__CLR4_1_101o8b1o8bluszwdw0.R.inc(78123);
            __CLR4_1_101o8b1o8bluszwdw0.R.inc(78124);this.values = values;
        }finally{__CLR4_1_101o8b1o8bluszwdw0.R.flushNeeded();}}

    }
}
