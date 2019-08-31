package test101.basic.programming;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * Given two strings a and b, that may or may not be of the same length,
 * determine the minimum number of character deletions required to make a and b anagrams.
 * Any characters can be deleted from either of the strings.
 *
 * Input ::  MARK  and MIKE
 * Output::  4
 *
 * @see <a href="https://github.com/pankajnimgade/PracticalProgramming/blob/master/src/main/java/test101/basic/programming/Test102Anagrams.java">Anagram</a>
 */
public class Test102Anagrams {

    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     *        TTAPE   and TPEAT
     *
     *         // t - 2
     *         // A - 1
     *         // P - 1
     *         // E - 1
     * @param args
     */
    public static void main(String[] args) {

        String firstText = SCANNER.nextLine();
        String secondText = SCANNER.nextLine();

        Hashtable<Character, Integer> firstHashTable = new Hashtable<>();
        Hashtable<Character, Integer> secondHashTable = new Hashtable<>();

        initializeHashTable(firstText, firstHashTable);
        initializeHashTable(secondText, secondHashTable);

        int numberOfCharacterToDelete = numberOfCharacterToDelete(firstHashTable, secondHashTable);

        System.out.println(numberOfCharacterToDelete);
    }

    private static int numberOfCharacterToDelete(Hashtable<Character, Integer> firstHashTable,
                                                 Hashtable<Character, Integer> secondHashTable) {
        int numberOfCharacterToBeDeleted = 0;

        for (Character character : firstHashTable.keySet()) {

            int currentValue = firstHashTable.get(character);

            if (secondHashTable.containsKey(character)) {

                int secondValue = secondHashTable.get(character);

                if (currentValue != secondValue){

                    int offset = Math.min(currentValue, secondValue);

                    firstHashTable.put(character, offset);
                    secondHashTable.put(character, offset);
                    numberOfCharacterToBeDeleted += Math.max(currentValue, secondValue) -  Math.min(currentValue, secondValue);
                }

            }else{
                numberOfCharacterToBeDeleted += currentValue;
            }

        }

        for (Character character : secondHashTable.keySet()) {

            int currentValue = secondHashTable.get(character);

            if (firstHashTable.containsKey(character)) {

                int secondValue = firstHashTable.get(character);

                if (currentValue != secondValue){

                    int offset = Math.min(currentValue, secondValue);

                    firstHashTable.put(character, offset);
                    secondHashTable.put(character, offset);
                    numberOfCharacterToBeDeleted += Math.max(currentValue, secondValue) -  Math.min(currentValue, secondValue);
                }

            }else{
                numberOfCharacterToBeDeleted += currentValue;
            }

        }

        return numberOfCharacterToBeDeleted;
    }

    private static void initializeHashTable(String firstText,
                                            Hashtable<Character, Integer> table) {

        for (char character : firstText.toCharArray()) {

            if (table.containsKey(character)){
                Integer currentValue = table.get(character);
                table.put(character, ++currentValue);
            }else {
                table.put(character, 1);
            }
        }
    }
}
