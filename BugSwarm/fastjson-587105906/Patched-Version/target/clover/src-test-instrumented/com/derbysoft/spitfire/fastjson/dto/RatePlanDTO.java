/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.derbysoft.spitfire.fastjson.dto;

import java.util.List;

public class RatePlanDTO extends AbstractDTO{public static class __CLR4_5_2289d289dlusyjxbc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,104053,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private String code;
    private String name;
    private FreeMealDTO freeMeal;
    private PaymentType paymentType;
    private List<ChargeItemDTO> taxes;
    private List<ChargeItemDTO> serviceCharges;
    private boolean needGuarantee;
    private CancelPolicyDTO cancelPolicy;
    private List<AvailGuaranteeDTO> availGuarantees;

    public String getCode() {try{__CLR4_5_2289d289dlusyjxbc.R.inc(104017);
        __CLR4_5_2289d289dlusyjxbc.R.inc(104018);return code;
    }finally{__CLR4_5_2289d289dlusyjxbc.R.flushNeeded();}}

    public void setCode(String code) {try{__CLR4_5_2289d289dlusyjxbc.R.inc(104019);
        __CLR4_5_2289d289dlusyjxbc.R.inc(104020);this.code = code;
    }finally{__CLR4_5_2289d289dlusyjxbc.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_2289d289dlusyjxbc.R.inc(104021);
        __CLR4_5_2289d289dlusyjxbc.R.inc(104022);return name;
    }finally{__CLR4_5_2289d289dlusyjxbc.R.flushNeeded();}}

    public void setName(String name) {try{__CLR4_5_2289d289dlusyjxbc.R.inc(104023);
        __CLR4_5_2289d289dlusyjxbc.R.inc(104024);this.name = name;
    }finally{__CLR4_5_2289d289dlusyjxbc.R.flushNeeded();}}

    public FreeMealDTO getFreeMeal() {try{__CLR4_5_2289d289dlusyjxbc.R.inc(104025);
        __CLR4_5_2289d289dlusyjxbc.R.inc(104026);return freeMeal;
    }finally{__CLR4_5_2289d289dlusyjxbc.R.flushNeeded();}}

    public void setFreeMeal(FreeMealDTO freeMeal) {try{__CLR4_5_2289d289dlusyjxbc.R.inc(104027);
        __CLR4_5_2289d289dlusyjxbc.R.inc(104028);this.freeMeal = freeMeal;
    }finally{__CLR4_5_2289d289dlusyjxbc.R.flushNeeded();}}

    public PaymentType getPaymentType() {try{__CLR4_5_2289d289dlusyjxbc.R.inc(104029);
        __CLR4_5_2289d289dlusyjxbc.R.inc(104030);return paymentType;
    }finally{__CLR4_5_2289d289dlusyjxbc.R.flushNeeded();}}

    public void setPaymentType(PaymentType paymentType) {try{__CLR4_5_2289d289dlusyjxbc.R.inc(104031);
        __CLR4_5_2289d289dlusyjxbc.R.inc(104032);this.paymentType = paymentType;
    }finally{__CLR4_5_2289d289dlusyjxbc.R.flushNeeded();}}

    public List<ChargeItemDTO> getTaxes() {try{__CLR4_5_2289d289dlusyjxbc.R.inc(104033);
        __CLR4_5_2289d289dlusyjxbc.R.inc(104034);return taxes;
    }finally{__CLR4_5_2289d289dlusyjxbc.R.flushNeeded();}}

    public void setTaxes(List<ChargeItemDTO> taxes) {try{__CLR4_5_2289d289dlusyjxbc.R.inc(104035);
        __CLR4_5_2289d289dlusyjxbc.R.inc(104036);this.taxes = taxes;
    }finally{__CLR4_5_2289d289dlusyjxbc.R.flushNeeded();}}

    public List<ChargeItemDTO> getServiceCharges() {try{__CLR4_5_2289d289dlusyjxbc.R.inc(104037);
        __CLR4_5_2289d289dlusyjxbc.R.inc(104038);return serviceCharges;
    }finally{__CLR4_5_2289d289dlusyjxbc.R.flushNeeded();}}

    public void setServiceCharges(List<ChargeItemDTO> serviceCharges) {try{__CLR4_5_2289d289dlusyjxbc.R.inc(104039);
        __CLR4_5_2289d289dlusyjxbc.R.inc(104040);this.serviceCharges = serviceCharges;
    }finally{__CLR4_5_2289d289dlusyjxbc.R.flushNeeded();}}

    public boolean isNeedGuarantee() {try{__CLR4_5_2289d289dlusyjxbc.R.inc(104041);
        __CLR4_5_2289d289dlusyjxbc.R.inc(104042);return needGuarantee;
    }finally{__CLR4_5_2289d289dlusyjxbc.R.flushNeeded();}}

    public void setNeedGuarantee(boolean needGuarantee) {try{__CLR4_5_2289d289dlusyjxbc.R.inc(104043);
        __CLR4_5_2289d289dlusyjxbc.R.inc(104044);this.needGuarantee = needGuarantee;
    }finally{__CLR4_5_2289d289dlusyjxbc.R.flushNeeded();}}

    public CancelPolicyDTO getCancelPolicy() {try{__CLR4_5_2289d289dlusyjxbc.R.inc(104045);
        __CLR4_5_2289d289dlusyjxbc.R.inc(104046);return cancelPolicy;
    }finally{__CLR4_5_2289d289dlusyjxbc.R.flushNeeded();}}

    public void setCancelPolicy(CancelPolicyDTO cancelPolicy) {try{__CLR4_5_2289d289dlusyjxbc.R.inc(104047);
        __CLR4_5_2289d289dlusyjxbc.R.inc(104048);this.cancelPolicy = cancelPolicy;
    }finally{__CLR4_5_2289d289dlusyjxbc.R.flushNeeded();}}

    public List<AvailGuaranteeDTO> getAvailGuarantees() {try{__CLR4_5_2289d289dlusyjxbc.R.inc(104049);
        __CLR4_5_2289d289dlusyjxbc.R.inc(104050);return availGuarantees;
    }finally{__CLR4_5_2289d289dlusyjxbc.R.flushNeeded();}}

    public void setAvailGuarantees(List<AvailGuaranteeDTO> availGuarantees) {try{__CLR4_5_2289d289dlusyjxbc.R.inc(104051);
        __CLR4_5_2289d289dlusyjxbc.R.inc(104052);this.availGuarantees = availGuarantees;
    }finally{__CLR4_5_2289d289dlusyjxbc.R.flushNeeded();}}
}
