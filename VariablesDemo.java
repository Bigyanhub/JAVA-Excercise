public class VariablesDemo {
    public static void main(String[] args) {
        // Java has two types of variables: primitive and reference
        // Primitive data types: byte, short, int, long, float, double, char, boolean

        // Integer types
        byte smallNumber = 100; // 8-bit, range: -128 to 127
        short mediumNumber = 30000; // 16-bit, range: -32,768 to 32,767
        int normalNumber = 123456789; // 32-bit, most commonly used
        long bigNumber = 123456789012345L; // 64-bit, note the 'L' suffix

        // Floating point types
        float decimalNumber = 3.14f; // 32-bit, note the 'f' suffix
        double preciseDecimal = 3.141592653589793; // 64-bit, more precise

        // Character and boolean
        char letter = 'A'; // Single character
        boolean isTrue = true; // true or false

        // Reference type example
        String text = "Hello, Java!"; // String is a reference type

        // Printing the variables
        System.out.println("Byte: " + smallNumber);
        System.out.println("Short: " + mediumNumber);
        System.out.println("Int: " + normalNumber);
        System.out.println("Long: " + bigNumber);
        System.out.println("Float: " + decimalNumber);
        System.out.println("Double: " + preciseDecimal);
        System.out.println("Char: " + letter);
        System.out.println("Boolean: " + isTrue);
        System.out.println("String: " + text);

        // Type casting example
        int intValue = 100;
        double doubleValue = intValue; // Automatic widening conversion
        System.out.println("Widening cast: int " + intValue + " to double " + doubleValue);

        double anotherDouble = 99.99;
        int anotherInt = (int) anotherDouble; // Explicit narrowing conversion
        System.out.println("Narrowing cast: double " + anotherDouble + " to int " + anotherInt);
    }
}