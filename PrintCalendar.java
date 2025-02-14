// Java Program to Generate Desired Calendar
// Without calendar.get() function or
// Inputting the Year and the Month
import java.time.LocalDate;
import java.util.Scanner;

public class PrintCalendar {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the year&month from user
        System.out.print("Enter the year (e.g., 2001): ");
        int year = input.nextInt();
        System.out.print("Enter month in number between 1 and 12: ");
        int month = input.nextInt();

        printMonthTitle(year, month);
        printMonthBody(year, month);



    }
    public static void printMonthTitle(int year, int month) {
        System.out.println("         " + getMonthName(month) + " " + year);
        System.out.println("-------------------------------");
        System.out.println("  Sun Mon Tue Wed Thu Fri Sat");
    }

    /** Convert the month in type int to string
     * @param month
     * @return the name of the month: January, February,...
     */
    /*Get the month name in form of string*/
    public static String getMonthName(int month){
        String monthName = "";
        switch(month){
            case 1: monthName ="January"; break;
            case 2: monthName ="February"; break;
            case 3: monthName ="March"; break;
            case 4: monthName ="April"; break;
            case 5: monthName ="May"; break;
            case 6: monthName ="June"; break;
            case 7: monthName ="July"; break;
            case 8: monthName ="August"; break;
            case 9: monthName ="September"; break;
            case 10: monthName ="October"; break;
            case 11: monthName ="November"; break;
            case 12: monthName ="December"; break;
            default: monthName = "Invalid month";
        }
        return monthName;
    }

    public static void printMonthBody(int year, int month) {
        //Get start of the week for the first date in the month
        int startDay = getStartDayV2(year, month);

        //Get number of the days in the month
        int numberOfTheDaysInMonth = getTheNumberOfDaysInMonth(year, month);

        //Pad space before the first day of the month
        int i = 0;
        for(i = 0; i < startDay; i++){
            System.out.print("    ");
        }

        for (i = 1; i <= numberOfTheDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if((i + startDay) % 7 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }

    /*Get the start day method*/
    public static int getStartDayV2(int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1);
        int systemDayOfWeek = date.getDayOfWeek().getValue();

        //The system represent Mon, Tue, ..., Sat, Sun as 1, 2, ...,6, 7
        //We need to convert Mon, Tue, ..., Sat, Sun as 1,2, ..., 6, 0

        //For sunday, systemDayOfWeek will be 7, we need to return 0 instead
        if(systemDayOfWeek == 7){
            return 0;
        }
        return systemDayOfWeek;
    }
    /** Return the number of day of the specific month&year
     * @param year
     * @param month
     * @return the number of day {30, 31, 28, 29}
     */
    /*Method to check how many days in that specific month&year*/
    public static int getTheNumberOfDaysInMonth(int year, int month){
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                    return 29;
            } else {
                    return 28;
            }
            default:
                // Handle invalid month
                return -1;
        }
    }
}