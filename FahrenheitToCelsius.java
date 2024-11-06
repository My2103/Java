// A program that converts a Fahrenheit degree to Celsius using the formula
// Created by Mai Ngoc Diem My.

import java.util.Scanner;

public class FahrenheitToCelsius {
    /**
     * @param args The argument
     */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        //Prompt the degree from user
        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        //Convert Fahrenheit degree to Celsius using the formula:
        // celsius = (fahrenheit - 32) * 5 / 9
        double celsius = (fahrenheit - 32) * 5 / 9;

        //Output the Celsius
        System.out.println("Fahrenheit is " + fahrenheit + " is " + celsius + " in Celsius");

    }
}