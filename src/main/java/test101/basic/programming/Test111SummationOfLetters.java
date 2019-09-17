package test101.basic.programming;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * For a given word in which every letter in it represented by a number.
 * calculate the summation of these numbers represented by the letters
 * a stands for 1, b stands for 2..............z stands for 26
 *
 * Input    : hello
 * Output   : 52
 *
 * @see <a href="https://github.com/pankajnimgade/PracticalProgramming/blob/master/src/main/java/test101/basic/programming/Test111SummationOfLetters.java">Summation of letters</a>
 */
public class Test111SummationOfLetters {

    private static final Scanner SCANNER = new Scanner(System.in);

    private static Hashtable<Character, Integer> lettersHashTable = getLettersHashTable();

    public static void main(String[] args) {

        String givenWord = SCANNER.next();

        int summation = 0;

        for (char character : givenWord.toCharArray()) {
            if (lettersHashTable.containsKey(character)) {
                summation += lettersHashTable.get(character);
            }
        }

        System.out.println("Summation is: "+summation);
    }

    private static Hashtable<Character, Integer> getLettersHashTable() {
        Hashtable<Character, Integer> lettersHashTable = new Hashtable<>();

        lettersHashTable.put('a', 1);
        lettersHashTable.put('b', 2);
        lettersHashTable.put('c', 3);
        lettersHashTable.put('d', 4);
        lettersHashTable.put('e', 5);
        lettersHashTable.put('f', 6);
        lettersHashTable.put('g', 7);
        lettersHashTable.put('h', 8);
        lettersHashTable.put('i', 9);
        lettersHashTable.put('j', 10);
        lettersHashTable.put('k', 11);
        lettersHashTable.put('l', 12);
        lettersHashTable.put('m', 13);
        lettersHashTable.put('n', 14);
        lettersHashTable.put('o', 15);
        lettersHashTable.put('p', 16);
        lettersHashTable.put('q', 17);
        lettersHashTable.put('r', 18);
        lettersHashTable.put('s', 19);
        lettersHashTable.put('t', 20);
        lettersHashTable.put('u', 21);
        lettersHashTable.put('v', 22);
        lettersHashTable.put('w', 23);
        lettersHashTable.put('x', 24);
        lettersHashTable.put('y', 25);
        lettersHashTable.put('z', 26);

        return lettersHashTable;
    }


}
