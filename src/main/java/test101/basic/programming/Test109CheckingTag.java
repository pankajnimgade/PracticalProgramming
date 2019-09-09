package test101.basic.programming;

import java.util.Scanner;

/**
 * For given text check if it is a valid or invalid.
 * Constraints:
 * 1. Text should not have any vowel within the text.
 * 2. Summation of all numbers within the text should be an even number.
 *
 * Input  :  24X653-55
 * Output :  Valid
 * @see <a href="https://github.com/pankajnimgade/PracticalProgramming/blob/master/src/main/java/test101/basic/programming/Test109CheckingTag.java">Checking Tag</a>
 */
public class Test109CheckingTag {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        String givenTag = SCANNER.next();

        if (isValidTag(givenTag)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    /**
     * 1. is should not have a vowel, A, E, I, O ,U
     * 2. summation of all numbers should be even number
     */
    private static boolean isValidTag(String givenTag) {
        boolean isValid = true;
        //first condition
        for (Character character : getCharacterArrayOfVowel()) {
            if (givenTag.contains(character.toString())) {
                isValid = false;
                break;
            }
        }

        //second condition
        if (isValid) {
            String numbersOnly = givenTag.replaceAll("[^0-9]", "");

            int summation = 0;
            for (char character : numbersOnly.toCharArray()) {
                summation += Integer.parseInt(character + "");
            }
            if (summation % 2 != 0) {
                isValid = false;
            }
        }
        return isValid;
    }

    private static Character[] getCharacterArrayOfVowel() {
        return new Character[]{'A', 'E', 'I', 'O', 'U'};
    }


}
