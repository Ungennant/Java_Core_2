package org.serf.javacore.lesson_21;

import java.io.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ObjectWriter {

    public void writeAnnotatedFields(Object o) {
        try {
            final String FILE_PATH = "src/main/java/org/serf/javacore/lesson_21/Objects.csv";
            Writer writer = new FileWriter(FILE_PATH);
            Field[] fields = o.getClass().getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                if (field.getAnnotation(MyAnnotation.class) != null){
                   writer.write(field.getName() + "  " + field.getAnnotation(MyAnnotation.class).param());
                }
            }
            System.out.println("Serialization success");
            writer.close();
        } catch (IOException e) {
        }
    }
}
