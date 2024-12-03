import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LotteryUsingStrings {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Create a random number
        String lottery = "" + (int)(Math.random()*10) + (int)(Math.random()*10);
       //String lottery = "12";
        //có 1 empty string ở phía trước nên câu lệnh này sẽ convert int thành string

        //Prompt a number from user
        System.out.print("Enter your lottery pick (two digits): ");
        String lotteryPick = input.nextLine();

        if(lotteryPick.length() != 2){
            System.out.println("You entered an invalid lottery pick. Please enter two-digits number");
        } else {
            //Get the digits from the lottery
            char lotteryDigit1 = lottery.charAt(0);
            char lotteryDigit2 = lottery.charAt(1);

            //Get the digits from the lottery pick
            char lotteryPickDigit1 = lotteryPick.charAt(0);
            char lotteryPickDigit2 = lotteryPick.charAt(1);

            //Output the lottery number
            System.out.println("The lottery number is " + lottery);

            //Check the winner
            if (lotteryPick.equals(lottery)) {
                System.out.println("Exact match: you won $10,000");
            } else if (lotteryDigit1 == lotteryPickDigit2 && lotteryDigit2 == lotteryPickDigit1) {
                System.out.println("Match all digits: you won $3,000");
            } else if (lotteryDigit1 == lotteryPickDigit1
                    || lotteryDigit1 == lotteryPickDigit2
                    || lotteryDigit2 == lotteryPickDigit1
                    || lotteryDigit2 == lotteryPickDigit2) {
                System.out.println("Match one digits: you won $1,000");
            } else {
                System.out.println("Sorry, no match");
            }
        }



    }
}