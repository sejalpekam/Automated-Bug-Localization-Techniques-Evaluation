/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.a;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import junit.framework.TestCase;
import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * Created by wenshao on 06/12/2016.
 */
public class Alipay1206 extends TestCase {static class __CLR4_5_222282228lusyjwk7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,96005,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_alipay() throws Exception {__CLR4_5_222282228lusyjwk7.R.globalSliceStart(getClass().getName(),95984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tsb7qs2228();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222282228lusyjwk7.R.rethrow($CLV_t2$);}finally{__CLR4_5_222282228lusyjwk7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.a.Alipay1206.test_for_alipay",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),95984,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tsb7qs2228() throws Exception{try{__CLR4_5_222282228lusyjwk7.R.inc(95984);
        __CLR4_5_222282228lusyjwk7.R.inc(95985);File file = new File("/Users/wenshao/Downloads/x.txt");
        __CLR4_5_222282228lusyjwk7.R.inc(95986);String text = FileUtils.readFileToString(file);
        __CLR4_5_222282228lusyjwk7.R.inc(95987);JSONObject root = JSON.parseObject(text);

        __CLR4_5_222282228lusyjwk7.R.inc(95988);JSONObject resultObj = root.getJSONObject("resultObj");
        __CLR4_5_222282228lusyjwk7.R.inc(95989);assertNotNull(resultObj);

        __CLR4_5_222282228lusyjwk7.R.inc(95990);JSONArray conditionGroupItemList = resultObj.getJSONArray("conditionGroupItemList");
        __CLR4_5_222282228lusyjwk7.R.inc(95991);assertNotNull(conditionGroupItemList);

        __CLR4_5_222282228lusyjwk7.R.inc(95992);JSONObject conditionGroup = conditionGroupItemList.getJSONObject(0).getJSONObject("conditionGroup");
        __CLR4_5_222282228lusyjwk7.R.inc(95993);assertNotNull(conditionGroup);

        __CLR4_5_222282228lusyjwk7.R.inc(95994);JSONArray recordList = conditionGroup.getJSONArray("recordList");
        __CLR4_5_222282228lusyjwk7.R.inc(95995);assertNotNull(recordList);

        __CLR4_5_222282228lusyjwk7.R.inc(95996);JSONArray conditionItemList = recordList.getJSONObject(0).getJSONArray("conditionItemList");
        __CLR4_5_222282228lusyjwk7.R.inc(95997);assertNotNull(conditionItemList);

        __CLR4_5_222282228lusyjwk7.R.inc(95998);JSONObject condition = conditionItemList.getJSONObject(18).getJSONObject("condition");
        __CLR4_5_222282228lusyjwk7.R.inc(95999);assertNotNull(condition);

        __CLR4_5_222282228lusyjwk7.R.inc(96000);JSONArray conditionConstraint = condition.getJSONArray("conditionConstraint");
        __CLR4_5_222282228lusyjwk7.R.inc(96001);assertNotNull(conditionConstraint);

        __CLR4_5_222282228lusyjwk7.R.inc(96002);JSONObject constraintOptionalRecordMap = conditionConstraint.getJSONObject(0).getJSONObject("constraintOptionalRecordMap");
        __CLR4_5_222282228lusyjwk7.R.inc(96003);assertNotNull(constraintOptionalRecordMap);

        __CLR4_5_222282228lusyjwk7.R.inc(96004);System.out.println(constraintOptionalRecordMap);
    }finally{__CLR4_5_222282228lusyjwk7.R.flushNeeded();}}
}
