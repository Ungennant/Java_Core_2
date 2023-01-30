package org.serf.javacore.lesson_20;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        RunnableThread runnableThread = new RunnableThread();
        Thread thread2 = new Thread(runnableThread);

        thread1.start();
        thread1.join();
        thread2.start();
    }
}
