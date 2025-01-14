/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class Bug14 extends TestCase {static class __CLR4_1_1013mg13mgluszw7br{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,51383,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_1013mg13mgluszw7br.R.globalSliceStart(getClass().getName(),51352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp213mg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013mg13mgluszw7br.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013mg13mgluszw7br.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug14.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51352,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp213mg() throws Exception{try{__CLR4_1_1013mg13mgluszw7br.R.inc(51352);
        __CLR4_1_1013mg13mgluszw7br.R.inc(51353);double f = -5.5000009;
        __CLR4_1_1013mg13mgluszw7br.R.inc(51354);Long i = 4294967295l;
        __CLR4_1_1013mg13mgluszw7br.R.inc(51355);System.out.println(BigInteger.valueOf(i));
        __CLR4_1_1013mg13mgluszw7br.R.inc(51356);System.out.println(Math.round(f));
        __CLR4_1_1013mg13mgluszw7br.R.inc(51357);List<AB> list = new ArrayList<AB>();
        __CLR4_1_1013mg13mgluszw7br.R.inc(51358);list.add(new AB("2a", "3b"));
        __CLR4_1_1013mg13mgluszw7br.R.inc(51359);list.add(new AB("4a", "6b"));
        __CLR4_1_1013mg13mgluszw7br.R.inc(51360);list.add(new AB("6a", "7{sdf<>jgh\n}b"));
        __CLR4_1_1013mg13mgluszw7br.R.inc(51361);list.add(new AB("8a", "9b"));
        __CLR4_1_1013mg13mgluszw7br.R.inc(51362);list.add(new AB("10a", "11ba"));
        __CLR4_1_1013mg13mgluszw7br.R.inc(51363);list.add(new AB("12a", "13b"));
        __CLR4_1_1013mg13mgluszw7br.R.inc(51364);String[] abc = new String[] { "sf", "sdf", "dsffds", "sdfsdf{fds}" };
        __CLR4_1_1013mg13mgluszw7br.R.inc(51365);Map<String, AB> map = new LinkedHashMap();
        __CLR4_1_1013mg13mgluszw7br.R.inc(51366);int k = 0;
        __CLR4_1_1013mg13mgluszw7br.R.inc(51367);for (AB a : list) {{
            __CLR4_1_1013mg13mgluszw7br.R.inc(51368);map.put(String.valueOf(k++), a);
        }
        }__CLR4_1_1013mg13mgluszw7br.R.inc(51369);System.out.println(JSON.toJSON(list));
        __CLR4_1_1013mg13mgluszw7br.R.inc(51370);System.out.println(JSON.toJSON(abc));
        __CLR4_1_1013mg13mgluszw7br.R.inc(51371);System.out.println(JSON.toJSON(new AB("10a", "11ba")));
        __CLR4_1_1013mg13mgluszw7br.R.inc(51372);System.out.println(JSON.toJSON(map));

    }finally{__CLR4_1_1013mg13mgluszw7br.R.flushNeeded();}}

    private static class AB {

        private String a;
        private String b;

        public AB(){
            super();__CLR4_1_1013mg13mgluszw7br.R.inc(51374);try{__CLR4_1_1013mg13mgluszw7br.R.inc(51373);
        }finally{__CLR4_1_1013mg13mgluszw7br.R.flushNeeded();}}

        public AB(String a, String b){
            super();__CLR4_1_1013mg13mgluszw7br.R.inc(51376);try{__CLR4_1_1013mg13mgluszw7br.R.inc(51375);
            __CLR4_1_1013mg13mgluszw7br.R.inc(51377);this.a = a;
            __CLR4_1_1013mg13mgluszw7br.R.inc(51378);this.b = b;
        }finally{__CLR4_1_1013mg13mgluszw7br.R.flushNeeded();}}

        public String getA() {try{__CLR4_1_1013mg13mgluszw7br.R.inc(51379);
            __CLR4_1_1013mg13mgluszw7br.R.inc(51380);return a;
        }finally{__CLR4_1_1013mg13mgluszw7br.R.flushNeeded();}}

        public String getB() {try{__CLR4_1_1013mg13mgluszw7br.R.inc(51381);
            __CLR4_1_1013mg13mgluszw7br.R.inc(51382);return b;
        }finally{__CLR4_1_1013mg13mgluszw7br.R.flushNeeded();}}

    }
}
