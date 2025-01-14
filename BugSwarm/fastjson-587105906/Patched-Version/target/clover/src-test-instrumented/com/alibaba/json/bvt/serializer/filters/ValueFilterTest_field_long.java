/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.ValueFilter;

public class ValueFilterTest_field_long extends TestCase {static class __CLR4_5_21vur1vurlusyjvga{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,88010,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_valuefilter() throws Exception {__CLR4_5_21vur1vurlusyjvga.R.globalSliceStart(getClass().getName(),87939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oiyabn1vur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vur1vurlusyjvga.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vur1vurlusyjvga.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_long.test_valuefilter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87939,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oiyabn1vur() throws Exception{try{__CLR4_5_21vur1vurlusyjvga.R.inc(87939);
        __CLR4_5_21vur1vurlusyjvga.R.inc(87940);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21vur1vurlusyjvga.R.inc(87941);
                __CLR4_5_21vur1vurlusyjvga.R.inc(87942);if ((((name.equals("id"))&&(__CLR4_5_21vur1vurlusyjvga.R.iget(87943)!=0|true))||(__CLR4_5_21vur1vurlusyjvga.R.iget(87944)==0&false))) {{
                    __CLR4_5_21vur1vurlusyjvga.R.inc(87945);return "AAA";
                }

                }__CLR4_5_21vur1vurlusyjvga.R.inc(87946);return value;
            }finally{__CLR4_5_21vur1vurlusyjvga.R.flushNeeded();}}

        };

        __CLR4_5_21vur1vurlusyjvga.R.inc(87947);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vur1vurlusyjvga.R.inc(87948);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vur1vurlusyjvga.R.inc(87949);serializer.getValueFilters().add(filter);

        __CLR4_5_21vur1vurlusyjvga.R.inc(87950);Bean a = new Bean();
        __CLR4_5_21vur1vurlusyjvga.R.inc(87951);serializer.write(a);

        __CLR4_5_21vur1vurlusyjvga.R.inc(87952);String text = out.toString();
        __CLR4_5_21vur1vurlusyjvga.R.inc(87953);Assert.assertEquals("{\"id\":\"AAA\"}", text);
    }finally{__CLR4_5_21vur1vurlusyjvga.R.flushNeeded();}}
    
    public void test_toJSONString() throws Exception {__CLR4_5_21vur1vurlusyjvga.R.globalSliceStart(getClass().getName(),87954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s73udk1vv6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vur1vurlusyjvga.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vur1vurlusyjvga.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_long.test_toJSONString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87954,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s73udk1vv6() throws Exception{try{__CLR4_5_21vur1vurlusyjvga.R.inc(87954);
        __CLR4_5_21vur1vurlusyjvga.R.inc(87955);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21vur1vurlusyjvga.R.inc(87956);
                __CLR4_5_21vur1vurlusyjvga.R.inc(87957);if ((((name.equals("id"))&&(__CLR4_5_21vur1vurlusyjvga.R.iget(87958)!=0|true))||(__CLR4_5_21vur1vurlusyjvga.R.iget(87959)==0&false))) {{
                    __CLR4_5_21vur1vurlusyjvga.R.inc(87960);return "AAA";
                }

                }__CLR4_5_21vur1vurlusyjvga.R.inc(87961);return value;
            }finally{__CLR4_5_21vur1vurlusyjvga.R.flushNeeded();}}

        };
        
        __CLR4_5_21vur1vurlusyjvga.R.inc(87962);Assert.assertEquals("{\"id\":\"AAA\"}", JSON.toJSONString(new Bean(), filter));
    }finally{__CLR4_5_21vur1vurlusyjvga.R.flushNeeded();}}

    public void test_valuefilter_1() throws Exception {__CLR4_5_21vur1vurlusyjvga.R.globalSliceStart(getClass().getName(),87963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_285ccsr1vvf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vur1vurlusyjvga.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vur1vurlusyjvga.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_long.test_valuefilter_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87963,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_285ccsr1vvf() throws Exception{try{__CLR4_5_21vur1vurlusyjvga.R.inc(87963);
        __CLR4_5_21vur1vurlusyjvga.R.inc(87964);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21vur1vurlusyjvga.R.inc(87965);
                __CLR4_5_21vur1vurlusyjvga.R.inc(87966);if ((((name.equals("name"))&&(__CLR4_5_21vur1vurlusyjvga.R.iget(87967)!=0|true))||(__CLR4_5_21vur1vurlusyjvga.R.iget(87968)==0&false))) {{
                    __CLR4_5_21vur1vurlusyjvga.R.inc(87969);return "AAA";
                }

                }__CLR4_5_21vur1vurlusyjvga.R.inc(87970);return value;
            }finally{__CLR4_5_21vur1vurlusyjvga.R.flushNeeded();}}

        };

        __CLR4_5_21vur1vurlusyjvga.R.inc(87971);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vur1vurlusyjvga.R.inc(87972);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vur1vurlusyjvga.R.inc(87973);serializer.getValueFilters().add(filter);

        __CLR4_5_21vur1vurlusyjvga.R.inc(87974);Bean a = new Bean();
        __CLR4_5_21vur1vurlusyjvga.R.inc(87975);serializer.write(a);

        __CLR4_5_21vur1vurlusyjvga.R.inc(87976);String text = out.toString();
        __CLR4_5_21vur1vurlusyjvga.R.inc(87977);Assert.assertEquals("{\"id\":0,\"name\":\"AAA\"}", text);
    }finally{__CLR4_5_21vur1vurlusyjvga.R.flushNeeded();}}

    public void test_valuefilter_2() throws Exception {__CLR4_5_21vur1vurlusyjvga.R.globalSliceStart(getClass().getName(),87978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24wce0a1vvu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vur1vurlusyjvga.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vur1vurlusyjvga.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_long.test_valuefilter_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87978,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24wce0a1vvu() throws Exception{try{__CLR4_5_21vur1vurlusyjvga.R.inc(87978);
        __CLR4_5_21vur1vurlusyjvga.R.inc(87979);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21vur1vurlusyjvga.R.inc(87980);
                __CLR4_5_21vur1vurlusyjvga.R.inc(87981);if ((((name.equals("name"))&&(__CLR4_5_21vur1vurlusyjvga.R.iget(87982)!=0|true))||(__CLR4_5_21vur1vurlusyjvga.R.iget(87983)==0&false))) {{
                    __CLR4_5_21vur1vurlusyjvga.R.inc(87984);return "AAA";
                }

                }__CLR4_5_21vur1vurlusyjvga.R.inc(87985);return value;
            }finally{__CLR4_5_21vur1vurlusyjvga.R.flushNeeded();}}

        };

        __CLR4_5_21vur1vurlusyjvga.R.inc(87986);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vur1vurlusyjvga.R.inc(87987);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vur1vurlusyjvga.R.inc(87988);serializer.getValueFilters().add(filter);

        __CLR4_5_21vur1vurlusyjvga.R.inc(87989);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21vur1vurlusyjvga.R.inc(87990);map.put("name", null);
        __CLR4_5_21vur1vurlusyjvga.R.inc(87991);serializer.write(map);

        __CLR4_5_21vur1vurlusyjvga.R.inc(87992);String text = out.toString();
        __CLR4_5_21vur1vurlusyjvga.R.inc(87993);Assert.assertEquals("{\"name\":\"AAA\"}", text);
    }finally{__CLR4_5_21vur1vurlusyjvga.R.flushNeeded();}}

    public void test_valuefilter_3() throws Exception {__CLR4_5_21vur1vurlusyjvga.R.globalSliceStart(getClass().getName(),87994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21ncf7t1vwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vur1vurlusyjvga.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vur1vurlusyjvga.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ValueFilterTest_field_long.test_valuefilter_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87994,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21ncf7t1vwa() throws Exception{try{__CLR4_5_21vur1vurlusyjvga.R.inc(87994);
        __CLR4_5_21vur1vurlusyjvga.R.inc(87995);ValueFilter filter = new ValueFilter() {

            public Object process(Object source, String name, Object value) {try{__CLR4_5_21vur1vurlusyjvga.R.inc(87996);
                __CLR4_5_21vur1vurlusyjvga.R.inc(87997);if ((((name.equals("name"))&&(__CLR4_5_21vur1vurlusyjvga.R.iget(87998)!=0|true))||(__CLR4_5_21vur1vurlusyjvga.R.iget(87999)==0&false))) {{
                    __CLR4_5_21vur1vurlusyjvga.R.inc(88000);return null;
                }

                }__CLR4_5_21vur1vurlusyjvga.R.inc(88001);return value;
            }finally{__CLR4_5_21vur1vurlusyjvga.R.flushNeeded();}}

        };

        __CLR4_5_21vur1vurlusyjvga.R.inc(88002);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21vur1vurlusyjvga.R.inc(88003);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21vur1vurlusyjvga.R.inc(88004);serializer.getValueFilters().add(filter);

        __CLR4_5_21vur1vurlusyjvga.R.inc(88005);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21vur1vurlusyjvga.R.inc(88006);map.put("name", "AA");
        __CLR4_5_21vur1vurlusyjvga.R.inc(88007);serializer.write(map);

        __CLR4_5_21vur1vurlusyjvga.R.inc(88008);String text = out.toString();
        __CLR4_5_21vur1vurlusyjvga.R.inc(88009);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21vur1vurlusyjvga.R.flushNeeded();}}

    public static class Bean {

        public long    id;
        public String name;


    }
}
