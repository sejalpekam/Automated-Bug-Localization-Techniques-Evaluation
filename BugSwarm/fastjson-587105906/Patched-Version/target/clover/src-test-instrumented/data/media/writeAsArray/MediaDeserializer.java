/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package data.media.writeAsArray;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

import data.media.Media;
import data.media.Media.Player;

public class MediaDeserializer implements ObjectDeserializer {public static class __CLR4_5_2296y296ylusyjxcv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,105262,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("unchecked")
    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_2296y296ylusyjxcv.R.inc(105226);
        __CLR4_5_2296y296ylusyjxcv.R.inc(105227);final JSONLexer lexer = parser.getLexer();

        __CLR4_5_2296y296ylusyjxcv.R.inc(105228);if ((((lexer.token() != JSONToken.LBRACKET)&&(__CLR4_5_2296y296ylusyjxcv.R.iget(105229)!=0|true))||(__CLR4_5_2296y296ylusyjxcv.R.iget(105230)==0&false))) {{
            __CLR4_5_2296y296ylusyjxcv.R.inc(105231);throw new JSONException("error");
        }

        }__CLR4_5_2296y296ylusyjxcv.R.inc(105232);Media media = new Media();

        __CLR4_5_2296y296ylusyjxcv.R.inc(105233);int bitrate = lexer.scanInt(',');
        __CLR4_5_2296y296ylusyjxcv.R.inc(105234);int height = lexer.scanInt(',');
        __CLR4_5_2296y296ylusyjxcv.R.inc(105235);int width = lexer.scanInt(',');
        __CLR4_5_2296y296ylusyjxcv.R.inc(105236);String copyright = lexer.scanString(',');
        __CLR4_5_2296y296ylusyjxcv.R.inc(105237);long duration = lexer.scanLong(',');
        __CLR4_5_2296y296ylusyjxcv.R.inc(105238);String format = lexer.scanString(',');

        __CLR4_5_2296y296ylusyjxcv.R.inc(105239);List<String> persons = new ArrayList<String>();
        __CLR4_5_2296y296ylusyjxcv.R.inc(105240);lexer.scanStringArray(persons, ',');

        __CLR4_5_2296y296ylusyjxcv.R.inc(105241);String playerName = lexer.scanSymbolWithSeperator(parser.getSymbolTable(), ',');
        __CLR4_5_2296y296ylusyjxcv.R.inc(105242);long size = lexer.scanLong(',');
        __CLR4_5_2296y296ylusyjxcv.R.inc(105243);String title = lexer.scanString(',');
        __CLR4_5_2296y296ylusyjxcv.R.inc(105244);String uri = lexer.scanString(']');

        __CLR4_5_2296y296ylusyjxcv.R.inc(105245);lexer.nextToken(JSONToken.COMMA);

        __CLR4_5_2296y296ylusyjxcv.R.inc(105246);media.setBitrate(bitrate);
        __CLR4_5_2296y296ylusyjxcv.R.inc(105247);media.setHeight(height);
        __CLR4_5_2296y296ylusyjxcv.R.inc(105248);media.setWidth(width);
        __CLR4_5_2296y296ylusyjxcv.R.inc(105249);media.setCopyright(copyright);
        __CLR4_5_2296y296ylusyjxcv.R.inc(105250);media.setDuration(duration);
        __CLR4_5_2296y296ylusyjxcv.R.inc(105251);media.setFormat(format);
        __CLR4_5_2296y296ylusyjxcv.R.inc(105252);media.setPersons(persons);
        __CLR4_5_2296y296ylusyjxcv.R.inc(105253);media.setPlayer((((playerName == null )&&(__CLR4_5_2296y296ylusyjxcv.R.iget(105254)!=0|true))||(__CLR4_5_2296y296ylusyjxcv.R.iget(105255)==0&false))? null : Player.valueOf(playerName));
        __CLR4_5_2296y296ylusyjxcv.R.inc(105256);media.setSize(size);
        __CLR4_5_2296y296ylusyjxcv.R.inc(105257);media.setTitle(title);
        __CLR4_5_2296y296ylusyjxcv.R.inc(105258);media.setUri(uri);

        __CLR4_5_2296y296ylusyjxcv.R.inc(105259);return (T) media;

    }finally{__CLR4_5_2296y296ylusyjxcv.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_5_2296y296ylusyjxcv.R.inc(105260);
        __CLR4_5_2296y296ylusyjxcv.R.inc(105261);return JSONToken.LBRACKET;
    }finally{__CLR4_5_2296y296ylusyjxcv.R.flushNeeded();}}

}
