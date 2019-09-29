package test101.basic.programming;

import java.util.Scanner;

/**
 * For a given number, create a pyramid pattern, which should scale by height for that number
 *
 * Input :  3
 * Output:
 *          *
 *         ***
 *        *****
 *
 * @see <a href="https://github.com/pankajnimgade/PracticalProgramming/blob/master/src/main/java/test101/basic/programming/Test116PyramidPattern.java">Pyramid Pattern</a>
 */
public class Test116PyramidPattern {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int heightOfPattern = SCANNER.nextInt();
        createPyramidPattern(heightOfPattern);
    }

    /**
     * Input : 3
     *
     * | | |*| | |  height 1
     * | |*|*|*| |  height 2
     * |*|*|*|*|*|  height 3
     *
     * horizontal scaling = current height + previous height
     *
     * current height,
     * current horizontal Index and
     * how far is it from center
     */
    private static void createPyramidPattern(int heightOfPattern) {
        int columnScale = heightOfPattern + (heightOfPattern - 1);

        for (int heightIndex = 1; heightIndex <= heightOfPattern; heightIndex++) {

            for (int columnIndex = 1; columnIndex <= columnScale; columnIndex++) {

                int distanceFromCenter = Math.abs(heightOfPattern - columnIndex);
                if (distanceFromCenter < heightIndex) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
