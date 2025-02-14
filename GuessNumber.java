import java.util.Scanner;

//The program prompts the user to enter a number continuously
// until the number matches the randomly generated number.
//For each user input, the program tells the user whether the
// input is too low or too high, so the user can choose the next input intelligently.
public class GuessNumber {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Guess a magic number between 0 to 100");
        //Create a random number
        int randomNumber = (int)(Math.random()*101);


        int guess = -1;
        while(guess != randomNumber) {
            //Prompt the number
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();

            if(guess == randomNumber) {
                System.out.println("Yes, the number is " + randomNumber);
            } else if (guess > randomNumber) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Your guess is too low");
            }
        }//end the loop


    }
}