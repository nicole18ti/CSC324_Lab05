package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // scanner for user to input data
        double gpa = 0;
System.out.print("Please enter James's GPA: ");
        // ToDo 5: Fix the error - done
        // ToDo 6: Fix the constructor of Student class - done
        // Todo 7: Create two classes for Freshman and Senior - done
        // ToDo 8: The senior class should have a minimum of 85 credits  - done
        // ToDo 9: Add a toString method for Freshman class - done
        // ToDo 10: Add a toString method for Senior class - done
        
        
        Student s1 = new Freshman("James", (short) 20, 12); // name, gpa, credits

        Student s2 = new Senior("John", (short) 30, 90); // make them work by converting the int to short type

       

        double input1 = scanner.nextDouble();
        s1.setGPA(input1);
        System.out.println(s1);

        System.out.print("Please enter John's GPA: ");
        double input2 = scanner.nextDouble();
        s2.setGPA(input2);
        System.out.println(s2);
        // ToDo 11: Set the gpa of the student using the scanner and user
        // 			input and then print the output. - done
        

        // ToDo 12: add comments and explain your code - done
        // ToDo 13: submit using a pull request. 
    }

}
