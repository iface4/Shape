package org.example;


public abstract class Shape {
    private String name;

    // Конструктор, що задає ім'я фігури
    public Shape(String name) {
        this.name = name;
    }

    // Метод для отримання імені фігури
    public String getName() {
        return this.name;
    }

    // Абстрактний метод для обчислення площі
    public abstract double area();

    // Статичний внутрішній клас для виведення імені фігури
    public static class ShapePrinter {
        // Метод для виведення імені фігури
        public void printShapeName(Shape shape) {
            System.out.println("Ім'я фігури: " + shape.getName());
        }
    }

    // Клас для ромба
    public static class Rhombus extends Shape {
        private double diagonal1;
        private double diagonal2;

        // Конструктор ромба
        public Rhombus(double diagonal1, double diagonal2) {
            super("Ромб");
            this.diagonal1 = diagonal1;
            this.diagonal2 = diagonal2;
        }

        // Метод для обчислення площі ромба
        @Override
        public double area() {
            return 0.5 * this.diagonal1 * this.diagonal2;
        }
    }

    // Клас для квадрата
    public static class Square extends Shape {
        private double side;

        // Конструктор квадрата
        public Square(double side) {
            super("Квадрат");
            this.side = side;
        }

        // Метод для обчислення площі квадрата
        @Override
        public double area() {
            return this.side * this.side;
        }
    }

    // Клас для трикутника
    public static class Triangle extends Shape {
        private double base;
        private double height;

        // Конструктор трикутника
        public Triangle(double base, double height) {
            super("Трикутник");
            this.base = base;
            this.height = height;
        }

        // Метод для обчислення площі трикутника
        @Override
        public double area() {
            return 0.5 * this.base * this.height;
        }
    }

    // Клас для прямокутного трикутника
    public static class RightTriangle extends Shape {
        private double base;
        private double height;

        // Конструктор прямокутного трикутника
        public RightTriangle(double base, double height) {
            super("Прямокутний трикутник");
            this.base = base;
            this.height = height;
        }

        // Метод для обчислення площі прямокутного трикутника
        @Override
        public double area() {
            return 0.5 * this.base * this.height;
        }
    }

    // Клас для прямокутника
    public static class Rectangle extends Shape {
        private double length;
        private double width;

        // Конструктор прямокутника
        public Rectangle(double length, double width) {
            super("Прямокутник");
            this.length = length;
            this.width = width;
        }

        // Метод для обчислення площі прямокутника
        @Override
        public double area() {
            return this.length * this.width;
        }
    }
}
