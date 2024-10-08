import java.util.Scanner;

class Student {
    
    int usn;
    String name;
    int credits[] = new int[5];
    int marks[] = new int[5];
    int grades[] = new int[5];
    int CGPA;
    
 
    
    public static void main(String[] args) {
        
        Student s = new Student();
        
        Scanner sc = new Scanner(System.in); // Corrected to use System.in
        
        System.out.println("Enter the USN: ");
        s.usn = sc.nextInt();
        sc.nextLine(); // Consume the newline character after nextInt()
        
        System.out.println("Enter the Name: ");
        s.name = sc.nextLine();
        
        System.out.println("Enter 5 Subject Credits: ");
        for (int i = 0; i < s.credits.length; i++) 
        
            s.credits[i] = sc.nextInt();
        
        System.out.println("Enter 5 Subject Marks: ");
        for (int i = 0; i < s.marks.length; i++) // Use s.marks.length instead of marks.size()
            s.marks[i] = sc.nextInt();
        
        System.out.println("Student Details: ");
        System.out.println("Student USN: " + s.usn);
        System.out.println("Student Name: " + s.name);
        
        System.out.println("Credits of 5 Subjects: ");
        for (int i = 0; i < s.credits.length; i++) // Use s.credits.length instead of credits.size()
            System.out.print(s.credits[i] + " ");
        
        System.out.println("\nMarks of 5 Subjects: ");
        for (int i = 0; i < s.marks.length; i++) // Use s.marks.length instead of marks.size()
            System.out.print(s.marks[i] + " ");
            
            
        for(int i=0; i<s.marks.length; i++){
                
                if(s.marks[i] == 100)
                    s.grades[i] = 10;
                    
                else
                    s.grades[i] = (s.marks[i]+10)/10;
        }
        
        
        System.out.println("Grades of 5 Subjects: ");
        for (int i = 0; i < s.grades.length; i++) // Use s.marks.length instead of marks.size()
            System.out.print(s.grades[i] + " ");
            
        
        sc.close(); // Close the scanner
    }
}
