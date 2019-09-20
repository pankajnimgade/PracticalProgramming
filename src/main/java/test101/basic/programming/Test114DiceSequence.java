package test101.basic.programming;

import java.util.Scanner;

/**
 * For given sequence of dice results played by group of rabbits.
 * Find out how many rabbits are playing.
 *
 * Constraint: if a rabbit gets the number 6 on dice, another chance to roll the dice given to that rabbit.
 *
 * Input  : 324662
 * Output : 4
 *
 * @see <a href="https://github.com/pankajnimgade/PracticalProgramming/blob/master/src/main/java/test101/basic/programming/Test114DiceSequence.java">Dice Sequence</a>
 */
public class Test114DiceSequence {

    public static final Scanner SCANNER = new Scanner(System.in);

    /**
     *  1   6   5   2
     *  for above input 3 rabbits have played.
     * @param args
     */
    public static void main(String[] args) {

        String givenDiceSequence = SCANNER.next();

        int numberOfRabbitsPlaying = 0;

        for (char diceOutput : givenDiceSequence.toCharArray()) {

            int currentNumber = getNumberFromCharacter(diceOutput);

            if (currentNumber < 6) {
                numberOfRabbitsPlaying++;
            }

        }

        System.out.println("Number of Rabbits playing: "+numberOfRabbitsPlaying);
    }

    private static int getNumberFromCharacter(char diceOutput) {
        return Integer.parseInt("" + diceOutput);
    }
}
