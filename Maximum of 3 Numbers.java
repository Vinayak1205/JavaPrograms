import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		
		int a,b,c;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the value of a: ");
		a = scanner.nextInt();
		System.out.println("Enter the value of b: ");
		b = scanner.nextInt();	
		System.out.println("Enter the value of c: ");
		c = scanner.nextInt();

		if(a > b && a > c)
			System.out.println("Largest is "+a);
		else
		if(b > c)
			System.out.println("Largest is "+b);
		else
			System.out.println("Largest is "+c);

		
		
	}
}
