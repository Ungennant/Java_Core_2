package org.serf.javacore.lesson_05_p2;

public class SomeClass {
    int a;
    int b;
    int c;

    public SomeClass(int a, int b){
        this.a = a;
        this.b = b;
    }

    public SomeClass(int a, int b, int c){
        this(a, b);
        this.c = c;
    }
}
