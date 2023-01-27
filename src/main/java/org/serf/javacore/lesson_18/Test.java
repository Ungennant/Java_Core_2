package org.serf.javacore.lesson_18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.keySet();
        //Створюємо список параметризований String
        List<String> stringNumbers = new ArrayList<>();

        stringNumbers.add("1");
        stringNumbers.add("2");
        stringNumbers.add("3");

        //Конвертуємо список String в список Integer
        List<Integer> integerList = stringNumbers.stream().map(Integer::parseInt).collect(Collectors.toList());

        for (Integer integer : integerList) {
            System.out.println(integer);
            System.out.println(integer instanceof Integer);
        }
    }

}
