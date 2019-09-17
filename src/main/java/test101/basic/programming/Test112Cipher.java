package test101.basic.programming;

import java.util.Scanner;


/**
 * For a given phrase encode (cipher) it by shifting each letter by 5 towards right
 * <p>
 * Input :  hello
 * Output:  mjqqt
 *
 * @see <a href="https://github.com/pankajnimgade/PracticalProgramming/blob/master/src/main/java/test101/basic/programming/Test112Cipher.java">Cipher</a>
 */
public class Test112Cipher {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static final int MAX = 122;
    public static final int MIN = 97;

    public static void main(String[] args) {

        String plainText = SCANNER.nextLine();

        StringBuilder builder = new StringBuilder();

        for (char character : plainText.toCharArray()) {
            if (isCharacterOfInterest(character)) {
                char shiftedValue = shiftByFive(character);
                builder.append(shiftedValue);
            } else {
                builder.append(character);
            }
        }

        System.out.println(builder);
    }

    /**
     * Shift by 5
     * A  -------------> F
     * B  -------------> G
     * C  -------------> H
     * D  -------------> I
     * E  -------------> J
     * F  -------------> K
     * G  -------------> L
     * H  -------------> M
     * I  -------------> N
     * J  -------------> O
     * K  -------------> P
     * L  -------------> Q
     * M  -------------> R
     * N  -------------> S
     * O  -------------> T
     * P  -------------> U
     * Q  -------------> V
     * R  -------------> W
     * S  -------------> X
     * T  -------------> Y
     * U  -------------> Z
     * V  -------------> A
     * W  -------------> B
     * X  -------------> C
     * Y  -------------> D
     * Z  -------------> E
     */
    private static char shiftByFive(char character) {
        char tempChar = '0';

        int shiftedValue = ((int) character) + 5;

        if (shiftedValue > MAX) {
            int offset = shiftedValue - MAX;
            shiftedValue = MIN + offset - 1;
        }

        return (char) shiftedValue;
    }

    private static boolean isCharacterOfInterest(char character) {
        return (character + "").matches("[a-z]");
    }
}
