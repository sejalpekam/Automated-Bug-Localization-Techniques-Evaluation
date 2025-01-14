/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.demo.hibernate.data;


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
@Table(name="Office"
    ,catalog="classicmodels"
)
public class Office  implements java.io.Serializable {public static class __CLR4_1_1021e821e8luszwhec{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,95180,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


     private String officeCode;
     private String city;
     private String phone;
     private String addressLine1;
     private String addressLine2;
     private String state;
     private String country;
     private String postalCode;
     private String territory;
     private Set<Employee> employees = new HashSet<Employee>(0);

    public Office() {try{__CLR4_1_1021e821e8luszwhec.R.inc(95120);
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}

	
    public Office(String officeCode, String city, String phone, String addressLine1, String country, String postalCode, String territory) {try{__CLR4_1_1021e821e8luszwhec.R.inc(95121);
        __CLR4_1_1021e821e8luszwhec.R.inc(95122);this.officeCode = officeCode;
        __CLR4_1_1021e821e8luszwhec.R.inc(95123);this.city = city;
        __CLR4_1_1021e821e8luszwhec.R.inc(95124);this.phone = phone;
        __CLR4_1_1021e821e8luszwhec.R.inc(95125);this.addressLine1 = addressLine1;
        __CLR4_1_1021e821e8luszwhec.R.inc(95126);this.country = country;
        __CLR4_1_1021e821e8luszwhec.R.inc(95127);this.postalCode = postalCode;
        __CLR4_1_1021e821e8luszwhec.R.inc(95128);this.territory = territory;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}
    public Office(String officeCode, String city, String phone, String addressLine1, String addressLine2, String state, String country, String postalCode, String territory, Set<Employee> employees) {try{__CLR4_1_1021e821e8luszwhec.R.inc(95129);
       __CLR4_1_1021e821e8luszwhec.R.inc(95130);this.officeCode = officeCode;
       __CLR4_1_1021e821e8luszwhec.R.inc(95131);this.city = city;
       __CLR4_1_1021e821e8luszwhec.R.inc(95132);this.phone = phone;
       __CLR4_1_1021e821e8luszwhec.R.inc(95133);this.addressLine1 = addressLine1;
       __CLR4_1_1021e821e8luszwhec.R.inc(95134);this.addressLine2 = addressLine2;
       __CLR4_1_1021e821e8luszwhec.R.inc(95135);this.state = state;
       __CLR4_1_1021e821e8luszwhec.R.inc(95136);this.country = country;
       __CLR4_1_1021e821e8luszwhec.R.inc(95137);this.postalCode = postalCode;
       __CLR4_1_1021e821e8luszwhec.R.inc(95138);this.territory = territory;
       __CLR4_1_1021e821e8luszwhec.R.inc(95139);this.employees = employees;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}
   
     @Id 
    
    @Column(name="officeCode", unique=true, nullable=false, length=50)
    public String getOfficeCode() {try{__CLR4_1_1021e821e8luszwhec.R.inc(95140);
        __CLR4_1_1021e821e8luszwhec.R.inc(95141);return this.officeCode;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}
    
    public void setOfficeCode(String officeCode) {try{__CLR4_1_1021e821e8luszwhec.R.inc(95142);
        __CLR4_1_1021e821e8luszwhec.R.inc(95143);this.officeCode = officeCode;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}
    
    @Column(name="city", nullable=false, length=50)
    public String getCity() {try{__CLR4_1_1021e821e8luszwhec.R.inc(95144);
        __CLR4_1_1021e821e8luszwhec.R.inc(95145);return this.city;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}
    
    public void setCity(String city) {try{__CLR4_1_1021e821e8luszwhec.R.inc(95146);
        __CLR4_1_1021e821e8luszwhec.R.inc(95147);this.city = city;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}
    
    @Column(name="phone", nullable=false, length=50)
    public String getPhone() {try{__CLR4_1_1021e821e8luszwhec.R.inc(95148);
        __CLR4_1_1021e821e8luszwhec.R.inc(95149);return this.phone;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}
    
    public void setPhone(String phone) {try{__CLR4_1_1021e821e8luszwhec.R.inc(95150);
        __CLR4_1_1021e821e8luszwhec.R.inc(95151);this.phone = phone;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}
    
    @Column(name="addressLine1", nullable=false, length=50)
    public String getAddressLine1() {try{__CLR4_1_1021e821e8luszwhec.R.inc(95152);
        __CLR4_1_1021e821e8luszwhec.R.inc(95153);return this.addressLine1;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}
    
    public void setAddressLine1(String addressLine1) {try{__CLR4_1_1021e821e8luszwhec.R.inc(95154);
        __CLR4_1_1021e821e8luszwhec.R.inc(95155);this.addressLine1 = addressLine1;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}
    
    @Column(name="addressLine2", length=50)
    public String getAddressLine2() {try{__CLR4_1_1021e821e8luszwhec.R.inc(95156);
        __CLR4_1_1021e821e8luszwhec.R.inc(95157);return this.addressLine2;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}
    
    public void setAddressLine2(String addressLine2) {try{__CLR4_1_1021e821e8luszwhec.R.inc(95158);
        __CLR4_1_1021e821e8luszwhec.R.inc(95159);this.addressLine2 = addressLine2;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}
    
    @Column(name="state", length=50)
    public String getState() {try{__CLR4_1_1021e821e8luszwhec.R.inc(95160);
        __CLR4_1_1021e821e8luszwhec.R.inc(95161);return this.state;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}
    
    public void setState(String state) {try{__CLR4_1_1021e821e8luszwhec.R.inc(95162);
        __CLR4_1_1021e821e8luszwhec.R.inc(95163);this.state = state;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}
    
    @Column(name="country", nullable=false, length=50)
    public String getCountry() {try{__CLR4_1_1021e821e8luszwhec.R.inc(95164);
        __CLR4_1_1021e821e8luszwhec.R.inc(95165);return this.country;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}
    
    public void setCountry(String country) {try{__CLR4_1_1021e821e8luszwhec.R.inc(95166);
        __CLR4_1_1021e821e8luszwhec.R.inc(95167);this.country = country;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}
    
    @Column(name="postalCode", nullable=false, length=10)
    public String getPostalCode() {try{__CLR4_1_1021e821e8luszwhec.R.inc(95168);
        __CLR4_1_1021e821e8luszwhec.R.inc(95169);return this.postalCode;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}
    
    public void setPostalCode(String postalCode) {try{__CLR4_1_1021e821e8luszwhec.R.inc(95170);
        __CLR4_1_1021e821e8luszwhec.R.inc(95171);this.postalCode = postalCode;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}
    
    @Column(name="territory", nullable=false, length=10)
    public String getTerritory() {try{__CLR4_1_1021e821e8luszwhec.R.inc(95172);
        __CLR4_1_1021e821e8luszwhec.R.inc(95173);return this.territory;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}
    
    public void setTerritory(String territory) {try{__CLR4_1_1021e821e8luszwhec.R.inc(95174);
        __CLR4_1_1021e821e8luszwhec.R.inc(95175);this.territory = territory;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="office")
    public Set<Employee> getEmployees() {try{__CLR4_1_1021e821e8luszwhec.R.inc(95176);
        __CLR4_1_1021e821e8luszwhec.R.inc(95177);return this.employees;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}
    
    public void setEmployees(Set<Employee> employees) {try{__CLR4_1_1021e821e8luszwhec.R.inc(95178);
        __CLR4_1_1021e821e8luszwhec.R.inc(95179);this.employees = employees;
    }finally{__CLR4_1_1021e821e8luszwhec.R.flushNeeded();}}




}


