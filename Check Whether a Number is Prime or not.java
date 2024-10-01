mport java.util.Scanner;

public class Main{

	public static void main(String args[]){
		
		int num;
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a Number to Check Prime: ");
		num = scanner.nextInt();
		
		int i = 2;
		int flag = 0;
		while(i < num/2){
		
			if(num % i == 0){
				flag = 1;
				break;
			}

			i++;
				
		}

		if(flag == 0)
			System.out.println("Number "+num+" is Prime");
		else
			System.out.println("Number "+num+" is not a Prime");
		
	}
}
