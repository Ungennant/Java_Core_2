package org.serf.javacore.lesson_09_p2;

public class Test {
    public static void main(String[] args) throws IllegalAccessException, MyException {
        Methods m = new Methods(20.5, 10.5);
        m.add();
        m.div();
        m.sub();
        m.multi();
    }
}
