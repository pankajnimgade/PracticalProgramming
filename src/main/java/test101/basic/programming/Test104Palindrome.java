package test101.basic.programming;

import java.util.Scanner;

/**
 * For a given String. You need to find and print whether this string is a palindrome or not.
 * If given text is Palindrome, print "true" otherwise "false".
 *
 * |    Input     |    Output     |
 * |    KAYAK     |    true       |
 * |    RADAR     |    true       |
 * |    HELLO     |    false      |
 *
 * @see  <a href="https://github.com/pankajnimgade/PracticalProgramming/blob/master/src/main/java/test101/basic/programming/Test104Palindrome.java">Palindrome</a>
 */
public class Test104Palindrome {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        String givenText = SCANNER.next();

        System.out.println(givenText + " is a Palindrome: " + isPalindrome(givenText));

    }

    /**
     * 0   1   2   3   4
     * K   A   Y   A   K
     *
     * @param givenText
     * @return true if text is a Palindrome otherwise false.
     */
    private static boolean isPalindrome(String givenText) {

        int leftSide = 0;
        int rightSide = givenText.length() - 1;
        int middleLimit = givenText.length() / 2;

        for (; leftSide < middleLimit; leftSide++, rightSide--) {

            if (givenText.charAt(leftSide) != givenText.charAt(rightSide)) {
                return false;
            }
        }
        return true;
    }
}
