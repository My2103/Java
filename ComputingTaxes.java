import java.util.Scanner;

//The US federal personal income tax is calculated based on the filing status and taxable income.
//There are four filing statuses: single filers, married filing jointly, married filing separately,
// and head of household. The tax rates for 2009 are shown below.
public class ComputingTaxes {
    public static void main(String[] args) {
        //Create Scanner object
        Scanner input = new Scanner(System.in);

        //The number stand for four filing statuses
        System.out.println("0-single filer");
        System.out.println("1-married jointly or qualifying widow(er)");
        System.out.println("2-married separately");
        System.out.println("3-head of household");

        //Prompt the filing status and taxable income form user
        System.out.print("Enter the filing status: ");
        int filingStatus = input.nextInt();

        System.out.print("Enter the taxable income: ");
        int taxableIncome = input.nextInt();

        double tax = 0; //Declare variable tax

        //Compute the taxes
        if (filingStatus == 0) {
            if (taxableIncome >= 0 && taxableIncome <= 8350) {
                tax = taxableIncome * 0.1;
            } else if (taxableIncome >= 8351 && taxableIncome <= 33950) {
                tax = taxableIncome * 0.15;
            } else if (taxableIncome >= 33951 && taxableIncome <= 82250) {
                tax = taxableIncome * 0.25;
            } else if (taxableIncome >= 82251 && taxableIncome <= 171550) {
                tax = taxableIncome * 0.28;
            } else if (taxableIncome >= 171551 && taxableIncome <= 372950) {
                tax = taxableIncome * 0.33;
            } else if (taxableIncome >= 372951) {
                tax = taxableIncome * 0.35;
            }
        } else if (filingStatus == 1) {
            if (taxableIncome >= 0 && taxableIncome <= 16700) {
                tax = taxableIncome * 0.1;
            } else if (taxableIncome >= 16701 && taxableIncome <= 67900) {
                tax = taxableIncome * 0.15;
            } else if (taxableIncome >= 67901 && taxableIncome <= 137050) {
                tax = taxableIncome * 0.25;
            } else if (taxableIncome >= 137051 && taxableIncome <= 208850) {
                tax = taxableIncome * 0.28;
            } else if (taxableIncome >= 208851 && taxableIncome <= 372950) {
                tax = taxableIncome * 0.33;
            } else if (taxableIncome >= 372951) {
                tax = taxableIncome * 0.35;
            }
        } else if (filingStatus == 2) {
            if (taxableIncome >= 0 && taxableIncome <= 8350) {
                tax = taxableIncome * 0.1;
            } else if (taxableIncome >= 8351 && taxableIncome <= 33950) {
                tax = taxableIncome * 0.15;
            } else if (taxableIncome >= 33951 && taxableIncome <= 68525) {
                tax = taxableIncome * 0.25;
            } else if (taxableIncome >= 68526 && taxableIncome <= 104425) {
                tax = taxableIncome * 0.28;
            } else if (taxableIncome >= 104426 && taxableIncome <= 186475) {
                tax = taxableIncome * 0.33;
            } else if (taxableIncome >= 186476) {
                tax = taxableIncome * 0.35;
            }
        } else if (filingStatus == 3) {
            if (taxableIncome >= 0 && taxableIncome <= 11950) {
                tax = taxableIncome * 0.1;
            } else if (taxableIncome >= 11951 && taxableIncome <= 45500) {
                tax = taxableIncome * 0.15;
            } else if (taxableIncome >= 45501 && taxableIncome <= 117450) {
                tax = taxableIncome * 0.25;
            } else if (taxableIncome >= 117451 && taxableIncome <= 190200) {
                tax = taxableIncome * 0.28;
            } else if (taxableIncome >= 190201 && taxableIncome <= 372950) {
                tax = taxableIncome * 0.33;
            } else if (taxableIncome >= 372951) {
                tax = taxableIncome * 0.35;
            }

        } else {
            System.out.println("Invalid filing status");
        }
        System.out.println("The tax is " + tax);
    }
}