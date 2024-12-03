import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FindingString {
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Prompt the string from the user
        System.out.print("Enter the string: ");
        String s = input.nextLine();

        int firstWhiteSpaceIndex = s.indexOf(' ');
        String lastName = s.substring(0, firstWhiteSpaceIndex);

        int secondWhiteSpaceIndex = s.indexOf(' ', firstWhiteSpaceIndex + 1);
        String middleName = s.substring(firstWhiteSpaceIndex + 1, secondWhiteSpaceIndex);

        String firstName = s.substring(secondWhiteSpaceIndex+1);

        System.out.println("Last Name: " + lastName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("First Name: " + firstName);



        /*System.out.print("Enter a string: ");
        String s = input.nextLine();

        int firstWhiteSpaceIndex = s.indexOf(' ');
        String firstName = s.substring(0, firstWhiteSpaceIndex);

        int secondWhiteSpaceIndex = s.lastIndexOf(' ');
        String lastName = s.substring(secondWhiteSpaceIndex + 1);

        String middleName = s.substring(firstWhiteSpaceIndex + 1, secondWhiteSpaceIndex);

        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);*/


    }
}