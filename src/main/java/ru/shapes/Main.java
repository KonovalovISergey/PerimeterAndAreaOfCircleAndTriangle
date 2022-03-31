package ru.shapes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Circle circle1 = new Circle(1,1,1, Shape.Colors.DEFAULT_COLOR);
        circle1.setR(3);
        circle1.findArea();
        circle1.findPerimeter();

        Triangle triangle1 = new Triangle(2, 3, 4, 90, 30, 60, Shape.Colors.Black);
        triangle1.findArea();
        triangle1.findPerimeter();

        Scanner in = new Scanner(System.in);

        double x;
        double y;
        double r;

        System.out.println("Введите точку x окружности:");
        x = in.nextDouble();
        System.out.println("Введите точку y окружности:");
        y = in.nextDouble();
        System.out.println("Введите точку r окружности:");
        r = in.nextDouble();

        Circle circle2 = new Circle(x, y, r, Shape.Colors.DEFAULT_COLOR);

        Shape.printRepresent();

    }

}
