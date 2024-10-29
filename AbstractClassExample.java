// Develop a Java program to create an abstract class named Shape that contains two integers
// and an empty method named printArea( ). Provide three classes named Rectangle, Triangle
// and Circle such that each one of the classes extends the class Shape. Each one of the classes
// contain only the method printArea( ) that prints the area of the given shape.


import java.util.Scanner;

abstract class Shape {
    int height;
    int width;

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    void printArea() {
        System.out.println("Area of Rectangle = " + height * width);
    }
}

class Circle extends Shape {
    Circle(int radius) {
        this.height = radius; 
    }

    void printArea() {
        System.out.println("Area of Circle = " + (3.142 * height * height));
    }
}

class Triangle extends Shape {
    Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * height * width));
    }
}

public class ShapeTest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Area for Circle: ");
        System.out.print("Enter the radius: ");
        int radius = sc.nextInt();
        Circle c = new Circle(radius);
        c.printArea();

        System.out.println("Area for Triangle: ");
        System.out.print("Enter the height: ");
        int height2 = sc.nextInt();
        System.out.print("Enter the base: ");
        int width2 = sc.nextInt();
        Triangle t = new Triangle(height2, width2);
        t.printArea();

        System.out.println("Area for Rectangle: ");
        System.out.print("Enter the height: ");
        int height3 = sc.nextInt();
        System.out.print("Enter the width: ");
        int width3 = sc.nextInt();
        Rectangle r = new Rectangle(height3, width3);
        r.printArea();
    }
}
