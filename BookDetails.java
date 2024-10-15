// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Book {
    
    String name;
    String author;
    float price;
    int num_pages;
    
    public Book(Book b,String name,String author,Float price,int num_pages){
        
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
               
    }
    
    public static void display(Book b){
        
        
        System.out.println("Books Detals: ");
            System.out.println(b.name+" "+b.author+" "+b.price+" "+b.num_pages);
    }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the no of Books: ");
        int NoOfBooks = sc.nextInt();
        
        Book b[] = new Book[NoOfBooks];
        
        for(int i = 0; i<NoOfBooks; i++){
           
            sc.nextLine();
        System.out.println("Enter name: ");
            String name = sc.nextLine();
            
        System.out.println("Enter author: ");
        
            String author = sc.nextLine();
            
        System.out.println("Enter price: ");
            float price = sc.nextFloat();
            
        System.out.println("Enter num_pages: ");
            int num_pages = sc.nextInt();
             b[i] = new Book(b[i],name,author,price,num_pages);
            
           
            
            display(b[i]);
            
        }
    
    }
}
