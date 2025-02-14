import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Palindrome {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt a string from user
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        //Check the palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
}