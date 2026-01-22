public class LoopsDemo {
    public static void main(String[] args) {
        // Loops allow you to execute a block of code repeatedly
        // For loop - when you know how many times to iterate
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // While loop - when you don't know how many times, but have a condition
        System.out.println("\nWhile loop:");
        int counter = 1;
        while (counter <= 5) {
            System.out.println("Counter: " + counter);
            counter++;
        }

        // Do-while loop - executes at least once, then checks condition
        System.out.println("\nDo-while loop:");
        int number = 1;
        do {
            System.out.println("Number: " + number);
            number++;
        } while (number <= 5);

        // Enhanced for loop (for-each) - for iterating over arrays/collections
        System.out.println("\nEnhanced for loop:");
        int[] numbers = { 10, 20, 30, 40, 50 };
        for (int num : numbers) {
            System.out.println("Value: " + num);
        }

        // Nested loops
        System.out.println("\nNested loops (multiplication table):");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println(); // New line after each row
        }

        // Break and continue statements
        System.out.println("\nBreak and continue example:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at " + i);
                break; // Exit the loop
            }
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println("Odd number: " + i);
        }

        // Infinite loop with break condition
        System.out.println("\nInfinite loop with break:");
        int sum = 0;
        int num = 1;
        while (true) {
            sum += num;
            if (sum > 100) {
                System.out.println("Sum exceeded 100 at number " + num + ", total sum: " + sum);
                break;
            }
            num++;
        }
    }
}