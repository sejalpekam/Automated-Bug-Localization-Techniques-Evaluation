/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.lang.reflect.Type;

import junit.framework.TestCase;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.TypeUtils;

public class Issue96 extends TestCase {static class __CLR4_5_217nj17njlusyjsfo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,56604,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_5_217nj17njlusyjsfo.R.globalSliceStart(getClass().getName(),56575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb17nj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217nj17njlusyjsfo.R.rethrow($CLV_t2$);}finally{__CLR4_5_217nj17njlusyjsfo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue96.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56575,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb17nj() throws Exception{try{__CLR4_5_217nj17njlusyjsfo.R.inc(56575);
        __CLR4_5_217nj17njlusyjsfo.R.inc(56576);Page<Sub> page = new Page<Sub>(new Sub(1));
        __CLR4_5_217nj17njlusyjsfo.R.inc(56577);Type type = new TypeReference<Page<Sub>>() {
        }.getType();
        // this is ok
        __CLR4_5_217nj17njlusyjsfo.R.inc(56578);Page<Sub> page1 = JSON.parseObject(JSON.toJSONString(page), type);
        __CLR4_5_217nj17njlusyjsfo.R.inc(56579);System.out.println(page1.sub.getClass());
    }finally{__CLR4_5_217nj17njlusyjsfo.R.flushNeeded();}}

    public void xx_testCast() {try{__CLR4_5_217nj17njlusyjsfo.R.inc(56580);
        __CLR4_5_217nj17njlusyjsfo.R.inc(56581);Page<Sub> page = new Page<Sub>(new Sub(1));
        __CLR4_5_217nj17njlusyjsfo.R.inc(56582);Type type = new TypeReference<Page<Sub>>() {
        }.getType();
        __CLR4_5_217nj17njlusyjsfo.R.inc(56583);ParserConfig parserconfig = ParserConfig.getGlobalInstance();
        // !!!! this will fail:
        // !!!! com.alibaba.fastjson.JSONException: can not cast to : Page<Sub> TypeUtils.java:719
        __CLR4_5_217nj17njlusyjsfo.R.inc(56584);Page<Sub> page1 = TypeUtils.cast(page, type, parserconfig);
        __CLR4_5_217nj17njlusyjsfo.R.inc(56585);System.out.println(page1.sub.getClass());
    }finally{__CLR4_5_217nj17njlusyjsfo.R.flushNeeded();}}

    static class Page<T> {

        public Page(){
            super();__CLR4_5_217nj17njlusyjsfo.R.inc(56587);try{__CLR4_5_217nj17njlusyjsfo.R.inc(56586);
        }finally{__CLR4_5_217nj17njlusyjsfo.R.flushNeeded();}}

        public Page(T sub){
            super();__CLR4_5_217nj17njlusyjsfo.R.inc(56589);try{__CLR4_5_217nj17njlusyjsfo.R.inc(56588);
            __CLR4_5_217nj17njlusyjsfo.R.inc(56590);this.sub = sub;
        }finally{__CLR4_5_217nj17njlusyjsfo.R.flushNeeded();}}

        T sub;

        public T getSub() {try{__CLR4_5_217nj17njlusyjsfo.R.inc(56591);
            __CLR4_5_217nj17njlusyjsfo.R.inc(56592);return sub;
        }finally{__CLR4_5_217nj17njlusyjsfo.R.flushNeeded();}}

        public void setSub(T sub) {try{__CLR4_5_217nj17njlusyjsfo.R.inc(56593);
            __CLR4_5_217nj17njlusyjsfo.R.inc(56594);this.sub = sub;
        }finally{__CLR4_5_217nj17njlusyjsfo.R.flushNeeded();}}
    }

    static class Sub {

        public Sub(){
            super();__CLR4_5_217nj17njlusyjsfo.R.inc(56596);try{__CLR4_5_217nj17njlusyjsfo.R.inc(56595);
        }finally{__CLR4_5_217nj17njlusyjsfo.R.flushNeeded();}}

        public Sub(int id){
            super();__CLR4_5_217nj17njlusyjsfo.R.inc(56598);try{__CLR4_5_217nj17njlusyjsfo.R.inc(56597);
            __CLR4_5_217nj17njlusyjsfo.R.inc(56599);this.id = id;
        }finally{__CLR4_5_217nj17njlusyjsfo.R.flushNeeded();}}

        int id;

        public int getId() {try{__CLR4_5_217nj17njlusyjsfo.R.inc(56600);
            __CLR4_5_217nj17njlusyjsfo.R.inc(56601);return id;
        }finally{__CLR4_5_217nj17njlusyjsfo.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_217nj17njlusyjsfo.R.inc(56602);
            __CLR4_5_217nj17njlusyjsfo.R.inc(56603);this.id = id;
        }finally{__CLR4_5_217nj17njlusyjsfo.R.flushNeeded();}}
    }
}
