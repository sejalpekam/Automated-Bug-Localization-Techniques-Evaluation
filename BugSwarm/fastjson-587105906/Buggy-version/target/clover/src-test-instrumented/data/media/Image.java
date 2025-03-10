/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package data.media;

import static data.ReprUtil.repr;

public class Image implements java.io.Serializable {public static class __CLR4_1_1029dv29dvluszwj0u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,105560,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 1L;

    public enum Size {
        SMALL, LARGE
    }

    public int    height;
    public Size   size;
    public String title; // Can be null
    public String uri;
    public int    width;
    
    public Image(){try{__CLR4_1_1029dv29dvluszwj0u.R.inc(105475);
    }finally{__CLR4_1_1029dv29dvluszwj0u.R.flushNeeded();}}

    public Image(String uri, String title, int width, int height, Size size){try{__CLR4_1_1029dv29dvluszwj0u.R.inc(105476);
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105477);this.height = height;
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105478);this.title = title;
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105479);this.uri = uri;
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105480);this.width = width;
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105481);this.size = size;
    }finally{__CLR4_1_1029dv29dvluszwj0u.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_1_1029dv29dvluszwj0u.R.inc(105482);
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105483);if ((((this == o)&&(__CLR4_1_1029dv29dvluszwj0u.R.iget(105484)!=0|true))||(__CLR4_1_1029dv29dvluszwj0u.R.iget(105485)==0&false))) {__CLR4_1_1029dv29dvluszwj0u.R.inc(105486);return true;
        }__CLR4_1_1029dv29dvluszwj0u.R.inc(105487);if ((((o == null || getClass() != o.getClass())&&(__CLR4_1_1029dv29dvluszwj0u.R.iget(105488)!=0|true))||(__CLR4_1_1029dv29dvluszwj0u.R.iget(105489)==0&false))) {__CLR4_1_1029dv29dvluszwj0u.R.inc(105490);return false;

        }__CLR4_1_1029dv29dvluszwj0u.R.inc(105491);Image image = (Image) o;

        __CLR4_1_1029dv29dvluszwj0u.R.inc(105492);if ((((height != image.height)&&(__CLR4_1_1029dv29dvluszwj0u.R.iget(105493)!=0|true))||(__CLR4_1_1029dv29dvluszwj0u.R.iget(105494)==0&false))) {__CLR4_1_1029dv29dvluszwj0u.R.inc(105495);return false;
        }__CLR4_1_1029dv29dvluszwj0u.R.inc(105496);if ((((width != image.width)&&(__CLR4_1_1029dv29dvluszwj0u.R.iget(105497)!=0|true))||(__CLR4_1_1029dv29dvluszwj0u.R.iget(105498)==0&false))) {__CLR4_1_1029dv29dvluszwj0u.R.inc(105499);return false;
        }__CLR4_1_1029dv29dvluszwj0u.R.inc(105500);if ((((size != image.size)&&(__CLR4_1_1029dv29dvluszwj0u.R.iget(105501)!=0|true))||(__CLR4_1_1029dv29dvluszwj0u.R.iget(105502)==0&false))) {__CLR4_1_1029dv29dvluszwj0u.R.inc(105503);return false;
        }__CLR4_1_1029dv29dvluszwj0u.R.inc(105504);if (((((((title != null )&&(__CLR4_1_1029dv29dvluszwj0u.R.iget(105505)!=0|true))||(__CLR4_1_1029dv29dvluszwj0u.R.iget(105506)==0&false))? !title.equals(image.title) : image.title != null)&&(__CLR4_1_1029dv29dvluszwj0u.R.iget(105507)!=0|true))||(__CLR4_1_1029dv29dvluszwj0u.R.iget(105508)==0&false))) {__CLR4_1_1029dv29dvluszwj0u.R.inc(105509);return false;
        }__CLR4_1_1029dv29dvluszwj0u.R.inc(105510);if (((((((uri != null )&&(__CLR4_1_1029dv29dvluszwj0u.R.iget(105511)!=0|true))||(__CLR4_1_1029dv29dvluszwj0u.R.iget(105512)==0&false))? !uri.equals(image.uri) : image.uri != null)&&(__CLR4_1_1029dv29dvluszwj0u.R.iget(105513)!=0|true))||(__CLR4_1_1029dv29dvluszwj0u.R.iget(105514)==0&false))) {__CLR4_1_1029dv29dvluszwj0u.R.inc(105515);return false;

        }__CLR4_1_1029dv29dvluszwj0u.R.inc(105516);return true;
    }finally{__CLR4_1_1029dv29dvluszwj0u.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_1_1029dv29dvluszwj0u.R.inc(105517);
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105518);int result = (((uri != null )&&(__CLR4_1_1029dv29dvluszwj0u.R.iget(105519)!=0|true))||(__CLR4_1_1029dv29dvluszwj0u.R.iget(105520)==0&false))? uri.hashCode() : 0;
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105521);result = 31 * result + ((((title != null )&&(__CLR4_1_1029dv29dvluszwj0u.R.iget(105522)!=0|true))||(__CLR4_1_1029dv29dvluszwj0u.R.iget(105523)==0&false))? title.hashCode() : 0);
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105524);result = 31 * result + width;
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105525);result = 31 * result + height;
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105526);result = 31 * result + ((((size != null )&&(__CLR4_1_1029dv29dvluszwj0u.R.iget(105527)!=0|true))||(__CLR4_1_1029dv29dvluszwj0u.R.iget(105528)==0&false))? size.hashCode() : 0);
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105529);return result;
    }finally{__CLR4_1_1029dv29dvluszwj0u.R.flushNeeded();}}

    public String toString() {try{__CLR4_1_1029dv29dvluszwj0u.R.inc(105530);
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105531);StringBuilder sb = new StringBuilder();
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105532);sb.append("[Image ");
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105533);sb.append("uri=").append(repr(uri));
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105534);sb.append(", title=").append(repr(title));
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105535);sb.append(", width=").append(width);
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105536);sb.append(", height=").append(height);
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105537);sb.append(", size=").append(size);
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105538);sb.append("]");
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105539);return sb.toString();
    }finally{__CLR4_1_1029dv29dvluszwj0u.R.flushNeeded();}}

    public void setUri(String uri) {try{__CLR4_1_1029dv29dvluszwj0u.R.inc(105540);
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105541);this.uri = uri;
    }finally{__CLR4_1_1029dv29dvluszwj0u.R.flushNeeded();}}

    public void setTitle(String title) {try{__CLR4_1_1029dv29dvluszwj0u.R.inc(105542);
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105543);this.title = title;
    }finally{__CLR4_1_1029dv29dvluszwj0u.R.flushNeeded();}}

    public void setWidth(int width) {try{__CLR4_1_1029dv29dvluszwj0u.R.inc(105544);
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105545);this.width = width;
    }finally{__CLR4_1_1029dv29dvluszwj0u.R.flushNeeded();}}

    public void setHeight(int height) {try{__CLR4_1_1029dv29dvluszwj0u.R.inc(105546);
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105547);this.height = height;
    }finally{__CLR4_1_1029dv29dvluszwj0u.R.flushNeeded();}}

    public void setSize(Size size) {try{__CLR4_1_1029dv29dvluszwj0u.R.inc(105548);
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105549);this.size = size;
    }finally{__CLR4_1_1029dv29dvluszwj0u.R.flushNeeded();}}

    public String getUri() {try{__CLR4_1_1029dv29dvluszwj0u.R.inc(105550);
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105551);return uri;
    }finally{__CLR4_1_1029dv29dvluszwj0u.R.flushNeeded();}}

    public String getTitle() {try{__CLR4_1_1029dv29dvluszwj0u.R.inc(105552);
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105553);return title;
    }finally{__CLR4_1_1029dv29dvluszwj0u.R.flushNeeded();}}

    public int getWidth() {try{__CLR4_1_1029dv29dvluszwj0u.R.inc(105554);
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105555);return width;
    }finally{__CLR4_1_1029dv29dvluszwj0u.R.flushNeeded();}}

    public int getHeight() {try{__CLR4_1_1029dv29dvluszwj0u.R.inc(105556);
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105557);return height;
    }finally{__CLR4_1_1029dv29dvluszwj0u.R.flushNeeded();}}

    public Size getSize() {try{__CLR4_1_1029dv29dvluszwj0u.R.inc(105558);
        __CLR4_1_1029dv29dvluszwj0u.R.inc(105559);return size;
    }finally{__CLR4_1_1029dv29dvluszwj0u.R.flushNeeded();}}
}
