package org.traccar.protocol;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray4 = new String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession5 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.traccar.model.Position position2 = null;
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            telicProtocolDecoder1.getLastLocation(position2, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            telicProtocolDecoder1.handleUpstream(channelHandlerContext2, channelEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        Class<?> wildcardClass2 = telicProtocolDecoder1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        // The following exception was thrown during execution in test generation
        try {
            String str2 = telicProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession5 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray7 = new String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray7 = new String[] { "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Object obj0 = new Object();
        Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray6 = new String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession7 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = telicProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = telicProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray5 = new String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession6 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray7 = new String[] { "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray6 = new String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession7 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray6 = new String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession7 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray6 = new String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession7 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray7 = new String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray5 = new String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession6 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray7 = new String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray7 = new String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray7 = new String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray7 = new String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        TelicProtocol telicProtocol0 = null;
        TelicProtocolDecoder telicProtocolDecoder1 = new TelicProtocolDecoder(telicProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = telicProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }
}

