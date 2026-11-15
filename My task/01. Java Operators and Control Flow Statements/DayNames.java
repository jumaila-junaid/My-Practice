import java.util.Scanner;

// Task 09 - Display day names using a switch statement.

public class DayNames {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read the day number from the user
        System.out.print("Enter the day number 1 to 7: ");
        int day = input.nextInt();

        // Each case matches a day number; break stops the switch after a match
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            // Runs when the number is not between 1 and 7
            default:
                System.out.println("Invalid day number.");
                break;
        }

        input.close();
    }
}
