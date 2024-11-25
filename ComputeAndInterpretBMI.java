

//This program will compute Body Mass Index (BMI)
//It can be calculated by taking your weight in kilograms
// and dividing by the square of your height in meters.
import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the weight and height of user
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();


        //Compute the BMI
         final double KILOGRAMS_PER_POUND = 0.45359237; //Constant
         final double METERS_PER_INCH = 0.0254; //Constant

         double weightInKilograms = weight * KILOGRAMS_PER_POUND;
         double heightInMeter = height * METERS_PER_INCH;
         double bmi = weightInKilograms / (heightInMeter * heightInMeter);

         System.out.println("BMI is " + bmi);

         //Output the result
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else if (bmi >= 30 && bmi < 35) {
            System.out.println("Obese");
        }
    }

}