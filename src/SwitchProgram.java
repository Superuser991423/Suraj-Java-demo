import java.util.Scanner;

public class SwitchProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Display menu
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        // Switch case for operations
        switch (choice) {
            case 1:
                System.out.println("Sum: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Difference: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Product: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Quotient: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
