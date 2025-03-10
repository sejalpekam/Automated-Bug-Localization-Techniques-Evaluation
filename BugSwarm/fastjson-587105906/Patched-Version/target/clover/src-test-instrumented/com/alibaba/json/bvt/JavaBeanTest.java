/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 1999-2017 Alibaba Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.json.bvt;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class JavaBeanTest extends TestCase {static class __CLR4_5_2yjkyjklusyjq2u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,44848,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void f_test_toJSON() throws Exception {try{__CLR4_5_2yjkyjklusyjq2u.R.inc(44768);
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44769);User user = new User();
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44770);user.setName("\u6821\u957f");
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44771);user.setAge(3);
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44772);user.setSalary(new BigDecimal("123456789.0123"));

        __CLR4_5_2yjkyjklusyjq2u.R.inc(44773);String jsonString = JSON.toJSONString(user);

        __CLR4_5_2yjkyjklusyjq2u.R.inc(44774);System.out.println(jsonString);

        __CLR4_5_2yjkyjklusyjq2u.R.inc(44775);JSON.parseObject(jsonString);
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44776);User user1 = JSON.parseObject(jsonString, User.class);

        __CLR4_5_2yjkyjklusyjq2u.R.inc(44777);Assert.assertEquals(user.getAge(), user1.getAge());
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44778);Assert.assertEquals(user.getName(), user1.getName());
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44779);Assert.assertEquals(user.getSalary(), user1.getSalary());
    }finally{__CLR4_5_2yjkyjklusyjq2u.R.flushNeeded();}}

    public void test_toJSON_List() throws Exception {__CLR4_5_2yjkyjklusyjq2u.R.globalSliceStart(getClass().getName(),44780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w6gmqcyjw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yjkyjklusyjq2u.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yjkyjklusyjq2u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JavaBeanTest.test_toJSON_List",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44780,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w6gmqcyjw() throws Exception{try{__CLR4_5_2yjkyjklusyjq2u.R.inc(44780);
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44781);User user = new User();
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44782);user.setName("\u6821\u957f");
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44783);user.setAge(3);
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44784);user.setSalary(new BigDecimal("123456789.0123"));
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44785);user.setBirthdate(new Date());
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44786);user.setOld(true);

        __CLR4_5_2yjkyjklusyjq2u.R.inc(44787);List<User> userList = new ArrayList<User>();
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44788);userList.add(user);

        __CLR4_5_2yjkyjklusyjq2u.R.inc(44789);String jsonString = JSON.toJSONString(userList);

        __CLR4_5_2yjkyjklusyjq2u.R.inc(44790);System.out.println(jsonString);

        __CLR4_5_2yjkyjklusyjq2u.R.inc(44791);List<User> userList1 = JSON.parseArray(jsonString, User.class);

        __CLR4_5_2yjkyjklusyjq2u.R.inc(44792);User user1 = userList1.get(0);

        __CLR4_5_2yjkyjklusyjq2u.R.inc(44793);Assert.assertEquals(user.getAge(), user1.getAge());
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44794);Assert.assertEquals(user.getName(), user1.getName());
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44795);Assert.assertEquals(user.getSalary(), user1.getSalary());
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44796);Assert.assertEquals(user.getBirthdate(), user1.getBirthdate());
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44797);Assert.assertEquals(user.isOld(), user1.isOld());
    }finally{__CLR4_5_2yjkyjklusyjq2u.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public void f_testComposite() throws Exception {try{__CLR4_5_2yjkyjklusyjq2u.R.inc(44798);
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44799);Group group = new Group();
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44800);group.setName("\u795e\u68cd");

        __CLR4_5_2yjkyjklusyjq2u.R.inc(44801);User user = new User();
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44802);user.setName("\u6821\u957f");
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44803);user.setAge(3);
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44804);user.setSalary(new BigDecimal("123456789.0123"));

        __CLR4_5_2yjkyjklusyjq2u.R.inc(44805);group.getUsers().add(user);
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44806);((List<User>) group.getUsers2()).add(user);

        __CLR4_5_2yjkyjklusyjq2u.R.inc(44807);String jsonString = JSON.toJSONString(group);

        __CLR4_5_2yjkyjklusyjq2u.R.inc(44808);System.out.println(jsonString);

        __CLR4_5_2yjkyjklusyjq2u.R.inc(44809);JSON.parseObject(jsonString);
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44810);Group group1 = JSON.parseObject(jsonString, Group.class);
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44811);Assert.assertEquals(group.getName(), group1.getName());

        __CLR4_5_2yjkyjklusyjq2u.R.inc(44812);User user1 = group1.getUsers().get(0);
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44813);Assert.assertEquals(user.getAge(), user1.getAge());
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44814);Assert.assertEquals(user.getName(), user1.getName());
        __CLR4_5_2yjkyjklusyjq2u.R.inc(44815);Assert.assertEquals(user.getSalary(), user1.getSalary());
    }finally{__CLR4_5_2yjkyjklusyjq2u.R.flushNeeded();}}

    public static class User {

        private String     name;
        private int        age;
        private BigDecimal salary;
        private Date       birthdate;
        private boolean    old;

        public boolean isOld() {try{__CLR4_5_2yjkyjklusyjq2u.R.inc(44816);
            __CLR4_5_2yjkyjklusyjq2u.R.inc(44817);return old;
        }finally{__CLR4_5_2yjkyjklusyjq2u.R.flushNeeded();}}

        public void setOld(boolean old) {try{__CLR4_5_2yjkyjklusyjq2u.R.inc(44818);
            __CLR4_5_2yjkyjklusyjq2u.R.inc(44819);this.old = old;
        }finally{__CLR4_5_2yjkyjklusyjq2u.R.flushNeeded();}}

        public Date getBirthdate() {try{__CLR4_5_2yjkyjklusyjq2u.R.inc(44820);
            __CLR4_5_2yjkyjklusyjq2u.R.inc(44821);return birthdate;
        }finally{__CLR4_5_2yjkyjklusyjq2u.R.flushNeeded();}}

        public void setBirthdate(Date birthdate) {try{__CLR4_5_2yjkyjklusyjq2u.R.inc(44822);
            __CLR4_5_2yjkyjklusyjq2u.R.inc(44823);this.birthdate = birthdate;
        }finally{__CLR4_5_2yjkyjklusyjq2u.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_2yjkyjklusyjq2u.R.inc(44824);
            __CLR4_5_2yjkyjklusyjq2u.R.inc(44825);return name;
        }finally{__CLR4_5_2yjkyjklusyjq2u.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_2yjkyjklusyjq2u.R.inc(44826);
            __CLR4_5_2yjkyjklusyjq2u.R.inc(44827);this.name = name;
        }finally{__CLR4_5_2yjkyjklusyjq2u.R.flushNeeded();}}

        public int getAge() {try{__CLR4_5_2yjkyjklusyjq2u.R.inc(44828);
            __CLR4_5_2yjkyjklusyjq2u.R.inc(44829);return age;
        }finally{__CLR4_5_2yjkyjklusyjq2u.R.flushNeeded();}}

        public void setAge(int age) {try{__CLR4_5_2yjkyjklusyjq2u.R.inc(44830);
            __CLR4_5_2yjkyjklusyjq2u.R.inc(44831);this.age = age;
        }finally{__CLR4_5_2yjkyjklusyjq2u.R.flushNeeded();}}

        public BigDecimal getSalary() {try{__CLR4_5_2yjkyjklusyjq2u.R.inc(44832);
            __CLR4_5_2yjkyjklusyjq2u.R.inc(44833);return salary;
        }finally{__CLR4_5_2yjkyjklusyjq2u.R.flushNeeded();}}

        public void setSalary(BigDecimal salary) {try{__CLR4_5_2yjkyjklusyjq2u.R.inc(44834);
            __CLR4_5_2yjkyjklusyjq2u.R.inc(44835);this.salary = salary;
        }finally{__CLR4_5_2yjkyjklusyjq2u.R.flushNeeded();}}

    }

    public static class Group {

        private List<User>           users  = new ArrayList<User>();
        private List<? extends User> users2 = new ArrayList<User>();

        private String               name;

        public String getName() {try{__CLR4_5_2yjkyjklusyjq2u.R.inc(44836);
            __CLR4_5_2yjkyjklusyjq2u.R.inc(44837);return name;
        }finally{__CLR4_5_2yjkyjklusyjq2u.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_2yjkyjklusyjq2u.R.inc(44838);
            __CLR4_5_2yjkyjklusyjq2u.R.inc(44839);this.name = name;
        }finally{__CLR4_5_2yjkyjklusyjq2u.R.flushNeeded();}}

        public List<User> getUsers() {try{__CLR4_5_2yjkyjklusyjq2u.R.inc(44840);
            __CLR4_5_2yjkyjklusyjq2u.R.inc(44841);return users;
        }finally{__CLR4_5_2yjkyjklusyjq2u.R.flushNeeded();}}

        public void setUsers(List<User> users) {try{__CLR4_5_2yjkyjklusyjq2u.R.inc(44842);
            __CLR4_5_2yjkyjklusyjq2u.R.inc(44843);this.users = users;
        }finally{__CLR4_5_2yjkyjklusyjq2u.R.flushNeeded();}}

        public List<? extends User> getUsers2() {try{__CLR4_5_2yjkyjklusyjq2u.R.inc(44844);
            __CLR4_5_2yjkyjklusyjq2u.R.inc(44845);return users2;
        }finally{__CLR4_5_2yjkyjklusyjq2u.R.flushNeeded();}}

        public void setUsers2(List<? extends User> users2) {try{__CLR4_5_2yjkyjklusyjq2u.R.inc(44846);
            __CLR4_5_2yjkyjklusyjq2u.R.inc(44847);this.users2 = users2;
        }finally{__CLR4_5_2yjkyjklusyjq2u.R.flushNeeded();}}

    }
}
