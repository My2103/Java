import java.util.Scanner;

//This code creates a program to let a first grader practice additions.
// The program randomly generates two single-digit integers number1 and
// number2 and displays a question such as “What is 7 + 9?” to the student.
public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10); //Create a random number
        int number2 = (int)(System.currentTimeMillis() / 10 % 10); //Create a random number
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

       //Create a quiz
       System.out.print("what is " + number1 + " + " + number2 + "? ");

       //User prompt the answer and the program will check it true or false
       int answer = input.nextInt();
       System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
    }
}