// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
      
        int  a,b,c,d;
        double r1,r2;
        
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if(a == 0)
            System.out.println("Not A valid Quadratic Eqn");
        else{
            
            d = b*b-4*a*c;
            
            if(d == 0){
                r1 = -b/(2*a);
                r2 = r1;
                System.out.println("root 1: "+r1);
                System.out.println("root 2: "+r2);
            }
            else
            
            if(d > 0){
                
                r1 = -b/(2*a)+Math.sqrt(d)/(2*a);
                r2 = -b/(2*a)-Math.sqrt(d)/(2*a);
                System.out.println("root 1: "+r1);
                System.out.println("root 2: "+r2);
            }
            else
                System.out.println("Non Real Solutions");
                
        }
        
        
    }
}
