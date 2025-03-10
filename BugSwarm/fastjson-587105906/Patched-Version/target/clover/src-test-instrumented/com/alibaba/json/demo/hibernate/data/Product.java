/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.demo.hibernate.data;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="Product"
    ,catalog="classicmodels"
)
public class Product  implements java.io.Serializable {public static class __CLR4_5_220m520m5lusyjwbz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,94171,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


     private String productCode;
     private String productName;
     private String productLine;
     private String productScale;
     private String productVendor;
     private String productDescription;
     private short quantityInStock;
     private double buyPrice;
     private double msrp;
     private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(0);

    public Product() {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94109);
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}

	
    public Product(String productCode, String productName, String productLine, String productScale, String productVendor, String productDescription, short quantityInStock, double buyPrice, double msrp) {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94110);
        __CLR4_5_220m520m5lusyjwbz.R.inc(94111);this.productCode = productCode;
        __CLR4_5_220m520m5lusyjwbz.R.inc(94112);this.productName = productName;
        __CLR4_5_220m520m5lusyjwbz.R.inc(94113);this.productLine = productLine;
        __CLR4_5_220m520m5lusyjwbz.R.inc(94114);this.productScale = productScale;
        __CLR4_5_220m520m5lusyjwbz.R.inc(94115);this.productVendor = productVendor;
        __CLR4_5_220m520m5lusyjwbz.R.inc(94116);this.productDescription = productDescription;
        __CLR4_5_220m520m5lusyjwbz.R.inc(94117);this.quantityInStock = quantityInStock;
        __CLR4_5_220m520m5lusyjwbz.R.inc(94118);this.buyPrice = buyPrice;
        __CLR4_5_220m520m5lusyjwbz.R.inc(94119);this.msrp = msrp;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}
    public Product(String productCode, String productName, String productLine, String productScale, String productVendor, String productDescription, short quantityInStock, double buyPrice, double msrp, Set<OrderDetail> orderDetails) {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94120);
       __CLR4_5_220m520m5lusyjwbz.R.inc(94121);this.productCode = productCode;
       __CLR4_5_220m520m5lusyjwbz.R.inc(94122);this.productName = productName;
       __CLR4_5_220m520m5lusyjwbz.R.inc(94123);this.productLine = productLine;
       __CLR4_5_220m520m5lusyjwbz.R.inc(94124);this.productScale = productScale;
       __CLR4_5_220m520m5lusyjwbz.R.inc(94125);this.productVendor = productVendor;
       __CLR4_5_220m520m5lusyjwbz.R.inc(94126);this.productDescription = productDescription;
       __CLR4_5_220m520m5lusyjwbz.R.inc(94127);this.quantityInStock = quantityInStock;
       __CLR4_5_220m520m5lusyjwbz.R.inc(94128);this.buyPrice = buyPrice;
       __CLR4_5_220m520m5lusyjwbz.R.inc(94129);this.msrp = msrp;
       __CLR4_5_220m520m5lusyjwbz.R.inc(94130);this.orderDetails = orderDetails;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}
   
     @Id 
    
    @Column(name="productCode", unique=true, nullable=false, length=50)
    public String getProductCode() {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94131);
        __CLR4_5_220m520m5lusyjwbz.R.inc(94132);return this.productCode;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}
    
    public void setProductCode(String productCode) {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94133);
        __CLR4_5_220m520m5lusyjwbz.R.inc(94134);this.productCode = productCode;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}
    
    @Column(name="productName", nullable=false, length=70)
    public String getProductName() {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94135);
        __CLR4_5_220m520m5lusyjwbz.R.inc(94136);return this.productName;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}
    
    public void setProductName(String productName) {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94137);
        __CLR4_5_220m520m5lusyjwbz.R.inc(94138);this.productName = productName;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}
    
    @Column(name="productLine", nullable=false, length=50)
    public String getProductLine() {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94139);
        __CLR4_5_220m520m5lusyjwbz.R.inc(94140);return this.productLine;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}
    
    public void setProductLine(String productLine) {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94141);
        __CLR4_5_220m520m5lusyjwbz.R.inc(94142);this.productLine = productLine;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}
    
    @Column(name="productScale", nullable=false, length=10)
    public String getProductScale() {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94143);
        __CLR4_5_220m520m5lusyjwbz.R.inc(94144);return this.productScale;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}
    
    public void setProductScale(String productScale) {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94145);
        __CLR4_5_220m520m5lusyjwbz.R.inc(94146);this.productScale = productScale;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}
    
    @Column(name="productVendor", nullable=false, length=50)
    public String getProductVendor() {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94147);
        __CLR4_5_220m520m5lusyjwbz.R.inc(94148);return this.productVendor;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}
    
    public void setProductVendor(String productVendor) {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94149);
        __CLR4_5_220m520m5lusyjwbz.R.inc(94150);this.productVendor = productVendor;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}
    
    @Column(name="productDescription", nullable=false, length=65535)
    public String getProductDescription() {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94151);
        __CLR4_5_220m520m5lusyjwbz.R.inc(94152);return this.productDescription;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}
    
    public void setProductDescription(String productDescription) {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94153);
        __CLR4_5_220m520m5lusyjwbz.R.inc(94154);this.productDescription = productDescription;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}
    
    @Column(name="quantityInStock", nullable=false)
    public short getQuantityInStock() {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94155);
        __CLR4_5_220m520m5lusyjwbz.R.inc(94156);return this.quantityInStock;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}
    
    public void setQuantityInStock(short quantityInStock) {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94157);
        __CLR4_5_220m520m5lusyjwbz.R.inc(94158);this.quantityInStock = quantityInStock;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}
    
    @Column(name="buyPrice", nullable=false, precision=22, scale=0)
    public double getBuyPrice() {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94159);
        __CLR4_5_220m520m5lusyjwbz.R.inc(94160);return this.buyPrice;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}
    
    public void setBuyPrice(double buyPrice) {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94161);
        __CLR4_5_220m520m5lusyjwbz.R.inc(94162);this.buyPrice = buyPrice;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}
    
    @Column(name="MSRP", nullable=false, precision=22, scale=0)
    public double getMsrp() {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94163);
        __CLR4_5_220m520m5lusyjwbz.R.inc(94164);return this.msrp;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}
    
    public void setMsrp(double msrp) {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94165);
        __CLR4_5_220m520m5lusyjwbz.R.inc(94166);this.msrp = msrp;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="product")
    public Set<OrderDetail> getOrderDetails() {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94167);
        __CLR4_5_220m520m5lusyjwbz.R.inc(94168);return this.orderDetails;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}
    
    public void setOrderDetails(Set<OrderDetail> orderDetails) {try{__CLR4_5_220m520m5lusyjwbz.R.inc(94169);
        __CLR4_5_220m520m5lusyjwbz.R.inc(94170);this.orderDetails = orderDetails;
    }finally{__CLR4_5_220m520m5lusyjwbz.R.flushNeeded();}}




}


