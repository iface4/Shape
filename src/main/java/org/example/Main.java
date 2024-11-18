package org.example;

import org.example.Shape;

public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкти різних фігур
        Shape square = new Shape.Square(5); // Квадрат зі стороною 5
        Shape rhombus = new Shape.Rhombus(6, 8); // Ромб з діагоналями 6 та 8
        Shape triangle = new Shape.Triangle(4, 7); // Трикутник з основою 4 та висотою 7
        Shape rightTriangle = new Shape.RightTriangle(3, 4); // Прямокутний трикутник з основою 3 та висотою 4
        Shape rectangle = new Shape.Rectangle(5, 10); // Прямокутник з довжиною 5 та шириною 10

        // Створюємо об'єкт для друку інформації про фігури
        Shape.ShapePrinter printer = new Shape.ShapePrinter();

        // Виводимо ім'я та площу кожної фігури
        printer.printShapeName(square);
        System.out.println("Площа: " + square.area() + "\n");

        printer.printShapeName(rhombus);
        System.out.println("Площа: " + rhombus.area() + "\n");

        printer.printShapeName(triangle);
        System.out.println("Площа: " + triangle.area() + "\n");

        printer.printShapeName(rightTriangle);
        System.out.println("Площа: " + rightTriangle.area() + "\n");

        printer.printShapeName(rectangle);
        System.out.println("Площа: " + rectangle.area() + "\n");
    }
}