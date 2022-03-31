package ru.shapes;

public class Circle extends Shape{

    private double x;
    private double y;
    private double r;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if (r>0)
            this.r = r;
        else
            throw new RuntimeException("Радиус < 0!");
    }

    public Circle(double x, double y, double r, Colors color) {
        super(color);
        setX(x);
        setY(y);
        setR(r);
    }

    @Override
    public void print() {
        System.out.printf("Окружность (%.2f, %.2f) радиуса:%.2f цвета:%s\n", getX(), getY(), getR(), color);
    }

    @Override
    public void findPerimeter() {
        double perimeter = 2*getR()*Math.PI;
        System.out.printf("Периметр окружности (x:%.2f, y:%.2f) радиуса:%.2f цвета:%s равен:%.2f\n", getX(), getY(), getR(), color, perimeter);
    }

    @Override
    public void findArea() {
        double area = Math.PI*Math.pow(getR(), 2);
        System.out.printf("Площадь окружности (x:%.2f, y:%.2f) радиуса:%.2f цвета:%s равна:%.2f\n", getX(), getY(), getR(), color, area);
    }
}
