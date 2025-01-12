package com.samsung.spy;
public class MathService2 {
    private Calculator2 calculator;

    public MathService2(Calculator2 calculator) {

        this.calculator = calculator;
    }

    public int addNumbers(int a, int b) {

        return calculator.add(a, b);
    }

    public int subtractNumbers(int a, int b) {

        return calculator.subtract(a, b);
    }
}
