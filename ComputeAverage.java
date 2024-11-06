import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ComputeAverage {
    /**
     * @param args The arguments for the program
     */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter three numbers
        System.out.print("Enter the three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        //Compute Average
        double average = (number1 + number2 + number3) / 3;

        //Display Averaage
        System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
    }
}