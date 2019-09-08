package test101.basic.programming;

import javafx.util.Pair;

import java.util.Scanner;

/**
 * for a given string in following letters: L, R, U, D
 *
 * find out what would be the destination coordinates would be is you would follow the given string directions
 *
 * Input  :  U
 * Output :  0 1
 * @see <a href="https://github.com/pankajnimgade/PracticalProgramming/blob/master/src/main/java/test101/basic/programming/Test108MazeDirection.java">Maze Direction</a>
 */
public class Test108MazeDirection {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        String givenDirection = SCANNER.next();

        Pair<Integer, Integer> destinationLocation = getDestinationLocation(givenDirection);

        System.out.println("X-axis: "+destinationLocation.getKey()+", Y-axis: "+destinationLocation.getValue());
    }

    /**
     *                      | y-axis
     *                      |
     *                      |
     *                      |
     *                      |
     * ---------------------------------------------- x-axis
     *                      |
     *                      |
     *                      |
     *                      |
     *                      |
     * @param givenDirection
     * @return
     */
    private static Pair<Integer, Integer> getDestinationLocation(String givenDirection) {
        int x = 0; // position at x-axis
        int y = 0; // position at y-axis

        for (char character : givenDirection.toCharArray()) {
            switch (character){
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
            }
        }
        return new Pair<>(x, y);
    }
}
