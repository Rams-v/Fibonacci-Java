import java.io.*;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        // Choose the input method based on the program arguments
        if (args.length > 0) {
            // If command-line arguments are provided, use CommandLineFibonacci
            commandLineFibonacci(args);
        } else {
            // If no command-line arguments, prompt the user for input method
            System.out.println("Choose input method:");
            System.out.println("1. Buffer Input");
            System.out.println("2. Command Line Input");
            System.out.println("3. Console Input");
            System.out.println("4. Scanner Input");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bufferInputFibonacci();
                    break;
                case 2:
                    System.out.print("Enter the number of elements: ");
                    scanner.nextLine(); // Consume newline character
                    String commandLineInput = scanner.nextLine();
                    commandLineFibonacci(new String[]{commandLineInput});
                    break;
                case 3:
                    consoleInputFibonacci();
                    break;
                case 4:
                    scannerInputFibonacci();
                    break;
                default:
                    System.out.println("Invalid choice. Exiting.");
            }

            scanner.close();
        }
    }

    // Fibonacci calculation method
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Input method using BufferedReader
    public static void bufferInputFibonacci() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the number of elements:");
            int number = Integer.parseInt(reader.readLine());

            for (int i = 0; i < number; i++) {
                System.out.println(fibonacci(i) + " ");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    // Input method using Command Line Arguments
    public static void commandLineFibonacci(String[] args) {
        int number = Integer.parseInt(args[0]);
        for (int i = 0; i < number; i++) {
            System.out.println(fibonacci(i) + " ");
        }
    }

    // Input method using Console
    public static void consoleInputFibonacci() {
        int number = Integer.parseInt(System.console().readLine("Enter the number of elements: "));
        for (int i = 0; i < number; i++) {
            System.out.println(fibonacci(i) + " ");
        }
    }

    // Input method using Scanner
    public static void scannerInputFibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println(fibonacci(i) + " ");
        }

        scanner.close();
    }
}
