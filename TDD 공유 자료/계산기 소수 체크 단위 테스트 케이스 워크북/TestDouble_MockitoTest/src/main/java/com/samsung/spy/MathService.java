package com.samsung.spy;
public class MathService {
    private Calculator calculator;

    public MathService(Calculator calculator) {
        this.calculator = calculator;
    }

    public int addNumbers(int a, int b) {
        return calculator.add(a, b);
    }

    public int subtractNumbers(int a, int b) {
        return calculator.subtract(a, b);
    }
}
