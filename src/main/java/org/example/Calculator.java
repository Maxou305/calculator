package org.example;

public class Calculator {

    public Calculator() {
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public String divide(int a, int b) {
        if (b == 0) return "Divide by 0 is impossible";
        
        return String.valueOf(a / b);
    }
}
