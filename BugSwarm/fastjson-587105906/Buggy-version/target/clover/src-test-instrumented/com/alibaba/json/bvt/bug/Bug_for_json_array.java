/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class Bug_for_json_array extends TestCase {static class __CLR4_1_1015v115v1luszw8w0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,54273,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_bug() throws Exception {__CLR4_1_1015v115v1luszw8w0.R.globalSliceStart(getClass().getName(),54253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a1x2ge15v1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1015v115v1luszw8w0.R.rethrow($CLV_t2$);}finally{__CLR4_1_1015v115v1luszw8w0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_json_array.test_bug",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),54253,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a1x2ge15v1() throws Exception{try{__CLR4_1_1015v115v1luszw8w0.R.inc(54253);
        __CLR4_1_1015v115v1luszw8w0.R.inc(54254);String jsonStr = "{\"state\":0,\"data\":[{\"items\":[{\"tip\":\"\u5218\u82e5\u82f1\",\"url\":\"xiami:\\/\\/artist\\/1930\"},{\"tip\":\"\u5218\u5fb7\u534e\",\"url\":\"xiami:\\/\\/artist\\/648\"}],\"type\":\"artist\"},{\"items\":[{\"tip\":\"\u6f02\u6d0b\u8fc7\u6d77\u6765\u770b\u4f60 (Live) - \u5218\u660e\u6e58\",\"url\":\"xiami:\\/\\/song\\/1773431302\"},{\"tip\":\"\\u6211\\u4eec\\u6ca1\\u6709\\u5728\\u4e00\\u8d77 - \\u5218\\u82e5\\u82f1\",\"url\":\"xiami:\\/\\/song\\/1769471863\"},{\"tip\":\"\\u54ed\u7802 (Live)(\\u5218\\u660e\\u6e58\\u80dc\\u51fa) - \\u5218\u660e\u6e58\",\"url\":\"xiami:\\/\\/ song\\/1773484887\"}],\"type\":\"song\"},{\"items\":[{\"tip\":\"\\u4eb2\\u7231\\u7684\\u8def\\u4eba - \\u5218\\u82e5\\u82f1\",\"url\":\"xiami:\\/\\/album\\/55230\"},{\"tip\":\"\\u5728\\u4e00\\u8d77 - \\u5218\\u82e5\\u82f1\",\"url\":\"xiami:\\/\\/album\\/377241\"}],\"type\":\"album\"}],\"status\":\"ok\",\"err\":null} ";

        __CLR4_1_1015v115v1luszw8w0.R.inc(54255);Parser parser = JSON.parseObject(jsonStr, Parser.class);

        __CLR4_1_1015v115v1luszw8w0.R.inc(54256);System.out.println(JSON.toJSONString(parser));
    }finally{__CLR4_1_1015v115v1luszw8w0.R.flushNeeded();}}

    public static class Parser {

        public int    state;
        public JSON   data;
        public String status;
        public String err;

        public int getState() {try{__CLR4_1_1015v115v1luszw8w0.R.inc(54257);
            __CLR4_1_1015v115v1luszw8w0.R.inc(54258);return state;
        }finally{__CLR4_1_1015v115v1luszw8w0.R.flushNeeded();}}

        public void setState(int state) {try{__CLR4_1_1015v115v1luszw8w0.R.inc(54259);
            __CLR4_1_1015v115v1luszw8w0.R.inc(54260);this.state = state;
        }finally{__CLR4_1_1015v115v1luszw8w0.R.flushNeeded();}}

        public JSON getData() {try{__CLR4_1_1015v115v1luszw8w0.R.inc(54261);
            __CLR4_1_1015v115v1luszw8w0.R.inc(54262);return data;
        }finally{__CLR4_1_1015v115v1luszw8w0.R.flushNeeded();}}

        public void setData(JSON data) {try{__CLR4_1_1015v115v1luszw8w0.R.inc(54263);
            __CLR4_1_1015v115v1luszw8w0.R.inc(54264);this.data = data;
        }finally{__CLR4_1_1015v115v1luszw8w0.R.flushNeeded();}}

        public String getStatus() {try{__CLR4_1_1015v115v1luszw8w0.R.inc(54265);
            __CLR4_1_1015v115v1luszw8w0.R.inc(54266);return status;
        }finally{__CLR4_1_1015v115v1luszw8w0.R.flushNeeded();}}

        public void setStatus(String status) {try{__CLR4_1_1015v115v1luszw8w0.R.inc(54267);
            __CLR4_1_1015v115v1luszw8w0.R.inc(54268);this.status = status;
        }finally{__CLR4_1_1015v115v1luszw8w0.R.flushNeeded();}}

        public String getErr() {try{__CLR4_1_1015v115v1luszw8w0.R.inc(54269);
            __CLR4_1_1015v115v1luszw8w0.R.inc(54270);return err;
        }finally{__CLR4_1_1015v115v1luszw8w0.R.flushNeeded();}}

        public void setErr(String err) {try{__CLR4_1_1015v115v1luszw8w0.R.inc(54271);
            __CLR4_1_1015v115v1luszw8w0.R.inc(54272);this.err = err;
        }finally{__CLR4_1_1015v115v1luszw8w0.R.flushNeeded();}}
    }
}
