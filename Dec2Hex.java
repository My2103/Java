import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Dec2Hex {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the decimal number from user
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        String hexadecimal = "";

        while(decimal != 0) {
            int remainder = decimal % 16;
            if(remainder < 10){
                 hexadecimal= remainder + hexadecimal;
            } else {
                char hexChar = (char)('A' + (remainder - 10));// vì sao A lại được tự động implicit casting: vì char không lớn hơn int, nên
                hexadecimal = hexChar + hexadecimal;//có casting khi 2 operand khac 
            }
            decimal = decimal / 16;

        }
        System.out.println("The hex number is: " + hexadecimal);

    }
}
/*int decimalNumber = 26;
String hexNumber = Integer.toHexString(decimalNumber);
System.out.println("The hexadecimal representation of " + decimalNumber + " is: " + hexNumber);*/