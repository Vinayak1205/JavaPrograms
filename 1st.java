
import java.util.Scanner;
class TypeCast {
    public static void main(String args[]) {
    
  
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Bytes allocated for a variable is: " + Integer.BYTES);         
        short b = (short) a;
       
        System.out.println("Bytes allocated for b variable is: " + Short.BYTES); 
         long  c = (long) a;
        
        System.out.println("Bytes allocated for c variable is: " + Long.BYTES);
         double  d = (double) a;
         
        System.out.println("Bytes allocated for d variable is: " + Double.BYTES);
           float  e = (float) a;
         
        System.out.println("Bytes allocated for e variable is: " + Float.BYTES);
  }
}
