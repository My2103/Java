import java.util.Scanner;


//The Math subtraction learning tool program generates just one question for each run.
public class SubtractionQuizLoop {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5; //Number of the question
        int correctCount = 0; //Count the number of the correct answer
        int count = 0; //Count the answer

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        String history = ""; // Create a string to store the history

        long startTime = System.currentTimeMillis();

        //The loop
        while (count < NUMBER_OF_QUESTIONS) {
            //Create a random number
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            //Swap number if number1 < number2
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            //Create quiz
            System.out.print("\nwhat is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();
            if(number1 - number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
                history += number1 + "-" + number2 + "=" + answer + " correct\n"; // Add to history
            } else {
                System.out.println("Your answer is wrong.");
                System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
                history += number1 + "-" + number2 + "=" + answer + " wrong\n"; // Add to history
            }
            count++;
        }

        long endTime = System.currentTimeMillis();
        long testTime = (endTime - startTime) / 1000;

        System.out.println("\nCorrect count is " + correctCount);
        System.out.println("Test time is " + testTime + " seconds\n");

        // Print the history
        System.out.println(history);

    }
}