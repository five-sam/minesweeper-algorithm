import java.util.Random;

// NOTES :
// MUST BE A COMPLETE BLACKBOX TO ALGORITHM, OTHERWISE SACRIFICES CONFIDENTIALITY
// this means all void return types, only information comes through prints, and only thing that can go in is a flag or explore action

// This class creates the board that minesweeper is played upon
// Only input are the constructors and action(), only output is toString()
public class Board {
    // Theoretically this group of variables could be given without sacrificing confidentiality, but I'm already committed to the blackbox idea
    private int[] dimensions;
    private int numMines;
    private boolean isGameOver;

    private Random rand; // this could be a local variable but I think if I end up adding smart start I need this as an instance variable

    // initializes then calls boardBuilder, have 2 constructors depending on whether or not a seed is used
    public Board(int[] dimensions, int numMines) {
        this.dimensions = dimensions;
        this.numMines = numMines;
        this.isGameOver = false;
        this.rand = new Random();
        boardBuilder();
    } public Board(int[] dimensions, int numMines, long seed) {
        this.dimensions = dimensions;
        this.numMines = numMines;
        this.isGameOver = false;
        this.rand = new Random(seed);
        boardBuilder();
    }

    private void boardBuilder() {
        
    }



    // This is the only input the Board takes
    public void action(int[] coordinate, boolean isExplore) {
        if (isGameOver) { return; }
    }

    private void flag(int[] coordinate) {

    }

    private void explore(int[] coordinate) {

    }


    // This is the only output the Board gives
    public String toString() {
        return "";
    }

    // The more I code the more I realize I cannot reasonably make this a nested class.
    /*
    private class Tile {
        private int[] coordinate;
        private int value;
        private boolean isExplored;
        private boolean isMine;
        private boolean isFlag;

        // kinda ugly code but this feels a lot more sensible than something overengineered
        private Tile(int[] coordinate, int value, boolean isExplored, boolean isMine, boolean isFlag) {

        }

        public toString
    }
    */

}