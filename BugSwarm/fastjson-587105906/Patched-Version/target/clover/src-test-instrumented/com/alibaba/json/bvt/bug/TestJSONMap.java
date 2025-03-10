/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class TestJSONMap extends TestCase {static class __CLR4_5_217x317x3lusyjsgx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,56933,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_217x317x3lusyjsgx.R.inc(56919);
        __CLR4_5_217x317x3lusyjsgx.R.inc(56920);com.alibaba.fastjson.parser.ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.TestJSONMap.");
    }finally{__CLR4_5_217x317x3lusyjsgx.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_5_217x317x3lusyjsgx.R.globalSliceStart(getClass().getName(),56921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp217x5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217x317x3lusyjsgx.R.rethrow($CLV_t2$);}finally{__CLR4_5_217x317x3lusyjsgx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.TestJSONMap.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56921,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp217x5() throws Exception{try{__CLR4_5_217x317x3lusyjsgx.R.inc(56921);
        __CLR4_5_217x317x3lusyjsgx.R.inc(56922);Record record = new Record();
        __CLR4_5_217x317x3lusyjsgx.R.inc(56923);Map map = new HashMap();
        __CLR4_5_217x317x3lusyjsgx.R.inc(56924);record.setRecord(map);
        __CLR4_5_217x317x3lusyjsgx.R.inc(56925);String s = JSON.toJSONString(record, SerializerFeature.WriteClassName);
        __CLR4_5_217x317x3lusyjsgx.R.inc(56926);System.out.println(s);
        __CLR4_5_217x317x3lusyjsgx.R.inc(56927);record = (Record)JSON.parse(s); //\u6b64\u5904\u629b\u51fa\u5f02\u5e38
        __CLR4_5_217x317x3lusyjsgx.R.inc(56928);System.out.println(record.getRecord().size());
    }finally{__CLR4_5_217x317x3lusyjsgx.R.flushNeeded();}}

    public static class Record {

        private Map<Integer, Integer> record;

        public Map<Integer, Integer> getRecord() {try{__CLR4_5_217x317x3lusyjsgx.R.inc(56929);
            __CLR4_5_217x317x3lusyjsgx.R.inc(56930);return record;
        }finally{__CLR4_5_217x317x3lusyjsgx.R.flushNeeded();}}

        public void setRecord(Map<Integer, Integer> record) {try{__CLR4_5_217x317x3lusyjsgx.R.inc(56931);
            __CLR4_5_217x317x3lusyjsgx.R.inc(56932);this.record = record;
        }finally{__CLR4_5_217x317x3lusyjsgx.R.flushNeeded();}}
    }
}
