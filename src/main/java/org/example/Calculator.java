package org.example;

public class Calculator {

    public Calculator() {
    }

    public float add(int a, int b) {
        return a + b;
    }

    public float subtract(int a, int b) {
        return a - b;
    }

    public float multiply(int a, int b) {
        return a * b;
    }

    public String divide(int a, int b) {
        if (b == 0) return "Divide by 0 is impossible";
        float result = (float) a / b;
        return String.valueOf(result);
    }
}
