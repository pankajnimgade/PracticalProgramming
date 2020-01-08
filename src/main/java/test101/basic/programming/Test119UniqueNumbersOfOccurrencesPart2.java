package test101.basic.programming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Given an array of integers arr,
 * write a function that returns true if and only if the number of occurrences of each value in the array is unique.
 *
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 *
 * Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 *
 * @see <a href="https://github.com/pankajnimgade/PracticalProgramming/blob/master/src/main/java/test101/basic/programming/Test119UniqueNumbersOfOccurrencesPart2.java">Unique Numbers Of Occurrences</a>
 */
public class Test119UniqueNumbersOfOccurrencesPart2 {

    public static void main(String[] args) {

//        int[] testArray = new int[]{1, 2, 2, 1, 1, 3};
//        int[] testArray = new int[]{1,2};
        int[] testArray = new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        System.out.println(uniqueOccurrences(testArray));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int number : arr) {
            if (map.containsKey(number)) {
                int currentOccurrenceSoFar = map.get(number);
                map.put(number, currentOccurrenceSoFar + 1);
            } else {
                map.put(number, 1);
            }
            /**
             *   A cleaner way of implementing above logic
             *
             *   map.put(number, map.getOrDefault(number, 0) + 1);
             */
        }

        HashSet<Integer> checkUniquenessOfValues = new HashSet<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (!checkUniquenessOfValues.add(entry.getValue())) {
                return false;
            }
        }

        return true;
    }
}
