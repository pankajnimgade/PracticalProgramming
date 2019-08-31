package test101.basic.programming;

/**
 * You are given a number N. You can perform the following operations on N any number of times:
 *
 * # If N is even, divide N by 2.
 *
 * # If N is odd, replace N with 3N+1.
 *
 * Your task is to find out, for a given N, if it is possible to reach the number 1 after performing the above two valid operations on N any number of times.
 */
public class Test103CollatzConjecture {

    public static void main(String[] args) {

        for (int givenNumber = 2; givenNumber <= 100; givenNumber++) {

            System.out.println("Given Number: " + givenNumber + "\t , Number of steps: " + numberOfStepsToReachOne(givenNumber));
        }
    }

    private static int numberOfStepsToReachOne(int givenNumber) {
        int step = 0;

        do {

            if (givenNumber % 2 == 0) { // even
                givenNumber = givenNumber / 2;
            } else { // odd
                givenNumber = (3 * givenNumber) + 1;
            }

            step = step + 1;
        } while (givenNumber != 1);

        return step;
    }
}
