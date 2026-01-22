public class MethodsDemo {
    public static void main(String[] args) {
        // Methods are blocks of code that perform specific tasks
        // They help organize code and make it reusable

        // Calling methods without parameters
        greet();
        printLine();

        // Calling methods with parameters
        greetPerson("Alice");
        greetPerson("Bob");

        // Calling methods with return values
        int sum = add(5, 3);
        System.out.println("5 + 3 = " + sum);

        double average = calculateAverage(10, 20, 30);
        System.out.println("Average of 10, 20, 30 = " + average);

        // Method overloading - same method name, different parameters
        System.out.println("Area of square with side 5: " + calculateArea(5));
        System.out.println("Area of rectangle 4x6: " + calculateArea(4, 6));
        System.out.println("Area of circle with radius 3: " + calculateArea(3.0));

        // Recursive method
        int factorial5 = factorial(5);
        System.out.println("5! = " + factorial5);

        // Method with variable arguments (varargs)
        int total = sumAll(1, 2, 3, 4, 5);
        System.out.println("Sum of 1+2+3+4+5 = " + total);
    }

    // Method without parameters and return value
    public static void greet() {
        System.out.println("Hello, welcome to Java methods!");
    }

    // Method without parameters but with return value
    public static void printLine() {
        System.out.println("------------------------------");
    }

    // Method with parameters
    public static void greetPerson(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method with parameters and return value
    public static int add(int a, int b) {
        return a + b;
    }

    // Method with multiple parameters
    public static double calculateAverage(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    // Method overloading - same name, different parameters
    public static int calculateArea(int side) {
        return side * side; // Square
    }

    public static int calculateArea(int length, int width) {
        return length * width; // Rectangle
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius; // Circle
    }

    // Recursive method
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Method with variable arguments (varargs)
    public static int sumAll(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
}