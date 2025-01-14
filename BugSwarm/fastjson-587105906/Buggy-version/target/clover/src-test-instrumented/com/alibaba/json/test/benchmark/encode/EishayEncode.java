/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.benchmark.encode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.alibaba.json.test.benchmark.BenchmarkCase;
import com.alibaba.json.test.codec.Codec;

import data.media.Image;
import data.media.Image.Size;
import data.media.Media;
import data.media.Media.Player;
import data.media.MediaContent;

public class EishayEncode extends BenchmarkCase {public static class __CLR4_1_10247d247dluszwia1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,98799,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final static MediaContent mediaContent = new MediaContent();

    static {try{__CLR4_1_10247d247dluszwia1.R.inc(98761);
        __CLR4_1_10247d247dluszwia1.R.inc(98762);Media media = new Media();
        __CLR4_1_10247d247dluszwia1.R.inc(98763);media.setUri("http://javaone.com/keynote.mpg");
        __CLR4_1_10247d247dluszwia1.R.inc(98764);media.setTitle("Javaone Keynote");
        __CLR4_1_10247d247dluszwia1.R.inc(98765);media.setWidth(640);
        __CLR4_1_10247d247dluszwia1.R.inc(98766);media.setHeight(480);
        __CLR4_1_10247d247dluszwia1.R.inc(98767);media.setFormat("video/mpg4");
        __CLR4_1_10247d247dluszwia1.R.inc(98768);media.setDuration(18000000);
        __CLR4_1_10247d247dluszwia1.R.inc(98769);media.setSize(58982400);
        __CLR4_1_10247d247dluszwia1.R.inc(98770);media.setBitrate(262144);
        __CLR4_1_10247d247dluszwia1.R.inc(98771);media.setPersons(Arrays.asList("Bill Gates", "Steve Jobs"));
        __CLR4_1_10247d247dluszwia1.R.inc(98772);media.setPlayer(Player.JAVA);
        __CLR4_1_10247d247dluszwia1.R.inc(98773);media.setCopyright(null);

        __CLR4_1_10247d247dluszwia1.R.inc(98774);mediaContent.media = media;

        __CLR4_1_10247d247dluszwia1.R.inc(98775);List<Image> images = new ArrayList<Image>();
        {
            __CLR4_1_10247d247dluszwia1.R.inc(98776);Image image = new Image();
            __CLR4_1_10247d247dluszwia1.R.inc(98777);image.setUri("http://javaone.com/keynote_large.jpg");
            __CLR4_1_10247d247dluszwia1.R.inc(98778);image.setTitle("Javaone Keynote");
            __CLR4_1_10247d247dluszwia1.R.inc(98779);image.setWidth(1024);
            __CLR4_1_10247d247dluszwia1.R.inc(98780);image.setHeight(768);
            __CLR4_1_10247d247dluszwia1.R.inc(98781);image.setSize(Size.LARGE);
            __CLR4_1_10247d247dluszwia1.R.inc(98782);images.add(image);
        }
        {
            __CLR4_1_10247d247dluszwia1.R.inc(98783);Image image = new Image();
            __CLR4_1_10247d247dluszwia1.R.inc(98784);image.setUri("http://javaone.com/keynote_small.jpg");
            __CLR4_1_10247d247dluszwia1.R.inc(98785);image.setTitle("Javaone Keynote");
            __CLR4_1_10247d247dluszwia1.R.inc(98786);image.setWidth(320);
            __CLR4_1_10247d247dluszwia1.R.inc(98787);image.setHeight(240);
            __CLR4_1_10247d247dluszwia1.R.inc(98788);image.setSize(Size.SMALL);
            __CLR4_1_10247d247dluszwia1.R.inc(98789);images.add(image);
        }
        __CLR4_1_10247d247dluszwia1.R.inc(98790);mediaContent.images = images;
    }finally{__CLR4_1_10247d247dluszwia1.R.flushNeeded();}}

    public EishayEncode(){
        super("EishayEncode");__CLR4_1_10247d247dluszwia1.R.inc(98792);try{__CLR4_1_10247d247dluszwia1.R.inc(98791);

    }finally{__CLR4_1_10247d247dluszwia1.R.flushNeeded();}}

    @Override
    public void execute(Codec codec) throws Exception {try{__CLR4_1_10247d247dluszwia1.R.inc(98793);
        __CLR4_1_10247d247dluszwia1.R.inc(98794);String text = codec.encode(mediaContent);
        __CLR4_1_10247d247dluszwia1.R.inc(98795);if ((((text == null)&&(__CLR4_1_10247d247dluszwia1.R.iget(98796)!=0|true))||(__CLR4_1_10247d247dluszwia1.R.iget(98797)==0&false))) {{
            __CLR4_1_10247d247dluszwia1.R.inc(98798);throw new Exception();
        }
    }}finally{__CLR4_1_10247d247dluszwia1.R.flushNeeded();}}

}
