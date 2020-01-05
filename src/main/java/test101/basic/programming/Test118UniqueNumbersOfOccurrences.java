package test101.basic.programming;

import java.util.HashMap;

/**
 * For a given array of number, find out if all numbers in that array are unique to that array.
 * <p>
 * Input    :  {1, 2, 3, 4, 5, 6, 7, 8, 9}
 * Output   :  true
 *
 * @see <a href="https://github.com/pankajnimgade/PracticalProgramming/blob/master/src/main/java/test101/basic/programming/Test118UniqueNumbersOfOccurrences.java">Unique Numbers Of Occurrences</a>
 */
public class Test118UniqueNumbersOfOccurrences {

    public static void main(String[] args) {

        int[] testArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean isUnique = areAllElementsUnique(testArray);
        System.out.println(isUnique);
    }

    private static boolean areAllElementsUnique(int[] testArray) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int element : testArray) {
            if (map.containsKey(element)) {
                return false;
            } else {
                map.put(element, 0);
            }
        }
        return true;
    }
}
