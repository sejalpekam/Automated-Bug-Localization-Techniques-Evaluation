/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class Bug_for_jared1 extends TestCase {static class __CLR4_5_214u214u2lusyjrpj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,52947,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_jared1() throws Exception {__CLR4_5_214u214u2lusyjrpj.R.globalSliceStart(getClass().getName(),52922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_293x7y714u2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214u214u2lusyjrpj.R.rethrow($CLV_t2$);}finally{__CLR4_5_214u214u2lusyjrpj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_jared1.test_for_jared1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52922,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_293x7y714u2() throws Exception{try{__CLR4_5_214u214u2lusyjrpj.R.inc(52922);
        __CLR4_5_214u214u2lusyjrpj.R.inc(52923);User user = new User();

        __CLR4_5_214u214u2lusyjrpj.R.inc(52924);String text = JSON.toJSONString(user);
        
        __CLR4_5_214u214u2lusyjrpj.R.inc(52925);System.out.println(text);
        
        __CLR4_5_214u214u2lusyjrpj.R.inc(52926);JSON.parseObject(text, User.class);
    }finally{__CLR4_5_214u214u2lusyjrpj.R.flushNeeded();}}

    public static class User implements Serializable {

        /**
         * 
         */
        private static final long serialVersionUID = 1L;

        private Integer           id;

        private String            acount;

        private String            password;

        private Set<Crowd>        crowds           = new HashSet<Crowd>();

        private Set<User>         friends          = new HashSet<User>();

        public Integer getId() {try{__CLR4_5_214u214u2lusyjrpj.R.inc(52927);
            __CLR4_5_214u214u2lusyjrpj.R.inc(52928);return id;
        }finally{__CLR4_5_214u214u2lusyjrpj.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_5_214u214u2lusyjrpj.R.inc(52929);
            __CLR4_5_214u214u2lusyjrpj.R.inc(52930);this.id = id;
        }finally{__CLR4_5_214u214u2lusyjrpj.R.flushNeeded();}}

        public String getAcount() {try{__CLR4_5_214u214u2lusyjrpj.R.inc(52931);
            __CLR4_5_214u214u2lusyjrpj.R.inc(52932);return acount;
        }finally{__CLR4_5_214u214u2lusyjrpj.R.flushNeeded();}}

        public void setAcount(String acount) {try{__CLR4_5_214u214u2lusyjrpj.R.inc(52933);
            __CLR4_5_214u214u2lusyjrpj.R.inc(52934);this.acount = acount;
        }finally{__CLR4_5_214u214u2lusyjrpj.R.flushNeeded();}}

        public String getPassword() {try{__CLR4_5_214u214u2lusyjrpj.R.inc(52935);
            __CLR4_5_214u214u2lusyjrpj.R.inc(52936);return password;
        }finally{__CLR4_5_214u214u2lusyjrpj.R.flushNeeded();}}

        public void setPassword(String password) {try{__CLR4_5_214u214u2lusyjrpj.R.inc(52937);
            __CLR4_5_214u214u2lusyjrpj.R.inc(52938);this.password = password;
        }finally{__CLR4_5_214u214u2lusyjrpj.R.flushNeeded();}}

        public Set<Crowd> getCrowds() {try{__CLR4_5_214u214u2lusyjrpj.R.inc(52939);
            __CLR4_5_214u214u2lusyjrpj.R.inc(52940);return crowds;
        }finally{__CLR4_5_214u214u2lusyjrpj.R.flushNeeded();}}

        public void setCrowds(Set<Crowd> crowds) {try{__CLR4_5_214u214u2lusyjrpj.R.inc(52941);
            __CLR4_5_214u214u2lusyjrpj.R.inc(52942);this.crowds = crowds;
        }finally{__CLR4_5_214u214u2lusyjrpj.R.flushNeeded();}}

        public Set<User> getFriends() {try{__CLR4_5_214u214u2lusyjrpj.R.inc(52943);
            __CLR4_5_214u214u2lusyjrpj.R.inc(52944);return friends;
        }finally{__CLR4_5_214u214u2lusyjrpj.R.flushNeeded();}}

        public void setFriends(Set<User> friends) {try{__CLR4_5_214u214u2lusyjrpj.R.inc(52945);
            __CLR4_5_214u214u2lusyjrpj.R.inc(52946);this.friends = friends;
        }finally{__CLR4_5_214u214u2lusyjrpj.R.flushNeeded();}}

        // \u4e00\u4e0b\u7701\u7565

    }

    public static class Crowd {

    }
}
