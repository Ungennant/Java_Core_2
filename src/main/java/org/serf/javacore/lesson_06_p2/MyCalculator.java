package org.serf.javacore.lesson_06_p2;

public class MyCalculator implements INumerable {

    private double firstNum;
    private double secondNum;

    public MyCalculator(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @Override
    public double divide() {
        return firstNum / secondNum;
    }

    @Override
    public double subtract() {
        return firstNum - secondNum;
    }

    @Override
    public double multiply() {
        return firstNum * secondNum;
    }

    @Override
    public double add() {
        return firstNum + secondNum;
    }
}
