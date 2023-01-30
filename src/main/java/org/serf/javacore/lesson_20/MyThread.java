package org.serf.javacore.lesson_20;

import java.util.Scanner;

public class MyThread extends Thread{

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to limit the Fibonacci series:");
        int choice = scanner.nextInt();
        System.out.println("===========================================");
        showFibSeq(choice);
        System.out.println("===========================================");
    }

    public static void showFibSeq(int userNum){

       int a = 0;
       int b  = 1;
       int c = 0;

       while (userNum > 0){
           System.out.print(c + " ");
           a = b;
           b = c;
           c = a + b;
           userNum = userNum - 1;
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
        System.out.println();
    }
}
