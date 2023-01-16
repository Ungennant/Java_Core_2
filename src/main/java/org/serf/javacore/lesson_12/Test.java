package org.serf.javacore.lesson_12;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rand1 = random.nextInt(1+10);

        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < rand1; i++) {
                carList.add(new Car(random.nextInt(250),random.nextInt(2023),
                        new SteeringWheel(random.nextInt(10),"leather"), new Engine(random.nextInt(10))));
        }

        System.out.println("1. Display arr of cars");
        System.out.println("2. For all objects of this array, fill the same object of Car");
        System.out.println("Choose one of above to start. Just enter 1 or 2");
        int choice = scanner.nextInt();
        if(choice == 1 || choice == 2){
            switch (choice) {
                case (1):
                    for (Car car : carList) {
                        System.out.println(car);
                    }
                    break;
                case (2):
                    Car car = new Car(250, 2020, new SteeringWheel(25, "leather"), new Engine(10));
                    for (int i = 0; i <rand1; i++) {
                        carList.add(i, car);
                        System.out.println(carList);
                    }
                    break;
                default:
                    System.out.println("Incorrect input.");
            }
        } else {
            System.out.println("Please try to choose again.");
        }
        scanner.close();
    }
}
