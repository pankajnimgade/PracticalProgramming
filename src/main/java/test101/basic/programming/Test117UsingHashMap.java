package test101.basic.programming;

import java.util.HashMap;
import java.util.Map;

/**
 * For a given number in text form, find out how many times every digit was repeated.
 *
 * Input    :  112433584
 * Output :
 * 1     ---    2
 * 2     ---    1
 * 3     ---    2
 * 4     ---    2
 * 5     ---    1
 * 8     ---    1
 *
 * @see <a href="https://github.com/pankajnimgade/PracticalProgramming/blob/master/src/main/java/test101/basic/programming/Test117UsingHashMap.java">Using HashMap</a>
 */
public class Test117UsingHashMap {

    public static void main(String[] args) {
        countingNumbers("1112asasaqewrewrtewasa");
    }

    private static void countingNumbers(String numberText) {

        HashMap<Character, Integer> valueToTimesMap = new HashMap<>();

        for (char character : numberText.toCharArray()) {

            if (valueToTimesMap.containsKey(character)) {

                int times = valueToTimesMap.get(character);
                valueToTimesMap.put(character, (times + 1));
            } else {
                valueToTimesMap.put(character, 1);
            }

        }

        for (Map.Entry<Character, Integer> entry : valueToTimesMap.entrySet()) {
            System.out.println(entry.getKey() +  "   -->   "+entry.getValue());
        }
    }
}
