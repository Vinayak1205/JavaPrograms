import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		
		int num;
		int n1 = 0,n2 = 1,n3;
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		num = scanner.nextInt();

		if(num >= 1)
			System.out.print(n1+" ");

		if(num >= 2)
			System.out.print(n2+" ");
		
		if(num >=3){
	
			for(int i=3; i<=num; i++){
			
				n3 = n1+n2;
				System.out.print(n3+" ");
				n1 = n2;
				n2 = n3;

			}
		}
		
		
		
	}
}
