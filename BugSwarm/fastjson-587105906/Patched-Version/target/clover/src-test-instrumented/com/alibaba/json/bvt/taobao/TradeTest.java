/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.taobao;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import junit.framework.TestCase;

public class TradeTest extends TestCase {static class __CLR4_5_21xio1xiolusyjvpz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,90103,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_cast() {__CLR4_5_21xio1xiolusyjvpz.R.globalSliceStart(getClass().getName(),90096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lbobql1xio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xio1xiolusyjvpz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xio1xiolusyjvpz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.taobao.TradeTest.test_cast",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90096,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lbobql1xio(){try{__CLR4_5_21xio1xiolusyjvpz.R.inc(90096);
        __CLR4_5_21xio1xiolusyjvpz.R.inc(90097);String s
                = "{\"period\":{\"label\":\"\u6700\u8fd130\u5929\",\"value\":\"30d\"},\"data\":{\"gmv\":{\"min\":-2},\"id\":3712312925}}";
        __CLR4_5_21xio1xiolusyjvpz.R.inc(90098);Param param;
        __CLR4_5_21xio1xiolusyjvpz.R.inc(90099);param = JSON.parseObject(s, Param.class); // \u4ece\u5b57\u7b26\u4e32\u76f4\u63a5\u8f6c\u5316\uff0cOK
        __CLR4_5_21xio1xiolusyjvpz.R.inc(90100);assertNotNull(param);

        __CLR4_5_21xio1xiolusyjvpz.R.inc(90101);JSONObject jobj = JSON.parseObject(s);
        __CLR4_5_21xio1xiolusyjvpz.R.inc(90102);param = jobj.toJavaObject(Param.class);
    }finally{__CLR4_5_21xio1xiolusyjvpz.R.flushNeeded();}}

    public static class Param extends BaseObject {

        private static final long serialVersionUID = 5180807854744861824L;

        public TradeParam<Long, Double, Long, Long> data;

        public Pair<String> period;
    }

    public static class TradeParam<ID, G, O, C> extends BaseObject {

        private static final long serialVersionUID = 3201881995156974305L;

        public ID id;

        public Range<G> gmv;

        public Range<O> ordCnt;

        public Range<C> cspu;

    }

    public static class Range<T> extends BaseObject {

        private static final long serialVersionUID = 669395861117027110L;

        public T min;
        public T max;

    }

    public static class BaseObject {}

    public static class Pair<T> extends BaseObject {

        private static final long serialVersionUID = 2840564531670241284L;

        public String label;
        public T value;

    }
}
