package org.serf.javacore.lesson_22;

public class Test {
    public static void main(String[] args) {

        VoiceAble cat = () -> System.out.println("Meow-meow");
        cat.voice();

        VoiceAble cow = () -> System.out.println("Moo-moo");
        cow.voice();

        VoiceAble dog = () -> System.out.println("Wof-wof");
        dog.voice();

    }
}
