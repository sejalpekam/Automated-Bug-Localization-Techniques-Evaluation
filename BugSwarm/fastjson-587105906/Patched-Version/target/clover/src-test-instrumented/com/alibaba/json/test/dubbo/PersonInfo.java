/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
 * Project: dubbo.test
 * 
 * File Created at 2010-11-17
 * $Id: PersonInfo.java 77622 2011-03-03 08:31:45Z ding.lid $
 * 
 * Copyright 2008 Alibaba.com Croporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.alibaba.json.test.dubbo;

import java.io.Serializable;
import java.util.List;

/**
 * TODO Comment of PersonInfoModel
 * 
 * @author tony.chenl
 */
public class PersonInfo implements Serializable {public static class __CLR4_5_224sy24sylusyjwxy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,99723,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final long serialVersionUID = 7443011149612231882L;

    List<Phone>               phones;

    Phone                     fax;

    FullAddress               fullAddress;

    String                    mobileNo;

    String                    name;

    boolean                   male;

    boolean                   female;

    String                    department;

    String                    jobTitle;

    String                    homepageUrl;

    public List<Phone> getPhones() {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99538);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99539);return phones;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

    public void setPhones(List<Phone> phones) {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99540);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99541);this.phones = phones;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

    public boolean isMale() {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99542);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99543);return male;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

    public void setMale(boolean male) {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99544);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99545);this.male = male;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

    public boolean isFemale() {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99546);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99547);return female;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

    public void setFemale(boolean female) {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99548);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99549);this.female = female;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

    public void setFax(Phone fax) {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99550);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99551);this.fax = fax;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

    public void setFullAddress(FullAddress fullAddress) {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99552);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99553);this.fullAddress = fullAddress;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

    public void setMobileNo(String mobileNo) {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99554);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99555);this.mobileNo = mobileNo;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

    public void setName(String name) {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99556);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99557);this.name = name;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

    public void setDepartment(String department) {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99558);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99559);this.department = department;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

    public void setJobTitle(String jobTitle) {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99560);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99561);this.jobTitle = jobTitle;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

    public void setHomepageUrl(String homepageUrl) {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99562);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99563);this.homepageUrl = homepageUrl;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

    public String getDepartment() {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99564);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99565);return department;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

    public Phone getFax() {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99566);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99567);return fax;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

    public FullAddress getFullAddress() {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99568);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99569);return fullAddress;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

    public String getHomepageUrl() {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99570);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99571);return homepageUrl;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

    public String getJobTitle() {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99572);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99573);return jobTitle;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

    public String getMobileNo() {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99574);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99575);return mobileNo;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99576);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99577);return name;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99578);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99579);final int prime = 31;
        __CLR4_5_224sy24sylusyjwxy.R.inc(99580);int result = 1;
        __CLR4_5_224sy24sylusyjwxy.R.inc(99581);result = prime * result + (((((department == null) )&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99582)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99583)==0&false))? 0 : department.hashCode());
        __CLR4_5_224sy24sylusyjwxy.R.inc(99584);result = prime * result + (((((fax == null) )&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99585)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99586)==0&false))? 0 : fax.hashCode());
        __CLR4_5_224sy24sylusyjwxy.R.inc(99587);result = prime * result + ((((female )&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99588)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99589)==0&false))? 1231 : 1237);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99590);result = prime * result + (((((fullAddress == null) )&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99591)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99592)==0&false))? 0 : fullAddress.hashCode());
        __CLR4_5_224sy24sylusyjwxy.R.inc(99593);result = prime * result + (((((homepageUrl == null) )&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99594)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99595)==0&false))? 0 : homepageUrl.hashCode());
        __CLR4_5_224sy24sylusyjwxy.R.inc(99596);result = prime * result + (((((jobTitle == null) )&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99597)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99598)==0&false))? 0 : jobTitle.hashCode());
        __CLR4_5_224sy24sylusyjwxy.R.inc(99599);result = prime * result + ((((male )&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99600)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99601)==0&false))? 1231 : 1237);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99602);result = prime * result + (((((mobileNo == null) )&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99603)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99604)==0&false))? 0 : mobileNo.hashCode());
        __CLR4_5_224sy24sylusyjwxy.R.inc(99605);result = prime * result + (((((name == null) )&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99606)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99607)==0&false))? 0 : name.hashCode());
        __CLR4_5_224sy24sylusyjwxy.R.inc(99608);result = prime * result + (((((phones == null) )&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99609)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99610)==0&false))? 0 : phones.hashCode());
        __CLR4_5_224sy24sylusyjwxy.R.inc(99611);return result;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_224sy24sylusyjwxy.R.inc(99612);
        __CLR4_5_224sy24sylusyjwxy.R.inc(99613);if ((((this == obj)&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99614)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99615)==0&false)))
            {__CLR4_5_224sy24sylusyjwxy.R.inc(99616);return true;
        }__CLR4_5_224sy24sylusyjwxy.R.inc(99617);if ((((obj == null)&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99618)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99619)==0&false)))
            {__CLR4_5_224sy24sylusyjwxy.R.inc(99620);return false;
        }__CLR4_5_224sy24sylusyjwxy.R.inc(99621);if ((((getClass() != obj.getClass())&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99622)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99623)==0&false)))
            {__CLR4_5_224sy24sylusyjwxy.R.inc(99624);return false;
        }__CLR4_5_224sy24sylusyjwxy.R.inc(99625);PersonInfo other = (PersonInfo) obj;
        __CLR4_5_224sy24sylusyjwxy.R.inc(99626);if ((((department == null)&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99627)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99628)==0&false))) {{
            __CLR4_5_224sy24sylusyjwxy.R.inc(99629);if ((((other.department != null)&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99630)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99631)==0&false)))
                {__CLR4_5_224sy24sylusyjwxy.R.inc(99632);return false;
        }} }else {__CLR4_5_224sy24sylusyjwxy.R.inc(99633);if ((((!department.equals(other.department))&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99634)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99635)==0&false)))
            {__CLR4_5_224sy24sylusyjwxy.R.inc(99636);return false;
        }}__CLR4_5_224sy24sylusyjwxy.R.inc(99637);if ((((fax == null)&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99638)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99639)==0&false))) {{
            __CLR4_5_224sy24sylusyjwxy.R.inc(99640);if ((((other.fax != null)&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99641)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99642)==0&false)))
                {__CLR4_5_224sy24sylusyjwxy.R.inc(99643);return false;
        }} }else {__CLR4_5_224sy24sylusyjwxy.R.inc(99644);if ((((!fax.equals(other.fax))&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99645)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99646)==0&false)))
            {__CLR4_5_224sy24sylusyjwxy.R.inc(99647);return false;
        }}__CLR4_5_224sy24sylusyjwxy.R.inc(99648);if ((((female != other.female)&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99649)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99650)==0&false)))
            {__CLR4_5_224sy24sylusyjwxy.R.inc(99651);return false;
        }__CLR4_5_224sy24sylusyjwxy.R.inc(99652);if ((((fullAddress == null)&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99653)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99654)==0&false))) {{
            __CLR4_5_224sy24sylusyjwxy.R.inc(99655);if ((((other.fullAddress != null)&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99656)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99657)==0&false)))
                {__CLR4_5_224sy24sylusyjwxy.R.inc(99658);return false;
        }} }else {__CLR4_5_224sy24sylusyjwxy.R.inc(99659);if ((((!fullAddress.equals(other.fullAddress))&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99660)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99661)==0&false)))
            {__CLR4_5_224sy24sylusyjwxy.R.inc(99662);return false;
        }}__CLR4_5_224sy24sylusyjwxy.R.inc(99663);if ((((homepageUrl == null)&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99664)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99665)==0&false))) {{
            __CLR4_5_224sy24sylusyjwxy.R.inc(99666);if ((((other.homepageUrl != null)&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99667)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99668)==0&false)))
                {__CLR4_5_224sy24sylusyjwxy.R.inc(99669);return false;
        }} }else {__CLR4_5_224sy24sylusyjwxy.R.inc(99670);if ((((!homepageUrl.equals(other.homepageUrl))&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99671)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99672)==0&false)))
            {__CLR4_5_224sy24sylusyjwxy.R.inc(99673);return false;
        }}__CLR4_5_224sy24sylusyjwxy.R.inc(99674);if ((((jobTitle == null)&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99675)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99676)==0&false))) {{
            __CLR4_5_224sy24sylusyjwxy.R.inc(99677);if ((((other.jobTitle != null)&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99678)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99679)==0&false)))
                {__CLR4_5_224sy24sylusyjwxy.R.inc(99680);return false;
        }} }else {__CLR4_5_224sy24sylusyjwxy.R.inc(99681);if ((((!jobTitle.equals(other.jobTitle))&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99682)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99683)==0&false)))
            {__CLR4_5_224sy24sylusyjwxy.R.inc(99684);return false;
        }}__CLR4_5_224sy24sylusyjwxy.R.inc(99685);if ((((male != other.male)&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99686)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99687)==0&false)))
            {__CLR4_5_224sy24sylusyjwxy.R.inc(99688);return false;
        }__CLR4_5_224sy24sylusyjwxy.R.inc(99689);if ((((mobileNo == null)&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99690)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99691)==0&false))) {{
            __CLR4_5_224sy24sylusyjwxy.R.inc(99692);if ((((other.mobileNo != null)&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99693)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99694)==0&false)))
                {__CLR4_5_224sy24sylusyjwxy.R.inc(99695);return false;
        }} }else {__CLR4_5_224sy24sylusyjwxy.R.inc(99696);if ((((!mobileNo.equals(other.mobileNo))&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99697)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99698)==0&false)))
            {__CLR4_5_224sy24sylusyjwxy.R.inc(99699);return false;
        }}__CLR4_5_224sy24sylusyjwxy.R.inc(99700);if ((((name == null)&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99701)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99702)==0&false))) {{
            __CLR4_5_224sy24sylusyjwxy.R.inc(99703);if ((((other.name != null)&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99704)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99705)==0&false)))
                {__CLR4_5_224sy24sylusyjwxy.R.inc(99706);return false;
        }} }else {__CLR4_5_224sy24sylusyjwxy.R.inc(99707);if ((((!name.equals(other.name))&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99708)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99709)==0&false)))
            {__CLR4_5_224sy24sylusyjwxy.R.inc(99710);return false;
        }}__CLR4_5_224sy24sylusyjwxy.R.inc(99711);if ((((phones == null)&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99712)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99713)==0&false))) {{
            __CLR4_5_224sy24sylusyjwxy.R.inc(99714);if ((((other.phones != null)&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99715)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99716)==0&false)))
                {__CLR4_5_224sy24sylusyjwxy.R.inc(99717);return false;
        }} }else {__CLR4_5_224sy24sylusyjwxy.R.inc(99718);if ((((!phones.equals(other.phones))&&(__CLR4_5_224sy24sylusyjwxy.R.iget(99719)!=0|true))||(__CLR4_5_224sy24sylusyjwxy.R.iget(99720)==0&false)))
            {__CLR4_5_224sy24sylusyjwxy.R.inc(99721);return false;
        }}__CLR4_5_224sy24sylusyjwxy.R.inc(99722);return true;
    }finally{__CLR4_5_224sy24sylusyjwxy.R.flushNeeded();}}

}
