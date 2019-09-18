package test101.basic.programming;

import java.util.Scanner;

/**
 * For a given number, make a as big as possible by changing its digits.
 * Constraint: there is limit to how many digits in number can be changed
 * <p>
 *          Number    Constraint
 * Input :  25478         2
 * Output:  99478
 *
 * @see <a href="https://github.com/pankajnimgade/PracticalProgramming/blob/master/src/main/java/test101/basic/programming/Test113MaximumDigit.java">Maximum Digit</a>
 */
public class Test113MaximumDigit {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        String givenNumber = SCANNER.next();
        int constraint = SCANNER.nextInt();

        StringBuilder builder = new StringBuilder();

        int numberOFChangesMade = 0;
        for (char digit : givenNumber.toCharArray()) {

            int currentNumber = Integer.parseInt("" + digit);

            if (currentNumber < 9 && numberOFChangesMade < constraint) {
                currentNumber = 9;
                builder.append(currentNumber);
                numberOFChangesMade++;

            } else {
                builder.append(digit);
            }

        }

        System.out.println(builder.toString());

    }
}
