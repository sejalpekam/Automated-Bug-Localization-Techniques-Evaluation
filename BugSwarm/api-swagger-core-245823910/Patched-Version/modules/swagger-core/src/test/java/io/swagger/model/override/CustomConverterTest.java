package io.swagger.model.override;

import com.fasterxml.jackson.databind.JavaType;
import io.swagger.converter.ModelConverter;
import io.swagger.converter.ModelConverterContext;
import io.swagger.converter.ModelConverters;
import io.swagger.oas.models.media.Schema;
import io.swagger.util.Json;
import org.testng.annotations.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Iterator;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

public class CustomConverterTest {

    @Test(description = "it should ignore properties with type Bar")
    public void testCustomConverter() {
        // add the custom converter
        final ModelConverters converters = new ModelConverters();
        converters.addConverter(new CustomConverter());

        final Schema model = converters.read(Foo.class).get("Foo");
        assertNotNull(model);
        assertEquals(model.getProperties().size(), 1);

        final Schema barProperty = (Schema)model.getProperties().get("bar");
        assertNull(barProperty);

        final Schema titleProperty = (Schema)model.getProperties().get("title");
        assertNotNull(titleProperty);
    }

    class CustomConverter implements ModelConverter {
        @Override
        public Schema resolve(Type type, ModelConverterContext context, Annotation[] annotations,
                                        Iterator<ModelConverter> chain) {
            final JavaType jType = Json.mapper().constructType(type);
            if (jType != null) {
                final Class<?> cls = jType.getRawClass();
                if (cls.equals(Bar.class)) {
                    return null;
                } else {
                    return chain.next().resolve(type, context, annotations, chain);
                }
            } else {
                return null;
            }
        }

        @Override
        public Schema resolve(Type type, ModelConverterContext context, Iterator<ModelConverter> chain) {
            return chain.next().resolve(type, context, chain);
        }
    }

    class Foo {
        public Bar bar = null;
        public String title = null;
    }

    class Bar {
        public String foo = null;
    }
}
