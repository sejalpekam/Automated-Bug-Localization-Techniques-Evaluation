/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 02 23:55:39 GMT 2024
 */

package com.amazonaws.encryptionsdk.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.amazonaws.encryptionsdk.CryptoAlgorithm;

import java.time.ZoneId;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EvosuiteDecryptionMaterialsRequest_ESTest extends EvosuiteDecryptionMaterialsRequest_ESTest_scaffolding {

  @Test(timeout = 50)
  public void test00()  throws Throwable  {
      DecryptionMaterialsRequest.Builder decryptionMaterialsRequest_Builder0 = DecryptionMaterialsRequest.newBuilder();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      DecryptionMaterialsRequest.Builder decryptionMaterialsRequest_Builder1 = decryptionMaterialsRequest_Builder0.setEncryptionContext(map0);
      assertSame(decryptionMaterialsRequest_Builder0, decryptionMaterialsRequest_Builder1);
  }

  @Test(timeout = 50)
  public void test01()  throws Throwable  {
      DecryptionMaterialsRequest.Builder decryptionMaterialsRequest_Builder0 = DecryptionMaterialsRequest.newBuilder();
      LinkedList<KeyBlob> linkedList0 = new LinkedList<KeyBlob>();
      DecryptionMaterialsRequest.Builder decryptionMaterialsRequest_Builder1 = decryptionMaterialsRequest_Builder0.setEncryptedDataKeys(linkedList0);
      assertSame(decryptionMaterialsRequest_Builder0, decryptionMaterialsRequest_Builder1);
  }

  @Test(timeout = 50)
  public void test02()  throws Throwable  {
      DecryptionMaterialsRequest.Builder decryptionMaterialsRequest_Builder0 = DecryptionMaterialsRequest.newBuilder();
      DecryptionMaterialsRequest decryptionMaterialsRequest0 = decryptionMaterialsRequest_Builder0.build();
      Map<String, String> map0 = decryptionMaterialsRequest0.getEncryptionContext();
      assertNull(map0);
  }

  @Test(timeout = 50)
  public void test03()  throws Throwable  {
      DecryptionMaterialsRequest.Builder decryptionMaterialsRequest_Builder0 = DecryptionMaterialsRequest.newBuilder();
      CryptoAlgorithm cryptoAlgorithm0 = CryptoAlgorithm.ALG_AES_192_GCM_IV12_TAG16_HKDF_SHA384_ECDSA_P384;
      DecryptionMaterialsRequest.Builder decryptionMaterialsRequest_Builder1 = decryptionMaterialsRequest_Builder0.setAlgorithm(cryptoAlgorithm0);
      DecryptionMaterialsRequest decryptionMaterialsRequest0 = decryptionMaterialsRequest_Builder1.build();
      CryptoAlgorithm cryptoAlgorithm1 = decryptionMaterialsRequest0.getAlgorithm();
      assertEquals(24, cryptoAlgorithm1.getKeyLength());
  }

  @Test(timeout = 50)
  public void test04()  throws Throwable  {
      CiphertextType ciphertextType0 = CiphertextType.CUSTOMER_AUTHENTICATED_ENCRYPTED_DATA;
      CryptoAlgorithm cryptoAlgorithm0 = CryptoAlgorithm.ALG_AES_192_GCM_IV12_TAG16_HKDF_SHA256;
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)21;
      byteArray0[3] = (byte)21;
      LinkedList<KeyBlob> linkedList0 = new LinkedList<KeyBlob>();
      ContentType contentType0 = ContentType.SINGLEBLOCK;
      CiphertextHeaders ciphertextHeaders0 = new CiphertextHeaders((byte)21, ciphertextType0, cryptoAlgorithm0, byteArray0, linkedList0, contentType0, (byte)0);
      // Undeclared exception!
      try { 
        DecryptionMaterialsRequest.fromCiphertextHeaders(ciphertextHeaders0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 50)
  public void test05()  throws Throwable  {
      DecryptionMaterialsRequest.Builder decryptionMaterialsRequest_Builder0 = DecryptionMaterialsRequest.newBuilder();
      Map<String, String> map0 = decryptionMaterialsRequest_Builder0.getEncryptionContext();
      assertNull(map0);
  }

  @Test(timeout = 50)
  public void test06()  throws Throwable  {
      DecryptionMaterialsRequest.Builder decryptionMaterialsRequest_Builder0 = DecryptionMaterialsRequest.newBuilder();
      List<KeyBlob> list0 = decryptionMaterialsRequest_Builder0.getEncryptedDataKeys();
      assertNull(list0);
  }

  @Test(timeout = 50)
  public void test07()  throws Throwable  {
      DecryptionMaterialsRequest.Builder decryptionMaterialsRequest_Builder0 = DecryptionMaterialsRequest.newBuilder();
      CryptoAlgorithm cryptoAlgorithm0 = CryptoAlgorithm.ALG_AES_256_GCM_IV12_TAG16_NO_KDF;
      decryptionMaterialsRequest_Builder0.setAlgorithm(cryptoAlgorithm0);
      DecryptionMaterialsRequest decryptionMaterialsRequest0 = decryptionMaterialsRequest_Builder0.build();
      CryptoAlgorithm cryptoAlgorithm1 = decryptionMaterialsRequest0.getAlgorithm();
      assertSame(cryptoAlgorithm1, cryptoAlgorithm0);
  }

  @Test(timeout = 50)
  public void test08()  throws Throwable  {
      DecryptionMaterialsRequest.Builder decryptionMaterialsRequest_Builder0 = DecryptionMaterialsRequest.newBuilder();
      DecryptionMaterialsRequest decryptionMaterialsRequest0 = decryptionMaterialsRequest_Builder0.build();
      List<KeyBlob> list0 = decryptionMaterialsRequest0.getEncryptedDataKeys();
      assertNull(list0);
  }

  @Test(timeout = 50)
  public void test09()  throws Throwable  {
      CiphertextType ciphertextType0 = CiphertextType.CUSTOMER_AUTHENTICATED_ENCRYPTED_DATA;
      CryptoAlgorithm cryptoAlgorithm0 = CryptoAlgorithm.ALG_AES_192_GCM_IV12_TAG16_HKDF_SHA256;
      byte[] byteArray0 = new byte[0];
      LinkedList<KeyBlob> linkedList0 = new LinkedList<KeyBlob>();
      ContentType contentType0 = ContentType.FRAME;
      CiphertextHeaders ciphertextHeaders0 = new CiphertextHeaders((byte) (-1), ciphertextType0, cryptoAlgorithm0, byteArray0, linkedList0, contentType0, 0);
      DecryptionMaterialsRequest decryptionMaterialsRequest0 = DecryptionMaterialsRequest.fromCiphertextHeaders(ciphertextHeaders0);
      DecryptionMaterialsRequest.Builder decryptionMaterialsRequest_Builder0 = decryptionMaterialsRequest0.toBuilder();
      CryptoAlgorithm cryptoAlgorithm1 = decryptionMaterialsRequest_Builder0.getAlgorithm();
      assertEquals((short)326, cryptoAlgorithm1.getValue());
  }

  @Test(timeout = 50)
  public void test10()  throws Throwable  {
      CiphertextHeaders ciphertextHeaders0 = new CiphertextHeaders();
      // Undeclared exception!
      try { 
        DecryptionMaterialsRequest.fromCiphertextHeaders(ciphertextHeaders0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 50)
  public void test11()  throws Throwable  {
      CiphertextType ciphertextType0 = CiphertextType.CUSTOMER_AUTHENTICATED_ENCRYPTED_DATA;
      CryptoAlgorithm cryptoAlgorithm0 = CryptoAlgorithm.ALG_AES_192_GCM_IV12_TAG16_HKDF_SHA256;
      byte[] byteArray0 = new byte[1];
      Vector<KeyBlob> vector0 = new Vector<KeyBlob>();
      ContentType contentType0 = ContentType.SINGLEBLOCK;
      CiphertextHeaders ciphertextHeaders0 = new CiphertextHeaders((byte)36, ciphertextType0, cryptoAlgorithm0, byteArray0, vector0, contentType0, (byte)0);
      // Undeclared exception!
      try { 
        DecryptionMaterialsRequest.fromCiphertextHeaders(ciphertextHeaders0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid encryption context. Expected more bytes.
         //
         verifyException("com.amazonaws.encryptionsdk.internal.EncryptionContextSerializer", e);
      }
  }

  @Test(timeout = 50)
  public void test12()  throws Throwable  {
      DecryptionMaterialsRequest.Builder decryptionMaterialsRequest_Builder0 = DecryptionMaterialsRequest.newBuilder();
      DecryptionMaterialsRequest decryptionMaterialsRequest0 = decryptionMaterialsRequest_Builder0.build();
      decryptionMaterialsRequest0.getAlgorithm();
  }
}
