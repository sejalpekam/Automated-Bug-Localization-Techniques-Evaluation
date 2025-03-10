/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.serializer;

/**
 * @since 1.1.35
 */
public abstract class AfterFilter implements SerializeFilter {public static class __CLR4_5_2iqviqvlusyjmi8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,24309,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final ThreadLocal<JSONSerializer> serializerLocal = new ThreadLocal<JSONSerializer>();
    private static final ThreadLocal<Character>      seperatorLocal  = new ThreadLocal<Character>();

    private final static Character                   COMMA           = Character.valueOf(',');

    final char writeAfter(JSONSerializer serializer, Object object, char seperator) {try{__CLR4_5_2iqviqvlusyjmi8.R.inc(24295);
        __CLR4_5_2iqviqvlusyjmi8.R.inc(24296);serializerLocal.set(serializer);
        __CLR4_5_2iqviqvlusyjmi8.R.inc(24297);seperatorLocal.set(seperator);
        __CLR4_5_2iqviqvlusyjmi8.R.inc(24298);writeAfter(object);
        __CLR4_5_2iqviqvlusyjmi8.R.inc(24299);serializerLocal.set(null);
        __CLR4_5_2iqviqvlusyjmi8.R.inc(24300);return seperatorLocal.get();
    }finally{__CLR4_5_2iqviqvlusyjmi8.R.flushNeeded();}}

    protected final void writeKeyValue(String key, Object value) {try{__CLR4_5_2iqviqvlusyjmi8.R.inc(24301);
        __CLR4_5_2iqviqvlusyjmi8.R.inc(24302);JSONSerializer serializer = serializerLocal.get();
        __CLR4_5_2iqviqvlusyjmi8.R.inc(24303);char seperator = seperatorLocal.get();
        __CLR4_5_2iqviqvlusyjmi8.R.inc(24304);serializer.writeKeyValue(seperator, key, value);
        __CLR4_5_2iqviqvlusyjmi8.R.inc(24305);if ((((seperator != ',')&&(__CLR4_5_2iqviqvlusyjmi8.R.iget(24306)!=0|true))||(__CLR4_5_2iqviqvlusyjmi8.R.iget(24307)==0&false))) {{
            __CLR4_5_2iqviqvlusyjmi8.R.inc(24308);seperatorLocal.set(COMMA);
        }
    }}finally{__CLR4_5_2iqviqvlusyjmi8.R.flushNeeded();}}

    public abstract void writeAfter(Object object);
}
