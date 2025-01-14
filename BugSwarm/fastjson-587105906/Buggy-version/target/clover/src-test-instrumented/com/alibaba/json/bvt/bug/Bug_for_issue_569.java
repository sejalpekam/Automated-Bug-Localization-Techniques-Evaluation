/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.json.bvt.bug.Bug_for_issue_569.LoginResponse.Body;
import com.alibaba.json.bvt.bug.Bug_for_issue_569.LoginResponse.MemberInfo;

import junit.framework.TestCase;

public class Bug_for_issue_569 extends TestCase {static class __CLR4_1_1015nx15nxluszw8nt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,54016,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_1_1015nx15nxluszw8nt.R.globalSliceStart(getClass().getName(),53997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb15nx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1015nx15nxluszw8nt.R.rethrow($CLV_t2$);}finally{__CLR4_1_1015nx15nxluszw8nt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_569.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),53997,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb15nx() throws Exception{try{__CLR4_1_1015nx15nxluszw8nt.R.inc(53997);
        __CLR4_1_1015nx15nxluszw8nt.R.inc(53998);LoginResponse loginResp = new LoginResponse();
        __CLR4_1_1015nx15nxluszw8nt.R.inc(53999);loginResp.response = new Response<LoginResponse.Body>();
        __CLR4_1_1015nx15nxluszw8nt.R.inc(54000);loginResp.response.content = new Body();
        __CLR4_1_1015nx15nxluszw8nt.R.inc(54001);loginResp.response.content.setMemberinfo(new MemberInfo());
        __CLR4_1_1015nx15nxluszw8nt.R.inc(54002);loginResp.response.content.getMemberinfo().name = "ding102992";
        __CLR4_1_1015nx15nxluszw8nt.R.inc(54003);loginResp.response.content.getMemberinfo().email = "ding102992@github.com";

        __CLR4_1_1015nx15nxluszw8nt.R.inc(54004);String text = JSON.toJSONString(loginResp);

        __CLR4_1_1015nx15nxluszw8nt.R.inc(54005);LoginResponse loginResp2 = JSON.parseObject(text, LoginResponse.class);
        
        __CLR4_1_1015nx15nxluszw8nt.R.inc(54006);Assert.assertEquals(loginResp.response //
                                     .getContent() //
                                     .getMemberinfo().name, //
                            loginResp2.response //
                                      .getContent() //
                                      .getMemberinfo().name);
        __CLR4_1_1015nx15nxluszw8nt.R.inc(54007);Assert.assertEquals(loginResp.response //
                                     .getContent().getMemberinfo().email, //
                            loginResp2.response.getContent().getMemberinfo().email);

    }finally{__CLR4_1_1015nx15nxluszw8nt.R.flushNeeded();}}

    public static class BaseResponse<T> {

        public Response<T> response;

    
    }
    
    public static class Response<T> {

        private T content;

        public T getContent() {try{__CLR4_1_1015nx15nxluszw8nt.R.inc(54008);
            __CLR4_1_1015nx15nxluszw8nt.R.inc(54009);return content;
        }finally{__CLR4_1_1015nx15nxluszw8nt.R.flushNeeded();}}

        public void setContent(T content) {try{__CLR4_1_1015nx15nxluszw8nt.R.inc(54010);
            __CLR4_1_1015nx15nxluszw8nt.R.inc(54011);this.content = content;
        }finally{__CLR4_1_1015nx15nxluszw8nt.R.flushNeeded();}}

    }

    public static class LoginResponse extends BaseResponse<LoginResponse.Body> {

        public static class Body {

            private MemberInfo memberinfo;

            public MemberInfo getMemberinfo() {try{__CLR4_1_1015nx15nxluszw8nt.R.inc(54012);
                __CLR4_1_1015nx15nxluszw8nt.R.inc(54013);return memberinfo;
            }finally{__CLR4_1_1015nx15nxluszw8nt.R.flushNeeded();}}

            public void setMemberinfo(MemberInfo memberinfo) {try{__CLR4_1_1015nx15nxluszw8nt.R.inc(54014);
                __CLR4_1_1015nx15nxluszw8nt.R.inc(54015);this.memberinfo = memberinfo;
            }finally{__CLR4_1_1015nx15nxluszw8nt.R.flushNeeded();}}
        }

        public static class MemberInfo {

            public String name;
            public String email;
            /*
             * \u7701\u7565Getter,Setter
             */
        }
    }
}
