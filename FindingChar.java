//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class FindingChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        System.out.print("Finding char: ");
        char findingChar = input.next().charAt(0);

        System.out.print("Position: ");
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == findingChar) {
                System.out.print(i + " ");
            }
        }
    }
}