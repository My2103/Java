// Displaying Current Time
// 24 hour in a day
// There are 24 hour in a day
// ==> 24h * 60 min/h in a day (m)
// ==> 24 * 60 min/h * 60s/min in a day (m)
//

import java.util.Scanner;

public class ShowCurrentTime {
    public static void main(String[] args) {
        //Obtain the total millisecond since midnight, Jan 1, 1970
        long  totalMilliseconds = System.currentTimeMillis();

        //Obtain the total second since midnight, Jan 1, 1970
        long  totalSeconds = totalMilliseconds / 1000;

        //Compute the current second in the minute in the hour
        long currentSeconds = totalSeconds % 60;

        //Obtain the total minutes
        long totalMinute = totalSeconds / 60;

        //Compute the current minute in the hour
        long currentMinute = totalMinute % 60;

        //Obtain the total hours
        long totalHour = totalMinute / 60;

        //Compute the current hour
        long currentHour = totalHour % 24;

        //Output the current hour
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSeconds + " GMT");
    }
}