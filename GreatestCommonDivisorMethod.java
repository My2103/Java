//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class GreatestCommonDivisorMethod {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt two number from user
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.println("The greatest common divisor of " + number1 + " and " + number2 +
                " is " + greatestCommonDivisor(number1, number2));

    }
    public static int greatestCommonDivisor(int number1, int number2){
        int min;
        int gcd = 0;
        if(number1 < number2){
            min = number1;
        } else {
            min = number2;
        }

        for(int divisor = 1; divisor <= min; divisor++){
            if(number1 % divisor == 0 && number2 % divisor == 0){
                gcd = divisor;
            }
        }
        return gcd;
    }
}