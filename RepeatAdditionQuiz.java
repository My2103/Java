//This code creates a program to let a first grader practice additions.
// The program randomly generates two single-digit integers number1 and
// number2 and displays a question such as “What is 7 + 9?” to the student.
import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(Math.random()*10); //Create a random number
        int number2 = (int)(Math.random()*10);  //Create a random number

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Display the question
        System.out.print("what is " + number1 + " + " + number2 + "? ");

        //Prompt the answer from user
        int answer = input.nextInt();

        //The loop until user answer correct
        while (answer != number1 + number2) {
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt(); // Prompt the user to enter the answer again
        }

        System.out.println("You got it!");
    }
}
/*//Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Create a quiz
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int answer;

        do {
            System.out.print("What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
            if(answer != number1 + number2){
            System.out.println("Wrong answer. Try it again\n");
            }
        } while (answer != (number1 + number2));

        System.out.println("The answer is correct");*/