/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvtVO.alipay;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.List;

public class PlatformDepartmentVO {public static class __CLR4_5_21zvo1zvolusyjw89{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,93244,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @JSONField(ordinal=1)
    private String id ;
    @JSONField(ordinal=2)
    private String label ;
    @JSONField(ordinal=3)
    private String value;
    @JSONField(ordinal=4)
    private String  parentId;
    @JSONField(ordinal=5)
    private String  parentLabel;
    @JSONField(ordinal=6)
    private String companyId;
    @JSONField(ordinal=7)
    private String departCode;
    @JSONField(ordinal=8)
    private String memo;
    @JSONField(ordinal=9)
    private String departOrgCode;
    @JSONField(ordinal=10)
    private String contact;
    @JSONField(ordinal=11)
    private String mobile;
    @JSONField(ordinal=12)
    private String departType;
    @JSONField(serialize=false)
    private String ipId;
    @JSONField(serialize=false)
    private String ipRoleId;
    @JSONField(serialize=false)
    private PlatformDepartmentVO parent;
    @JSONField(ordinal=6,name="ChildNodes")
    private List<PlatformDepartmentVO> childNodes =new ArrayList<PlatformDepartmentVO>();
    public String getId() {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93156);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93157);return id;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}
    public void setId(String id) {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93158);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93159);this.id = id;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}
    public String getLabel() {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93160);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93161);return label;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}
    public void setLabel(String label) {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93162);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93163);this.label = label;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}
    public String getValue() {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93164);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93165);return value;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}
    public void setValue(String value) {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93166);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93167);this.value = value;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}

    public String getParentId() {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93168);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93169);return parentId;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}
    public void setParentId(String parentId) {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93170);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93171);this.parentId = parentId;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}
    public String getCompanyId() {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93172);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93173);return companyId;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}
    public void setCompanyId(String companyId) {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93174);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93175);this.companyId = companyId;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}

    public String getDepartCode() {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93176);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93177);return departCode;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}
    public void setDepartCode(String departCode) {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93178);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93179);this.departCode = departCode;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}
    public String getMemo() {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93180);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93181);return memo;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}
    public void setMemo(String memo) {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93182);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93183);this.memo = memo;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}
    public PlatformDepartmentVO getParent() {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93184);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93185);return parent;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}
    public void setParent(PlatformDepartmentVO parent) {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93186);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93187);this.parent = parent;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}
    public List<PlatformDepartmentVO> getChildNodes() {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93188);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93189);return childNodes;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}
    public void setChildNodes(List<PlatformDepartmentVO> childNodes) {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93190);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93191);this.childNodes = childNodes;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}

    /**
     * Getter method for property <tt>departType</tt>.
     *
     * @return property value of departType
     */
    public String getDepartType() {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93192);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93193);return departType;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}

    /**
     * Setter method for property <tt>departType</tt>.
     *
     * @param departType  value to be assigned to property departType
     */
    public void setDepartType(String departType) {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93194);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93195);this.departType = departType;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}

    /**
     * Getter method for property <tt>parentLabel</tt>.
     *
     * @return property value of parentLabel
     */
    public String getParentLabel() {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93196);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93197);return parentLabel;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}

    /**
     * Setter method for property <tt>parentLabel</tt>.
     *
     * @param parentLabel  value to be assigned to property parentLabel
     */
    public void setParentLabel(String parentLabel) {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93198);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93199);this.parentLabel = parentLabel;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}

    /**
     * Getter method for property <tt>departOrgCode</tt>.
     *
     * @return property value of departOrgCode
     */
    public String getDepartOrgCode() {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93200);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93201);return departOrgCode;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}

    /**
     * Setter method for property <tt>departOrgCode</tt>.
     *
     * @param departOrgCode  value to be assigned to property departOrgCode
     */
    public void setDepartOrgCode(String departOrgCode) {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93202);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93203);this.departOrgCode = departOrgCode;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}

    /**
     * Getter method for property <tt>contact</tt>.
     *
     * @return property value of contact
     */
    public String getContact() {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93204);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93205);return contact;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}

    /**
     * Setter method for property <tt>contact</tt>.
     *
     * @param contact  value to be assigned to property contact
     */
    public void setContact(String contact) {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93206);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93207);this.contact = contact;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}

    /**
     * Getter method for property <tt>mobile</tt>.
     *
     * @return property value of mobile
     */
    public String getMobile() {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93208);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93209);return mobile;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}

    /**
     * Setter method for property <tt>mobile</tt>.
     *
     * @param mobile  value to be assigned to property mobile
     */
    public void setMobile(String mobile) {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93210);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93211);this.mobile = mobile;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}

    /**
     * Getter method for property <tt>ipRoleId</tt>.
     *
     * @return property value of ipRoleId
     */
    public String getIpRoleId() {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93212);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93213);return ipRoleId;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}

    /**
     * Setter method for property <tt>ipRoleId</tt>.
     *
     * @param ipRoleId  value to be assigned to property ipRoleId
     */
    public void setIpRoleId(String ipRoleId) {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93214);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93215);this.ipRoleId = ipRoleId;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}

    /**
     * Getter method for property <tt>ipId</tt>.
     *
     * @return property value of ipId
     */
    public String getIpId() {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93216);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93217);return ipId;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}

    /**
     * Setter method for property <tt>ipId</tt>.
     *
     * @param ipId  value to be assigned to property ipId
     */
    public void setIpId(String ipId) {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93218);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93219);this.ipId = ipId;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}

    public PlatformDepartmentVO() {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93220);

    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}
//    public PlatformDepartmentVO(String id, String label, String value, String parentId,
//                                String companyId) {
//        this.id = id;
//        this.label = label;
//        this.value = value;
//        this.parentId = parentId;
//        this.companyId = companyId;
//    }


    public boolean equals(Object obj) {try{__CLR4_5_21zvo1zvolusyjw89.R.inc(93221);
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93222);if ((((this == obj)&&(__CLR4_5_21zvo1zvolusyjw89.R.iget(93223)!=0|true))||(__CLR4_5_21zvo1zvolusyjw89.R.iget(93224)==0&false))) {{
            __CLR4_5_21zvo1zvolusyjw89.R.inc(93225);return true;
        }
        }__CLR4_5_21zvo1zvolusyjw89.R.inc(93226);if ((((obj == null)&&(__CLR4_5_21zvo1zvolusyjw89.R.iget(93227)!=0|true))||(__CLR4_5_21zvo1zvolusyjw89.R.iget(93228)==0&false))) {{
            __CLR4_5_21zvo1zvolusyjw89.R.inc(93229);return false;
        }
        }__CLR4_5_21zvo1zvolusyjw89.R.inc(93230);if ((((getClass() != obj.getClass())&&(__CLR4_5_21zvo1zvolusyjw89.R.iget(93231)!=0|true))||(__CLR4_5_21zvo1zvolusyjw89.R.iget(93232)==0&false))) {{
            __CLR4_5_21zvo1zvolusyjw89.R.inc(93233);return false;
        }
        }__CLR4_5_21zvo1zvolusyjw89.R.inc(93234);if((((null==this.getId())&&(__CLR4_5_21zvo1zvolusyjw89.R.iget(93235)!=0|true))||(__CLR4_5_21zvo1zvolusyjw89.R.iget(93236)==0&false))){{
            __CLR4_5_21zvo1zvolusyjw89.R.inc(93237);return false;
        }
        }__CLR4_5_21zvo1zvolusyjw89.R.inc(93238);final PlatformDepartmentVO other = (PlatformDepartmentVO) obj;
        __CLR4_5_21zvo1zvolusyjw89.R.inc(93239);if((((!this.getId().equals(other.getId()))&&(__CLR4_5_21zvo1zvolusyjw89.R.iget(93240)!=0|true))||(__CLR4_5_21zvo1zvolusyjw89.R.iget(93241)==0&false))) {{
            __CLR4_5_21zvo1zvolusyjw89.R.inc(93242);return false;
        }
        }__CLR4_5_21zvo1zvolusyjw89.R.inc(93243);return true;
    }finally{__CLR4_5_21zvo1zvolusyjw89.R.flushNeeded();}}

}