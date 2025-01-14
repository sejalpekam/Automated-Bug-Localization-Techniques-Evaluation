/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.benchmark;

import java.lang.management.ManagementFactory;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.json.test.TestUtils;
import com.alibaba.json.test.benchmark.decode.EishayDecodeBytes;

import data.media.Image;
import data.media.Media;
import data.media.MediaContent;
import data.media.writeAsArray.ImageSerializer;
import data.media.writeAsArray.MediaContentSerializer;
import data.media.writeAsArray.MediaSerializer;

public class BenchmarkMain_EishayEncode_WriteAsArray {public static class __CLR4_5_222ea22ealusyjwn2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,96450,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) throws Exception {try{__CLR4_5_222ea22ealusyjwn2.R.inc(96418);
        __CLR4_5_222ea22ealusyjwn2.R.inc(96419);SerializeConfig config = SerializeConfig.getGlobalInstance();
        __CLR4_5_222ea22ealusyjwn2.R.inc(96420);config.put(MediaContent.class, new MediaContentSerializer());
        __CLR4_5_222ea22ealusyjwn2.R.inc(96421);config.put(Media.class, new MediaSerializer());
        __CLR4_5_222ea22ealusyjwn2.R.inc(96422);config.put(Image.class, new ImageSerializer());
        
        __CLR4_5_222ea22ealusyjwn2.R.inc(96423);System.out.println(System.getProperty("java.vm.name") + " " + System.getProperty("java.runtime.version"));
        __CLR4_5_222ea22ealusyjwn2.R.inc(96424);List<String> arguments = ManagementFactory.getRuntimeMXBean().getInputArguments();
        __CLR4_5_222ea22ealusyjwn2.R.inc(96425);System.out.println(arguments);

        __CLR4_5_222ea22ealusyjwn2.R.inc(96426);MediaContent content = EishayDecodeBytes.instance.getContent();
        __CLR4_5_222ea22ealusyjwn2.R.inc(96427);String text = encode(content);
        __CLR4_5_222ea22ealusyjwn2.R.inc(96428);System.out.println(text);
        
        __CLR4_5_222ea22ealusyjwn2.R.inc(96429);for (int i = 0; (((i < 10)&&(__CLR4_5_222ea22ealusyjwn2.R.iget(96430)!=0|true))||(__CLR4_5_222ea22ealusyjwn2.R.iget(96431)==0&false)); ++i) {{
            __CLR4_5_222ea22ealusyjwn2.R.inc(96432);perf(text);
        }
    }}finally{__CLR4_5_222ea22ealusyjwn2.R.flushNeeded();}}

    static long perf(Object obj) {try{__CLR4_5_222ea22ealusyjwn2.R.inc(96433);
        __CLR4_5_222ea22ealusyjwn2.R.inc(96434);long startYGC = TestUtils.getYoungGC();
        __CLR4_5_222ea22ealusyjwn2.R.inc(96435);long startYGCTime = TestUtils.getYoungGCTime();
        __CLR4_5_222ea22ealusyjwn2.R.inc(96436);long startFGC = TestUtils.getFullGC();

        __CLR4_5_222ea22ealusyjwn2.R.inc(96437);long startMillis = System.currentTimeMillis();
        __CLR4_5_222ea22ealusyjwn2.R.inc(96438);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_5_222ea22ealusyjwn2.R.iget(96439)!=0|true))||(__CLR4_5_222ea22ealusyjwn2.R.iget(96440)==0&false)); ++i) {{
            __CLR4_5_222ea22ealusyjwn2.R.inc(96441);encode(obj);
        }
        }__CLR4_5_222ea22ealusyjwn2.R.inc(96442);long millis = System.currentTimeMillis() - startMillis;

        __CLR4_5_222ea22ealusyjwn2.R.inc(96443);long ygc = TestUtils.getYoungGC() - startYGC;
        __CLR4_5_222ea22ealusyjwn2.R.inc(96444);long ygct = TestUtils.getYoungGCTime() - startYGCTime;
        __CLR4_5_222ea22ealusyjwn2.R.inc(96445);long fgc = TestUtils.getFullGC() - startFGC;

        __CLR4_5_222ea22ealusyjwn2.R.inc(96446);System.out.println("encode\t" + millis + ", ygc " + ygc + ", ygct " + ygct + ", fgc " + fgc);
        __CLR4_5_222ea22ealusyjwn2.R.inc(96447);return millis;
    }finally{__CLR4_5_222ea22ealusyjwn2.R.flushNeeded();}}

    static String encode(Object text) {try{__CLR4_5_222ea22ealusyjwn2.R.inc(96448);
        __CLR4_5_222ea22ealusyjwn2.R.inc(96449);return JSON.toJSONString(text);
    }finally{__CLR4_5_222ea22ealusyjwn2.R.flushNeeded();}}
}
