import java.util.Scanner;

/*
 * CalculatorApp.java
 * Java Developer Internship - Task 2
 * Demonstrates variables, data types, input, operations, casting, and formatting
 */

public class CalculatorApp {

    // Static variable (shared by all objects)
    static String appName = "Console Calculator";

    // Instance variable (belongs to object)
    int instanceCounter = 0;

    public static void main(String[] args) {

        // Local variable
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to " + appName);

        /* -------------------------------
           Primitive Data Types in Java
           ------------------------------- */

        byte b = 10;        // 1 byte
        short s = 100;      // 2 bytes
        int i = 1000;       // 4 bytes
        long l = 100000L;   // 8 bytes

        float f = 10.5f;    // 4 bytes
        double d = 99.99;  // 8 bytes

        char c = 'A';       // 2 bytes
        boolean flag = true; // 1 bit

        System.out.println("\nPrimitive Data Types Example:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        /* -------------------------------
           Console Input using Scanner
           ------------------------------- */

        System.out.print("\nEnter first number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter numbers only.");
            return;
        }
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter numbers only.");
            return;
        }
        double num2 = scanner.nextDouble();

        /* -------------------------------
           Arithmetic Operations
           ------------------------------- */

        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        double division = (num2 != 0) ? num1 / num2 : 0;

        /* -------------------------------
           Type Casting
           ------------------------------- */

        int castedSum = (int) sum; // explicit casting (double → int)

        /* -------------------------------
           Formatted Output
           ------------------------------- */

        System.out.printf("\nResults:\n");
        System.out.printf("Sum: %.2f\n", sum);
        System.out.printf("Difference: %.2f\n", diff);
        System.out.printf("Product: %.2f\n", product);

        if (num2 != 0) {
            System.out.printf("Division: %.2f\n", division);
        } else {
            System.out.println("Division: Cannot divide by zero");
        }

        System.out.println("Casted Sum (double → int): " + castedSum);

        scanner.close();
    }
}
