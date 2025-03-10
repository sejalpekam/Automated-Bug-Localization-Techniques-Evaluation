/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by wuwen on 2016/12/7.
 */
public class Bug_for_issue_937 extends TestCase {static class __CLR4_5_214tl14tllusyjrpg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,52922,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_5_214tl14tllusyjrpg.R.globalSliceStart(getClass().getName(),52905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb14tl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214tl14tllusyjrpg.R.rethrow($CLV_t2$);}finally{__CLR4_5_214tl14tllusyjrpg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_937.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52905,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb14tl() throws Exception{try{__CLR4_5_214tl14tllusyjrpg.R.inc(52905);
        __CLR4_5_214tl14tllusyjrpg.R.inc(52906);String json = "{outPara:{name:\"user\"}}";
        __CLR4_5_214tl14tllusyjrpg.R.inc(52907);Out<Info> out = returnOut(json, Info.class);
        __CLR4_5_214tl14tllusyjrpg.R.inc(52908);Assert.assertEquals("user", out.getOutPara().getName());
    }finally{__CLR4_5_214tl14tllusyjrpg.R.flushNeeded();}}

    public static <T> Out<T> returnOut(String jsonStr, Class<T> c2) {try{__CLR4_5_214tl14tllusyjrpg.R.inc(52909);
        __CLR4_5_214tl14tllusyjrpg.R.inc(52910);return JSON.parseObject(jsonStr, new TypeReference<Out<T>>(c2) {
        });
    }finally{__CLR4_5_214tl14tllusyjrpg.R.flushNeeded();}}

    public static class Out<T> {
        private T outPara;

        public void setOutPara(T t) {try{__CLR4_5_214tl14tllusyjrpg.R.inc(52911);
            __CLR4_5_214tl14tllusyjrpg.R.inc(52912);outPara = t;
        }finally{__CLR4_5_214tl14tllusyjrpg.R.flushNeeded();}}

        public T getOutPara() {try{__CLR4_5_214tl14tllusyjrpg.R.inc(52913);
            __CLR4_5_214tl14tllusyjrpg.R.inc(52914);return outPara;
        }finally{__CLR4_5_214tl14tllusyjrpg.R.flushNeeded();}}

        public Out() {try{__CLR4_5_214tl14tllusyjrpg.R.inc(52915);
        }finally{__CLR4_5_214tl14tllusyjrpg.R.flushNeeded();}}

        public Out(T t) {try{__CLR4_5_214tl14tllusyjrpg.R.inc(52916);
            __CLR4_5_214tl14tllusyjrpg.R.inc(52917);setOutPara(t);
        }finally{__CLR4_5_214tl14tllusyjrpg.R.flushNeeded();}}
    }

    public static class Info {
        private String name;

        public String getName() {try{__CLR4_5_214tl14tllusyjrpg.R.inc(52918);
            __CLR4_5_214tl14tllusyjrpg.R.inc(52919);return name;
        }finally{__CLR4_5_214tl14tllusyjrpg.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_214tl14tllusyjrpg.R.inc(52920);
            __CLR4_5_214tl14tllusyjrpg.R.inc(52921);this.name = name;
        }finally{__CLR4_5_214tl14tllusyjrpg.R.flushNeeded();}}
    }
}
