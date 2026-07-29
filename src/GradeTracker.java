import java.util.ArrayList;
import java.util.Scanner;

public class GradeTracker {

    static double[] cutoffs = {90, 80, 70, 60, 0};
    static char[] letters = {'A', 'B', 'C', 'D', 'F'};

    static char letterFor(double grade) {

        for (int i = 0; i < cutoffs.length; i++) {

            if (grade >= cutoffs[i]) {
                return letters[i];
            }

        }

        return 'F';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        int choice = 0;

        while (choice != 4) {

            System.out.println("===== Grade Tracker =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Class Average");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter student name: ");
                String name = sc.next();

                System.out.print("Enter student grade: ");
                double grade = sc.nextDouble();

                Student student = new Student(name, grade);

                students.add(student);

                System.out.println("Student added successfully.");

            } else if (choice == 2) {

                if (students.isEmpty()) {

                    System.out.println("No students found.");

                } else {

                    System.out.println("Student List");

                    for (Student student : students) {

                        System.out.println("Name: " + student.name);
                        System.out.println("Grade: " + student.grade);
                        System.out.println("Letter Grade: " + letterFor(student.grade));
                        System.out.println();

                    }

                }

            } else if (choice == 3) {

                if (students.isEmpty()) {

                    System.out.println("No students available.");

                } else {

                    double total = 0;

                    for (Student student : students) {

                        total = total + student.grade;

                    }

                    double average = total / students.size();

                    System.out.printf("Class Average: %.2f%n", average);
                    System.out.println("Letter Grade: " + letterFor(average));

                }

            } else if (choice == 4) {

                System.out.println("Program ended.");

            } else {

                System.out.println("Invalid choice.");

            }

        }

        sc.close();

    }

}

class Student {

    String name;
    double grade;

    Student(String name, double grade) {

        this.name = name;
        this.grade = grade;

    }

}