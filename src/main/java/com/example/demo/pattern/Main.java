package com.example.demo.pattern;

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle();
        if(s instanceof Circle c && c.test()) {
            System.out.printf("laaaa");
        }
    }

    static class Shape {
        boolean test() {
            return false;
        }
    }

    static class Circle extends Shape {
        @Override
        boolean test() {
            return false;
        }
    }
}
