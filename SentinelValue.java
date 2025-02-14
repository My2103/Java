//A program that reads and calculates the sum of an unspecified number of integers.
// The input 0 signifies the end of the input.

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Read the initial data
        System.out.print("Enter an integer (the input ends if it is 0): ");
        int value = input.nextInt();

        //Keep reading data until the input is 0
        int sum = 0;
        while (value != 0) {
            //sum += Math.abs(value);
            sum += value;
            System.out.print("Enter an integer (the input ends if it is 0): ");
            value = input.nextInt();
        }

        System.out.println("The sum is " + sum);
    }
}