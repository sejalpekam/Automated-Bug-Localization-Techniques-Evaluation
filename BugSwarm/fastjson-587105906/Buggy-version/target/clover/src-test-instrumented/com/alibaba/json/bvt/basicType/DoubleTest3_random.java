/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.basicType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class DoubleTest3_random extends TestCase {static class __CLR4_1_1013781378luszw713{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,50845,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_ran() throws Exception {__CLR4_1_1013781378luszw713.R.globalSliceStart(getClass().getName(),50804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rgzuvb1378();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013781378luszw713.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013781378luszw713.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.DoubleTest3_random.test_ran",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50804,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rgzuvb1378() throws Exception{try{__CLR4_1_1013781378luszw713.R.inc(50804);
        __CLR4_1_1013781378luszw713.R.inc(50805);Random rand = new Random();

        __CLR4_1_1013781378luszw713.R.inc(50806);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_1_1013781378luszw713.R.iget(50807)!=0|true))||(__CLR4_1_1013781378luszw713.R.iget(50808)==0&false)); ++i) {{
            __CLR4_1_1013781378luszw713.R.inc(50809);double val = rand.nextDouble();

            __CLR4_1_1013781378luszw713.R.inc(50810);String str = JSON.toJSONString(new Model(val));
            __CLR4_1_1013781378luszw713.R.inc(50811);Model m = JSON.parseObject(str, Model.class);

            __CLR4_1_1013781378luszw713.R.inc(50812);assertEquals(val, m.value);
        }
    }}finally{__CLR4_1_1013781378luszw713.R.flushNeeded();}}

    public void test_ran_2() throws Exception {__CLR4_1_1013781378luszw713.R.globalSliceStart(getClass().getName(),50813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10u8hm8c137h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013781378luszw713.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013781378luszw713.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.DoubleTest3_random.test_ran_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50813,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10u8hm8c137h() throws Exception{try{__CLR4_1_1013781378luszw713.R.inc(50813);
        __CLR4_1_1013781378luszw713.R.inc(50814);Random rand = new Random();

        __CLR4_1_1013781378luszw713.R.inc(50815);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_1_1013781378luszw713.R.iget(50816)!=0|true))||(__CLR4_1_1013781378luszw713.R.iget(50817)==0&false)); ++i) {{
            __CLR4_1_1013781378luszw713.R.inc(50818);double val = rand.nextDouble();

            __CLR4_1_1013781378luszw713.R.inc(50819);String str = JSON.toJSONString(new Model(val), SerializerFeature.BeanToArray);
            __CLR4_1_1013781378luszw713.R.inc(50820);Model m = JSON.parseObject(str, Model.class, Feature.SupportArrayToBean);

            __CLR4_1_1013781378luszw713.R.inc(50821);assertEquals(val, m.value);
        }
    }}finally{__CLR4_1_1013781378luszw713.R.flushNeeded();}}

    public void test_ran_3() throws Exception {__CLR4_1_1013781378luszw713.R.globalSliceStart(getClass().getName(),50822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xhhl0t137q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013781378luszw713.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013781378luszw713.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.DoubleTest3_random.test_ran_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50822,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xhhl0t137q() throws Exception{try{__CLR4_1_1013781378luszw713.R.inc(50822);
        __CLR4_1_1013781378luszw713.R.inc(50823);Random rand = new Random();

        __CLR4_1_1013781378luszw713.R.inc(50824);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_1_1013781378luszw713.R.iget(50825)!=0|true))||(__CLR4_1_1013781378luszw713.R.iget(50826)==0&false)); ++i) {{
            __CLR4_1_1013781378luszw713.R.inc(50827);double val = rand.nextDouble();

            __CLR4_1_1013781378luszw713.R.inc(50828);String str = JSON.toJSONString(Collections.singletonMap("val", val));
            __CLR4_1_1013781378luszw713.R.inc(50829);double val2 = JSON.parseObject(str).getDoubleValue("val");

            __CLR4_1_1013781378luszw713.R.inc(50830);assertEquals(val, val2);
        }
    }}finally{__CLR4_1_1013781378luszw713.R.flushNeeded();}}

    public void test_ran_4() throws Exception {__CLR4_1_1013781378luszw713.R.globalSliceStart(getClass().getName(),50831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yami5u137z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013781378luszw713.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013781378luszw713.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.DoubleTest3_random.test_ran_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50831,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yami5u137z() throws Exception{try{__CLR4_1_1013781378luszw713.R.inc(50831);
        __CLR4_1_1013781378luszw713.R.inc(50832);Random rand = new Random();

        __CLR4_1_1013781378luszw713.R.inc(50833);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_1_1013781378luszw713.R.iget(50834)!=0|true))||(__CLR4_1_1013781378luszw713.R.iget(50835)==0&false)); ++i) {{
            __CLR4_1_1013781378luszw713.R.inc(50836);double val = rand.nextDouble();

            __CLR4_1_1013781378luszw713.R.inc(50837);HashMap map = new HashMap();
            __CLR4_1_1013781378luszw713.R.inc(50838);map.put("val", val);
            __CLR4_1_1013781378luszw713.R.inc(50839);String str = JSON.toJSONString(map);
            __CLR4_1_1013781378luszw713.R.inc(50840);double val2 = JSON.parseObject(str).getDoubleValue("val");

            __CLR4_1_1013781378luszw713.R.inc(50841);assertEquals(val, val2);
        }
    }}finally{__CLR4_1_1013781378luszw713.R.flushNeeded();}}

    public static class Model {
        public double value;

        public Model() {try{__CLR4_1_1013781378luszw713.R.inc(50842);

        }finally{__CLR4_1_1013781378luszw713.R.flushNeeded();}}

        public Model(double value) {try{__CLR4_1_1013781378luszw713.R.inc(50843);
            __CLR4_1_1013781378luszw713.R.inc(50844);this.value = value;
        }finally{__CLR4_1_1013781378luszw713.R.flushNeeded();}}
    }
}
