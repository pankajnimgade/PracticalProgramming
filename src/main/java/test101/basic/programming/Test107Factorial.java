package test101.basic.programming;

import java.util.Scanner;

/**
 * Given number 5
 *
 * 5! = 5 * 4 * 3 * 2 * 1 = 120
 *
 * @see <a href="https://github.com/pankajnimgade/PracticalProgramming/blob/master/src/main/java/test101/basic/programming/Test107Factorial.java">Factorial</a>
 */
public class Test107Factorial {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int givenNumber = SCANNER.nextInt();

        System.out.println(getFactorialOfMethodTwo(givenNumber));

    }

    private static int getFactorialOfMethodTwo(int givenNumber) {
        int result = 1;

        for (int index = 1; index <= givenNumber; index++) {

            result = result * index;
        }

        return result;
    }

    private static int getFactorialOfMethodOne(int givenNumber) {
        if (givenNumber == 1) {
            return 1;
        }
        return givenNumber * getFactorialOfMethodOne(givenNumber - 1);
    }
}
