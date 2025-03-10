/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.basicType;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import junit.framework.TestCase;

public class LongTest extends TestCase {static class __CLR4_1_1013gr13grluszw7ak{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,51169,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_array() throws Exception {__CLR4_1_1013gr13grluszw7ak.R.globalSliceStart(getClass().getName(),51147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vw0vd913gr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013gr13grluszw7ak.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013gr13grluszw7ak.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.LongTest.test_array",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51147,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vw0vd913gr() throws Exception{try{__CLR4_1_1013gr13grluszw7ak.R.inc(51147);
        __CLR4_1_1013gr13grluszw7ak.R.inc(51148);long[] values = new long[] {Long.MIN_VALUE, -1, 0, 1, Long.MAX_VALUE};
        __CLR4_1_1013gr13grluszw7ak.R.inc(51149);String text = JSON.toJSONString(values);
        __CLR4_1_1013gr13grluszw7ak.R.inc(51150);long[] values_2 = JSON.parseObject(text, long[].class);
        __CLR4_1_1013gr13grluszw7ak.R.inc(51151);Assert.assertEquals(values_2.length, values.length);
        __CLR4_1_1013gr13grluszw7ak.R.inc(51152);for (int i = 0; (((i < values.length)&&(__CLR4_1_1013gr13grluszw7ak.R.iget(51153)!=0|true))||(__CLR4_1_1013gr13grluszw7ak.R.iget(51154)==0&false)); ++i) {{
            __CLR4_1_1013gr13grluszw7ak.R.inc(51155);Assert.assertEquals(values[i], values_2[i]);
        }
    }}finally{__CLR4_1_1013gr13grluszw7ak.R.flushNeeded();}}
    
    public void test_map() throws Exception {__CLR4_1_1013gr13grluszw7ak.R.globalSliceStart(getClass().getName(),51156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10aaqgyy13h0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013gr13grluszw7ak.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013gr13grluszw7ak.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.LongTest.test_map",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51156,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10aaqgyy13h0() throws Exception{try{__CLR4_1_1013gr13grluszw7ak.R.inc(51156);
        __CLR4_1_1013gr13grluszw7ak.R.inc(51157);long[] values = new long[] {Long.MIN_VALUE, -1, 0, 1, Long.MAX_VALUE};
        __CLR4_1_1013gr13grluszw7ak.R.inc(51158);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_1013gr13grluszw7ak.R.inc(51159);for (int i = 0; (((i < values.length)&&(__CLR4_1_1013gr13grluszw7ak.R.iget(51160)!=0|true))||(__CLR4_1_1013gr13grluszw7ak.R.iget(51161)==0&false)); ++i) {{
            __CLR4_1_1013gr13grluszw7ak.R.inc(51162);map.put(Long.toString(i), values[i]);
        }
        
        }__CLR4_1_1013gr13grluszw7ak.R.inc(51163);String text = JSON.toJSONString(map);
        __CLR4_1_1013gr13grluszw7ak.R.inc(51164);JSONObject obj = JSON.parseObject(text);
        __CLR4_1_1013gr13grluszw7ak.R.inc(51165);for (int i = 0; (((i < values.length)&&(__CLR4_1_1013gr13grluszw7ak.R.iget(51166)!=0|true))||(__CLR4_1_1013gr13grluszw7ak.R.iget(51167)==0&false)); ++i) {{
            __CLR4_1_1013gr13grluszw7ak.R.inc(51168);Assert.assertEquals(values[i], ((Number) obj.get(Long.toString(i))).longValue());
        }
    }}finally{__CLR4_1_1013gr13grluszw7ak.R.flushNeeded();}}
}
