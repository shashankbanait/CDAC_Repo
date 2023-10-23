/*
 * 4.Write a Java program to create an abstract class GeometricShape with abstract methods area()
and perimeter(). Create subclasses Triangle and Rectangle that extend the GeometricShape
class and implement the respective methods to calculate the area and perimeter of each shape.
 */

import java.util.Scanner;

abstract class GeometricShape {
    abstract double area();
    abstract double perimeter();
}

class Traingle extends GeometricShape{
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;
    
    public Traingle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
    
}
class Rectangle extends GeometricShape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}




public class Forth{
    public static void main(String[] args) {
        
        Traingle triangle = new Traingle(5, 4, 3, 4, 5);
        Rectangle rectangle = new Rectangle(6, 8);

        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
    }
    
}
