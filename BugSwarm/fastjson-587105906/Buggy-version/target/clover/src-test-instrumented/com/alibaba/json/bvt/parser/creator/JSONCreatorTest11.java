/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.creator;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;

import java.util.List;

public class JSONCreatorTest11 extends TestCase {static class __CLR4_1_101l3i1l3iluszwd8f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,74042,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_yk() throws Exception {__CLR4_1_101l3i1l3iluszwd8f.R.globalSliceStart(getClass().getName(),73998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10he1fzw1l3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101l3i1l3iluszwd8f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101l3i1l3iluszwd8f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.creator.JSONCreatorTest11.test_for_yk",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),73998,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10he1fzw1l3i() throws Exception{try{__CLR4_1_101l3i1l3iluszwd8f.R.inc(73998);
        __CLR4_1_101l3i1l3iluszwd8f.R.inc(73999);String jsonString = "[{\"image\":\"https://gw.alicdn.com/tfs/TB1Dtk.ay6guuRjy1XdXXaAwpXa-204-154.png\","
            + "\"labelNot\":\"zh*179753,zh*179745,zh*179743,zh*178230,zh*180695\",\"link\":\"https://alimarket.m.taobao"
            + ".com/markets/alisports/3_1weeklist\",\"title\":\"\u70ed\u5356\u699c\u5355\",\"desc\":\"\u5927\u5bb6\u90fd\u5728\u4e70\"}]";

        __CLR4_1_101l3i1l3iluszwd8f.R.inc(74000);JSONArray array = JSON.parseArray(jsonString);
        __CLR4_1_101l3i1l3iluszwd8f.R.inc(74001);List<RecommendDTO> dtoList = array.toJavaList(RecommendDTO.class);
        __CLR4_1_101l3i1l3iluszwd8f.R.inc(74002);assertEquals("\u70ed\u5356\u699c\u5355", dtoList.get(0).title);

        __CLR4_1_101l3i1l3iluszwd8f.R.inc(74003);System.out.println(JSON.VERSION);
    }finally{__CLR4_1_101l3i1l3iluszwd8f.R.flushNeeded();}}

    public static class RecommendDTO {
        private String image;
        private String link;
        private String title;
        private String desc;
        private String labels;
        private String labelNot;


        @JSONCreator
        public RecommendDTO(@JSONField(name = "image") String image, @JSONField(name = "link") String link,
                            @JSONField(name = "title") String title, @JSONField(name = "desc") String desc,
                            @JSONField(name = "labels") String labels, @JSONField(name = "labelNot") String labelNot) {try{__CLR4_1_101l3i1l3iluszwd8f.R.inc(74004);
            __CLR4_1_101l3i1l3iluszwd8f.R.inc(74005);final String PREFIX = "//";
            __CLR4_1_101l3i1l3iluszwd8f.R.inc(74006);this.desc = desc;
            __CLR4_1_101l3i1l3iluszwd8f.R.inc(74007);this.title = title;
            __CLR4_1_101l3i1l3iluszwd8f.R.inc(74008);this.labelNot = labelNot;
            __CLR4_1_101l3i1l3iluszwd8f.R.inc(74009);this.labels = labels;
            __CLR4_1_101l3i1l3iluszwd8f.R.inc(74010);if ((((image.startsWith(PREFIX))&&(__CLR4_1_101l3i1l3iluszwd8f.R.iget(74011)!=0|true))||(__CLR4_1_101l3i1l3iluszwd8f.R.iget(74012)==0&false))) {{
                __CLR4_1_101l3i1l3iluszwd8f.R.inc(74013);this.image = image.substring(2);
            }
            }__CLR4_1_101l3i1l3iluszwd8f.R.inc(74014);if ((((link.startsWith(PREFIX))&&(__CLR4_1_101l3i1l3iluszwd8f.R.iget(74015)!=0|true))||(__CLR4_1_101l3i1l3iluszwd8f.R.iget(74016)==0&false))) {{
                __CLR4_1_101l3i1l3iluszwd8f.R.inc(74017);this.link = link.substring(2);
            }
        }}finally{__CLR4_1_101l3i1l3iluszwd8f.R.flushNeeded();}}

        public String getImage() {try{__CLR4_1_101l3i1l3iluszwd8f.R.inc(74018);
            __CLR4_1_101l3i1l3iluszwd8f.R.inc(74019);return image;
        }finally{__CLR4_1_101l3i1l3iluszwd8f.R.flushNeeded();}}

        public void setImage(String image) {try{__CLR4_1_101l3i1l3iluszwd8f.R.inc(74020);
            __CLR4_1_101l3i1l3iluszwd8f.R.inc(74021);this.image = image;
        }finally{__CLR4_1_101l3i1l3iluszwd8f.R.flushNeeded();}}

        public String getLink() {try{__CLR4_1_101l3i1l3iluszwd8f.R.inc(74022);
            __CLR4_1_101l3i1l3iluszwd8f.R.inc(74023);return link;
        }finally{__CLR4_1_101l3i1l3iluszwd8f.R.flushNeeded();}}

        public void setLink(String link) {try{__CLR4_1_101l3i1l3iluszwd8f.R.inc(74024);
            __CLR4_1_101l3i1l3iluszwd8f.R.inc(74025);this.link = link;
        }finally{__CLR4_1_101l3i1l3iluszwd8f.R.flushNeeded();}}

        public String getTitle() {try{__CLR4_1_101l3i1l3iluszwd8f.R.inc(74026);
            __CLR4_1_101l3i1l3iluszwd8f.R.inc(74027);return title;
        }finally{__CLR4_1_101l3i1l3iluszwd8f.R.flushNeeded();}}

        public void setTitle(String title) {try{__CLR4_1_101l3i1l3iluszwd8f.R.inc(74028);
            __CLR4_1_101l3i1l3iluszwd8f.R.inc(74029);this.title = title;
        }finally{__CLR4_1_101l3i1l3iluszwd8f.R.flushNeeded();}}

        public String getDesc() {try{__CLR4_1_101l3i1l3iluszwd8f.R.inc(74030);
            __CLR4_1_101l3i1l3iluszwd8f.R.inc(74031);return desc;
        }finally{__CLR4_1_101l3i1l3iluszwd8f.R.flushNeeded();}}

        public void setDesc(String desc) {try{__CLR4_1_101l3i1l3iluszwd8f.R.inc(74032);
            __CLR4_1_101l3i1l3iluszwd8f.R.inc(74033);this.desc = desc;
        }finally{__CLR4_1_101l3i1l3iluszwd8f.R.flushNeeded();}}

        public String getLabels() {try{__CLR4_1_101l3i1l3iluszwd8f.R.inc(74034);
            __CLR4_1_101l3i1l3iluszwd8f.R.inc(74035);return labels;
        }finally{__CLR4_1_101l3i1l3iluszwd8f.R.flushNeeded();}}

        public void setLabels(String labels) {try{__CLR4_1_101l3i1l3iluszwd8f.R.inc(74036);
            __CLR4_1_101l3i1l3iluszwd8f.R.inc(74037);this.labels = labels;
        }finally{__CLR4_1_101l3i1l3iluszwd8f.R.flushNeeded();}}

        public String getLabelNot() {try{__CLR4_1_101l3i1l3iluszwd8f.R.inc(74038);
            __CLR4_1_101l3i1l3iluszwd8f.R.inc(74039);return labelNot;
        }finally{__CLR4_1_101l3i1l3iluszwd8f.R.flushNeeded();}}

        public void setLabelNot(String labelNot) {try{__CLR4_1_101l3i1l3iluszwd8f.R.inc(74040);
            __CLR4_1_101l3i1l3iluszwd8f.R.inc(74041);this.labelNot = labelNot;
        }finally{__CLR4_1_101l3i1l3iluszwd8f.R.flushNeeded();}}
    }
}
