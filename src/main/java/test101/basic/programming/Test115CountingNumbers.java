package test101.basic.programming;

import java.util.Scanner;

/**
 * For a given alphanumeric string (text), Find out how many numbers are in that string (text)
 * Note: we are checking for numbers, not digit.
 *
 * Input :   mike123hello1212eee1
 * Output:   3
 *
 * @see <a href="https://github.com/pankajnimgade/PracticalProgramming/blob/master/src/main/java/test101/basic/programming/Test115CountingNumbers.java">Counting Numbers</a>
 */
public class Test115CountingNumbers {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        String givenAlphaNumericNumber = SCANNER.next();

        int countNumber = 0;
        boolean foundDigit = false;
        // mike123hello1212eee1
        for (char currentCharacter : givenAlphaNumericNumber.toCharArray()) {

            if (isDigit(currentCharacter)) {
                foundDigit = true;
            } else {
                if (foundDigit) {
                    foundDigit = false;
                    countNumber++;
                }
            }
        }

        if (foundDigit) {
            countNumber++;
        }

        System.out.println(countNumber);
    }

    private static boolean isDigit(char currentCharacter) {
        return Character.isDigit(currentCharacter);
    }
}
