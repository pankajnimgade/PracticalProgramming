package test101.basic.programming;

import java.util.Scanner;

/**
 * For a given number crate following pattern which should scale depending on the number.
 *
 * Input : 5
 *
 * Output:
 *          *########*
 *          **######**
 *          ***####***
 *          ****##****
 *          **********
 *
 * @see <a href="https://github.com/pankajnimgade/PracticalProgramming/blob/master/src/main/java/test101/basic/programming/Test105PatternWithChisel.java">Palindrome</a>
 */
public class Test105PatternWithChisel {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int givenNumber = SCANNER.nextInt();

        createPattern(givenNumber);

    }

    /**
     *          *################*
     *          **##############**
     *          ***############***
     *          ****##########****
     *          *****########*****
     *          ******######******
     *          *******####*******
     *          ********##********
     *          ******************
     *
     * @param givenNumber
     */
    private static void createPattern(int givenNumber) {

        int verticalLimit = givenNumber;
        int horizontalLimit = givenNumber * 2;


        for (int verticalIndex = 1; verticalIndex <= verticalLimit; verticalIndex++) {

            for (int horizontalIndex = 1; horizontalIndex <= horizontalLimit; horizontalIndex++) {

                if (horizontalIndex > verticalIndex && (horizontalIndex <= (horizontalLimit - verticalIndex))) {
                    System.out.print("#");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
