//A program that checks whether a number is divisible by 2 and 3,
// whether a number is divisible by 2 or 3, and whether a number is divisible by 2 or 3 but not both
import java.util.Scanner;

public class TestBooleanOperators {
    public static void main(String[] args) {
        //Create a Scanner object.
        Scanner input = new Scanner(System.in);

        //Prompt a number from user.
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //Check whether a number is divisible by 2 and 3.
        if ((number % 2 ==0) && (number % 3 == 0)) {
            System.out.println(number + " is divisible by 2 and 3.");
        }

        //Check whether a number is divisible by 2 or 3.
        if ((number % 2 ==0) || (number % 3 == 0)) {
            System.out.println(number + " is divisible by 2 or 3.");
        }

        //whether a number is divisible by 2 or 3 but not both.
        if ((number % 2 ==0) ^ (number % 3 == 0)) {
            System.out.println(number + " is divisible by 2 or 3, but not both.");
        }
    }
}