/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1600;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;

public class Issue_for_gaorui extends TestCase {static class __CLR4_5_21c4m1c4mlusyjsz5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,62413,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_21c4m1c4mlusyjsz5.R.globalSliceStart(getClass().getName(),62374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1c4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21c4m1c4mlusyjsz5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21c4m1c4mlusyjsz5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1600.Issue_for_gaorui.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),62374,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1c4m() throws Exception{try{__CLR4_5_21c4m1c4mlusyjsz5.R.inc(62374);
        __CLR4_5_21c4m1c4mlusyjsz5.R.inc(62375);String json = "{\"@type\":\"java.util.HashMap\",\"COUPON\":[{\"@type\":\"com.alibaba.json.bvt.issue_1600.Issue_for_gaorui.PromotionTermDetail\",\"activityId\":\"1584034\",\"choose\":true,\"couponId\":1251068987,\"couponType\":\"limitp\",\"match\":true,\"realPrice\":{\"amount\":0.6,\"currency\":\"USD\"}}],\"grayTrade\":\"true\"}";

        __CLR4_5_21c4m1c4mlusyjsz5.R.inc(62376);JSON.parseObject(json, Object.class, Feature.SupportAutoType);
    }finally{__CLR4_5_21c4m1c4mlusyjsz5.R.flushNeeded();}}

    public static class PromotionTermDetail {
        /**
         * \u5361\u5238Id
         */
        private Long couponId;
        /**
         * \u8425\u9500Id
         */
        private String promotionId;
        /**
         * \u5b9e\u9645\u5355\u4ef7
         */
        private Money realPrice;
        /**
         * \u6d3b\u52a8Id
         */
        private String activityId;

        /**
         * \u5361\u5238\u7c7b\u578b
         */
        private String couponType;

        /**
         * \u662f\u5426\u80fd\u591f\u83b7\u53d6\u5230\u8be5\u4f18\u60e0
         */
        private boolean isMatch = false;
        /**
         * \u662f\u5426\u9009\u62e9\u4e86\u8be5\u4f18\u60e0
         */
        private boolean isChoose = false;
        /**
         * \u672a\u83b7\u53d6\u5230\u4f18\u60e0\u7684\u539f\u56e0
         */
        private String reasonForLose;
        /**
         * \u672a\u83b7\u53d6\u4f18\u60e0\u7684\u6807\u8bc6\u7801
         */
        private String codeForLose;

        public Long getCouponId() {try{__CLR4_5_21c4m1c4mlusyjsz5.R.inc(62377);
            __CLR4_5_21c4m1c4mlusyjsz5.R.inc(62378);return couponId;
        }finally{__CLR4_5_21c4m1c4mlusyjsz5.R.flushNeeded();}}

        public void setCouponId(Long couponId) {try{__CLR4_5_21c4m1c4mlusyjsz5.R.inc(62379);
            __CLR4_5_21c4m1c4mlusyjsz5.R.inc(62380);this.couponId = couponId;
        }finally{__CLR4_5_21c4m1c4mlusyjsz5.R.flushNeeded();}}

        public String getPromotionId() {try{__CLR4_5_21c4m1c4mlusyjsz5.R.inc(62381);
            __CLR4_5_21c4m1c4mlusyjsz5.R.inc(62382);return promotionId;
        }finally{__CLR4_5_21c4m1c4mlusyjsz5.R.flushNeeded();}}

        public void setPromotionId(String promotionId) {try{__CLR4_5_21c4m1c4mlusyjsz5.R.inc(62383);
            __CLR4_5_21c4m1c4mlusyjsz5.R.inc(62384);this.promotionId = promotionId;
        }finally{__CLR4_5_21c4m1c4mlusyjsz5.R.flushNeeded();}}

        public Money getRealPrice() {try{__CLR4_5_21c4m1c4mlusyjsz5.R.inc(62385);
            __CLR4_5_21c4m1c4mlusyjsz5.R.inc(62386);return realPrice;
        }finally{__CLR4_5_21c4m1c4mlusyjsz5.R.flushNeeded();}}

        public void setRealPrice(Money realPrice) {try{__CLR4_5_21c4m1c4mlusyjsz5.R.inc(62387);
            __CLR4_5_21c4m1c4mlusyjsz5.R.inc(62388);this.realPrice = realPrice;
        }finally{__CLR4_5_21c4m1c4mlusyjsz5.R.flushNeeded();}}

        public String getActivityId() {try{__CLR4_5_21c4m1c4mlusyjsz5.R.inc(62389);
            __CLR4_5_21c4m1c4mlusyjsz5.R.inc(62390);return activityId;
        }finally{__CLR4_5_21c4m1c4mlusyjsz5.R.flushNeeded();}}

        public void setActivityId(String activityId) {try{__CLR4_5_21c4m1c4mlusyjsz5.R.inc(62391);
            __CLR4_5_21c4m1c4mlusyjsz5.R.inc(62392);this.activityId = activityId;
        }finally{__CLR4_5_21c4m1c4mlusyjsz5.R.flushNeeded();}}

        public String getCouponType() {try{__CLR4_5_21c4m1c4mlusyjsz5.R.inc(62393);
            __CLR4_5_21c4m1c4mlusyjsz5.R.inc(62394);return couponType;
        }finally{__CLR4_5_21c4m1c4mlusyjsz5.R.flushNeeded();}}

        public void setCouponType(String couponType) {try{__CLR4_5_21c4m1c4mlusyjsz5.R.inc(62395);
            __CLR4_5_21c4m1c4mlusyjsz5.R.inc(62396);this.couponType = couponType;
        }finally{__CLR4_5_21c4m1c4mlusyjsz5.R.flushNeeded();}}

        public boolean isMatch() {try{__CLR4_5_21c4m1c4mlusyjsz5.R.inc(62397);
            __CLR4_5_21c4m1c4mlusyjsz5.R.inc(62398);return isMatch;
        }finally{__CLR4_5_21c4m1c4mlusyjsz5.R.flushNeeded();}}

        public void setMatch(boolean match) {try{__CLR4_5_21c4m1c4mlusyjsz5.R.inc(62399);
            __CLR4_5_21c4m1c4mlusyjsz5.R.inc(62400);isMatch = match;
        }finally{__CLR4_5_21c4m1c4mlusyjsz5.R.flushNeeded();}}

        public boolean isChoose() {try{__CLR4_5_21c4m1c4mlusyjsz5.R.inc(62401);
            __CLR4_5_21c4m1c4mlusyjsz5.R.inc(62402);return isChoose;
        }finally{__CLR4_5_21c4m1c4mlusyjsz5.R.flushNeeded();}}

        public void setChoose(boolean choose) {try{__CLR4_5_21c4m1c4mlusyjsz5.R.inc(62403);
            __CLR4_5_21c4m1c4mlusyjsz5.R.inc(62404);isChoose = choose;
        }finally{__CLR4_5_21c4m1c4mlusyjsz5.R.flushNeeded();}}

        public String getReasonForLose() {try{__CLR4_5_21c4m1c4mlusyjsz5.R.inc(62405);
            __CLR4_5_21c4m1c4mlusyjsz5.R.inc(62406);return reasonForLose;
        }finally{__CLR4_5_21c4m1c4mlusyjsz5.R.flushNeeded();}}

        public void setReasonForLose(String reasonForLose) {try{__CLR4_5_21c4m1c4mlusyjsz5.R.inc(62407);
            __CLR4_5_21c4m1c4mlusyjsz5.R.inc(62408);this.reasonForLose = reasonForLose;
        }finally{__CLR4_5_21c4m1c4mlusyjsz5.R.flushNeeded();}}

        public String getCodeForLose() {try{__CLR4_5_21c4m1c4mlusyjsz5.R.inc(62409);
            __CLR4_5_21c4m1c4mlusyjsz5.R.inc(62410);return codeForLose;
        }finally{__CLR4_5_21c4m1c4mlusyjsz5.R.flushNeeded();}}

        public void setCodeForLose(String codeForLose) {try{__CLR4_5_21c4m1c4mlusyjsz5.R.inc(62411);
            __CLR4_5_21c4m1c4mlusyjsz5.R.inc(62412);this.codeForLose = codeForLose;
        }finally{__CLR4_5_21c4m1c4mlusyjsz5.R.flushNeeded();}}
    }

    public static class Money {

    }
}
