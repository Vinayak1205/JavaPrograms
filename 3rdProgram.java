import java.util.Scanner;

class Student {
   
    String name;
    String usn;
    int[] marks = new int[5];  
    double sgpaSem1;
    double sgpaSem2;
    double cgpa;


    public Student(String name, String usn) {
        this.name = name;
        this.usn = usn;
    }

    private int calculateGradePoint(int marks) {
        if (marks >= 90) 
            return 10;
        else 
        if (marks >= 80) 
            return 9;
        else 
        if (marks >= 70) 
            return 8;
        else 
        if (marks >= 60) 
            return 7;
        else 
        if (marks >= 50) 
            return 6;
        else 
        if (marks >= 40)
            return 5;
        else return 0; 
    }


    public double calculateSGPA(int[] marks) {
        int totalGradePoints = 0;
        for (int i = 0; i < marks.length; i++) {
            totalGradePoints += calculateGradePoint(marks[i]);
        }
        return totalGradePoints / 5.0;
    }

    public void calculateCGPA() {
        this.cgpa = (this.sgpaSem1 + this.sgpaSem2) / 2.0;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("Marks: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Sgpa Sem 1: " + sgpaSem1);
        System.out.println("Sgpa Sem1r 2: " + sgpaSem2);
        System.out.println("Cgpa: " + cgpa);
        System.out.println("\n");
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        Student[] students = new Student[n];

  
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (++i) + ":");

          
            System.out.print("Enter name: ");
            scanner.nextLine(); 
            String name = scanner.nextLine();
            System.out.print("Enter USN: ");
            String usn = scanner.nextLine();

        
            students[i] = new Student(name, usn);

     
            System.out.println("Enter marks for 5 subjects (Semester 1, out of 100):");
            for (int j = 0; j < 5; j++) {
                System.out.print("Marks for subject " + (++j) + ": ");
                students[i].marks[j] = scanner.nextInt();
            }

     
            students[i].sgpaSem1 = students[i].calculateSGPA(students[i].marks);

    
            System.out.println("Enter marks for 5 subjects (Semester 2, out of 100):");
            for (int j = 0; j < 5; j++) {
                System.out.print("Marks for subject " + (j + 1) + ": ");
                students[i].marks[j] = scanner.nextInt();
            }

      
            students[i].sgpaSem2 = students[i].calculateSGPA(students[i].marks);

      
            students[i].calculateCGPA();
        }

       
        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            students[i].displayDetails();
        }

     
    }
}
