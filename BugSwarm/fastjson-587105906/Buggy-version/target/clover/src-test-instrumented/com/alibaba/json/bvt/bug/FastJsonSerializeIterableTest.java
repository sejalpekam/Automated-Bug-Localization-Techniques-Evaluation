/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.junit.Test;

import com.alibaba.fastjson.JSON;

@java.lang.SuppressWarnings({"fallthrough"}) public class FastJsonSerializeIterableTest {static class __CLR4_1_1017bs17bsluszw9f3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,56181,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testWithIterable() {__CLR4_1_1017bs17bsluszw9f3.R.globalSliceStart(getClass().getName(),56152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yrwwlt17bs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1017bs17bsluszw9f3.R.rethrow($CLV_t2$);}finally{__CLR4_1_1017bs17bsluszw9f3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.FastJsonSerializeIterableTest.testWithIterable",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),56152,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yrwwlt17bs(){try{__CLR4_1_1017bs17bsluszw9f3.R.inc(56152);
        class Person {
            private String name;
            public Person(String s) {try{__CLR4_1_1017bs17bsluszw9f3.R.inc(56153);
                __CLR4_1_1017bs17bsluszw9f3.R.inc(56154);this.name = s;
            }finally{__CLR4_1_1017bs17bsluszw9f3.R.flushNeeded();}}
            public String getName() {try{__CLR4_1_1017bs17bsluszw9f3.R.inc(56155);
                __CLR4_1_1017bs17bsluszw9f3.R.inc(56156);return name;
            }finally{__CLR4_1_1017bs17bsluszw9f3.R.flushNeeded();}}
        }
        __CLR4_1_1017bs17bsluszw9f3.R.inc(56157);final Person s1 = new Person("fast");
        __CLR4_1_1017bs17bsluszw9f3.R.inc(56158);final Person s2 = new Person("fast");
        __CLR4_1_1017bs17bsluszw9f3.R.inc(56159);Iterable<Person> iterable = new Iterable<Person>() {
            @Override
            public Iterator<Person> iterator() {try{__CLR4_1_1017bs17bsluszw9f3.R.inc(56160);
                __CLR4_1_1017bs17bsluszw9f3.R.inc(56161);return new Iterator<Person>() {
                    int cursor = 0;
                    @Override
                    public boolean hasNext() {try{__CLR4_1_1017bs17bsluszw9f3.R.inc(56162);
                        __CLR4_1_1017bs17bsluszw9f3.R.inc(56163);return cursor < 2;
                    }finally{__CLR4_1_1017bs17bsluszw9f3.R.flushNeeded();}}

                    @Override
                    public Person next() {try{__CLR4_1_1017bs17bsluszw9f3.R.inc(56164);
                        __CLR4_1_1017bs17bsluszw9f3.R.inc(56165);int val = cursor++;
                        boolean __CLB4_1_10_bool0=false;__CLR4_1_1017bs17bsluszw9f3.R.inc(56166);switch (val) {
                            case 0:if (!__CLB4_1_10_bool0) {__CLR4_1_1017bs17bsluszw9f3.R.inc(56167);__CLB4_1_10_bool0=true;}
                                __CLR4_1_1017bs17bsluszw9f3.R.inc(56168);return s1;
                            case 1:if (!__CLB4_1_10_bool0) {__CLR4_1_1017bs17bsluszw9f3.R.inc(56169);__CLB4_1_10_bool0=true;}
                                __CLR4_1_1017bs17bsluszw9f3.R.inc(56170);return s2;
                            default:if (!__CLB4_1_10_bool0) {__CLR4_1_1017bs17bsluszw9f3.R.inc(56171);__CLB4_1_10_bool0=true;}
                                __CLR4_1_1017bs17bsluszw9f3.R.inc(56172);throw new NoSuchElementException();
                        }
                    }finally{__CLR4_1_1017bs17bsluszw9f3.R.flushNeeded();}}

                    @Override
                    public void remove() {try{__CLR4_1_1017bs17bsluszw9f3.R.inc(56173);
                        __CLR4_1_1017bs17bsluszw9f3.R.inc(56174);throw new UnsupportedOperationException();
                    }finally{__CLR4_1_1017bs17bsluszw9f3.R.flushNeeded();}}
                };
            }finally{__CLR4_1_1017bs17bsluszw9f3.R.flushNeeded();}}
        };
        __CLR4_1_1017bs17bsluszw9f3.R.inc(56175);List<Person> list = new ArrayList<Person>();
        __CLR4_1_1017bs17bsluszw9f3.R.inc(56176);for (Person p : iterable) {{
            __CLR4_1_1017bs17bsluszw9f3.R.inc(56177);list.add(p);
        }
        
        }__CLR4_1_1017bs17bsluszw9f3.R.inc(56178);Assert.assertEquals("[{\"name\":\"fast\"},{\"name\":\"fast\"}]", JSON.toJSONString(list));
        __CLR4_1_1017bs17bsluszw9f3.R.inc(56179);Assert.assertEquals("[{\"name\":\"fast\"},{\"name\":\"fast\"}]", JSON.toJSONString(iterable));
        __CLR4_1_1017bs17bsluszw9f3.R.inc(56180);Assert.assertEquals("[{\"name\":\"fast\"},{\"name\":\"fast\"}]", JSON.toJSONString(list.iterator()));
    }finally{__CLR4_1_1017bs17bsluszw9f3.R.flushNeeded();}}
}
