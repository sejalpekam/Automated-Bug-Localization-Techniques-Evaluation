/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.jsonfield;

import java.lang.reflect.Field;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

import junit.framework.TestCase;

public class JSONFieldTest_0 extends TestCase {static class __CLR4_1_101fcy1fcyluszwbyk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,66596,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101fcy1fcyluszwbyk.R.globalSliceStart(getClass().getName(),66562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21fcy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fcy1fcyluszwbyk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fcy1fcyluszwbyk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jsonfield.JSONFieldTest_0.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66562,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21fcy() throws Exception{try{__CLR4_1_101fcy1fcyluszwbyk.R.inc(66562);
        __CLR4_1_101fcy1fcyluszwbyk.R.inc(66563);VO vo = new VO();
        __CLR4_1_101fcy1fcyluszwbyk.R.inc(66564);vo.setF0(100);
        __CLR4_1_101fcy1fcyluszwbyk.R.inc(66565);vo.setF1(101);
        __CLR4_1_101fcy1fcyluszwbyk.R.inc(66566);vo.setF2(102);

        __CLR4_1_101fcy1fcyluszwbyk.R.inc(66567);String text = JSON.toJSONString(vo);
        __CLR4_1_101fcy1fcyluszwbyk.R.inc(66568);System.out.println(text);

        __CLR4_1_101fcy1fcyluszwbyk.R.inc(66569);Assert.assertEquals("{\"f2\":102,\"f1\":101,\"f0\":100}", text);

        __CLR4_1_101fcy1fcyluszwbyk.R.inc(66570);VO vo_decoded = JSON.parseObject(text, VO.class);

        __CLR4_1_101fcy1fcyluszwbyk.R.inc(66571);Assert.assertEquals(vo.f0, vo_decoded.f0);
        __CLR4_1_101fcy1fcyluszwbyk.R.inc(66572);Assert.assertEquals(vo.f1, vo_decoded.f1);
        __CLR4_1_101fcy1fcyluszwbyk.R.inc(66573);Assert.assertEquals(vo.f2, vo_decoded.f2);

        __CLR4_1_101fcy1fcyluszwbyk.R.inc(66574);JavaBeanDeserializer javaBeanDeser = null;
        
        __CLR4_1_101fcy1fcyluszwbyk.R.inc(66575);ObjectDeserializer deser = ParserConfig.getGlobalInstance().getDeserializer(VO.class);
        __CLR4_1_101fcy1fcyluszwbyk.R.inc(66576);javaBeanDeser = (JavaBeanDeserializer) deser;
        
        __CLR4_1_101fcy1fcyluszwbyk.R.inc(66577);Field field = JavaBeanDeserializer.class.getDeclaredField("sortedFieldDeserializers");
        __CLR4_1_101fcy1fcyluszwbyk.R.inc(66578);field.setAccessible(true);
        __CLR4_1_101fcy1fcyluszwbyk.R.inc(66579);FieldDeserializer[] fieldDeserList = (FieldDeserializer[]) field.get(javaBeanDeser);
        
        __CLR4_1_101fcy1fcyluszwbyk.R.inc(66580);Assert.assertEquals(3, fieldDeserList.length);
        __CLR4_1_101fcy1fcyluszwbyk.R.inc(66581);Assert.assertEquals("f2", fieldDeserList[0].fieldInfo.name);
        __CLR4_1_101fcy1fcyluszwbyk.R.inc(66582);Assert.assertEquals("f1", fieldDeserList[1].fieldInfo.name);
        __CLR4_1_101fcy1fcyluszwbyk.R.inc(66583);Assert.assertEquals("f0", fieldDeserList[2].fieldInfo.name);
    }finally{__CLR4_1_101fcy1fcyluszwbyk.R.flushNeeded();}}

    public static class VO {

        @JSONField(ordinal = 3)
        private int f0;

        @JSONField(ordinal = 2)
        private int f1;

        @JSONField(ordinal = 1)
        private int f2;

        public int getF0() {try{__CLR4_1_101fcy1fcyluszwbyk.R.inc(66584);
            __CLR4_1_101fcy1fcyluszwbyk.R.inc(66585);return f0;
        }finally{__CLR4_1_101fcy1fcyluszwbyk.R.flushNeeded();}}

        public void setF0(int f0) {try{__CLR4_1_101fcy1fcyluszwbyk.R.inc(66586);
            __CLR4_1_101fcy1fcyluszwbyk.R.inc(66587);this.f0 = f0;
        }finally{__CLR4_1_101fcy1fcyluszwbyk.R.flushNeeded();}}

        public int getF1() {try{__CLR4_1_101fcy1fcyluszwbyk.R.inc(66588);
            __CLR4_1_101fcy1fcyluszwbyk.R.inc(66589);return f1;
        }finally{__CLR4_1_101fcy1fcyluszwbyk.R.flushNeeded();}}

        public void setF1(int f1) {try{__CLR4_1_101fcy1fcyluszwbyk.R.inc(66590);
            __CLR4_1_101fcy1fcyluszwbyk.R.inc(66591);this.f1 = f1;
        }finally{__CLR4_1_101fcy1fcyluszwbyk.R.flushNeeded();}}

        public int getF2() {try{__CLR4_1_101fcy1fcyluszwbyk.R.inc(66592);
            __CLR4_1_101fcy1fcyluszwbyk.R.inc(66593);return f2;
        }finally{__CLR4_1_101fcy1fcyluszwbyk.R.flushNeeded();}}

        public void setF2(int f2) {try{__CLR4_1_101fcy1fcyluszwbyk.R.inc(66594);
            __CLR4_1_101fcy1fcyluszwbyk.R.inc(66595);this.f2 = f2;
        }finally{__CLR4_1_101fcy1fcyluszwbyk.R.flushNeeded();}}

    }
}
