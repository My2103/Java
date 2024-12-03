//HexDigit2Dec.java: A program that converts a hexadecimal digit into a decimal value.
import java.util.Scanner;
public class HexDigit2Dec {
    public static void main(String[] args) {
        //Create a Scanner object
        //Scanner input = new Scanner(System.in);

        //Prompt the string from user
        //System.out.print("Enter a hex digit: ");
        //String hexDigit = input.nextLine();

        //Output the decimal value
        //int decimalValue = Integer.parseInt(hexDigit, 16);
        //System.out.println("The decimal value of hex digit " + hexDigit + " is " + decimalValue);

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt a hexadecimal from user
        System.out.print("Enter a hexadecimal number: ");
        String hexadecimal = input.nextLine().toUpperCase();
        int decimal = 0;

        //Convert to decimal
        for(int i = 0; i < hexadecimal.length(); i++){
            char hexChar = hexadecimal.charAt(i);
            int digitValue;
            if(hexChar >= '0' && hexChar <= '9'){
                digitValue = hexChar - '0';
            } else {
                digitValue = 10 + (hexChar - 'A');
            }
            decimal = 16 * decimal + digitValue;
        }
        System.out.println("The decimal number is " + decimal);
    }
}

