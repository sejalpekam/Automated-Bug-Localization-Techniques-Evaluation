/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class IntegerFieldDeserializerTest2 extends TestCase {static class __CLR4_1_101m1u1m1uluszwdf6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,75265,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	
	protected void setUp() throws Exception {try{__CLR4_1_101m1u1m1uluszwdf6.R.inc(75234);
//		ParserConfig.getGlobalInstance().setAsmEnable(false);
	}finally{__CLR4_1_101m1u1m1uluszwdf6.R.flushNeeded();}}
	
	public void test_integer() throws Exception {__CLR4_1_101m1u1m1uluszwdf6.R.globalSliceStart(getClass().getName(),75235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10z8vhhk1m1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101m1u1m1uluszwdf6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101m1u1m1uluszwdf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.IntegerFieldDeserializerTest2.test_integer",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75235,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10z8vhhk1m1v() throws Exception{try{__CLR4_1_101m1u1m1uluszwdf6.R.inc(75235);
		__CLR4_1_101m1u1m1uluszwdf6.R.inc(75236);String text = "{\"value\":{\"column1\":\"aa\"}}";
		__CLR4_1_101m1u1m1uluszwdf6.R.inc(75237);Map<String, Entity> map = JSON.parseObject(text, new TypeReference<Map<String, Entity>>(){});
		__CLR4_1_101m1u1m1uluszwdf6.R.inc(75238);Assert.assertNotNull(map);
		__CLR4_1_101m1u1m1uluszwdf6.R.inc(75239);Assert.assertNotNull(map.get("value"));
		__CLR4_1_101m1u1m1uluszwdf6.R.inc(75240);Assert.assertNotNull("aa", map.get("value").getColumn1());
	}finally{__CLR4_1_101m1u1m1uluszwdf6.R.flushNeeded();}}
	
	public void test_integer_2() throws Exception {__CLR4_1_101m1u1m1uluszwdf6.R.globalSliceStart(getClass().getName(),75241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ha0lor1m21();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101m1u1m1uluszwdf6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101m1u1m1uluszwdf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.IntegerFieldDeserializerTest2.test_integer_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75241,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ha0lor1m21() throws Exception{try{__CLR4_1_101m1u1m1uluszwdf6.R.inc(75241);
		__CLR4_1_101m1u1m1uluszwdf6.R.inc(75242);String text = "[{\"value\":{\"column1\":\"aa\"}}]";
		__CLR4_1_101m1u1m1uluszwdf6.R.inc(75243);List<Map<String, Entity>> mapList = JSON.parseObject(text, new TypeReference<List<Map<String, Entity>>>(){});
		__CLR4_1_101m1u1m1uluszwdf6.R.inc(75244);Map<String, Entity> map = mapList.get(0);
		__CLR4_1_101m1u1m1uluszwdf6.R.inc(75245);Assert.assertNotNull(map);
		__CLR4_1_101m1u1m1uluszwdf6.R.inc(75246);Assert.assertNotNull(map.get("value"));
		__CLR4_1_101m1u1m1uluszwdf6.R.inc(75247);Assert.assertNotNull("aa", map.get("value").getColumn1());
	}finally{__CLR4_1_101m1u1m1uluszwdf6.R.flushNeeded();}}
	
	public void test_integer_3() throws Exception {__CLR4_1_101m1u1m1uluszwdf6.R.globalSliceStart(getClass().getName(),75248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kj0kh81m28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101m1u1m1uluszwdf6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101m1u1m1uluszwdf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.IntegerFieldDeserializerTest2.test_integer_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75248,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kj0kh81m28() throws Exception{try{__CLR4_1_101m1u1m1uluszwdf6.R.inc(75248);
		__CLR4_1_101m1u1m1uluszwdf6.R.inc(75249);String text = "{\"value\":{\"valueA\":{\"column1\":\"aa\"}, \"valueB\":{\"column1\":\"bb\"}}}";
		__CLR4_1_101m1u1m1uluszwdf6.R.inc(75250);Map<String, Map<String, Entity>> mapmap = JSON.parseObject(text, new TypeReference<Map<String, Map<String, Entity>>>(){});
		__CLR4_1_101m1u1m1uluszwdf6.R.inc(75251);Map<String, Entity> map = mapmap.get("value");
		__CLR4_1_101m1u1m1uluszwdf6.R.inc(75252);Assert.assertNotNull(map);
		__CLR4_1_101m1u1m1uluszwdf6.R.inc(75253);Assert.assertNotNull(map.get("valueA"));
		__CLR4_1_101m1u1m1uluszwdf6.R.inc(75254);Assert.assertNotNull("aa", map.get("valueA").getColumn1());
		__CLR4_1_101m1u1m1uluszwdf6.R.inc(75255);Assert.assertNotNull(map.get("valueB"));
		__CLR4_1_101m1u1m1uluszwdf6.R.inc(75256);Assert.assertNotNull("bb", map.get("valueB").getColumn1());
	}finally{__CLR4_1_101m1u1m1uluszwdf6.R.flushNeeded();}}

	public static class Entity implements Serializable {
		private static final long serialVersionUID = 1L;
		private String column1;
		private Integer column3;

		public String getColumn1() {try{__CLR4_1_101m1u1m1uluszwdf6.R.inc(75257);
			__CLR4_1_101m1u1m1uluszwdf6.R.inc(75258);return column1;
		}finally{__CLR4_1_101m1u1m1uluszwdf6.R.flushNeeded();}}

		public void setColumn1(String column1) {try{__CLR4_1_101m1u1m1uluszwdf6.R.inc(75259);
			__CLR4_1_101m1u1m1uluszwdf6.R.inc(75260);this.column1 = column1;
		}finally{__CLR4_1_101m1u1m1uluszwdf6.R.flushNeeded();}}

		public Integer getColumn3() {try{__CLR4_1_101m1u1m1uluszwdf6.R.inc(75261);
			__CLR4_1_101m1u1m1uluszwdf6.R.inc(75262);return column3;
		}finally{__CLR4_1_101m1u1m1uluszwdf6.R.flushNeeded();}}

		public void setColumn3(Integer column3) {try{__CLR4_1_101m1u1m1uluszwdf6.R.inc(75263);
			__CLR4_1_101m1u1m1uluszwdf6.R.inc(75264);this.column3 = column3;
		}finally{__CLR4_1_101m1u1m1uluszwdf6.R.flushNeeded();}}
	}
	
	public static class Value {
		
	}
}
