package Grid;

import java.util.Arrays;

public class Grid {

    // 2D approach first, then GUI

    // TODO: GUI
    final private int VERTICAL_LINES = 10;
    final private int  HORIZONTAL_LINES = 10;

    // structure

    private char[][] map;

    public Grid() {
        this.map =  new char[][]{{'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}};
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

    // MOVE ON THE MAP
    public void moveOnMap(int coordinateX, int coordinateY, char player) {
        this.map[coordinateX][coordinateY] =  player;
    }

    // print map
    public void printMap() {
        System.out.println(Arrays.deepToString(this.get2DMap()));
    }

}
