/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1800;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import junit.framework.TestCase;

public class Issue1821 extends TestCase {static class __CLR4_1_101dhp1dhpluszwbbr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,64155,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101dhp1dhpluszwbbr.R.globalSliceStart(getClass().getName(),64141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1dhp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101dhp1dhpluszwbbr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101dhp1dhpluszwbbr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1800.Issue1821.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),64141,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1dhp() throws Exception{try{__CLR4_1_101dhp1dhpluszwbbr.R.inc(64141);
        __CLR4_1_101dhp1dhpluszwbbr.R.inc(64142);String str = "{\"type\":800,\"data\":\"HuYgMIxwfqdtvOJNv6kK025g5fh3yFHI2kaByO7udKk6FOBC3PGRWkGfwV0\\/vWQW6roN5ftKDHFZ3PWl0715OYue0rZj\\/VwrNsMvIL4MqTUNBBUGFU9SgZu87ss7RqmyijH6\\/sM968cK1Dv5U7Rrw79idl\\/hW8SILLn1YXvUa60=\"}";
        __CLR4_1_101dhp1dhpluszwbbr.R.inc(64143);String expectStr = "{\"type\":800,\"data\":\"HuYgMIxwfqdtvOJNv6kK025g5fh3yFHI2kaByO7udKk6FOBC3PGRWkGfwV0/vWQW6roN5ftKDHFZ3PWl0715OYue0rZj/VwrNsMvIL4MqTUNBBUGFU9SgZu87ss7RqmyijH6/sM968cK1Dv5U7Rrw79idl/hW8SILLn1YXvUa60=\"}";
        __CLR4_1_101dhp1dhpluszwbbr.R.inc(64144);Model m = JSON.parseObject(str, Model.class);
        __CLR4_1_101dhp1dhpluszwbbr.R.inc(64145);assertEquals(expectStr, JSON.toJSONString(m));

        __CLR4_1_101dhp1dhpluszwbbr.R.inc(64146);str = "{\"type\":800,\"data\":\"Y29tLmFsaWJhYmEuZmFzdGpzb24=\"}";
        __CLR4_1_101dhp1dhpluszwbbr.R.inc(64147);m = JSON.parseObject(str, Model.class);
        __CLR4_1_101dhp1dhpluszwbbr.R.inc(64148);assertEquals(str, JSON.toJSONString(m));
        __CLR4_1_101dhp1dhpluszwbbr.R.inc(64149);assertEquals("com.alibaba.fastjson", new String(m.data));

        __CLR4_1_101dhp1dhpluszwbbr.R.inc(64150);expectStr = str;
        __CLR4_1_101dhp1dhpluszwbbr.R.inc(64151);str = "{\"type\":800,\"data\":\"\\u005929tLmFsaWJ\\u0068YmEuZmFzdGpzb24\\u003d\"}";
        __CLR4_1_101dhp1dhpluszwbbr.R.inc(64152);m = JSON.parseObject(str, Model.class);
        __CLR4_1_101dhp1dhpluszwbbr.R.inc(64153);assertEquals(expectStr, JSON.toJSONString(m));
        __CLR4_1_101dhp1dhpluszwbbr.R.inc(64154);assertEquals("com.alibaba.fastjson", new String(m.data));

    }finally{__CLR4_1_101dhp1dhpluszwbbr.R.flushNeeded();}}

    @JSONType
    public static class Model {
        @JSONField(name="type", ordinal = 1)
        public int type;

        @JSONField(name="data", ordinal = 2)
        public byte[] data;
    }

}
