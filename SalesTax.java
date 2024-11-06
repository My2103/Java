//SalesTax.java: a program that displays the sales tax with two digits
// after the decimal point. The sale tax is 6%


import java.util.Scanner;

public class SalesTax {
    /**
     * The tax rate: it will vary depend on the state
     */
    public static final double STATE_TAX_RATE = 0.06;
    /**
     * @param args The argument for the program
     */
    public static void main(String[] args) {

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the number from user
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        //Compute the sale tax
        double salesTax = purchaseAmount * STATE_TAX_RATE;

        //Output the result
        System.out.printf("sales Tax is %.2f", salesTax);
    }
}