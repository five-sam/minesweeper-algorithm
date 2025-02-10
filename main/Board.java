import java.util.Random;

// NOTES :
// MUST BE A COMPLETE BLACKBOX TO ALGORITHM, OTHERWISE SACRIFICES CONFIDENTIALITY
// this means all void return types, only information comes through prints, and only thing that can go in is a flag or explore action

// This class creates the board that minesweeper is played upon.
// Only input are the constructors and action(), only output is toString()

public class Board {
    // Theoretically this group of variables could be given without sacrificing confidentiality, but I'm already committed to the blackbox idea
    private int[] dimensions = new int[2];
    private int numFlags;
    private int turn;
    private boolean isGameOver;

    private Tile[][] gameBoard;

    private Random rand; // this could be a local variable but I think if I end up adding smart start I need this as an instance variable

    // initializes then calls boardBuilder(), it has 2 constructors depending on whether or not a seed is used
    public Board(int[] dimensions, int numMines) {
        this.dimensions = dimensions;
        this.numFlags = numMines;
        this.turn = 0;
        this.isGameOver = false;
        this.rand = new Random();
        boardBuilder();
    } public Board(int[] dimensions, int numMines, long seed) {
        this.dimensions = dimensions;
        this.numFlags = numMines;
        this.turn = 0;
        this.isGameOver = false;
        this.rand = new Random(seed);
        boardBuilder();
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
        String finalString = "";

        finalString += "   ⚑: " + numFlags + "    ⊕: " + turn;

        for (int i = 0; i < dimensions[0]; i++) { // row
            for (int j = 0; j < dimensions[1]; j++) { // column
                finalString += " " + gameBoard[i][j];
            }
            finalString += "\n";
        }
        if (isGameOver) {
            finalString += "\n   ! Game Over !   \n";
        }
        return finalString;
    }

}