package test101.basic.programming;


import java.util.Scanner;

/**
 * for a given string in following letters: L, R, U, D
 * <p>
 * find out what would be the destination coordinates would be is you would follow the given string directions
 * <p>
 * Input  :  U
 * Output :  0 1
 *
 * @see <a href="https://github.com/pankajnimgade/PracticalProgramming/blob/master/src/main/java/test101/basic/programming/Test108MazeDirection.java">Maze Direction</a>
 */
public class Test108MazeDirection {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        String givenDirection = SCANNER.next();

        Coordinate coordinate = getDestinationLocation(givenDirection);

        System.out.println("X-axis: " + coordinate.x + ", Y-axis: " + coordinate.y);
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
    private static Coordinate getDestinationLocation(String givenDirection) {
        Coordinate coordinate = new Coordinate();

        for (char character : givenDirection.toCharArray()) {
            switch (character) {
                case 'L':
                    coordinate.x--;
                    break;
                case 'R':
                    coordinate.x++;
                    break;
                case 'U':
                    coordinate.y++;
                    break;
                case 'D':
                    coordinate.y--;
                    break;
            }
        }
        return coordinate;
    }
}

class Coordinate {
    int x;
    int y;
}

