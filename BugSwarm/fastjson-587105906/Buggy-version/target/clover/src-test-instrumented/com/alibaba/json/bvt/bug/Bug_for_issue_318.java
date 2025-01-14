/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class Bug_for_issue_318 extends TestCase {static class __CLR4_1_10156v156vluszw8h1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,53435,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_1_10156v156vluszw8h1.R.globalSliceStart(getClass().getName(),53383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb156v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10156v156vluszw8h1.R.rethrow($CLV_t2$);}finally{__CLR4_1_10156v156vluszw8h1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_318.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),53383,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb156v() throws Exception{try{__CLR4_1_10156v156vluszw8h1.R.inc(53383);
        __CLR4_1_10156v156vluszw8h1.R.inc(53384);Person o1 = new Person("zhangsan", 20);
        __CLR4_1_10156v156vluszw8h1.R.inc(53385);Person o2 = new Person("liuXX", 30);
        __CLR4_1_10156v156vluszw8h1.R.inc(53386);Person o3 = new Person("Test", 10);

        __CLR4_1_10156v156vluszw8h1.R.inc(53387);List<Person> users = new ArrayList<Person>();
        __CLR4_1_10156v156vluszw8h1.R.inc(53388);users.add(o1);
        __CLR4_1_10156v156vluszw8h1.R.inc(53389);users.add(o2);
        __CLR4_1_10156v156vluszw8h1.R.inc(53390);users.add(o3);

        __CLR4_1_10156v156vluszw8h1.R.inc(53391);List<Person> managers = new ArrayList<Person>();
        __CLR4_1_10156v156vluszw8h1.R.inc(53392);managers.add(o2);
        __CLR4_1_10156v156vluszw8h1.R.inc(53393);managers.add(o3);

        __CLR4_1_10156v156vluszw8h1.R.inc(53394);PersonAll pa = new PersonAll();
        __CLR4_1_10156v156vluszw8h1.R.inc(53395);pa.setCount(30);

        // map
        __CLR4_1_10156v156vluszw8h1.R.inc(53396);Map<String, List<Person>> userMap = new LinkedHashMap<String, List<Person>>();
        __CLR4_1_10156v156vluszw8h1.R.inc(53397);userMap.put("managers", managers);
        __CLR4_1_10156v156vluszw8h1.R.inc(53398);userMap.put("users", users);
        __CLR4_1_10156v156vluszw8h1.R.inc(53399);pa.setUserMap(userMap);
        // bean\u7684\u5c5e\u6027
        __CLR4_1_10156v156vluszw8h1.R.inc(53400);pa.setUsers(users);
        __CLR4_1_10156v156vluszw8h1.R.inc(53401);pa.setManagers(managers);

        // String json = JSON.toJSONString(pa, SerializerFeature.DisableCircularReferenceDetect);
        __CLR4_1_10156v156vluszw8h1.R.inc(53402);String json = JSON.toJSONString(pa);
//        System.out.println("\u5e8f\u5217\u5316: ");
//        System.out.println(json);

        __CLR4_1_10156v156vluszw8h1.R.inc(53403);PersonAll target = JSON.parseObject(json, PersonAll.class);
//        System.out.println("\u53cd\u5e8f\u5217\u5316\u7ed3\u679c: ");
//        System.out.println("map users: " + target.getUserMap().get("users"));
//        System.out.println("map managers: " + target.getUserMap().get("managers"));
//
//        // \u53ef\u80fd\u662f\u4e2a "BUG" \u7b2c\u4e00\u4e2a\u5143\u7d20\u603b\u662f\u4e3anull
//        System.out.println("bean users: " + target.getUsers());
//        System.out.println("bean managers: " + target.getManagers());
//        
//        System.out.println(JSON.toJSONString(target));
        
        __CLR4_1_10156v156vluszw8h1.R.inc(53404);Assert.assertNotNull(target.getUsers().get(0));
        __CLR4_1_10156v156vluszw8h1.R.inc(53405);Assert.assertNotNull(target.getManagers().get(0));
    }finally{__CLR4_1_10156v156vluszw8h1.R.flushNeeded();}}

    private static class Person {
        private String name;
        private Integer age;

        public Person(){try{__CLR4_1_10156v156vluszw8h1.R.inc(53406);}finally{__CLR4_1_10156v156vluszw8h1.R.flushNeeded();}}

        public Person(String name, Integer age) {
            super();__CLR4_1_10156v156vluszw8h1.R.inc(53408);try{__CLR4_1_10156v156vluszw8h1.R.inc(53407);
            __CLR4_1_10156v156vluszw8h1.R.inc(53409);this.name = name;
            __CLR4_1_10156v156vluszw8h1.R.inc(53410);this.age = age;
        }finally{__CLR4_1_10156v156vluszw8h1.R.flushNeeded();}}
        public String getName() {try{__CLR4_1_10156v156vluszw8h1.R.inc(53411);
            __CLR4_1_10156v156vluszw8h1.R.inc(53412);return name;
        }finally{__CLR4_1_10156v156vluszw8h1.R.flushNeeded();}}
        public void setName(String name) {try{__CLR4_1_10156v156vluszw8h1.R.inc(53413);
            __CLR4_1_10156v156vluszw8h1.R.inc(53414);this.name = name;
        }finally{__CLR4_1_10156v156vluszw8h1.R.flushNeeded();}}
        public Integer getAge() {try{__CLR4_1_10156v156vluszw8h1.R.inc(53415);
            __CLR4_1_10156v156vluszw8h1.R.inc(53416);return age;
        }finally{__CLR4_1_10156v156vluszw8h1.R.flushNeeded();}}
        public void setAge(Integer age) {try{__CLR4_1_10156v156vluszw8h1.R.inc(53417);
            __CLR4_1_10156v156vluszw8h1.R.inc(53418);this.age = age;
        }finally{__CLR4_1_10156v156vluszw8h1.R.flushNeeded();}}
    }

    private static class PersonAll {
        private Map<String, List<Person>> userMap = new HashMap<String, List<Person>>();
        private Integer count;
        private List<Person> users;
        private List<Person> managers;

        public Integer getCount() {try{__CLR4_1_10156v156vluszw8h1.R.inc(53419);
            __CLR4_1_10156v156vluszw8h1.R.inc(53420);return count;
        }finally{__CLR4_1_10156v156vluszw8h1.R.flushNeeded();}}

        public void setCount(Integer count) {try{__CLR4_1_10156v156vluszw8h1.R.inc(53421);
            __CLR4_1_10156v156vluszw8h1.R.inc(53422);this.count = count;
        }finally{__CLR4_1_10156v156vluszw8h1.R.flushNeeded();}}

        public Map<String, List<Person>> getUserMap() {try{__CLR4_1_10156v156vluszw8h1.R.inc(53423);
            __CLR4_1_10156v156vluszw8h1.R.inc(53424);return userMap;
        }finally{__CLR4_1_10156v156vluszw8h1.R.flushNeeded();}}

        public void setUserMap(Map<String, List<Person>> userMap) {try{__CLR4_1_10156v156vluszw8h1.R.inc(53425);
            __CLR4_1_10156v156vluszw8h1.R.inc(53426);this.userMap = userMap;
        }finally{__CLR4_1_10156v156vluszw8h1.R.flushNeeded();}}

        public List<Person> getUsers() {try{__CLR4_1_10156v156vluszw8h1.R.inc(53427);
            __CLR4_1_10156v156vluszw8h1.R.inc(53428);return users;
        }finally{__CLR4_1_10156v156vluszw8h1.R.flushNeeded();}}

        public void setUsers(List<Person> users) {try{__CLR4_1_10156v156vluszw8h1.R.inc(53429);
            __CLR4_1_10156v156vluszw8h1.R.inc(53430);this.users = users;
        }finally{__CLR4_1_10156v156vluszw8h1.R.flushNeeded();}}

        public List<Person> getManagers() {try{__CLR4_1_10156v156vluszw8h1.R.inc(53431);
            __CLR4_1_10156v156vluszw8h1.R.inc(53432);return managers;
        }finally{__CLR4_1_10156v156vluszw8h1.R.flushNeeded();}}

        public void setManagers(List<Person> managers) {try{__CLR4_1_10156v156vluszw8h1.R.inc(53433);
            __CLR4_1_10156v156vluszw8h1.R.inc(53434);this.managers = managers;
        }finally{__CLR4_1_10156v156vluszw8h1.R.flushNeeded();}}
    }
}
