/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.derbysoft.spitfire.fastjson.dto;

import com.alibaba.fastjson.annotation.JSONField;

public class UniqueIDDTO extends AbstractDTO{public static class __CLR4_5_228dq28dqlusyjxbm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,104190,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private String companyName;
    private String code;
    private UniqueIDType type;

    public UniqueIDDTO() {try{__CLR4_5_228dq28dqlusyjxbm.R.inc(104174);
    }finally{__CLR4_5_228dq28dqlusyjxbm.R.flushNeeded();}}

    public UniqueIDDTO(String code, UniqueIDType type) {try{__CLR4_5_228dq28dqlusyjxbm.R.inc(104175);
        __CLR4_5_228dq28dqlusyjxbm.R.inc(104176);this.code = code;
        __CLR4_5_228dq28dqlusyjxbm.R.inc(104177);this.type = type;
    }finally{__CLR4_5_228dq28dqlusyjxbm.R.flushNeeded();}}

    @JSONField(name="CName")
    public String getCompanyName() {try{__CLR4_5_228dq28dqlusyjxbm.R.inc(104178);
        __CLR4_5_228dq28dqlusyjxbm.R.inc(104179);return companyName;
    }finally{__CLR4_5_228dq28dqlusyjxbm.R.flushNeeded();}}

    @JSONField(name="CName")
    public void setCompanyName(String companyName) {try{__CLR4_5_228dq28dqlusyjxbm.R.inc(104180);
        __CLR4_5_228dq28dqlusyjxbm.R.inc(104181);this.companyName = companyName;
    }finally{__CLR4_5_228dq28dqlusyjxbm.R.flushNeeded();}}

    public String getCode() {try{__CLR4_5_228dq28dqlusyjxbm.R.inc(104182);
        __CLR4_5_228dq28dqlusyjxbm.R.inc(104183);return code;
    }finally{__CLR4_5_228dq28dqlusyjxbm.R.flushNeeded();}}

    public void setCode(String code) {try{__CLR4_5_228dq28dqlusyjxbm.R.inc(104184);
        __CLR4_5_228dq28dqlusyjxbm.R.inc(104185);this.code = code;
    }finally{__CLR4_5_228dq28dqlusyjxbm.R.flushNeeded();}}

    public UniqueIDType getType() {try{__CLR4_5_228dq28dqlusyjxbm.R.inc(104186);
        __CLR4_5_228dq28dqlusyjxbm.R.inc(104187);return type;
    }finally{__CLR4_5_228dq28dqlusyjxbm.R.flushNeeded();}}

    public void setType(UniqueIDType type) {try{__CLR4_5_228dq28dqlusyjxbm.R.inc(104188);
        __CLR4_5_228dq28dqlusyjxbm.R.inc(104189);this.type = type;
    }finally{__CLR4_5_228dq28dqlusyjxbm.R.flushNeeded();}}
}
