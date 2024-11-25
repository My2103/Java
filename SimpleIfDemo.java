

//SimpleIfDemo.java: a program that prompts the user to enter an integer.
//If the number is a multiple of 5, print HiFive.
//If the number is divisible by 2, print HiEven.
import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt a number from user
        System.out.print("Enter an integer: ");
        double number = input.nextDouble();

        //Check if the number is multiple of 5
        if(number % 5 == 0) {
            System.out.println("HiFive");
        }

        //Check if the number is divisible of 2
        if (number % 2 == 0) {
            System.out.println("HiEven");
        }
    }
}