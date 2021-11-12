package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public double divide(int y) {
        return (double) y / (double) x;
    }

    public double sumAllOperation(int y) {
        return (sum(y) + multiply(y) + minus(y) + divide(y));
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println("Operation \"sum\": result = " + result);
        result = minus(10);
        System.out.println("Operation \"minus\": result = " + result);
        Calculator calculator = new Calculator();
        result = calculator.multiply(5);
        System.out.println("Operation \"multiply\": result = " + result);
        double rsl = calculator.divide(2);
        System.out.println("Operation \"divide\": result = " + rsl);
        rsl = calculator.sumAllOperation(5);
        System.out.println("Operation \"sumAllOperation\": result = " + rsl);
    }
}
