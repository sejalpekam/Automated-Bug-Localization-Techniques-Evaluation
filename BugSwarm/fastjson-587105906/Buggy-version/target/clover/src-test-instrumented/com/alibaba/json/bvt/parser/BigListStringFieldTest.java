/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class BigListStringFieldTest extends TestCase {static class __CLR4_1_101fzr1fzrluszwc5d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,67402,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_list() throws Exception {__CLR4_1_101fzr1fzrluszwc5d.R.globalSliceStart(getClass().getName(),67383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1059ny8i1fzr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fzr1fzrluszwc5d.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fzr1fzrluszwc5d.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.BigListStringFieldTest.test_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67383,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1059ny8i1fzr() throws Exception{try{__CLR4_1_101fzr1fzrluszwc5d.R.inc(67383);
        __CLR4_1_101fzr1fzrluszwc5d.R.inc(67384);Model model = new Model();
        __CLR4_1_101fzr1fzrluszwc5d.R.inc(67385);model.values = new ArrayList<String>(10000);
        __CLR4_1_101fzr1fzrluszwc5d.R.inc(67386);for (int i = 0; (((i < 10000)&&(__CLR4_1_101fzr1fzrluszwc5d.R.iget(67387)!=0|true))||(__CLR4_1_101fzr1fzrluszwc5d.R.iget(67388)==0&false)); ++i) {{
            __CLR4_1_101fzr1fzrluszwc5d.R.inc(67389);String value = random(100);
            __CLR4_1_101fzr1fzrluszwc5d.R.inc(67390);model.values.add(value);
        }
        }__CLR4_1_101fzr1fzrluszwc5d.R.inc(67391);String text = JSON.toJSONString(model);
        __CLR4_1_101fzr1fzrluszwc5d.R.inc(67392);Model model2 = JSON.parseObject(text, Model.class);
        
        __CLR4_1_101fzr1fzrluszwc5d.R.inc(67393);Assert.assertEquals(model.values, model2.values);
    }finally{__CLR4_1_101fzr1fzrluszwc5d.R.flushNeeded();}}
    public static class Model {
        public List<String> values;
    }
    
    public String random(int count) {try{__CLR4_1_101fzr1fzrluszwc5d.R.inc(67394);
        __CLR4_1_101fzr1fzrluszwc5d.R.inc(67395);Random random = new Random();
        
        __CLR4_1_101fzr1fzrluszwc5d.R.inc(67396);char[] chars = new char[count];
        __CLR4_1_101fzr1fzrluszwc5d.R.inc(67397);for (int i = 0; (((i < count)&&(__CLR4_1_101fzr1fzrluszwc5d.R.iget(67398)!=0|true))||(__CLR4_1_101fzr1fzrluszwc5d.R.iget(67399)==0&false)); ++i) {{
            __CLR4_1_101fzr1fzrluszwc5d.R.inc(67400);chars[i] = (char) random.nextInt();
        }
        
        }__CLR4_1_101fzr1fzrluszwc5d.R.inc(67401);return new String(chars);
    }finally{__CLR4_1_101fzr1fzrluszwc5d.R.flushNeeded();}}
}
