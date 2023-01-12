package org.serf.javacore.lesson_10;

import java.util.Locale;

public class ÑharacterReplacer {
    public static void main(String[] args) {

        String o = new String("You are empty.");
        String n = o.toLowerCase().replaceAll("[aeiouy]", "-");
        System.out.println(n);

    }
}
