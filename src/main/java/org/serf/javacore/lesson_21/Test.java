package org.serf.javacore.lesson_21;

public class Test {
    public static void main(String[] args) {
        ObjectWriter ow = new ObjectWriter();
        Person person = new Person(25, "Mike", "Italian");
        ow.writeAnnotatedFields(person);
    }
}
