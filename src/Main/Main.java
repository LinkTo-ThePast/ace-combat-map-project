package Main;

import Grid.Grid;

import java.util.Arrays;

public class Main {

    // entry point for the application
    public static void main(String[] args) {
        System.out.println("Map for Ace Combat: personal project.");
        Grid newMap = new Grid();
        System.out.println(Arrays.deepToString(newMap.get2DMap()).replace("],", "],\n"));
        //System.out.println(Arrays.deepToString(newMap.getMap()).replace("],", "],\n"));
    }
}
