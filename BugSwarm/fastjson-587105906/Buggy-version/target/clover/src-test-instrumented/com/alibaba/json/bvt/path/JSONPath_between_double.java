/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import com.alibaba.fastjson.JSONPath;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class JSONPath_between_double extends TestCase {static class __CLR4_1_101pk31pk3luszwe9v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,79815,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_between() throws Exception {__CLR4_1_101pk31pk3luszwe9v.R.globalSliceStart(getClass().getName(),79779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104fvk5a1pk3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pk31pk3luszwe9v.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pk31pk3luszwe9v.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_between_double.test_between",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79779,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104fvk5a1pk3() throws Exception{try{__CLR4_1_101pk31pk3luszwe9v.R.inc(79779);
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79780);List list = new ArrayList();
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79781);list.add(new Entity(101, "kiki"));
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79782);list.add(new Entity(102, "ljw2083"));
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79783);list.add(new Entity(103, "ljw2083"));
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79784);List<Object> result = (List<Object>) JSONPath.eval(list, "$[id between 101 and 101]");
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79785);Assert.assertEquals(1, result.size());
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79786);Assert.assertSame(list.get(0), result.get(0));
    }finally{__CLR4_1_101pk31pk3luszwe9v.R.flushNeeded();}}
    
    public void test_between_2() throws Exception {__CLR4_1_101pk31pk3luszwe9v.R.globalSliceStart(getClass().getName(),79787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101h2qqd1pkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pk31pk3luszwe9v.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pk31pk3luszwe9v.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_between_double.test_between_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79787,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101h2qqd1pkb() throws Exception{try{__CLR4_1_101pk31pk3luszwe9v.R.inc(79787);
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79788);List list = new ArrayList();
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79789);list.add(new Entity(101, "kiki"));
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79790);list.add(new Entity(102, "ljw2083"));
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79791);list.add(new Entity(103, "ljw2083"));
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79792);List<Object> result = (List<Object>) JSONPath.eval(list, "$[id between 101 and 102]");
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79793);Assert.assertEquals(2, result.size());
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79794);Assert.assertSame(list.get(0), result.get(0));
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79795);Assert.assertSame(list.get(1), result.get(1));
    }finally{__CLR4_1_101pk31pk3luszwe9v.R.flushNeeded();}}
    
    public void test_between_not() throws Exception {__CLR4_1_101pk31pk3luszwe9v.R.globalSliceStart(getClass().getName(),79796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102omvfu1pkk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pk31pk3luszwe9v.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pk31pk3luszwe9v.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_between_double.test_between_not",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79796,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102omvfu1pkk() throws Exception{try{__CLR4_1_101pk31pk3luszwe9v.R.inc(79796);
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79797);List list = new ArrayList();
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79798);list.add(new Entity(101, "kiki"));
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79799);list.add(new Entity(102, "ljw2083"));
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79800);list.add(new Entity(103, "ljw2083"));
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79801);List<Object> result = (List<Object>) JSONPath.eval(list, "$[id not between 101 and 102]");
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79802);Assert.assertEquals(1, result.size());
        __CLR4_1_101pk31pk3luszwe9v.R.inc(79803);Assert.assertSame(list.get(2), result.get(0));
    }finally{__CLR4_1_101pk31pk3luszwe9v.R.flushNeeded();}}

    public static class Entity {

        private Double id;
        private String  name;

        public Entity(int id, String name){try{__CLR4_1_101pk31pk3luszwe9v.R.inc(79804);
            __CLR4_1_101pk31pk3luszwe9v.R.inc(79805);this.id = Double.valueOf(id);
            __CLR4_1_101pk31pk3luszwe9v.R.inc(79806);this.name = name;
        }finally{__CLR4_1_101pk31pk3luszwe9v.R.flushNeeded();}}

        public Double getId() {try{__CLR4_1_101pk31pk3luszwe9v.R.inc(79807);
            __CLR4_1_101pk31pk3luszwe9v.R.inc(79808);return id;
        }finally{__CLR4_1_101pk31pk3luszwe9v.R.flushNeeded();}}

        public void setId(Double id) {try{__CLR4_1_101pk31pk3luszwe9v.R.inc(79809);
            __CLR4_1_101pk31pk3luszwe9v.R.inc(79810);this.id = id;
        }finally{__CLR4_1_101pk31pk3luszwe9v.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101pk31pk3luszwe9v.R.inc(79811);
            __CLR4_1_101pk31pk3luszwe9v.R.inc(79812);return name;
        }finally{__CLR4_1_101pk31pk3luszwe9v.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101pk31pk3luszwe9v.R.inc(79813);
            __CLR4_1_101pk31pk3luszwe9v.R.inc(79814);this.name = name;
        }finally{__CLR4_1_101pk31pk3luszwe9v.R.flushNeeded();}}

    }
}
