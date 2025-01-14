/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.demo.hibernate.data;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class OrderDetailId  implements java.io.Serializable {public static class __CLR4_5_220jj20jjlusyjwbp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,94051,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


     private Integer orderNumber;
     private String productCode;

    public OrderDetailId() {try{__CLR4_5_220jj20jjlusyjwbp.R.inc(94015);
    }finally{__CLR4_5_220jj20jjlusyjwbp.R.flushNeeded();}}

    public OrderDetailId(Integer orderNumber, String productCode) {try{__CLR4_5_220jj20jjlusyjwbp.R.inc(94016);
       __CLR4_5_220jj20jjlusyjwbp.R.inc(94017);this.orderNumber = orderNumber;
       __CLR4_5_220jj20jjlusyjwbp.R.inc(94018);this.productCode = productCode;
    }finally{__CLR4_5_220jj20jjlusyjwbp.R.flushNeeded();}}
   

    @Column(name="orderNumber", nullable=false)
    public Integer getOrderNumber() {try{__CLR4_5_220jj20jjlusyjwbp.R.inc(94019);
        __CLR4_5_220jj20jjlusyjwbp.R.inc(94020);return this.orderNumber;
    }finally{__CLR4_5_220jj20jjlusyjwbp.R.flushNeeded();}}
    
    public void setOrderNumber(Integer orderNumber) {try{__CLR4_5_220jj20jjlusyjwbp.R.inc(94021);
        __CLR4_5_220jj20jjlusyjwbp.R.inc(94022);this.orderNumber = orderNumber;
    }finally{__CLR4_5_220jj20jjlusyjwbp.R.flushNeeded();}}

    @Column(name="productCode", nullable=false, length=50)
    public String getProductCode() {try{__CLR4_5_220jj20jjlusyjwbp.R.inc(94023);
        __CLR4_5_220jj20jjlusyjwbp.R.inc(94024);return this.productCode;
    }finally{__CLR4_5_220jj20jjlusyjwbp.R.flushNeeded();}}
    
    public void setProductCode(String productCode) {try{__CLR4_5_220jj20jjlusyjwbp.R.inc(94025);
        __CLR4_5_220jj20jjlusyjwbp.R.inc(94026);this.productCode = productCode;
    }finally{__CLR4_5_220jj20jjlusyjwbp.R.flushNeeded();}}

    @Override
    public boolean equals(Object other) {try{__CLR4_5_220jj20jjlusyjwbp.R.inc(94027);
        __CLR4_5_220jj20jjlusyjwbp.R.inc(94028);if ( ((((this == other ) )&&(__CLR4_5_220jj20jjlusyjwbp.R.iget(94029)!=0|true))||(__CLR4_5_220jj20jjlusyjwbp.R.iget(94030)==0&false))) {__CLR4_5_220jj20jjlusyjwbp.R.inc(94031);return true;
        }__CLR4_5_220jj20jjlusyjwbp.R.inc(94032);if ( ((((other == null ) )&&(__CLR4_5_220jj20jjlusyjwbp.R.iget(94033)!=0|true))||(__CLR4_5_220jj20jjlusyjwbp.R.iget(94034)==0&false))) {__CLR4_5_220jj20jjlusyjwbp.R.inc(94035);return false;
        }__CLR4_5_220jj20jjlusyjwbp.R.inc(94036);if ( (((!(other instanceof OrderDetailId) )&&(__CLR4_5_220jj20jjlusyjwbp.R.iget(94037)!=0|true))||(__CLR4_5_220jj20jjlusyjwbp.R.iget(94038)==0&false))) {__CLR4_5_220jj20jjlusyjwbp.R.inc(94039);return false;
        }__CLR4_5_220jj20jjlusyjwbp.R.inc(94040);OrderDetailId castOther = ( OrderDetailId ) other; 

        __CLR4_5_220jj20jjlusyjwbp.R.inc(94041);return ( (this.getOrderNumber()==castOther.getOrderNumber()) || ( this.getOrderNumber()!=null && castOther.getOrderNumber()!=null && this.getOrderNumber().equals(castOther.getOrderNumber()) ) )
                && ( (this.getProductCode()==castOther.getProductCode()) || ( this.getProductCode()!=null && castOther.getProductCode()!=null && this.getProductCode().equals(castOther.getProductCode()) ) );
    }finally{__CLR4_5_220jj20jjlusyjwbp.R.flushNeeded();}}
   
    @Override
    public int hashCode() {try{__CLR4_5_220jj20jjlusyjwbp.R.inc(94042);
        __CLR4_5_220jj20jjlusyjwbp.R.inc(94043);int result = 17;

        __CLR4_5_220jj20jjlusyjwbp.R.inc(94044);result = 37 * result + ( (((getOrderNumber() == null )&&(__CLR4_5_220jj20jjlusyjwbp.R.iget(94045)!=0|true))||(__CLR4_5_220jj20jjlusyjwbp.R.iget(94046)==0&false))? 0 : this.getOrderNumber().hashCode() );
        __CLR4_5_220jj20jjlusyjwbp.R.inc(94047);result = 37 * result + ( (((getProductCode() == null )&&(__CLR4_5_220jj20jjlusyjwbp.R.iget(94048)!=0|true))||(__CLR4_5_220jj20jjlusyjwbp.R.iget(94049)==0&false))? 0 : this.getProductCode().hashCode() );
        __CLR4_5_220jj20jjlusyjwbp.R.inc(94050);return result;
    }finally{__CLR4_5_220jj20jjlusyjwbp.R.flushNeeded();}}   
}


