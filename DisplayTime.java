//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        //Create Scanner object
       Scanner input = new Scanner(System.in);
       //Prompt the user input the seconds
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();

        //Input minutes
        int minutes = seconds / 60; //Find minutes in seconds
        int remainingSeconds = seconds % 60; //Seconds remaining
        System.out.println(seconds + " second is " + minutes + " minutes and " + remainingSeconds + " seconds");
    }
}