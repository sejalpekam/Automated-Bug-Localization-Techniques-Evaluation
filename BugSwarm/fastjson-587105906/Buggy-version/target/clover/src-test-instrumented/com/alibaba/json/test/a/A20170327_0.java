/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.a;

import java.lang.reflect.Type;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import junit.framework.TestCase;

import java.math.BigDecimal;

/**
 * Created by wenshao on 27/03/2017.
 */
public class A20170327_0 extends TestCase {static class __CLR4_1_1022zu22zuluszwi24{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,97227,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_1_1022zu22zuluszwi24.R.globalSliceStart(getClass().getName(),97194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp222zu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1022zu22zuluszwi24.R.rethrow($CLV_t2$);}finally{__CLR4_1_1022zu22zuluszwi24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.a.A20170327_0.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),97194,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp222zu() throws Exception{try{__CLR4_1_1022zu22zuluszwi24.R.inc(97194);
        __CLR4_1_1022zu22zuluszwi24.R.inc(97195);String s = "{\"itemCurrentAmount\":{\"amount\":12.50,\"cent\":1250,\"centFactor\":100,\"currency\":\"CNY\",\"currencyCode\":\"CNY\"},\"itemDiscountAmount\":{\"$ref\":\"$.itemCurrentAmount\"}}";
        //String s = "{\"itemDiscountAmount\":{\"$ref\":\"$.itemCurrentAmount\"},\"itemCurrentAmount\":{\"amount\":12.50,\"cent\":1250,\"centFactor\":100,\"currency\":\"CNY\",\"currencyCode\":\"CNY\"}}";

        __CLR4_1_1022zu22zuluszwi24.R.inc(97196);ParserConfig config = new ParserConfig();
        __CLR4_1_1022zu22zuluszwi24.R.inc(97197);config.putDeserializer(Money.class, new MoneyDeserialize());

        __CLR4_1_1022zu22zuluszwi24.R.inc(97198);Model model = JSON.parseObject(s, Model.class, config);
        __CLR4_1_1022zu22zuluszwi24.R.inc(97199);assertSame(model.itemCurrentAmount, model.itemDiscountAmount);
        //JSONObject jsonObject = (JSONObject) JSON.parse(s);
        //assertSame(jsonObject.get("itemCurrentAmount"), jsonObject.get("itemDiscountAmount"));
    }finally{__CLR4_1_1022zu22zuluszwi24.R.flushNeeded();}}

    public static class Model {
        public Money itemCurrentAmount;
        public Money itemDiscountAmount;
    }

    public static class Money {
        public BigDecimal amount;
        public long cent;
        public int centFactor;
        public String currency;
        public String currencyCode;
    }

    public static class MoneyDeserialize implements ObjectDeserializer {

        @SuppressWarnings("unchecked")
        public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_1022zu22zuluszwi24.R.inc(97200);
            __CLR4_1_1022zu22zuluszwi24.R.inc(97201);ParseContext cxt = parser.getContext();
            __CLR4_1_1022zu22zuluszwi24.R.inc(97202);Object object = parser.parse(fieldName);
            __CLR4_1_1022zu22zuluszwi24.R.inc(97203);if ((((object == null)&&(__CLR4_1_1022zu22zuluszwi24.R.iget(97204)!=0|true))||(__CLR4_1_1022zu22zuluszwi24.R.iget(97205)==0&false))) {{
                __CLR4_1_1022zu22zuluszwi24.R.inc(97206);return null;
            }
            }__CLR4_1_1022zu22zuluszwi24.R.inc(97207);String moneyCentStr = null;
            __CLR4_1_1022zu22zuluszwi24.R.inc(97208);if ((((object instanceof JSONObject)&&(__CLR4_1_1022zu22zuluszwi24.R.iget(97209)!=0|true))||(__CLR4_1_1022zu22zuluszwi24.R.iget(97210)==0&false))) {{//\u5386\u53f2\u6570\u636e\u517c\u5bb9
                __CLR4_1_1022zu22zuluszwi24.R.inc(97211);JSONObject jsonObject = (JSONObject) object;
                __CLR4_1_1022zu22zuluszwi24.R.inc(97212);moneyCentStr = jsonObject.getString("cent");
            } }else {__CLR4_1_1022zu22zuluszwi24.R.inc(97213);if ((((object instanceof String)&&(__CLR4_1_1022zu22zuluszwi24.R.iget(97214)!=0|true))||(__CLR4_1_1022zu22zuluszwi24.R.iget(97215)==0&false))) {{
                __CLR4_1_1022zu22zuluszwi24.R.inc(97216);moneyCentStr = (String) object;
            } }else {{
                __CLR4_1_1022zu22zuluszwi24.R.inc(97217);throw new RuntimeException("money\u5c5e\u6027\u53cd\u5e8f\u5217\u5316\u5931\u8d25\uff0c\u4e0d\u652f\u6301\u7684\u7c7b\u578b\uff1a" + object.getClass().getName());
            }
            }}__CLR4_1_1022zu22zuluszwi24.R.inc(97218);if ((((moneyCentStr.length() != 0)&&(__CLR4_1_1022zu22zuluszwi24.R.iget(97219)!=0|true))||(__CLR4_1_1022zu22zuluszwi24.R.iget(97220)==0&false))) {{
                __CLR4_1_1022zu22zuluszwi24.R.inc(97221);Money m = new Money();
                __CLR4_1_1022zu22zuluszwi24.R.inc(97222);m.cent = Long.valueOf(moneyCentStr);
                __CLR4_1_1022zu22zuluszwi24.R.inc(97223);return (T) m;
            }
            }__CLR4_1_1022zu22zuluszwi24.R.inc(97224);return null;
        }finally{__CLR4_1_1022zu22zuluszwi24.R.flushNeeded();}}

        public int getFastMatchToken() {try{__CLR4_1_1022zu22zuluszwi24.R.inc(97225);
            __CLR4_1_1022zu22zuluszwi24.R.inc(97226);return 0;
        }finally{__CLR4_1_1022zu22zuluszwi24.R.flushNeeded();}}
    }
}
