/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 02 22:17:39 GMT 2024
 */

package org.traccar.protocol;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.SocketAddress;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jboss.netty.channel.Channel;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EvosuiteEelinkProtocolDecoder_ESTest extends EvosuiteEelinkProtocolDecoder_ESTest_scaffolding {

  @Test(timeout = 50)
  public void test0()  throws Throwable  {
      EelinkProtocol eelinkProtocol0 = mock(EelinkProtocol.class, new ViolatedAssumptionAnswer());
      EelinkProtocolDecoder eelinkProtocolDecoder0 = new EelinkProtocolDecoder(eelinkProtocol0);
      try { 
        eelinkProtocolDecoder0.decode((Channel) null, (SocketAddress) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.traccar.protocol.EelinkProtocolDecoder", e);
      }
  }

  @Test(timeout = 50)
  public void test1()  throws Throwable  {
      EelinkProtocol eelinkProtocol0 = mock(EelinkProtocol.class, new ViolatedAssumptionAnswer());
      EelinkProtocolDecoder eelinkProtocolDecoder0 = new EelinkProtocolDecoder(eelinkProtocol0);
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      SocketAddress socketAddress0 = mock(SocketAddress.class, new ViolatedAssumptionAnswer());
      try { 
        eelinkProtocolDecoder0.decode(channel0, socketAddress0, channel0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jboss.netty.channel.Channel$MockitoMock$438770553 cannot be cast to org.jboss.netty.buffer.ChannelBuffer
         //
         verifyException("org.traccar.protocol.EelinkProtocolDecoder", e);
      }
  }
}
