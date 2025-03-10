/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 03 00:41:51 GMT 2024
 */

package org.traccar.protocol;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;

@EvoSuiteClassExclude
public class EvosuiteWondexProtocolDecoder_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.traccar.protocol.WondexProtocolDecoder"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
    java.lang.System.setProperty("user.timezone", ""); 
    java.lang.System.setProperty("user.dir", "/Users/strider/Dev/CS527-Project/Bears/Bears-118/Buggy-Version"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/p8/yfnxf01j0zl1djdmz617g_980000gn/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(EvosuiteWondexProtocolDecoder_ESTest_scaffolding.class.getClassLoader() ,
      "org.traccar.ExtendedObjectDecoder",
      "org.jboss.netty.logging.JdkLoggerFactory",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$TreeNode",
      "com.ning.http.client.providers.netty.channel.CleanupChannelGroup",
      "org.traccar.StringProtocolEncoder",
      "com.ning.http.client.AsyncHttpClientConfig$Builder$1",
      "org.jboss.netty.channel.ChannelFutureListener",
      "org.traccar.Config",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$Fun",
      "org.jboss.netty.channel.socket.nio.BossPool",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$Segment",
      "org.jboss.netty.channel.ChannelException",
      "org.jboss.netty.channel.socket.Worker",
      "org.jboss.netty.channel.group.ChannelGroup",
      "org.jboss.netty.channel.socket.nio.Boss",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$SendBuffer",
      "org.jboss.netty.util.ThreadRenamingRunnable",
      "org.traccar.DeviceSession",
      "org.jboss.netty.channel.group.DefaultChannelGroup",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig$DefaultNettyWebSocketFactory",
      "org.traccar.Context",
      "org.jboss.netty.channel.ChannelUpstreamHandler",
      "org.jboss.netty.channel.ChannelHandler",
      "org.jboss.netty.channel.socket.nio.AbstractNioWorkerPool",
      "org.jboss.netty.util.Timeout",
      "org.jboss.netty.channel.socket.nio.NioWorker",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannelSink",
      "com.ning.http.client.AsyncHttpClientConfigDefaults",
      "com.ning.http.client.providers.netty.handler.ConnectionStrategy",
      "com.ning.http.client.ProxyServerSelector$1",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$Preallocation",
      "org.jboss.netty.logging.JdkLogger",
      "com.ning.http.client.providers.netty.request.NettyRequestSender",
      "org.traccar.Protocol",
      "org.jboss.netty.util.HashedWheelTimer$HashedWheelBucket",
      "com.ning.http.client.providers.jdk.JDKAsyncHttpProvider$1",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$ConcurrentHashMapSpliterator",
      "org.jboss.netty.buffer.HeapChannelBuffer",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel",
      "org.jboss.netty.util.CharsetUtil",
      "org.jboss.netty.util.CharsetUtil$1",
      "org.jboss.netty.util.CharsetUtil$2",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink",
      "org.jboss.netty.channel.ChannelFutureProgressListener",
      "org.jboss.netty.util.ThreadNameDeterminer",
      "org.traccar.database.ActiveDevice",
      "com.ning.http.client.providers.netty.handler.Protocol",
      "org.jboss.netty.buffer.AbstractChannelBuffer",
      "org.jboss.netty.channel.socket.nio.WorkerPool",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory",
      "org.jboss.netty.channel.ConnectTimeoutException",
      "org.jboss.netty.channel.Channels",
      "com.ning.http.client.AsyncHttpClientConfig",
      "com.ning.http.client.HttpResponseBodyPart",
      "org.jboss.netty.util.internal.DetectionUtil$1",
      "com.ning.http.client.providers.netty.response.NettyResponseHeaders",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$ValueIterator",
      "com.ning.http.client.ProxyServerSelector",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$ForwardingNode",
      "com.ning.http.client.providers.jdk.JDKFuture",
      "com.ning.http.client.AsyncHttpProvider",
      "org.traccar.database.IdentityManager",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$CounterCell",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannel",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$ReservationNode",
      "org.jboss.netty.util.Timer",
      "org.jboss.netty.channel.socket.SocketChannel",
      "com.ning.http.client.providers.netty.response.NettyResponseBodyPart",
      "org.traccar.model.Message",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$BaseIterator",
      "org.jboss.netty.util.ExternalResourceReleasable",
      "com.ning.http.client.HttpResponseHeaders",
      "com.ning.http.client.providers.netty.channel.pool.ChannelPool",
      "org.jboss.netty.buffer.HeapChannelBufferFactory",
      "org.jboss.netty.channel.ChannelHandlerContext",
      "org.jboss.netty.buffer.WrappedChannelBuffer",
      "org.jboss.netty.channel.ChannelFuture",
      "org.jboss.netty.channel.Channels$1",
      "com.ning.http.client.providers.netty.request.body.NettyBody",
      "com.ning.http.client.AsyncHttpClient",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool",
      "com.ning.http.client.MaxRedirectException",
      "com.ning.http.client.providers.jdk.JDKAsyncHttpProvider",
      "com.ning.http.client.ListenableFuture",
      "org.jboss.netty.bootstrap.ConnectionlessBootstrap",
      "org.traccar.geolocation.GeolocationProvider",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool",
      "com.ning.http.client.HttpResponseStatus",
      "org.jboss.netty.channel.ChannelSink",
      "org.jboss.netty.handler.codec.oneone.OneToOneEncoder",
      "com.ning.http.client.AsyncHttpProviderConfig",
      "org.jboss.netty.channel.socket.nio.AbstractNioWorker",
      "org.traccar.protocol.WondexProtocolEncoder",
      "org.jboss.netty.buffer.EmptyChannelBuffer",
      "org.jboss.netty.channel.ChannelDownstreamHandler",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$EntrySetView",
      "com.ning.http.client.providers.jdk.JDKDelegateFuture",
      "org.jboss.netty.channel.MessageEvent",
      "com.ning.http.client.SSLEngineFactory$DefaultSSLEngineFactory",
      "org.jboss.netty.channel.ChannelFactory",
      "org.traccar.BaseProtocolDecoder",
      "org.jboss.netty.channel.socket.nio.AbstractNioSelector",
      "org.traccar.BaseProtocol",
      "com.ning.http.client.providers.netty.channel.ChannelManager$7",
      "com.ning.http.client.providers.netty.channel.ChannelManager$8",
      "org.jboss.netty.channel.socket.nio.NioClientBoss$1",
      "org.jboss.netty.channel.ChannelPipeline",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool$1",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig$NettyWebSocketFactory",
      "org.traccar.helper.Parser",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig",
      "com.ning.http.client.providers.netty.request.NettyRequestFactory",
      "org.jboss.netty.channel.LifeCycleAwareChannelHandler",
      "org.jboss.netty.channel.ChannelHandlerLifeCycleException",
      "org.jboss.netty.util.internal.DeadLockProofWorker",
      "org.jboss.netty.channel.group.DefaultChannelGroup$1",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler",
      "org.traccar.geocoder.Geocoder",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool$IdleChannelDetector",
      "org.jboss.netty.channel.socket.nio.NioClientBoss",
      "com.ning.http.client.listenable.AbstractListenableFuture",
      "org.jboss.netty.logging.AbstractInternalLogger",
      "org.jboss.netty.channel.socket.nio.NioClientBossPool",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProvider",
      "org.jboss.netty.channel.ChannelEvent",
      "org.jboss.netty.buffer.LittleEndianHeapChannelBuffer",
      "org.jboss.netty.channel.socket.nio.NioSelector",
      "org.jboss.netty.util.internal.SharedResourceMisuseDetector",
      "org.jboss.netty.bootstrap.ServerBootstrap",
      "org.traccar.protocol.WondexProtocol",
      "org.jboss.netty.channel.socket.nio.SocketReceiveBufferAllocator",
      "org.jboss.netty.buffer.ChannelBuffers",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$ValuesView",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$1",
      "com.ning.http.client.providers.netty.handler.DefaultConnectionStrategy",
      "org.jboss.netty.handler.codec.http.HttpMessage",
      "org.traccar.model.Extensible",
      "org.jboss.netty.channel.Channel",
      "org.jboss.netty.util.HashedWheelTimer",
      "org.jboss.netty.channel.AbstractChannel",
      "com.ning.http.client.filter.FilterException",
      "org.jboss.netty.handler.codec.http.HttpResponseStatus",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannel",
      "org.jboss.netty.channel.socket.nio.NioWorkerPool",
      "org.jboss.netty.channel.AbstractChannelSink",
      "com.ning.http.util.DateUtils",
      "org.jboss.netty.buffer.TruncatedChannelBuffer",
      "org.jboss.netty.bootstrap.ClientBootstrap",
      "org.jboss.netty.buffer.ChannelBufferFactory",
      "org.jboss.netty.util.ThreadNameDeterminer$2",
      "org.jboss.netty.util.ThreadNameDeterminer$1",
      "org.traccar.helper.PatternBuilder",
      "org.jboss.netty.buffer.ChannelBuffer",
      "org.jboss.netty.channel.group.ChannelGroupFuture",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$CollectionView",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$TreeBin",
      "org.jboss.netty.handler.codec.http.HttpRequest",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$Traverser",
      "org.jboss.netty.buffer.BigEndianHeapChannelBuffer",
      "org.jboss.netty.channel.socket.ClientSocketChannelFactory",
      "org.jboss.netty.channel.socket.nio.AbstractNioBossPool",
      "com.ning.http.util.MiscUtils",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.util.internal.DetectionUtil",
      "com.ning.http.client.SSLEngineFactory",
      "org.jboss.netty.util.internal.SystemPropertyUtil",
      "org.jboss.netty.util.HashedWheelTimer$HashedWheelTimeout",
      "com.ning.http.client.AsyncHttpClientConfig$Builder",
      "org.jboss.netty.handler.codec.http.HttpContentDecompressor",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "org.jboss.netty.channel.ChannelPipelineFactory",
      "com.ning.http.client.providers.netty.handler.HttpProtocol",
      "org.traccar.BaseProtocolEncoder",
      "org.jboss.netty.buffer.AbstractChannelBufferFactory",
      "com.ning.http.client.AsyncHandler",
      "org.jboss.netty.logging.InternalLogger",
      "com.ning.http.client.providers.netty.response.NettyResponseStatus",
      "com.ning.http.client.providers.netty.Callback",
      "org.jboss.netty.util.internal.DeadLockProofWorker$1",
      "org.jboss.netty.bootstrap.Bootstrap",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$Node",
      "org.jboss.netty.channel.DefaultChannelPipeline$DiscardingChannelSink",
      "org.jboss.netty.handler.codec.http.HttpContentDecoder",
      "org.jboss.netty.channel.socket.nio.NioSelectorPool",
      "org.traccar.protocol.WondexProtocolDecoder",
      "org.traccar.model.Position",
      "org.jboss.netty.util.TimerTask",
      "com.ning.http.client.providers.netty.handler.WebSocketProtocol",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$KeySetView",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$EmptySendBuffer",
      "org.jboss.netty.util.HashedWheelTimer$Worker",
      "org.traccar.model.Command",
      "org.jboss.netty.channel.ChannelPipelineException",
      "org.jboss.netty.channel.socket.nio.SelectorUtil",
      "com.ning.http.client.providers.netty.channel.ChannelManager",
      "org.jboss.netty.channel.DefaultChannelFuture"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(EvosuiteWondexProtocolDecoder_ESTest_scaffolding.class.getClassLoader());

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.traccar.ExtendedObjectDecoder",
      "org.traccar.BaseProtocolDecoder",
      "org.traccar.helper.PatternBuilder",
      "org.traccar.protocol.WondexProtocolDecoder",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "org.traccar.BaseProtocol",
      "org.traccar.protocol.WondexProtocol",
      "org.jboss.netty.handler.codec.oneone.OneToOneEncoder",
      "org.traccar.BaseProtocolEncoder",
      "org.traccar.StringProtocolEncoder",
      "org.traccar.protocol.WondexProtocolEncoder",
      "org.jboss.netty.channel.local.DefaultLocalClientChannelFactory",
      "org.jboss.netty.channel.AbstractChannelSink",
      "org.jboss.netty.logging.JdkLoggerFactory",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.logging.AbstractInternalLogger",
      "org.jboss.netty.logging.JdkLogger",
      "org.jboss.netty.channel.local.LocalClientChannelSink",
      "org.jboss.netty.channel.DefaultChannelPipeline$DiscardingChannelSink",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "org.jboss.netty.channel.AbstractChannel",
      "org.jboss.netty.channel.local.DefaultLocalChannel",
      "org.jboss.netty.channel.CompleteChannelFuture",
      "org.jboss.netty.channel.SucceededChannelFuture",
      "org.jboss.netty.channel.DefaultChannelFuture",
      "org.jboss.netty.channel.AbstractChannel$ChannelCloseFuture",
      "org.jboss.netty.util.internal.ThreadLocalBoolean",
      "org.jboss.netty.channel.DefaultChannelConfig",
      "org.jboss.netty.buffer.AbstractChannelBufferFactory",
      "org.jboss.netty.buffer.HeapChannelBufferFactory",
      "org.jboss.netty.channel.local.DefaultLocalChannel$1",
      "org.jboss.netty.channel.Channels",
      "org.jboss.netty.channel.UpstreamChannelStateEvent",
      "org.jboss.netty.channel.ChannelState",
      "org.jboss.netty.channel.UpstreamChannelStateEvent$1",
      "org.jboss.netty.buffer.AbstractChannelBuffer",
      "org.jboss.netty.buffer.HeapChannelBuffer",
      "org.jboss.netty.buffer.LittleEndianHeapChannelBuffer",
      "org.jboss.netty.buffer.TruncatedChannelBuffer",
      "org.traccar.model.Extensible",
      "org.traccar.model.Message",
      "org.traccar.model.Command",
      "com.ning.http.client.AsyncHttpClient",
      "com.ning.http.client.AsyncHttpClientConfig$Builder",
      "com.ning.http.client.AsyncHttpClientConfigDefaults",
      "com.ning.http.util.MiscUtils",
      "com.ning.http.client.AsyncHttpClientConfig$Builder$1",
      "com.ning.http.client.ProxyServerSelector$1",
      "com.ning.http.client.ProxyServerSelector",
      "com.ning.http.client.AsyncHttpClientConfig",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProvider",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig$DefaultNettyWebSocketFactory",
      "com.ning.http.client.providers.netty.handler.DefaultConnectionStrategy",
      "org.jboss.netty.util.internal.SharedResourceMisuseDetector",
      "org.jboss.netty.util.HashedWheelTimer",
      "org.jboss.netty.util.HashedWheelTimer$Worker",
      "org.jboss.netty.util.HashedWheelTimer$HashedWheelBucket",
      "org.jboss.netty.util.ThreadNameDeterminer$1",
      "org.jboss.netty.util.ThreadNameDeterminer$2",
      "org.jboss.netty.util.ThreadNameDeterminer",
      "org.jboss.netty.util.ThreadRenamingRunnable",
      "org.jboss.netty.util.internal.SystemPropertyUtil",
      "com.ning.http.client.providers.netty.channel.ChannelManager",
      "org.jboss.netty.util.internal.DetectionUtil$1",
      "com.ning.http.client.SSLEngineFactory$DefaultSSLEngineFactory",
      "org.jboss.netty.util.internal.DetectionUtil",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool$1",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$1",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool$IdleChannelDetector",
      "org.jboss.netty.util.HashedWheelTimer$HashedWheelTimeout",
      "org.jboss.netty.channel.group.DefaultChannelGroup",
      "com.ning.http.client.providers.netty.channel.CleanupChannelGroup",
      "org.jboss.netty.channel.group.DefaultChannelGroup$1",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory",
      "org.jboss.netty.channel.socket.nio.AbstractNioWorkerPool",
      "org.jboss.netty.channel.socket.nio.NioWorkerPool",
      "org.jboss.netty.channel.socket.nio.AbstractNioSelector",
      "org.jboss.netty.channel.socket.nio.AbstractNioWorker",
      "org.jboss.netty.channel.socket.nio.NioWorker",
      "org.jboss.netty.channel.socket.nio.SelectorUtil",
      "org.jboss.netty.util.internal.DeadLockProofWorker",
      "org.jboss.netty.util.internal.DeadLockProofWorker$1",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$EmptySendBuffer",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$Preallocation",
      "org.jboss.netty.channel.socket.nio.SocketReceiveBufferAllocator",
      "org.jboss.netty.channel.socket.nio.AbstractNioBossPool",
      "org.jboss.netty.channel.socket.nio.NioClientBossPool",
      "org.jboss.netty.channel.socket.nio.NioClientBoss",
      "org.jboss.netty.channel.socket.nio.NioClientBoss$1",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannelSink",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink",
      "org.jboss.netty.bootstrap.Bootstrap",
      "org.jboss.netty.bootstrap.ClientBootstrap",
      "org.jboss.netty.channel.Channels$1",
      "com.ning.http.client.providers.netty.request.NettyRequestSender",
      "com.ning.http.client.providers.netty.request.NettyRequestFactory",
      "org.jboss.netty.handler.codec.http.HttpResponseStatus",
      "com.ning.http.client.providers.netty.handler.Protocol",
      "com.ning.http.client.providers.netty.handler.HttpProtocol",
      "com.ning.http.client.MaxRedirectException",
      "com.ning.http.client.providers.jdk.JDKAsyncHttpProvider",
      "org.traccar.Context",
      "org.jboss.netty.channel.local.DefaultLocalServerChannelFactory",
      "org.jboss.netty.channel.local.LocalServerChannelSink",
      "org.jboss.netty.channel.AbstractServerChannel",
      "org.jboss.netty.channel.local.DefaultLocalServerChannel",
      "org.jboss.netty.channel.DefaultServerChannelConfig",
      "org.jboss.netty.buffer.BigEndianHeapChannelBuffer",
      "org.jboss.netty.buffer.EmptyChannelBuffer",
      "org.jboss.netty.buffer.ChannelBuffers",
      "org.traccar.TrackerServer",
      "org.traccar.protocol.WondexProtocol$1",
      "org.jboss.netty.bootstrap.ServerBootstrap",
      "org.traccar.GlobalChannelFactory",
      "org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory",
      "org.jboss.netty.channel.socket.nio.NioServerBossPool",
      "org.jboss.netty.channel.socket.nio.NioServerBoss",
      "org.jboss.netty.channel.socket.nio.NioServerSocketPipelineSink",
      "org.traccar.model.Device",
      "org.traccar.protocol.Gl200ProtocolEncoder",
      "org.jboss.netty.channel.DownstreamChannelStateEvent",
      "org.jboss.netty.channel.local.LocalServerChannelSink$1",
      "org.jboss.netty.channel.group.DefaultChannelGroupFuture",
      "org.jboss.netty.channel.group.DefaultChannelGroupFuture$1",
      "org.traccar.database.ActiveDevice",
      "org.jboss.netty.buffer.DynamicChannelBuffer",
      "org.jboss.netty.buffer.DuplicatedChannelBuffer",
      "com.cloudhopper.commons.util.NamingThreadFactory",
      "com.cloudhopper.commons.util.Sequencer",
      "org.traccar.protocol.WatchProtocolEncoder",
      "org.jboss.netty.channel.DefaultChildChannelStateEvent",
      "org.jboss.netty.buffer.CompositeChannelBuffer",
      "org.jboss.netty.channel.UpstreamMessageEvent",
      "org.traccar.protocol.MeitrackProtocolEncoder",
      "org.jboss.netty.buffer.SlicedChannelBuffer",
      "org.traccar.protocol.UproProtocol",
      "org.traccar.model.Position",
      "org.joda.time.base.AbstractPartial",
      "org.joda.time.base.BaseLocal",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.DurationFieldType",
      "org.joda.time.LocalDate",
      "org.joda.time.Chronology",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.DurationField",
      "org.joda.time.field.MillisDurationField",
      "org.joda.time.field.BaseDurationField",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.DateTimeField",
      "org.joda.time.field.BaseDateTimeField",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.field.DecoratedDateTimeField",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.chrono.BasicChronology",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.UTCDateTimeZone",
      "org.joda.time.DateTimeZone",
      "org.joda.time.chrono.AssembledChronology$Fields",
      "org.joda.time.field.ImpreciseDateTimeField",
      "org.joda.time.chrono.BasicYearDateTimeField",
      "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField",
      "org.joda.time.chrono.GJYearOfEraDateTimeField",
      "org.joda.time.field.OffsetDateTimeField",
      "org.joda.time.field.DividedDateTimeField",
      "org.joda.time.field.DecoratedDurationField",
      "org.joda.time.field.ScaledDurationField",
      "org.joda.time.field.RemainderDateTimeField",
      "org.joda.time.chrono.GJEraDateTimeField",
      "org.joda.time.chrono.GJDayOfWeekDateTimeField",
      "org.joda.time.chrono.BasicDayOfMonthDateTimeField",
      "org.joda.time.chrono.BasicDayOfYearDateTimeField",
      "org.joda.time.chrono.BasicMonthOfYearDateTimeField",
      "org.joda.time.chrono.GJMonthOfYearDateTimeField",
      "org.joda.time.chrono.BasicWeekyearDateTimeField",
      "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField",
      "org.joda.time.field.UnsupportedDurationField",
      "org.joda.time.chrono.GregorianChronology",
      "org.joda.time.chrono.ISOYearOfEraDateTimeField",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.DateTimeUtils$SystemMillisProvider",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.field.FieldUtils",
      "org.joda.time.chrono.BasicChronology$YearInfo",
      "org.traccar.protocol.EnforaProtocol",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannel",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel",
      "org.joda.time.LocalDateTime",
      "org.joda.time.convert.ConverterManager",
      "org.joda.time.convert.ConverterSet",
      "org.joda.time.convert.AbstractConverter",
      "org.joda.time.convert.ReadableInstantConverter",
      "org.joda.time.convert.StringConverter",
      "org.joda.time.convert.CalendarConverter",
      "org.joda.time.convert.DateConverter",
      "org.joda.time.convert.LongConverter",
      "org.joda.time.convert.NullConverter",
      "org.joda.time.convert.ReadablePartialConverter",
      "org.joda.time.convert.ReadableDurationConverter",
      "org.joda.time.convert.ReadableIntervalConverter",
      "org.joda.time.convert.ReadablePeriodConverter",
      "org.joda.time.convert.ConverterSet$Entry",
      "org.jboss.netty.buffer.ReadOnlyChannelBuffer",
      "org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext",
      "org.jboss.netty.buffer.DirectChannelBufferFactory",
      "org.traccar.protocol.H02ProtocolEncoder",
      "org.jboss.netty.buffer.ByteBufferBackedChannelBuffer",
      "com.zaxxer.hikari.util.UtilityElf$DefaultThreadFactory",
      "org.traccar.protocol.GranitProtocolSmsEncoder",
      "org.traccar.protocol.Tk103ProtocolEncoder",
      "org.jboss.netty.channel.DefaultExceptionEvent",
      "org.jboss.netty.util.CharsetUtil$1",
      "org.jboss.netty.util.CharsetUtil$2",
      "org.jboss.netty.util.CharsetUtil",
      "org.traccar.helper.Parser",
      "org.joda.time.format.ISODateTimeFormat",
      "org.joda.time.format.DateTimeFormatterBuilder",
      "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter",
      "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber",
      "org.joda.time.format.DateTimeFormatter",
      "org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral",
      "org.joda.time.format.DateTimeFormatterBuilder$Composite",
      "org.joda.time.format.DateTimeFormatterBuilder$StringLiteral",
      "org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber",
      "org.joda.time.format.DateTimeFormatterBuilder$Fraction",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset",
      "org.joda.time.format.DateTimeFormatterBuilder$FixedNumber",
      "org.joda.time.format.InternalParserDateTimeParser",
      "org.joda.time.format.DateTimeParserInternalParser",
      "org.joda.time.format.DateTimeFormatterBuilder$MatchingParser",
      "org.joda.time.format.DateTimePrinterInternalPrinter",
      "org.joda.time.format.ISODateTimeFormat$Constants",
      "org.joda.time.tz.ZoneInfoProvider",
      "org.joda.time.tz.ZoneInfoProvider$1",
      "org.joda.time.DateTimeZone$LazyInit$1",
      "org.joda.time.DateTimeZone$LazyInit",
      "org.joda.time.format.DateTimeParserBucket",
      "org.joda.time.format.DateTimeParserBucket$SavedState",
      "org.joda.time.format.FormatUtils",
      "org.traccar.protocol.Jt600ProtocolEncoder"
    );
  }
}
