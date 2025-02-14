import java.util.Scanner;

//a program that prompts the user to enter two positive integers
// and finds their greatest common divisor.
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the number from the user
        /*System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();*/

        int number1;
        do{
            System.out.print("Enter the first number: ");
            number1 = input.nextInt();
            if(number1 <= 0){
                System.out.println("You must enter a positive number. Please try again");
            }
        }while (number1 <= 0);

        int number2;

        do{
            System.out.print("Enter the first number: ");
            number2 = input.nextInt();
            if(number2 <= 0){
                System.out.println("You must enter a positive number. Please try again");
            }
        }while (number2 <= 0);


        //Check the divisor of each number
        if(number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        int max_gcd = 1;
        for(int i = 2; i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                max_gcd = i;
            }
        }

        /*int max_gcd = 1; // Initialize greatest common divisor to 1
        int i = 1;
        boolean terminate = false;

        while(!terminate){
            if(i > number2){
                terminate = true;
            } else {
                if(number1 % i == 0 && number2 % i == 0){
                    max_gcd = i; // Update gcd if i is a common divisor
                }
                i++;
            }
        }*/
        System.out.println("The greatest common divisor for " + number1 + " and " + number2 + " is " + max_gcd);
    }
}