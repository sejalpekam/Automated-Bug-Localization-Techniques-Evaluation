/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.NameFilter;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;

public class FieldSerializerTest2 extends TestCase {static class __CLR4_1_101lwk1lwkluszwddu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,75086,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_writeNull() throws Exception {__CLR4_1_101lwk1lwkluszwddu.R.globalSliceStart(getClass().getName(),75044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a7dh6o1lwk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lwk1lwkluszwddu.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lwk1lwkluszwddu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.FieldSerializerTest2.test_writeNull",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75044,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a7dh6o1lwk() throws Exception{try{__CLR4_1_101lwk1lwkluszwddu.R.inc(75044);
        __CLR4_1_101lwk1lwkluszwddu.R.inc(75045);String text = toJSONString(new Entity());
        __CLR4_1_101lwk1lwkluszwddu.R.inc(75046);Assert.assertEquals("{\"value\":\"xxx\"}", text);
    }finally{__CLR4_1_101lwk1lwkluszwddu.R.flushNeeded();}}
    
    public static final String toJSONString(Object object, SerializerFeature... features) {try{__CLR4_1_101lwk1lwkluszwddu.R.inc(75047);
        __CLR4_1_101lwk1lwkluszwddu.R.inc(75048);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101lwk1lwkluszwddu.R.inc(75049);try {
            __CLR4_1_101lwk1lwkluszwddu.R.inc(75050);JSONSerializer serializer = new JSONSerializer(out);
            __CLR4_1_101lwk1lwkluszwddu.R.inc(75051);serializer.getPropertyFilters().add(new PropertyFilter() {
                
                public boolean apply(Object source, String name, Object value) {try{__CLR4_1_101lwk1lwkluszwddu.R.inc(75052);
                    __CLR4_1_101lwk1lwkluszwddu.R.inc(75053);if (((("id".equals(name))&&(__CLR4_1_101lwk1lwkluszwddu.R.iget(75054)!=0|true))||(__CLR4_1_101lwk1lwkluszwddu.R.iget(75055)==0&false))) {{
                        __CLR4_1_101lwk1lwkluszwddu.R.inc(75056);return false;
                    }
                    }__CLR4_1_101lwk1lwkluszwddu.R.inc(75057);return true;
                }finally{__CLR4_1_101lwk1lwkluszwddu.R.flushNeeded();}}
            });
            __CLR4_1_101lwk1lwkluszwddu.R.inc(75058);serializer.getNameFilters().add(new NameFilter() {

                public String process(Object source, String name, Object value) {try{__CLR4_1_101lwk1lwkluszwddu.R.inc(75059);
                    __CLR4_1_101lwk1lwkluszwddu.R.inc(75060);if (((("v".equals(name))&&(__CLR4_1_101lwk1lwkluszwddu.R.iget(75061)!=0|true))||(__CLR4_1_101lwk1lwkluszwddu.R.iget(75062)==0&false))) {{
                        __CLR4_1_101lwk1lwkluszwddu.R.inc(75063);return "value";
                    }
                    }__CLR4_1_101lwk1lwkluszwddu.R.inc(75064);return name;
                }finally{__CLR4_1_101lwk1lwkluszwddu.R.flushNeeded();}}
                
            });
            __CLR4_1_101lwk1lwkluszwddu.R.inc(75065);serializer.getValueFilters().add(new ValueFilter() {
                
                public Object process(Object source, String name, Object value) {try{__CLR4_1_101lwk1lwkluszwddu.R.inc(75066);
                    __CLR4_1_101lwk1lwkluszwddu.R.inc(75067);if (((("v".endsWith(name))&&(__CLR4_1_101lwk1lwkluszwddu.R.iget(75068)!=0|true))||(__CLR4_1_101lwk1lwkluszwddu.R.iget(75069)==0&false))) {{
                        __CLR4_1_101lwk1lwkluszwddu.R.inc(75070);return "xxx";
                    }
                    
                    }__CLR4_1_101lwk1lwkluszwddu.R.inc(75071);return value;
                }finally{__CLR4_1_101lwk1lwkluszwddu.R.flushNeeded();}}
            });
            __CLR4_1_101lwk1lwkluszwddu.R.inc(75072);for (com.alibaba.fastjson.serializer.SerializerFeature feature : features) {{
                __CLR4_1_101lwk1lwkluszwddu.R.inc(75073);serializer.config(feature, true);
            }

            }__CLR4_1_101lwk1lwkluszwddu.R.inc(75074);serializer.write(object);

            __CLR4_1_101lwk1lwkluszwddu.R.inc(75075);return out.toString();
        } catch (StackOverflowError e) {
            __CLR4_1_101lwk1lwkluszwddu.R.inc(75076);throw new JSONException("maybe circular references", e);
        } finally {
            __CLR4_1_101lwk1lwkluszwddu.R.inc(75077);out.close();
        }
    }finally{__CLR4_1_101lwk1lwkluszwddu.R.flushNeeded();}}

    private static class Entity {

        private int id;
        @JSONField(name = "v", serialzeFeatures = { SerializerFeature.WriteMapNullValue })
        private String        value;

        public int getId() {try{__CLR4_1_101lwk1lwkluszwddu.R.inc(75078);
            __CLR4_1_101lwk1lwkluszwddu.R.inc(75079);return id;
        }finally{__CLR4_1_101lwk1lwkluszwddu.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101lwk1lwkluszwddu.R.inc(75080);
            __CLR4_1_101lwk1lwkluszwddu.R.inc(75081);this.id = id;
        }finally{__CLR4_1_101lwk1lwkluszwddu.R.flushNeeded();}}

        public String getValue() {try{__CLR4_1_101lwk1lwkluszwddu.R.inc(75082);
            __CLR4_1_101lwk1lwkluszwddu.R.inc(75083);return value;
        }finally{__CLR4_1_101lwk1lwkluszwddu.R.flushNeeded();}}

        public void setValue(String value) {try{__CLR4_1_101lwk1lwkluszwddu.R.inc(75084);
            __CLR4_1_101lwk1lwkluszwddu.R.inc(75085);this.value = value;
        }finally{__CLR4_1_101lwk1lwkluszwddu.R.flushNeeded();}}

    }
}
