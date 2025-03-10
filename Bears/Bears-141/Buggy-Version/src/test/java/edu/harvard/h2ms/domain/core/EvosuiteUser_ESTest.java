/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 03 01:59:47 GMT 2024
 */

package edu.harvard.h2ms.domain.core;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;
import org.springframework.security.core.GrantedAuthority;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EvosuiteUser_ESTest extends EvosuiteUser_ESTest_scaffolding {

  @Test(timeout = 50)
  public void test00()  throws Throwable  {
      User user0 = new User("", "", "`^_7q+hDFlj<5E", "`^_7q+hDFlj<5E", (String) null, "UjXny\\)7dn*m^sY~s");
      assertEquals("UjXny\\)7dn*m^sY~s", user0.getType());
      assertEquals("`^_7q+hDFlj<5E", user0.getLastName());
      assertEquals("", user0.getFirstName());
      assertEquals("", user0.getMiddleName());
      assertEquals("`^_7q+hDFlj<5E", user0.getUsername());
  }

  @Test(timeout = 50)
  public void test01()  throws Throwable  {
      User user0 = new User();
      user0.setEmail("8kmpA");
      String string0 = user0.getUsername();
      assertEquals("8kmpA", string0);
  }

  @Test(timeout = 50)
  public void test02()  throws Throwable  {
      User user0 = new User((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
      user0.setType("EE :C(1*dN2");
      String string0 = user0.getType();
      assertEquals("EE :C(1*dN2", string0);
  }

  @Test(timeout = 50)
  public void test03()  throws Throwable  {
      User user0 = new User();
      user0.setType("");
      String string0 = user0.getType();
      assertEquals("", string0);
  }

  @Test(timeout = 50)
  public void test04()  throws Throwable  {
      User user0 = new User();
      LinkedHashSet<Role> linkedHashSet0 = new LinkedHashSet<Role>();
      Role role0 = new Role();
      linkedHashSet0.add(role0);
      user0.setRoles(linkedHashSet0);
      Set<Role> set0 = user0.getRoles();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 50)
  public void test05()  throws Throwable  {
      User user0 = new User();
      user0.setResetToken("5M;E~U+hO!>tBQo'#w<");
      String string0 = user0.getResetToken();
      assertEquals("5M;E~U+hO!>tBQo'#w<", string0);
  }

  @Test(timeout = 50)
  public void test06()  throws Throwable  {
      User user0 = new User();
      user0.setResetToken("");
      String string0 = user0.getResetToken();
      assertEquals("", string0);
  }

  @Test(timeout = 50)
  public void test07()  throws Throwable  {
      User user0 = new User();
      user0.setNotificationFrequency("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null");
      String string0 = user0.getNotificationFrequency();
      assertEquals("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", string0);
  }

  @Test(timeout = 50)
  public void test08()  throws Throwable  {
      User user0 = new User("aQ#n&y'M-yL", "aQ#n&y'M-yL", "aQ#n&y'M-yL", "", (String) null, "aQ#n&y'M-yL");
      String string0 = user0.getMiddleName();
      assertEquals("aQ#n&y'M-yL", string0);
      assertEquals("aQ#n&y'M-yL", user0.getFirstName());
      assertNotNull(string0);
      assertEquals("aQ#n&y'M-yL", user0.getLastName());
      assertEquals("", user0.getEmail());
      assertEquals("aQ#n&y'M-yL", user0.getType());
  }

  @Test(timeout = 50)
  public void test09()  throws Throwable  {
      User user0 = new User();
      user0.setLastName("");
      String string0 = user0.getLastName();
      assertEquals("", string0);
  }

  @Test(timeout = 50)
  public void test10()  throws Throwable  {
      User user0 = new User("evSrUNWT)YOu", "Invalid len", "Invalid len", (String) null, (String) null, "=^-'y)vL p-h&");
      Long long0 = new Long(173L);
      user0.setId(long0);
      user0.getId();
      assertEquals("evSrUNWT)YOu", user0.getFirstName());
      assertEquals("=^-'y)vL p-h&", user0.getType());
      assertEquals("Invalid len", user0.getLastName());
      assertEquals("Invalid len", user0.getMiddleName());
  }

  @Test(timeout = 50)
  public void test11()  throws Throwable  {
      User user0 = new User();
      Long long0 = new Long((-2560L));
      user0.setId(long0);
      Long long1 = user0.getId();
      assertEquals((-2560L), (long)long1);
  }

  @Test(timeout = 50)
  public void test12()  throws Throwable  {
      User user0 = new User();
      user0.setFirstName("5M;E~U+hO!>tBQo'#w<");
      String string0 = user0.getFirstName();
      assertEquals("5M;E~U+hO!>tBQo'#w<", string0);
  }

  @Test(timeout = 50)
  public void test13()  throws Throwable  {
      User user0 = new User();
      user0.setEmail("=Y}3\"VZomp@%H");
      String string0 = user0.getEmail();
      assertEquals("=Y}3\"VZomp@%H", string0);
  }

  @Test(timeout = 50)
  public void test14()  throws Throwable  {
      User user0 = new User("aQ#n&y'M-yL", "aQ#n&y'M-yL", "aQ#n&y'M-yL", "", (String) null, "aQ#n&y'M-yL");
      String string0 = user0.getEmail();
      assertEquals("", string0);
      assertEquals("aQ#n&y'M-yL", user0.getFirstName());
      assertEquals("aQ#n&y'M-yL", user0.getLastName());
      assertEquals("aQ#n&y'M-yL", user0.getType());
      assertNotNull(string0);
      assertEquals("aQ#n&y'M-yL", user0.getMiddleName());
  }

  @Test(timeout = 50)
  public void test15()  throws Throwable  {
      User user0 = new User();
      MockDate mockDate0 = new MockDate((-1964470824), (-1964470824), 0, 0, (-1964470824));
      user0.setCreatedOn(mockDate0);
      Date date0 = user0.getCreatedOn();
      assertSame(date0, mockDate0);
  }

  @Test(timeout = 50)
  public void test16()  throws Throwable  {
      User user0 = new User();
      user0.setPassword((String) null);
      assertTrue(user0.isAccountNonLocked());
  }

  @Test(timeout = 50)
  public void test17()  throws Throwable  {
      User user0 = new User();
      // Undeclared exception!
      user0.setPassword("\"/Q6|<1JOGUx4ND<4");
  }

  @Test(timeout = 50)
  public void test18()  throws Throwable  {
      User user0 = new User();
      Date date0 = user0.getLastLogin();
      assertNull(date0);
  }

  @Test(timeout = 50)
  public void test19()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getNotificationFrequency();
      assertNull(string0);
  }

  @Test(timeout = 50)
  public void test20()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getResetToken();
      assertNull(string0);
  }

  @Test(timeout = 50)
  public void test21()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getMiddleName();
      assertNull(string0);
  }

  @Test(timeout = 50)
  public void test22()  throws Throwable  {
      User user0 = new User();
      user0.setFirstName("");
      String string0 = user0.getFirstName();
      assertEquals("", string0);
  }

  @Test(timeout = 50)
  public void test23()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.toString();
      assertEquals("User [id=null, firstName=null, middleName=null, lastName=null, email=null, typenull, notificationFrequency=null", string0);
  }

  @Test(timeout = 50)
  public void test24()  throws Throwable  {
      User user0 = new User();
      Long long0 = user0.getId();
      assertNull(long0);
  }

  @Test(timeout = 50)
  public void test25()  throws Throwable  {
      User user0 = new User();
      user0.setEnabled(false);
      assertNull(user0.getPassword());
  }

  @Test(timeout = 50)
  public void test26()  throws Throwable  {
      User user0 = new User();
      Collection<? extends GrantedAuthority> collection0 = user0.getAuthorities();
      assertNotNull(collection0);
  }

  @Test(timeout = 50)
  public void test27()  throws Throwable  {
      User user0 = new User();
      user0.setMiddleName("");
      String string0 = user0.getMiddleName();
      assertEquals("", string0);
  }

  @Test(timeout = 50)
  public void test28()  throws Throwable  {
      User user0 = new User();
      LinkedHashSet<Role> linkedHashSet0 = new LinkedHashSet<Role>();
      user0.setRoles(linkedHashSet0);
      Set<Role> set0 = user0.getRoles();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 50)
  public void test29()  throws Throwable  {
      User user0 = new User();
      user0.setEmail("");
      String string0 = user0.getUsername();
      assertEquals("", string0);
  }

  @Test(timeout = 50)
  public void test30()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getPassword();
      assertNull(string0);
  }

  @Test(timeout = 50)
  public void test31()  throws Throwable  {
      User user0 = new User("aQ#n&y'M-yL", "aQ#n&y'M-yL", "aQ#n&y'M-yL", "", (String) null, "aQ#n&y'M-yL");
      boolean boolean0 = user0.isEnabled();
      assertEquals("aQ#n&y'M-yL", user0.getMiddleName());
      assertEquals("", user0.getUsername());
      assertEquals("aQ#n&y'M-yL", user0.getLastName());
      assertEquals("aQ#n&y'M-yL", user0.getType());
      assertTrue(boolean0);
      assertEquals("aQ#n&y'M-yL", user0.getFirstName());
  }

  @Test(timeout = 50)
  public void test32()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getFirstName();
      assertNull(string0);
  }

  @Test(timeout = 50)
  public void test33()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getEmail();
      assertNull(string0);
  }

  @Test(timeout = 50)
  public void test34()  throws Throwable  {
      User user0 = new User();
      boolean boolean0 = user0.isAccountNonLocked();
      assertTrue(boolean0);
  }

  @Test(timeout = 50)
  public void test35()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getUsername();
      assertNull(string0);
  }

  @Test(timeout = 50)
  public void test36()  throws Throwable  {
      User user0 = new User("#@]^R&K", "#@]^R&K", "#@]^R&K", "#@]^R&K", "#@]^R&K", "#@]^R&K");
  }

  @Test(timeout = 50)
  public void test37()  throws Throwable  {
      User user0 = new User();
      boolean boolean0 = user0.isAccountNonExpired();
      assertTrue(boolean0);
  }

  @Test(timeout = 50)
  public void test38()  throws Throwable  {
      User user0 = new User();
      Long long0 = new Long(0L);
      user0.setId(long0);
      Long long1 = user0.getId();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 50)
  public void test39()  throws Throwable  {
      User user0 = new User();
      MockDate mockDate0 = new MockDate(2040L);
      user0.setLastLogin(mockDate0);
      Date date0 = user0.getLastLogin();
      assertEquals("Thu Jan 01 00:00:02 GMT 1970", date0.toString());
  }

  @Test(timeout = 50)
  public void test40()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getLastName();
      assertNull(string0);
  }

  @Test(timeout = 50)
  public void test41()  throws Throwable  {
      User user0 = new User();
      Date date0 = user0.getCreatedOn();
      assertNull(date0);
  }

  @Test(timeout = 50)
  public void test42()  throws Throwable  {
      User user0 = new User();
      user0.setNotificationFrequency("");
      String string0 = user0.getNotificationFrequency();
      assertEquals("", string0);
  }

  @Test(timeout = 50)
  public void test43()  throws Throwable  {
      User user0 = new User();
      boolean boolean0 = user0.isCredentialsNonExpired();
      assertTrue(boolean0);
  }

  @Test(timeout = 50)
  public void test44()  throws Throwable  {
      User user0 = new User();
      user0.setLastName("f,25SgWZY>b");
      String string0 = user0.getLastName();
      assertEquals("f,25SgWZY>b", string0);
  }

  @Test(timeout = 50)
  public void test45()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getType();
      assertNull(string0);
  }

  @Test(timeout = 50)
  public void test46()  throws Throwable  {
      User user0 = new User();
      Set<Role> set0 = user0.getRoles();
      assertNull(set0);
  }
}
