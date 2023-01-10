package org.serf.javacore.lesson_09_p2;

public class Methods {

    private double a;
    private double b;

    public Methods(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void add() throws MyException, IllegalAccessException {
        errCheck();
        double result = a + b;
        System.out.println(result);
    }

    public void sub() throws MyException, IllegalAccessException {
        errCheck();
        double result = a - b;
        System.out.println(result);
    }

    public void multi() throws MyException, IllegalAccessException {
        errCheck();
        double result = a * b;
        System.out.println(result);
    }

    public void div() throws MyException, IllegalAccessException {
        errCheck();
        double result = a / b;
        System.out.println(result);
    }

    public void errCheck() throws IllegalAccessException, MyException {
        if(this.a<0 && this.b<0){
            throw new IllegalArgumentException("A and B smaller than zero");
        }
        if((this.a==0 && this.b!=0) || (this.a!=0 && this.b==0)){
            throw new ArithmeticException("A or B is not equals to zoro");
        }
        if(this.a==0 && this.b == 0) {
            throw new IllegalAccessException("A and B are equals to zero");
        }
        if(this.a>0 && this.b>0) {
            String alert = ("Fatal ERROR");
            throw new MyException(alert);
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
