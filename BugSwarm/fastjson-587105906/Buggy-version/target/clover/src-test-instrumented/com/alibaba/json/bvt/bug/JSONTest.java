/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@SuppressWarnings("unchecked")
public class JSONTest {static class __CLR4_1_1018su18suluszwa2h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,58097,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testParseArray() throws Exception {__CLR4_1_1018su18suluszwa2h.R.globalSliceStart(getClass().getName(),58062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10veatr518su();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018su18suluszwa2h.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018su18suluszwa2h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.JSONTest.testParseArray",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58062,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10veatr518su() throws Exception{try{__CLR4_1_1018su18suluszwa2h.R.inc(58062);
        __CLR4_1_1018su18suluszwa2h.R.inc(58063);List list = new ArrayList();
        __CLR4_1_1018su18suluszwa2h.R.inc(58064);OuterEntry entry = new OuterEntry();
        __CLR4_1_1018su18suluszwa2h.R.inc(58065);list.add(entry);
        __CLR4_1_1018su18suluszwa2h.R.inc(58066);entry.setId(1000L);
        __CLR4_1_1018su18suluszwa2h.R.inc(58067);entry.setUrl("http://www.springframework.org/schema/aop");
        __CLR4_1_1018su18suluszwa2h.R.inc(58068);String jsonString = JSONObject.toJSONString(entry);
        __CLR4_1_1018su18suluszwa2h.R.inc(58069);String arrayString = JSONObject.toJSONString(list);
        __CLR4_1_1018su18suluszwa2h.R.inc(58070);System.out.println(jsonString);
        __CLR4_1_1018su18suluszwa2h.R.inc(58071);System.out.println(arrayString);
        __CLR4_1_1018su18suluszwa2h.R.inc(58072);list = JSONArray.parseArray(arrayString, OuterEntry.class);
        __CLR4_1_1018su18suluszwa2h.R.inc(58073);JSONArray array = JSONArray.parseArray(arrayString);// \u8fd9\u4e00\u6b65\u51fa\u9519
    }finally{__CLR4_1_1018su18suluszwa2h.R.flushNeeded();}}

    @Test
    public void testInnerEntry() throws Exception {__CLR4_1_1018su18suluszwa2h.R.globalSliceStart(getClass().getName(),58074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yahwfp18t6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018su18suluszwa2h.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018su18suluszwa2h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.JSONTest.testInnerEntry",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58074,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yahwfp18t6() throws Exception{try{__CLR4_1_1018su18suluszwa2h.R.inc(58074);
        __CLR4_1_1018su18suluszwa2h.R.inc(58075);List list = new ArrayList();
        __CLR4_1_1018su18suluszwa2h.R.inc(58076);InnerEntry entry = new InnerEntry();
        __CLR4_1_1018su18suluszwa2h.R.inc(58077);list.add(entry);
        __CLR4_1_1018su18suluszwa2h.R.inc(58078);entry.setId(1000L);
        __CLR4_1_1018su18suluszwa2h.R.inc(58079);entry.setUrl("http://www.springframework.org/schema/aop");
        __CLR4_1_1018su18suluszwa2h.R.inc(58080);String jsonString = JSONObject.toJSONString(entry);// //\u8fd9\u4e00\u6b65\u51fa\u9519
    }finally{__CLR4_1_1018su18suluszwa2h.R.flushNeeded();}}

    class InnerEntry {

        private Long   id;
        private String url;

        public Long getId() {try{__CLR4_1_1018su18suluszwa2h.R.inc(58081);
            __CLR4_1_1018su18suluszwa2h.R.inc(58082);return id;
        }finally{__CLR4_1_1018su18suluszwa2h.R.flushNeeded();}}

        public void setId(Long id) {try{__CLR4_1_1018su18suluszwa2h.R.inc(58083);
            __CLR4_1_1018su18suluszwa2h.R.inc(58084);this.id = id;
        }finally{__CLR4_1_1018su18suluszwa2h.R.flushNeeded();}}

        public String getUrl() {try{__CLR4_1_1018su18suluszwa2h.R.inc(58085);
            __CLR4_1_1018su18suluszwa2h.R.inc(58086);return url;
        }finally{__CLR4_1_1018su18suluszwa2h.R.flushNeeded();}}

        public void setUrl(String url) {try{__CLR4_1_1018su18suluszwa2h.R.inc(58087);
            __CLR4_1_1018su18suluszwa2h.R.inc(58088);this.url = url;
        }finally{__CLR4_1_1018su18suluszwa2h.R.flushNeeded();}}
    }

    public static class OuterEntry {

        private Long   id;
        private String url;

        public Long getId() {try{__CLR4_1_1018su18suluszwa2h.R.inc(58089);
            __CLR4_1_1018su18suluszwa2h.R.inc(58090);return id;
        }finally{__CLR4_1_1018su18suluszwa2h.R.flushNeeded();}}

        public void setId(Long id) {try{__CLR4_1_1018su18suluszwa2h.R.inc(58091);
            __CLR4_1_1018su18suluszwa2h.R.inc(58092);this.id = id;
        }finally{__CLR4_1_1018su18suluszwa2h.R.flushNeeded();}}

        public String getUrl() {try{__CLR4_1_1018su18suluszwa2h.R.inc(58093);
            __CLR4_1_1018su18suluszwa2h.R.inc(58094);return url;
        }finally{__CLR4_1_1018su18suluszwa2h.R.flushNeeded();}}

        public void setUrl(String url) {try{__CLR4_1_1018su18suluszwa2h.R.inc(58095);
            __CLR4_1_1018su18suluszwa2h.R.inc(58096);this.url = url;
        }finally{__CLR4_1_1018su18suluszwa2h.R.flushNeeded();}}
    }
}
