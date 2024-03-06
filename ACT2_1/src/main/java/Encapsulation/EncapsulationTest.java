
package main;

import Encapsulation.Student;
import java.util.Scanner;

public class EncapsulationTest {
    
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = null; 

        while (true) {
            System.out.print("Enter test case number (1, 2, or 3): ");
            int testCase = scanner.nextInt();
            scanner.nextLine();

            switch (testCase) {
                case 1:
                    System.out.println("Test Case " + testCase + ": Student under 18");
                    System.out.print("Enter first name: ");
                    String firstName1 = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName1 = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age1 = scanner.nextInt();
                    student1 = new Student(firstName1, lastName1, age1);
                    System.out.println(student1);
                    break;
                case 2:
                    if (student1 != null) {
                        System.out.println("Test Case " + testCase + ": Increase age of student1");
                        student1.increaseAge();
                        System.out.println(student1);
                    } else {
                        System.out.println("Error: Student1 is not initialized. Please enter test case 1 first.");
                    }
                    break;
                case 3:
                    System.out.println("Test Case " + testCase + ": Student over 18");
                    System.out.print("Enter first name: ");
                    String firstName2 = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName2 = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age2 = scanner.nextInt();
                    Student student2 = new Student(firstName2, lastName2, age2);
                    System.out.println(student2);
                    break;
                default:
                    System.out.println("Invalid test case number. Please enter 1, 2, or 3.");
                    break;
            }

            System.out.println("Do you want to continue? (yes/no)");
            String continueInput = scanner.next();
            if (!continueInput.equalsIgnoreCase("yes")) {
                break;
            }
            scanner.nextLine();
        }

        scanner.close();
    }
}
