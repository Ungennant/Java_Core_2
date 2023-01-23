package org.serf.javacore.lesson_16;

import java.io.Serializable;
import java.lang.reflect.*;

public class Test implements Serializable {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        Class personClass = Person.class;

        String className = personClass.getName();
        System.out.println("Name of class: " + className);

        String simpleClassName = personClass.getSimpleName();
        System.out.println("Simple name of class:" + simpleClassName);

        int modifier = personClass.getModifiers();
        String modifierInfo = Modifier.toString(modifier);
        System.out.println("Class modifiers:" + modifierInfo + " int value: " + modifier);

        System.out.println("Is public? " + Modifier.isPublic(modifier));
        System.out.println("Package: " + personClass.getPackageName());

        Class superClass = personClass.getSuperclass();
        System.out.println("Super class: " + superClass);

        Constructor<Person>[] personConstructor = personClass.getConstructors();
        for (Constructor<Person> constructor : personConstructor) {
            System.out.println("Constructor " + constructor);
        }
        System.out.println("Total of constructors: " + personConstructor.length);

        Constructor<Person> constructor = personClass.getConstructor(String.class, String.class, int.class, int.class, double.class, double.class);
        System.out.println("Single constructor: " + constructor);
        Person newInstance = constructor.newInstance("Dave", "Jones", 30, 1992, 185.5, 79.2);
        System.out.println("Reflection Person: " + newInstance);

        Field[] fields = personClass.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            System.out.println(field);
        }


        Field nameField = fields[0];
        nameField.setAccessible(true);
        nameField.set(newInstance, "John");
        System.out.println("Person with new name: " + newInstance);

        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        Person newInstance1 =  constructor.newInstance("Colin", "Mills", 28, 1995, 179.1, 81);

        Method methodCall1 = newInstance1.getClass().getMethod("myMethod", String.class);
        Method methodCall2 = newInstance1.getClass().getMethod("myMethod", String.class, int[].class);

        methodCall1.invoke(newInstance1, "Some args...");
        methodCall2.invoke(newInstance1, "Some args...", new int[]{1,2,3,4,5});

    }
}
