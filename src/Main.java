import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declare a variable for birthMonth
        // prompt the user for their birth month (1-12)
        // check if the input is a valid integer
        // if it is a valid integer, read the birthMonth and clear the buffer
        // if birthMonth is between 1 and 12, display a confirmation message
        // otherwise, display an out-of-range error message
        // if not a valid integer, display an invalid input message

        Scanner in = new Scanner(System.in);
        int birthMonth;

        System.out.print("Enter your birth month (1-12): ");

        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine(); // Clear the buffer

            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }
        } else {
            String trash = in.nextLine();
            System.out.println("Invalid input. Please run the program again and enter a valid number.");
        }
    }
}