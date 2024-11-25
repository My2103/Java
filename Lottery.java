//Write a program that randomly generates a lottery of a two- digit number,
//prompts the user to enter a two-digit number, and determines whether the user wins according to the following rule:
//If the user input matches the lottery in exact order, the award is $10,000.
//If the user input matches the lottery, the award is $3,000.
//If one digit in the user input matches a digit in the lottery, the award is $1,000.

import java.util.Scanner;
public class Lottery {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt a number from user
        System.out.print("Enter your lottery pick (two digits): ");
        int lotteryPick = input.nextInt();

        //Create a random number
        int randomNumber = (int)(Math.random() * 100);
        //int randomNumber = 92;

        //Get digits from lottery
        int lotteryDigit1 = lotteryPick / 10; //General formula: lotteryDigit1 = (lotteryPick / 10) % 10
        int lotteryDigit2 = lotteryPick % 10;

        //Get digits from the random
        int randomDigit1 = randomNumber / 10;
        int randomDigit2 = randomNumber % 10;

        System.out.println("The lottery number is: " + randomNumber);
        //Check the winner
        if (lotteryPick == randomNumber) {
            System.out.println("Exact match: you won $10,000");
        } else if (lotteryDigit1 == randomDigit2 && lotteryDigit2 == randomDigit1) {
            System.out.println("Match all digits: you won $3,000");
        } else if ((lotteryDigit1 == randomDigit1)
                || (lotteryDigit2 == randomDigit2)
                || (lotteryDigit1 == randomDigit2)
                || (lotteryDigit2 == randomDigit1)) {
            System.out.println("Match one digits: you won $1,000");
        } else {
            System.out.println("Sorry, no match");
        }

    }
}