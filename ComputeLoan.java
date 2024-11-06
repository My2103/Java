//Computing Loan Payments
import java.util.Scanner;

public class ComputeLoan {
    /**
     * @param args The argument for the program
     */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Get the loan amount from the user
        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        //Get the number of year from the user
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        //Get the annual interest rate from user
        System.out.print("Enter interest rate: ");
        double annualInterestRate = input.nextDouble();

        //Calculate the monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        //Calculate the number of payments
        int numberOfPayments = years * 12;

        //Calculate the monthly payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 +
                monthlyInterestRate, numberOfPayments)));

        //Calculate the total payment
        double totalPayment = monthlyPayment * numberOfPayments;

        //Display the monthly and total payment
        System.out.println("Monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);

    }
}