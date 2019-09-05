package test101.basic.programming;

import java.util.Scanner;

/**
 * Question:
 * You are given with initial and final number which crates a range (both number are inclusive)
 * find out how many times the numbers in this range is divisible by a given divisor number.
 *
 * Input :
 * Initial number = 6, Final number = 10 and Divisor is 2
 *
 * Output :
 * 3
 *
 * @see <a href="https://github.com/pankajnimgade/PracticalProgramming/blob/master/src/main/java/test101/basic/programming/Test106CountingDivisors.java">Palindrome</a>
 */
public class Test106CountingDivisors {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {


//        methodOne();
        methodTwo();

    }

    /**
     *
     *                      I               F
     * 1    2   3   4   5   6   7   8   9   10
     *
     * Divisor = 2
     */
    private static void methodTwo() {
        int initialNumber = SCANNER.nextInt();
        int finalNumber = SCANNER.nextInt();
        int divisor = SCANNER.nextInt();

        int totalNumberOfTimesDivisible = finalNumber / divisor; // 5
        int offsetDivisibility = (initialNumber -1 )/divisor; // 2

        int count  = totalNumberOfTimesDivisible - offsetDivisibility;
        System.out.println(count);
    }

    private static void methodOne() {
        int initialNumber = SCANNER.nextInt();
        int finalNumber = SCANNER.nextInt();
        int divisor = SCANNER.nextInt();

        int count = 0;
        for (int index = initialNumber; index <= finalNumber ; index++) {

            if (index % divisor == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
