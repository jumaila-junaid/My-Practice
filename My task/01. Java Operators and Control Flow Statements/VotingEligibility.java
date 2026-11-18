import java.util.Scanner;

// Task 04 - Check whether a person is eligible for voting.

public class VotingEligibility {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get age
        System.out.print("Enter the age: ");
        int age = input.nextInt();

        // 18 or above can vote
        if (age >= 18) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }

        input.close();
    }
}
