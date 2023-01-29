package org.serf.javacore.lesson_19;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Methods {

    public void serialize(Employee employee) {
        try {
            final String FILE_PATH = "src/main/java/org/serf/javacore/lesson_19/Employees.csv";
            FileOutputStream fos = new FileOutputStream(FILE_PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(employee);
            System.out.println("Serialization success");

            oos.close();
            fos.close();
        } catch (IOException e) {


        }
    }

    public void serialize(List<Employee> list){
        final String FILE_PATH = "src/main/java/org/serf/javacore/lesson_19/Employees2.csv";
        try {
            FileOutputStream fos = new FileOutputStream(FILE_PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.flush();

            oos.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deserialize() {
        final String FILE_PATH = "src/main/java/org/serf/javacore/lesson_19/Employees.csv";
        try {
            FileInputStream fis = new FileInputStream(FILE_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee employee = (Employee) ois.readObject();
            System.out.println(employee);

            fis.close();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void deserialize(List<Employee> list){
        final String FILE_PATH = "src/main/java/org/serf/javacore/lesson_19/Employees2.csv";
        ArrayList<Employee> employees = null;
        try {
            FileInputStream fis = new FileInputStream(FILE_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            employees = (ArrayList<Employee>) ois.readObject();
            for (Employee employee : employees) {
                System.out.println(employee);
            }
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}
