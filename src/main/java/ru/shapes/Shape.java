package ru.shapes;

import java.util.ArrayList;

public abstract class Shape {

    enum Colors {
        White, Black;
        public static final Colors DEFAULT_COLOR = Colors.White;
    }

    public Colors color;

    static ArrayList<Shape> represent = new ArrayList<>();

    public Shape() {
        this.color = Colors.DEFAULT_COLOR;
    }

    public Shape(Colors color) {
        this.color = color;
        represent.add(this);
    }

    public abstract void print();

    public static void printRepresent() {
        for (Shape sh : represent)
            sh.print();
    }

    public abstract void findPerimeter();
    public abstract void findArea();
}
