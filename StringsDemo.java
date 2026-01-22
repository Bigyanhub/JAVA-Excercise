public class StringsDemo {
    public static void main(String[] args) {
        // Strings in Java are objects that represent sequences of characters
        // Strings are immutable - once created, they cannot be changed

        // Creating strings
        String str1 = "Hello"; // String literal
        String str2 = new String("World"); // Using constructor
        String str3 = str1 + " " + str2; // Concatenation

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

        // String methods
        String text = "Hello, Java Programming!";
        System.out.println("\nOriginal text: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        // Substring
        System.out.println("Substring (7, 11): " + text.substring(7, 11)); // "Java"
        System.out.println("Substring from 7: " + text.substring(7)); // "Java Programming!"

        // Character access
        System.out.println("Character at index 0: " + text.charAt(0));
        System.out.println("Character at index 7: " + text.charAt(7));

        // Searching
        System.out.println("Index of 'Java': " + text.indexOf("Java"));
        System.out.println("Index of 'o': " + text.indexOf('o'));
        System.out.println("Last index of 'o': " + text.lastIndexOf('o'));
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // Replacing
        String replaced = text.replace("Java", "Python");
        System.out.println("After replace: " + replaced);

        // Splitting
        String sentence = "Java is a programming language";
        String[] words = sentence.split(" ");
        System.out.println("\nWords in sentence:");
        for (String word : words) {
            System.out.println(word);
        }

        // Trimming whitespace
        String withSpaces = "   Hello World   ";
        System.out.println("\nOriginal with spaces: '" + withSpaces + "'");
        System.out.println("Trimmed: '" + withSpaces.trim() + "'");

        // String comparison
        String s1 = "hello";
        String s2 = "HELLO";
        String s3 = "hello";

        System.out.println("\nString comparisons:");
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // false
        System.out.println("s1.equalsIgnoreCase(s2): " + s1.equalsIgnoreCase(s2)); // true
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true
        System.out.println("s1 == s3: " + (s1 == s3)); // true (same object due to string pooling)

        // String formatting
        String name = "Alice";
        int age = 25;
        double height = 5.6;

        String formatted = String.format("Name: %s, Age: %d, Height: %.1f", name, age, height);
        System.out.println("\nFormatted string: " + formatted);

        // StringBuilder for mutable strings
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        System.out.println("StringBuilder result: " + sb.toString());

        // Converting other types to string
        int number = 123;
        double decimal = 45.67;
        boolean flag = true;

        String numStr = String.valueOf(number);
        String decStr = String.valueOf(decimal);
        String boolStr = String.valueOf(flag);

        System.out.println("\nConversions:");
        System.out.println("int to string: " + numStr);
        System.out.println("double to string: " + decStr);
        System.out.println("boolean to string: " + boolStr);
    }
}