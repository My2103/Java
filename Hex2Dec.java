//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Hex2Dec {
    /**
     * @param args The method convert hexadecimal value to decimal value
     */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input =  new Scanner(System.in);

        //Prompt the user to enter a string
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine().toUpperCase();

        System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
    }

    /**
     * Calculate the decimal value of an hexadecimal number as a string
     * @param hex the string contains the hexadecimal number
     * @return the decimal number value of the hexadecimal string
     */
    public static int hexToDecimal (@org.jetbrains.annotations.NotNull String hex){
        int decimal = 0;
        for (int i = 0; i < hex.length(); i++){
            char hexChar = hex.charAt(i); //take the char in hexadecimal
            decimal = decimal * 16 + hexCharToDecimal(hexChar); //get the decimal
        }
        return decimal;
    }

    public static int hexCharToDecimal (char myChar){
        if ('A' <= myChar && myChar <= 'F'){
            return 10 + myChar - 'A';
        } else {
            return myChar - '0';
        }
    }
}