/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1400;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.JSONSerializable;
import com.alibaba.fastjson.serializer.JSONSerializer;
import junit.framework.TestCase;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;

public class Issue1449 extends TestCase {static class __CLR4_5_21agg1agglusyjsub{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,60256,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_21agg1agglusyjsub.R.globalSliceStart(getClass().getName(),60208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1agg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21agg1agglusyjsub.R.rethrow($CLV_t2$);}finally{__CLR4_5_21agg1agglusyjsub.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1400.Issue1449.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),60208,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1agg() throws Exception{try{__CLR4_5_21agg1agglusyjsub.R.inc(60208);
        __CLR4_5_21agg1agglusyjsub.R.inc(60209);Student student = new Student();
        __CLR4_5_21agg1agglusyjsub.R.inc(60210);student.name = "name";
        __CLR4_5_21agg1agglusyjsub.R.inc(60211);student.id = 1L;
        __CLR4_5_21agg1agglusyjsub.R.inc(60212);student.sex = Sex.MAN;
        __CLR4_5_21agg1agglusyjsub.R.inc(60213);System.out.println(JSON.toJSON(student).toString());
        __CLR4_5_21agg1agglusyjsub.R.inc(60214);System.out.println(JSON.toJSONString(student));
        __CLR4_5_21agg1agglusyjsub.R.inc(60215);String str1 = "{\"id\":1,\"name\":\"name\",\"sex\":\"MAN\"}";
        __CLR4_5_21agg1agglusyjsub.R.inc(60216);Student stu1 = JSON.parseObject(str1, Student.class);
        __CLR4_5_21agg1agglusyjsub.R.inc(60217);System.out.println(JSON.toJSONString(stu1));
        __CLR4_5_21agg1agglusyjsub.R.inc(60218);String str2 = "{\"id\":1,\"name\":\"name\",\"sex\":{\"code\":\"1\",\"des\":\"\u7537\"}}";
        __CLR4_5_21agg1agglusyjsub.R.inc(60219);JSON.parseObject(str2, Student.class);

    }finally{__CLR4_5_21agg1agglusyjsub.R.flushNeeded();}}

    @JSONType(deserializer = SexDeserializer.class)
    public static enum Sex implements JSONSerializable {

        NONE("0","NONE"),MAN("1","\u7537"),WOMAN("2","\u5973");
        private final String code;
        private final String des;
        private Sex(String code, String des) {try{__CLR4_5_21agg1agglusyjsub.R.inc(60220);
            __CLR4_5_21agg1agglusyjsub.R.inc(60221);this.code = code;
            __CLR4_5_21agg1agglusyjsub.R.inc(60222);this.des = des;
        }finally{__CLR4_5_21agg1agglusyjsub.R.flushNeeded();}}

        public String getCode() {try{__CLR4_5_21agg1agglusyjsub.R.inc(60223);
            __CLR4_5_21agg1agglusyjsub.R.inc(60224);return code;
        }finally{__CLR4_5_21agg1agglusyjsub.R.flushNeeded();}}

        public String getDes() {try{__CLR4_5_21agg1agglusyjsub.R.inc(60225);
            __CLR4_5_21agg1agglusyjsub.R.inc(60226);return des;
        }finally{__CLR4_5_21agg1agglusyjsub.R.flushNeeded();}}

        public void write(JSONSerializer serializer, Object fieldName, Type fieldType, int features) throws IOException {try{__CLR4_5_21agg1agglusyjsub.R.inc(60227);

            __CLR4_5_21agg1agglusyjsub.R.inc(60228);JSONObject object = new JSONObject();
            __CLR4_5_21agg1agglusyjsub.R.inc(60229);object.put("code", code);
            __CLR4_5_21agg1agglusyjsub.R.inc(60230);object.put("des", des);
            __CLR4_5_21agg1agglusyjsub.R.inc(60231);serializer.write(object);

        }finally{__CLR4_5_21agg1agglusyjsub.R.flushNeeded();}}
    }

    public static class SexDeserializer implements ObjectDeserializer {

        public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_21agg1agglusyjsub.R.inc(60232);
            __CLR4_5_21agg1agglusyjsub.R.inc(60233);String code;
            __CLR4_5_21agg1agglusyjsub.R.inc(60234);Object object = parser.parse();
            __CLR4_5_21agg1agglusyjsub.R.inc(60235);if ((((object instanceof JSONObject)&&(__CLR4_5_21agg1agglusyjsub.R.iget(60236)!=0|true))||(__CLR4_5_21agg1agglusyjsub.R.iget(60237)==0&false))) {{
                __CLR4_5_21agg1agglusyjsub.R.inc(60238);JSONObject jsonObject = (JSONObject) object;
                __CLR4_5_21agg1agglusyjsub.R.inc(60239);code = jsonObject.getString("code");
            } }else {{
                __CLR4_5_21agg1agglusyjsub.R.inc(60240);code = (String) object;
            }
            }__CLR4_5_21agg1agglusyjsub.R.inc(60241);if (((("0".equals(code))&&(__CLR4_5_21agg1agglusyjsub.R.iget(60242)!=0|true))||(__CLR4_5_21agg1agglusyjsub.R.iget(60243)==0&false))) {{
                __CLR4_5_21agg1agglusyjsub.R.inc(60244);return (T) Sex.NONE;
            } }else {__CLR4_5_21agg1agglusyjsub.R.inc(60245);if (((("1".equals(code))&&(__CLR4_5_21agg1agglusyjsub.R.iget(60246)!=0|true))||(__CLR4_5_21agg1agglusyjsub.R.iget(60247)==0&false))) {{
                __CLR4_5_21agg1agglusyjsub.R.inc(60248);return (T) Sex.MAN;
            } }else {__CLR4_5_21agg1agglusyjsub.R.inc(60249);if (((("2".equals(code))&&(__CLR4_5_21agg1agglusyjsub.R.iget(60250)!=0|true))||(__CLR4_5_21agg1agglusyjsub.R.iget(60251)==0&false))) {{
                __CLR4_5_21agg1agglusyjsub.R.inc(60252);return (T) Sex.WOMAN;
            }
            }}}__CLR4_5_21agg1agglusyjsub.R.inc(60253);return (T) Sex.NONE;
        }finally{__CLR4_5_21agg1agglusyjsub.R.flushNeeded();}}

        public int getFastMatchToken() {try{__CLR4_5_21agg1agglusyjsub.R.inc(60254);
            __CLR4_5_21agg1agglusyjsub.R.inc(60255);return 0;
        }finally{__CLR4_5_21agg1agglusyjsub.R.flushNeeded();}}
    }
    public static class Student implements Serializable {

        public Long id;

        public String name;

        public Sex sex;
    }
}
