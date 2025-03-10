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

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class StringCodec implements ObjectSerializer, ObjectDeserializer {public static class __CLR4_1_10oe0oe0luszw09e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,31674,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static StringCodec instance = new StringCodec();

    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features)
                                                                                                               throws IOException {try{__CLR4_1_10oe0oe0luszw09e.R.inc(31608);
        __CLR4_1_10oe0oe0luszw09e.R.inc(31609);write(serializer, (String) object);
    }finally{__CLR4_1_10oe0oe0luszw09e.R.flushNeeded();}}

    public void write(JSONSerializer serializer, String value) {try{__CLR4_1_10oe0oe0luszw09e.R.inc(31610);
        __CLR4_1_10oe0oe0luszw09e.R.inc(31611);SerializeWriter out = serializer.out;

        __CLR4_1_10oe0oe0luszw09e.R.inc(31612);if ((((value == null)&&(__CLR4_1_10oe0oe0luszw09e.R.iget(31613)!=0|true))||(__CLR4_1_10oe0oe0luszw09e.R.iget(31614)==0&false))) {{
            __CLR4_1_10oe0oe0luszw09e.R.inc(31615);out.writeNull(SerializerFeature.WriteNullStringAsEmpty);
            __CLR4_1_10oe0oe0luszw09e.R.inc(31616);return;
        }

        }__CLR4_1_10oe0oe0luszw09e.R.inc(31617);out.writeString(value);
    }finally{__CLR4_1_10oe0oe0luszw09e.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public <T> T deserialze(DefaultJSONParser parser, Type clazz, Object fieldName) {try{__CLR4_1_10oe0oe0luszw09e.R.inc(31618);
        __CLR4_1_10oe0oe0luszw09e.R.inc(31619);if ((((clazz == StringBuffer.class)&&(__CLR4_1_10oe0oe0luszw09e.R.iget(31620)!=0|true))||(__CLR4_1_10oe0oe0luszw09e.R.iget(31621)==0&false))) {{
            __CLR4_1_10oe0oe0luszw09e.R.inc(31622);final JSONLexer lexer = parser.lexer;
            __CLR4_1_10oe0oe0luszw09e.R.inc(31623);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_1_10oe0oe0luszw09e.R.iget(31624)!=0|true))||(__CLR4_1_10oe0oe0luszw09e.R.iget(31625)==0&false))) {{
                __CLR4_1_10oe0oe0luszw09e.R.inc(31626);String val = lexer.stringVal();
                __CLR4_1_10oe0oe0luszw09e.R.inc(31627);lexer.nextToken(JSONToken.COMMA);

                __CLR4_1_10oe0oe0luszw09e.R.inc(31628);return (T) new StringBuffer(val);
            }

            }__CLR4_1_10oe0oe0luszw09e.R.inc(31629);Object value = parser.parse();

            __CLR4_1_10oe0oe0luszw09e.R.inc(31630);if ((((value == null)&&(__CLR4_1_10oe0oe0luszw09e.R.iget(31631)!=0|true))||(__CLR4_1_10oe0oe0luszw09e.R.iget(31632)==0&false))) {{
                __CLR4_1_10oe0oe0luszw09e.R.inc(31633);return null;
            }

            }__CLR4_1_10oe0oe0luszw09e.R.inc(31634);return (T) new StringBuffer(value.toString());
        }

        }__CLR4_1_10oe0oe0luszw09e.R.inc(31635);if ((((clazz == StringBuilder.class)&&(__CLR4_1_10oe0oe0luszw09e.R.iget(31636)!=0|true))||(__CLR4_1_10oe0oe0luszw09e.R.iget(31637)==0&false))) {{
            __CLR4_1_10oe0oe0luszw09e.R.inc(31638);final JSONLexer lexer = parser.lexer;
            __CLR4_1_10oe0oe0luszw09e.R.inc(31639);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_1_10oe0oe0luszw09e.R.iget(31640)!=0|true))||(__CLR4_1_10oe0oe0luszw09e.R.iget(31641)==0&false))) {{
                __CLR4_1_10oe0oe0luszw09e.R.inc(31642);String val = lexer.stringVal();
                __CLR4_1_10oe0oe0luszw09e.R.inc(31643);lexer.nextToken(JSONToken.COMMA);

                __CLR4_1_10oe0oe0luszw09e.R.inc(31644);return (T) new StringBuilder(val);
            }

            }__CLR4_1_10oe0oe0luszw09e.R.inc(31645);Object value = parser.parse();

            __CLR4_1_10oe0oe0luszw09e.R.inc(31646);if ((((value == null)&&(__CLR4_1_10oe0oe0luszw09e.R.iget(31647)!=0|true))||(__CLR4_1_10oe0oe0luszw09e.R.iget(31648)==0&false))) {{
                __CLR4_1_10oe0oe0luszw09e.R.inc(31649);return null;
            }

            }__CLR4_1_10oe0oe0luszw09e.R.inc(31650);return (T) new StringBuilder(value.toString());
        }

        }__CLR4_1_10oe0oe0luszw09e.R.inc(31651);return (T) deserialze(parser);
    }finally{__CLR4_1_10oe0oe0luszw09e.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public static <T> T deserialze(DefaultJSONParser parser) {try{__CLR4_1_10oe0oe0luszw09e.R.inc(31652);
        __CLR4_1_10oe0oe0luszw09e.R.inc(31653);final JSONLexer lexer = parser.getLexer();
        __CLR4_1_10oe0oe0luszw09e.R.inc(31654);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_1_10oe0oe0luszw09e.R.iget(31655)!=0|true))||(__CLR4_1_10oe0oe0luszw09e.R.iget(31656)==0&false))) {{
            __CLR4_1_10oe0oe0luszw09e.R.inc(31657);String val = lexer.stringVal();
            __CLR4_1_10oe0oe0luszw09e.R.inc(31658);lexer.nextToken(JSONToken.COMMA);
            __CLR4_1_10oe0oe0luszw09e.R.inc(31659);return (T) val;
        }

        }__CLR4_1_10oe0oe0luszw09e.R.inc(31660);if ((((lexer.token() == JSONToken.LITERAL_INT)&&(__CLR4_1_10oe0oe0luszw09e.R.iget(31661)!=0|true))||(__CLR4_1_10oe0oe0luszw09e.R.iget(31662)==0&false))) {{
            __CLR4_1_10oe0oe0luszw09e.R.inc(31663);String val = lexer.numberString();
            __CLR4_1_10oe0oe0luszw09e.R.inc(31664);lexer.nextToken(JSONToken.COMMA);
            __CLR4_1_10oe0oe0luszw09e.R.inc(31665);return (T) val;
        }

        }__CLR4_1_10oe0oe0luszw09e.R.inc(31666);Object value = parser.parse();

        __CLR4_1_10oe0oe0luszw09e.R.inc(31667);if ((((value == null)&&(__CLR4_1_10oe0oe0luszw09e.R.iget(31668)!=0|true))||(__CLR4_1_10oe0oe0luszw09e.R.iget(31669)==0&false))) {{
            __CLR4_1_10oe0oe0luszw09e.R.inc(31670);return null;
        }

        }__CLR4_1_10oe0oe0luszw09e.R.inc(31671);return (T) value.toString();
    }finally{__CLR4_1_10oe0oe0luszw09e.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_1_10oe0oe0luszw09e.R.inc(31672);
        __CLR4_1_10oe0oe0luszw09e.R.inc(31673);return JSONToken.LITERAL_STRING;
    }finally{__CLR4_1_10oe0oe0luszw09e.R.flushNeeded();}}
}
