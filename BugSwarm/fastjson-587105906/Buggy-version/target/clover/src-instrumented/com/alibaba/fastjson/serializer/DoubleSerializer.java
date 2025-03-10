/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//*
 * Copyright 1999-2018 Alibaba Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DecimalFormat;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class DoubleSerializer implements ObjectSerializer {public static class __CLR4_1_10jp3jp3luszvz3g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,25550,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final static DoubleSerializer instance      = new DoubleSerializer();

    private DecimalFormat                decimalFormat = null;

    public DoubleSerializer(){try{__CLR4_1_10jp3jp3luszvz3g.R.inc(25527);

    }finally{__CLR4_1_10jp3jp3luszvz3g.R.flushNeeded();}}

    public DoubleSerializer(DecimalFormat decimalFormat){try{__CLR4_1_10jp3jp3luszvz3g.R.inc(25528);
        __CLR4_1_10jp3jp3luszvz3g.R.inc(25529);this.decimalFormat = decimalFormat;
    }finally{__CLR4_1_10jp3jp3luszvz3g.R.flushNeeded();}}

    public DoubleSerializer(String decimalFormat){
        this(new DecimalFormat(decimalFormat));__CLR4_1_10jp3jp3luszvz3g.R.inc(25531);try{__CLR4_1_10jp3jp3luszvz3g.R.inc(25530);
    }finally{__CLR4_1_10jp3jp3luszvz3g.R.flushNeeded();}}

    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {try{__CLR4_1_10jp3jp3luszvz3g.R.inc(25532);
        __CLR4_1_10jp3jp3luszvz3g.R.inc(25533);SerializeWriter out = serializer.out;

        __CLR4_1_10jp3jp3luszvz3g.R.inc(25534);if ((((object == null)&&(__CLR4_1_10jp3jp3luszvz3g.R.iget(25535)!=0|true))||(__CLR4_1_10jp3jp3luszvz3g.R.iget(25536)==0&false))) {{
            __CLR4_1_10jp3jp3luszvz3g.R.inc(25537);out.writeNull(SerializerFeature.WriteNullNumberAsZero);
            __CLR4_1_10jp3jp3luszvz3g.R.inc(25538);return;
        }

        }__CLR4_1_10jp3jp3luszvz3g.R.inc(25539);double doubleValue = ((Double) object).doubleValue();

        __CLR4_1_10jp3jp3luszvz3g.R.inc(25540);if ((((Double.isNaN(doubleValue) //
                || Double.isInfinite(doubleValue))&&(__CLR4_1_10jp3jp3luszvz3g.R.iget(25541)!=0|true))||(__CLR4_1_10jp3jp3luszvz3g.R.iget(25542)==0&false))) {{
            __CLR4_1_10jp3jp3luszvz3g.R.inc(25543);out.writeNull();
        } }else {{
            __CLR4_1_10jp3jp3luszvz3g.R.inc(25544);if ((((decimalFormat == null)&&(__CLR4_1_10jp3jp3luszvz3g.R.iget(25545)!=0|true))||(__CLR4_1_10jp3jp3luszvz3g.R.iget(25546)==0&false))) {{
                __CLR4_1_10jp3jp3luszvz3g.R.inc(25547);out.writeDouble(doubleValue, true);
            } }else {{
                __CLR4_1_10jp3jp3luszvz3g.R.inc(25548);String doubleText = decimalFormat.format(doubleValue);
                __CLR4_1_10jp3jp3luszvz3g.R.inc(25549);out.write(doubleText);
            }
        }}
    }}finally{__CLR4_1_10jp3jp3luszvz3g.R.flushNeeded();}}
}
