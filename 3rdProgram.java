import java.util.Scanner;

class Student {
    
    int usn;
    String name;
    int credits[] = new int[5];
    int marks[] = new int[5];
    int grades[] = new int[5];
    int CGPA;
    
    
    
    static float CalculateCGPA(Student s,int NoOfCredits){
        
        int sum = 0;
        
        for(int i=0; i<s.credits.length; i++){
            sum += s.credits[i]*s.grades[i];
        }
        
        return (float)sum/NoOfCredits;
    }
    
    public static void displayStudentDetails(Student s){
           System.out.println("Student Details: ");
        System.out.println("Student USN: " + s.usn);
        System.out.println("Student Name: " + s.name);
        
         int SumOfCredits=0;
        
        
        System.out.println("Credits of 5 Subjects: ");
        for (int i = 0; i < s.credits.length; i++){ // Use s.credits.length instead of credits.size()
            SumOfCredits += s.credits[i];
            System.out.print(s.credits[i] + " ");
        }
        
        System.out.println("\nMarks of 5 Subjects: ");
        for (int i = 0; i < s.marks.length; i++) // Use s.marks.length instead of marks.size()
            System.out.print(s.marks[i] + " ");
            
    }
    
    public static void ConvertMarksToGrades(Student s){
        
         for(int i=0; i<s.marks.length; i++){
                
                if(s.marks[i] == 100)
                    s.grades[i] = 10;
                    
                else
                    s.grades[i] = (s.marks[i]+10)/10;
        }
        
        
        System.out.println("Grades of 5 Subjects: ");
        for (int i = 0; i < s.grades.length; i++) // Use s.marks.length instead of marks.size()
            System.out.print(s.grades[i] + " ");

        
    }
 
    
    public static void main(String[] args) {
        
        Student s = new Student();
        int SumOfCredits = 0;
         
       
        Scanner sc = new Scanner(System.in); // Corrected to use System.in
        
        System.out.println("Enter the USN: ");
        s.usn = sc.nextInt();
        sc.nextLine(); // Consume the newline character after nextInt()
        
        System.out.println("Enter the Name: ");
        s.name = sc.nextLine();
        
        System.out.println("Enter 5 Subject Credits: ");
        for (int i = 0; i < s.credits.length; i++) {
           
            s.credits[i] = sc.nextInt();
            SumOfCredits += s.credits[i];
        }
        System.out.println("Enter 5 Subject Marks: ");
        for (int i = 0; i < s.marks.length; i++) // Use s.marks.length instead of marks.size()
            s.marks[i] = sc.nextInt();
        
     
        displayStudentDetails(s);
            
        ConvertMarksToGrades(s);
       
            
        float res = CalculateCGPA(s,SumOfCredits);
         System.out.print("Your CGPA:  "+res);
        sc.close(); // Close the scanner
    }
}
