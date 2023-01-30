package org.serf.javacore.lesson_20;

import java.util.Scanner;

public class RunnableThread implements Runnable{

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to limit the Fibonacci series:");
        int choice = scanner.nextInt();
        System.out.println("===========================================");
        showFibSeqReverse(choice);
    }

    public static void showFibSeqReverse(int userNum){
        int a[] = new int[userNum];

        a[0] = 0;
        a[1] = 1;

        for (int i = 2; i < userNum; i++) {
            a[i] = a[i - 2] + a[i - 1];
        }

        for (int i = userNum - 1; i >= 0 ; i--) {
            System.out.print(a[i] + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
