package Grid;

import java.util.Arrays;

public class Grid {

    // 2D approach first, then GUI

    // TODO: GUI
    final private int VERTICAL_LINES = 10;
    final private int  HORIZONTAL_LINES = 10;

    // structure
    private static char[][] map = {{'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}};

    public static char[][] getMap() {
        return map;
    }

    public static void setMap(char[][] map) {
        Grid.map = map;
    }


    // method for creating an array
    public char[][] get2DMap() {
        // structure for map
        char[][] mapChar = new char[VERTICAL_LINES][HORIZONTAL_LINES];
        // creating 2D map
        for (int iVertical = 0; iVertical < VERTICAL_LINES; iVertical++) {
           for (int iHorizontal = 0; iHorizontal < HORIZONTAL_LINES; iHorizontal++) {
               mapChar[iVertical][iHorizontal] = 'X';
           }
        }
        return mapChar;
    }

    // print map
    public void printMap() {
        System.out.println(Arrays.deepToString(this.get2DMap()));
    }

}
