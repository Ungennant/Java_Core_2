package org.serf.javacore.lesson_19;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

           Methods serializer = new Methods();
//        Employee employee = new Employee(1, "Daniel", 2000);

//        serializer.serialize(employee);

//        serializer.deserialize();

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(2, "Colin", 2350));
        employeeList.add(new Employee(3, "Adam", 2900));
        employeeList.add(new Employee(4, "Roby", 4350));
        employeeList.add(new Employee(5, "Jane", 2850));

        serializer.serialize(employeeList);
        serializer.deserialize(employeeList);

    }
}
