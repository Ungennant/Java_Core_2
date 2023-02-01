package org.serf.javacore.lesson_21;

public class Person {

    @MyAnnotation
    private int age;

    @MyAnnotation
    private String name;

    @MyAnnotation
    private String nationality;

    public Person(int age, String name, String nationality) {
        this.age = age;
        this.name = name;
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
