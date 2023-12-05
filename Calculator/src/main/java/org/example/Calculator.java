package org.example;
public class Calculator {
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Calculator() {
    }

    int a;
    int b;

    public int add(int a, int b){

        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public double division(int a, int b) {
        return a/b;
    }
}
