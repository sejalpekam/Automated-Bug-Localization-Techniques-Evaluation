/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.writeClassName;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import com.alibaba.fastjson.parser.ParserConfig;
import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class WriteClassNameTest_Set extends TestCase {static class __CLR4_5_21yxs1yxslusyjw13{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,91953,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_21yxs1yxslusyjw13.R.inc(91936);
        __CLR4_5_21yxs1yxslusyjw13.R.inc(91937);ParserConfig.global.addAccept("com.alibaba.json.bvt.writeClassName.WriteClassNameTest_Set");
    }finally{__CLR4_5_21yxs1yxslusyjw13.R.flushNeeded();}}

    public void test_list() throws Exception {__CLR4_5_21yxs1yxslusyjw13.R.globalSliceStart(getClass().getName(),91938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259ny8i1yxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yxs1yxslusyjw13.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yxs1yxslusyjw13.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeClassName.WriteClassNameTest_Set.test_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91938,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259ny8i1yxu() throws Exception{try{__CLR4_5_21yxs1yxslusyjw13.R.inc(91938);
        __CLR4_5_21yxs1yxslusyjw13.R.inc(91939);A a = new A();
        __CLR4_5_21yxs1yxslusyjw13.R.inc(91940);Set<B> set = new LinkedHashSet<B>();
        __CLR4_5_21yxs1yxslusyjw13.R.inc(91941);set.add(new B());
        __CLR4_5_21yxs1yxslusyjw13.R.inc(91942);set.add(new B1());
        __CLR4_5_21yxs1yxslusyjw13.R.inc(91943);a.setList(set);
        __CLR4_5_21yxs1yxslusyjw13.R.inc(91944);String text = JSON.toJSONString(a, SerializerFeature.WriteClassName);
        __CLR4_5_21yxs1yxslusyjw13.R.inc(91945);System.out.println(text);
        __CLR4_5_21yxs1yxslusyjw13.R.inc(91946);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.writeClassName.WriteClassNameTest_Set$A\",\"list\":[{},{\"@type\":\"com.alibaba.json.bvt.writeClassName.WriteClassNameTest_Set$B1\"}]}",
                            text);

        __CLR4_5_21yxs1yxslusyjw13.R.inc(91947);A a1 = (A) JSON.parse(text);

        __CLR4_5_21yxs1yxslusyjw13.R.inc(91948);Assert.assertEquals(2, a1.getList().size());
    }finally{__CLR4_5_21yxs1yxslusyjw13.R.flushNeeded();}}

    public static class A {

        private Set<B> list;

        public Set<B> getList() {try{__CLR4_5_21yxs1yxslusyjw13.R.inc(91949);
            __CLR4_5_21yxs1yxslusyjw13.R.inc(91950);return list;
        }finally{__CLR4_5_21yxs1yxslusyjw13.R.flushNeeded();}}

        public void setList(Set<B> list) {try{__CLR4_5_21yxs1yxslusyjw13.R.inc(91951);
            __CLR4_5_21yxs1yxslusyjw13.R.inc(91952);this.list = list;
        }finally{__CLR4_5_21yxs1yxslusyjw13.R.flushNeeded();}}

    }

    public static class B {

    }

    public static class B1 extends B {

    }
}
