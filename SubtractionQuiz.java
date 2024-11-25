//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        //Create a random number
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Swap number if number1 < number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        //Create the quiz if number1 >= number2
        if(number1 >= number2) {
        System.out.print("what is " + number1 + " - " + number2 + "? ");
        }

        //User prompt the answer and the program will check it true or false
        int answer = input.nextInt();
        if(number1 - number2 == answer){
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
        }


    }
}