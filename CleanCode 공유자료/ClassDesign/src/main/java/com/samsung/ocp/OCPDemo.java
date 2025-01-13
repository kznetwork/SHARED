package com.samsung.ocp;

// 추상 클래스: 도형의 기본 설계
abstract class Shape {
    public abstract double calculateArea();
}

// 사각형 클래스
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// 원 클래스
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// 삼각형 클래스
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// OCP 데모 클래스
public class OCPDemo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10); // 사각형
        Shape circle = new Circle(7);           // 원
        Shape triangle = new Triangle(6, 8);    // 삼각형

        System.out.println("사각형 넓이: " + rectangle.calculateArea());
        System.out.println("원 넓이: " + circle.calculateArea());
        System.out.println("삼각형 넓이: " + triangle.calculateArea());
    }
}
