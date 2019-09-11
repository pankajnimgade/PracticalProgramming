package test101.basic.programming;

import java.util.Scanner;

/**
 * For given two intervals start and end time find the difference between them in Hour and minute
 * Input shall be given in Hour and Minute for both start and end time.
 *
 * Input    :  2 20 5 15
 * Output   :  Hour: 2, Minute: 55
 * @see <a href="https://github.com/pankajnimgade/PracticalProgramming/blob/master/src/main/java/test101/basic/programming/Test110DurationInTime.java">Duration In Time</a>
 */
public class Test110DurationInTime {

    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * 2                3                   4                   5               6
     * |-------------------------------------------------------------------------|
     */
    public static void main(String[] args) {

        int startHour = SCANNER.nextInt();
        int startMinute = SCANNER.nextInt();

        int endHour = SCANNER.nextInt();
        int endMinute = SCANNER.nextInt();

        //1. number of minutes in first hour
        int minutesInFirstHour = 60 - startMinute;

        // 2. number of minutes in between hours
        int intervalHours = (endHour - startHour) - 1;
        int minutesInBetween = intervalHours * 60;

        //3. number of minutes in last hour
        int minutesInLastHour = endMinute;


        int totalNumberOfMinutes = minutesInFirstHour + minutesInBetween + minutesInLastHour;

        int differenceHour = totalNumberOfMinutes / 60;
        int remainingMinutes = totalNumberOfMinutes % 60;

        System.out.println("Hour: "+ differenceHour+", Minutes: "+remainingMinutes);

    }
}
