package org.serf.javacore.lesson_06;

public class Test {

    public static void main(String[] args) {
        FixedSalaryEmployee employee1 = new FixedSalaryEmployee(20, 80);
        HourlySalaryEmployee employee2 = new HourlySalaryEmployee(80, 15);

        System.out.println(employee1.salary());
        System.out.println(employee2.salary());
    }

}
