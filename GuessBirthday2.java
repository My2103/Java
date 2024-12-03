//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class GuessBirthday2 {
    public static void main(String[] args) {
        String set1 = "1 3 5 7 9 11\n";

        String set2 = "2 3 6 7 10 11\n";

        String set3 = "4 5 6 7 12\n";

        String set4 = "8 9 10 11 12\n";

        int month = 0;

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to answer question (set 1)
        System.out.print("Is your birthday is set1?\n");
        System.out.print(set1);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        int answer = input.nextInt();

        if (answer == 1) {
            month += 1;
        }

        //Prompt the user to answer question (set 2)
        System.out.print("Is your birthday is set2?\n");
        System.out.print(set2);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1) {
            month += 2;
        }

        //Prompt the user to answer question (set 3)
        System.out.print("Is your birthday is set3?\n");
        System.out.print(set3);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1) {
            month += 4;
        }

        //Prompt the user to answer question (set 4)
        System.out.print("Is your birthday is set4?\n");
        System.out.print(set4);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1) {
            month += 8;
        }

        System.out.println("Your birthday is " + month + "!");
    }
}