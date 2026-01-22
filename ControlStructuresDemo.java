public class ControlStructuresDemo {
    public static void main(String[] args) {
        // Control structures control the flow of execution in a program
        // if-else statements
        int number = 10;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Nested if-else
        int age = 25;
        boolean hasLicense = true;

        if (age >= 18) {
            if (hasLicense) {
                System.out.println("You can drive.");
            } else {
                System.out.println("You need a license to drive.");
            }
        } else {
            System.out.println("You are too young to drive.");
        }

        // Switch statement
        int dayOfWeek = 3;
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("Day " + dayOfWeek + " is " + dayName);

        // Switch with strings (Java 7+)
        String fruit = "apple";
        String color;

        switch (fruit) {
            case "apple":
                color = "red";
                break;
            case "banana":
                color = "yellow";
                break;
            case "orange":
                color = "orange";
                break;
            default:
                color = "unknown";
                break;
        }

        System.out.println("A " + fruit + " is typically " + color);

        // Ternary operator (conditional operator)
        int a = 5, b = 10;
        int max = (a > b) ? a : b;
        System.out.println("The maximum of " + a + " and " + b + " is " + max);
    }
}