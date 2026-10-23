package Main;

import Grid.Grid;

import java.util.Arrays;

public class Main {

    // entry point for the application
    public static void main(String[] args) {
        System.out.println("Map for Ace Combat: personal project.");
        Grid newMap = new Grid();
        char[][] map2D = newMap.get2DMap();
        System.out.println(Arrays.deepToString(map2D));
    }
}
