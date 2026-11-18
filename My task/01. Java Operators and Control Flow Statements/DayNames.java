import java.util.Scanner;

// Task 09 - Display day names using a switch statement.

public class DayNames {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get day number
        System.out.print("Enter the day number 1 to 7: ");
        int day = input.nextInt();

        // break stops after a match
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

            default:
                System.out.println("Invalid day number.");
                break;
        }

        input.close();
    }
}
