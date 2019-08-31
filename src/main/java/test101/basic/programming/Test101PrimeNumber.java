package test101.basic.programming;

import java.util.Scanner;

/**
 * You are given an integer N. You need to print the series of all prime numbers till N.
 *
 *  | Input     |    Output   |
 *  |    9     |    2 3 5 7   |
 *
 * @see <a href ="https://github.com/pankajnimgade/PracticalProgramming/blob/master/src/main/java/test101/basic/programming/Test101PrimeNumber.java">get list of Prime Number</>
 */
public class Test101PrimeNumber {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int userInput = SCANNER.nextInt();

        for (int index = 1; index <= userInput; index++) {

            if (isPrimeNumber(index)) {

                System.out.print(index+" ");
            }
        }
    }

    public static boolean isPrimeNumber(int givenNumber) {

        if (givenNumber <= 1) {
            return false;
        }

        for (int index = 2; index <= (givenNumber / 2); index++) {

            if (givenNumber % index == 0){
                return false;
            }
        }


        return true;
    }
}
