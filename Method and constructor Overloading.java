import java.util.Scanner;

public class Box1 {
    int length;
    int height;
    int breadth;

    Box1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Box1(int length, int breadth,int height) {
        this.length = length;
	this.breadth = breadth;
        this.height = height;
    }

    int calculateArea(int length,int width) {
        return length * width;
    }

    int calculateArea(int length,int width,int height) {
        return length * height * width;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	System.out.print("Enter the length of Box: ");
        int length = sc.nextInt();

        System.out.print("Enter the height of Box: ");
        int height = sc.nextInt();

        System.out.print("Enter the width of Box: ");
        int breadth = sc.nextInt();

        Box1 box1 = new Box1(length, breadth);
        System.out.println("Area of Box1 with 2 parameter constructor: " + box1.calculateArea(length, breadth));

        Box1 box2 = new Box1(length, breadth,height);
        System.out.println("Area of Box1 with 3 parameter constructor: " + box2.calculateArea(length, breadth,height));
    }
}
