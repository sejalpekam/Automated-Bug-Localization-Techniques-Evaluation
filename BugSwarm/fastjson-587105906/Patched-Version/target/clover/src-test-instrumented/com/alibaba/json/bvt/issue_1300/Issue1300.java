/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1300;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.util.TypeUtils;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by wenshao on 01/07/2017.
 */
public class Issue1300 extends TestCase {static class __CLR4_5_219v019v0lusyjsrc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,59453,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void testFullJSON() {__CLR4_5_219v019v0lusyjsrc.R.globalSliceStart(getClass().getName(),59436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xl2wnk19v0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219v019v0lusyjsrc.R.rethrow($CLV_t2$);}finally{__CLR4_5_219v019v0lusyjsrc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1300.testFullJSON",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59436,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xl2wnk19v0(){try{__CLR4_5_219v019v0lusyjsrc.R.inc(59436);
        __CLR4_5_219v019v0lusyjsrc.R.inc(59437);JSONObject data = new JSONObject();
        __CLR4_5_219v019v0lusyjsrc.R.inc(59438);data.put("name", "string");
        __CLR4_5_219v019v0lusyjsrc.R.inc(59439);data.put("code", 1);
        __CLR4_5_219v019v0lusyjsrc.R.inc(59440);data.put("pinyin", "pinyin");
        __CLR4_5_219v019v0lusyjsrc.R.inc(59441);City object = TypeUtils.castToJavaBean(data, City.class);
        __CLR4_5_219v019v0lusyjsrc.R.inc(59442);assertEquals("string", object.name);
        __CLR4_5_219v019v0lusyjsrc.R.inc(59443);assertEquals(1, object.code);
        __CLR4_5_219v019v0lusyjsrc.R.inc(59444);assertEquals("pinyin", object.pinyin);
    }finally{__CLR4_5_219v019v0lusyjsrc.R.flushNeeded();}}

    public void testEmptyJSON() {__CLR4_5_219v019v0lusyjsrc.R.globalSliceStart(getClass().getName(),59445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kdvh7a19v9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219v019v0lusyjsrc.R.rethrow($CLV_t2$);}finally{__CLR4_5_219v019v0lusyjsrc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1300.testEmptyJSON",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59445,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kdvh7a19v9(){try{__CLR4_5_219v019v0lusyjsrc.R.inc(59445);
        __CLR4_5_219v019v0lusyjsrc.R.inc(59446);City object = TypeUtils.castToJavaBean(new JSONObject(), City.class);
        __CLR4_5_219v019v0lusyjsrc.R.inc(59447);Assert.assertEquals(null, object.name);
        __CLR4_5_219v019v0lusyjsrc.R.inc(59448);Assert.assertEquals(0, object.code);
    }finally{__CLR4_5_219v019v0lusyjsrc.R.flushNeeded();}}


    public static class City implements Parcelable {
        public final int code;
        public final String name;
        public final String pinyin;

        @JSONCreator
        public City(@JSONField(name = "code") int code,
                    @JSONField(name = "name") String name,
                    @JSONField(name = "pinyin") String pinyin) {try{__CLR4_5_219v019v0lusyjsrc.R.inc(59449);
            __CLR4_5_219v019v0lusyjsrc.R.inc(59450);this.code = code;
            __CLR4_5_219v019v0lusyjsrc.R.inc(59451);this.name = name;
            __CLR4_5_219v019v0lusyjsrc.R.inc(59452);this.pinyin = pinyin;
        }finally{__CLR4_5_219v019v0lusyjsrc.R.flushNeeded();}}
    }

    public static interface Parcelable {

    }
}
