//This program first prompts the user to enter a year as an int value
// and checks if it is a leap year.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //Create a Scanner object.
        Scanner input = new Scanner(System.in);

        //Prompt a number from user.
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        //Check if it is a leap year.
        boolean isLeapYear =
                ((year % 4 == 0) && (year % 100 != 0)
                        || year % 400 == 0);

        //Display the result in a message dialog box
        System.out.println(year + " is a leap year? " + isLeapYear);
    }
}