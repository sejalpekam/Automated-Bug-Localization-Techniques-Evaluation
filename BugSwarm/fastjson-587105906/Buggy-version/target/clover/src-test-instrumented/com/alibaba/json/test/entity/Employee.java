/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {public static class __CLR4_1_10261n261nluszwiik{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,101180,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Long       id;
    private String     number;
    private String     name;
    private String     description;
    private Integer    age;
    private BigDecimal salary;
    private Date       birthdate;
    private boolean    badboy;

    public Employee(){try{__CLR4_1_10261n261nluszwiik.R.inc(101147);

    }finally{__CLR4_1_10261n261nluszwiik.R.flushNeeded();}}

    public boolean isBadboy() {try{__CLR4_1_10261n261nluszwiik.R.inc(101148);
        __CLR4_1_10261n261nluszwiik.R.inc(101149);return badboy;
    }finally{__CLR4_1_10261n261nluszwiik.R.flushNeeded();}}

    public void setBadboy(boolean badboy) {try{__CLR4_1_10261n261nluszwiik.R.inc(101150);
        __CLR4_1_10261n261nluszwiik.R.inc(101151);this.badboy = badboy;
    }finally{__CLR4_1_10261n261nluszwiik.R.flushNeeded();}}

    public Integer getAge() {try{__CLR4_1_10261n261nluszwiik.R.inc(101152);
        __CLR4_1_10261n261nluszwiik.R.inc(101153);return age;
    }finally{__CLR4_1_10261n261nluszwiik.R.flushNeeded();}}

    public void setAge(Integer age) {try{__CLR4_1_10261n261nluszwiik.R.inc(101154);
        __CLR4_1_10261n261nluszwiik.R.inc(101155);this.age = age;
    }finally{__CLR4_1_10261n261nluszwiik.R.flushNeeded();}}

    public Long getId() {try{__CLR4_1_10261n261nluszwiik.R.inc(101156);
        __CLR4_1_10261n261nluszwiik.R.inc(101157);return id;
    }finally{__CLR4_1_10261n261nluszwiik.R.flushNeeded();}}

    public void setId(Long id) {try{__CLR4_1_10261n261nluszwiik.R.inc(101158);
        __CLR4_1_10261n261nluszwiik.R.inc(101159);this.id = id;
    }finally{__CLR4_1_10261n261nluszwiik.R.flushNeeded();}}

    public String getNumber() {try{__CLR4_1_10261n261nluszwiik.R.inc(101160);
        __CLR4_1_10261n261nluszwiik.R.inc(101161);return number;
    }finally{__CLR4_1_10261n261nluszwiik.R.flushNeeded();}}

    public void setNumber(String number) {try{__CLR4_1_10261n261nluszwiik.R.inc(101162);
        __CLR4_1_10261n261nluszwiik.R.inc(101163);this.number = number;
    }finally{__CLR4_1_10261n261nluszwiik.R.flushNeeded();}}

    public String getName() {try{__CLR4_1_10261n261nluszwiik.R.inc(101164);
        __CLR4_1_10261n261nluszwiik.R.inc(101165);return name;
    }finally{__CLR4_1_10261n261nluszwiik.R.flushNeeded();}}

    public void setName(String name) {try{__CLR4_1_10261n261nluszwiik.R.inc(101166);
        __CLR4_1_10261n261nluszwiik.R.inc(101167);this.name = name;
    }finally{__CLR4_1_10261n261nluszwiik.R.flushNeeded();}}

    public String getDescription() {try{__CLR4_1_10261n261nluszwiik.R.inc(101168);
        __CLR4_1_10261n261nluszwiik.R.inc(101169);return description;
    }finally{__CLR4_1_10261n261nluszwiik.R.flushNeeded();}}

    public void setDescription(String description) {try{__CLR4_1_10261n261nluszwiik.R.inc(101170);
        __CLR4_1_10261n261nluszwiik.R.inc(101171);this.description = description;
    }finally{__CLR4_1_10261n261nluszwiik.R.flushNeeded();}}

    public BigDecimal getSalary() {try{__CLR4_1_10261n261nluszwiik.R.inc(101172);
        __CLR4_1_10261n261nluszwiik.R.inc(101173);return salary;
    }finally{__CLR4_1_10261n261nluszwiik.R.flushNeeded();}}

    public void setSalary(BigDecimal salary) {try{__CLR4_1_10261n261nluszwiik.R.inc(101174);
        __CLR4_1_10261n261nluszwiik.R.inc(101175);this.salary = salary;
    }finally{__CLR4_1_10261n261nluszwiik.R.flushNeeded();}}

    public Date getBirthdate() {try{__CLR4_1_10261n261nluszwiik.R.inc(101176);
        __CLR4_1_10261n261nluszwiik.R.inc(101177);return birthdate;
    }finally{__CLR4_1_10261n261nluszwiik.R.flushNeeded();}}

    public void setBirthdate(Date birthdate) {try{__CLR4_1_10261n261nluszwiik.R.inc(101178);
        __CLR4_1_10261n261nluszwiik.R.inc(101179);this.birthdate = birthdate;
    }finally{__CLR4_1_10261n261nluszwiik.R.flushNeeded();}}

}
