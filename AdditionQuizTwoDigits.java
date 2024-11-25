//The program randomly generates two two-digit integers number1 and
// number2 and displays a question.
import java.util.Scanner;

public class AdditionQuizTwoDigits {
    public static void main(String[] args) {
        //Create a random number
        int number1 = (int)(System.currentTimeMillis() % 100);
        int number2 = (int)(System.currentTimeMillis() / 100 % 100);

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Create a quiz
        System.out.print("what is " + number1 + " + " + number2 + "? ");

        //User prompt the answer and the program will check it true or false
        int answer = input.nextInt();
        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
    }
}