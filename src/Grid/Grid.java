package Grid;

import java.util.Arrays;

public class Grid {

    // 2D approach first, then GUI

    // TODO: GUI
    final private int VERTICAL_LINES = 10;
    final private int  HORIZONTAL_LINES = 10;

    // structure
    char[][] map = {{'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}};

    // structure for map
    char[][] mapChar;

    // method for creating an array
    public char[][] get2DMap() {
        // creating 2D map
        for (int iVertical = 0; iVertical < VERTICAL_LINES + 1; iVertical++) {
           for (int iHorizontal = 0; iHorizontal < HORIZONTAL_LINES + 1; iHorizontal++) {
               mapChar[iVertical][iHorizontal] = 'X';
           }
        }
        return mapChar;
    }

    // print map
    public void printMap() {
        System.out.println(Arrays.deepToString(this.mapChar));
    }

}
