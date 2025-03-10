/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.List;

/**
 * Created by wenshao on 16/8/11.
 */
public class Bug_for_issue_569_1 extends TestCase {static class __CLR4_5_214px14pxlusyjrop{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,52787,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_214px14pxlusyjrop.R.globalSliceStart(getClass().getName(),52773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb14px();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214px14pxlusyjrop.R.rethrow($CLV_t2$);}finally{__CLR4_5_214px14pxlusyjrop.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_569_1.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52773,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb14px() throws Exception{try{__CLR4_5_214px14pxlusyjrop.R.inc(52773);
        __CLR4_5_214px14pxlusyjrop.R.inc(52774);String str = "{\"bList\":[{\"data\":[0,1]},{\"data\":[1,2]},{\"data\":[2,3]},{\"data\":[3,4]},{\"data\":[4,5]},{\"data\":[5,6]},{\"data\":[6,7]},{\"data\":[7,8]},{\"data\":[8,9]},{\"data\":[9,10]}]}";
        __CLR4_5_214px14pxlusyjrop.R.inc(52775);A<Integer> aInteger;
        __CLR4_5_214px14pxlusyjrop.R.inc(52776);A<Long> aLong;

//        aInteger = JSON.parseObject(str, new TypeReference<A<Integer>>() {
//        });
//        Assert.assertEquals(aInteger.getbList().get(0).getData().get(0).getClass().getName(), Integer.class.getName());
//
        __CLR4_5_214px14pxlusyjrop.R.inc(52777);aLong = JSON.parseObject(str, new TypeReference<A<Long>>() {
        });
        __CLR4_5_214px14pxlusyjrop.R.inc(52778);Assert.assertEquals(aLong.getbList().get(0).getData().get(0).getClass().getName(), Long.class.getName());

    }finally{__CLR4_5_214px14pxlusyjrop.R.flushNeeded();}}



    public static class A<T> {
        private List<B<T>> bList;

        public List<B<T>> getbList() {try{__CLR4_5_214px14pxlusyjrop.R.inc(52779);
            __CLR4_5_214px14pxlusyjrop.R.inc(52780);return bList;
        }finally{__CLR4_5_214px14pxlusyjrop.R.flushNeeded();}}

        public void setbList(List<B<T>> bList) {try{__CLR4_5_214px14pxlusyjrop.R.inc(52781);
            __CLR4_5_214px14pxlusyjrop.R.inc(52782);this.bList = bList;
        }finally{__CLR4_5_214px14pxlusyjrop.R.flushNeeded();}}
    }

    public static class B<T> {
        private List<T> data;

        public List<T> getData() {try{__CLR4_5_214px14pxlusyjrop.R.inc(52783);
            __CLR4_5_214px14pxlusyjrop.R.inc(52784);return data;
        }finally{__CLR4_5_214px14pxlusyjrop.R.flushNeeded();}}

        public void setData(List<T> data) {try{__CLR4_5_214px14pxlusyjrop.R.inc(52785);
            __CLR4_5_214px14pxlusyjrop.R.inc(52786);this.data = data;
        }finally{__CLR4_5_214px14pxlusyjrop.R.flushNeeded();}}
    }
}
