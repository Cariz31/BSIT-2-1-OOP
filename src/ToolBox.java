
import java.util.Scanner;

public class ToolBox {

    // Task 1
    static String greet(String name) {
        return "Hello, " + name + "! Welcome to my Java Toolbox.";
    }

    // Task 2 (Square)
    static double area(double side) {
        return side * side;
    }

    // Task 2 (Rectangle)
    static double area(double length, double width) {
        return length * width;
    }

    // Task 3
    static int sum(int... numbers) {

        int total = 0;

        for (int n : numbers) {
            total = total + n;
        }

        return total;
    }

    // Task 4
    static void swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;

        System.out.println("   (inside swap) a = " + a + ", b = " + b);

    }

    // Task 5
    static void addToBox(Box box, int amount) {

        box.value = box.value + amount;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = -1;

        while (choice != 0) {

            System.out.println("===== JAVA TOOLBOX =====");
            System.out.println("1 - Greet me");
            System.out.println("2 - Area (square or rectangle)");
            System.out.println("3 - Sum of numbers");
            System.out.println("4 - Swap demo (pass-by-value)");
            System.out.println("5 - Box demo (object mutation)");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter your name: ");
                String name = sc.next();

                System.out.println(greet(name));

            } else if (choice == 2) {

                System.out.print("Sides (1 = square, 2 = rectangle): ");
                int type = sc.nextInt();

                if (type == 1) {

                    System.out.print("Enter side length: ");
                    double side = sc.nextDouble();

                    System.out.println("Area of square = " + area(side));

                } else if (type == 2) {

                    System.out.print("Enter length: ");
                    double length = sc.nextDouble();

                    System.out.print("Enter width: ");
                    double width = sc.nextDouble();

                    System.out.println("Area of rectangle = " + area(length, width));

                } else {

                    System.out.println("Invalid choice.");

                }

            } else if (choice == 3) {

                System.out.println("Sum of 4, 8, 15 = " + sum(4, 8, 15));
                System.out.println("Sum of 2, 4, 6, 8, 10 = " + sum(2, 4, 6, 8, 10));

            } else if (choice == 4) {

                int x = 5;
                int y = 9;

                System.out.println("Before swap: x = " + x + ", y = " + y);

                swap(x, y);

                System.out.println("After swap: x = " + x + ", y = " + y);
                System.out.println("Java is pass-by-value.");

            } else if (choice == 5) {

                Box box = new Box();

                box.value = 10;

                System.out.println("Before: box.value = " + box.value);

                addToBox(box, 25);

                System.out.println("After: box.value = " + box.value);
                System.out.println("The object was changed.");

            } else if (choice == 0) {

                System.out.println("Goodbye!");

            } else {

                System.out.println("Invalid option.");

            }

        }

        sc.close();

    }

}

class Box {

    int value;

}
