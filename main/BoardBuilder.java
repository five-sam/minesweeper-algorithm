import java.util.Random;

// BoardBuilder init() builds the gameBoard and returns it

public class BoardBuilder {
    public static Tile[][] init(int[] dimensions, int numMines, Random rand) {
        Tile[][] finalGameBoard = new Tile[dimensions[0]][dimensions[1]];

        for (int i = 0; i < dimensions[0]; i++) {
            for (int j = 0; j < dimensions[1]; j++) {
                int[] coordinates = {i, j};
                finalGameBoard[i][j] = new Tile(coordinates);
            }
        }

        helperMines(finalGameBoard, numMines, rand);



        return finalGameBoard;
    }

    // fills board up with mines
    private static void helperMines(Tile[][] gameBoard, int numMines, Random rand) {

        while(numMines > 0) { // could cause infinite loop if data isn't fixed before this point
            int i = rand.nextInt(gameBoard.length);
            int j = rand.nextInt(gameBoard[0].length);
            Tile randTile = gameBoard[i][j];
            if (!randTile.isMine) {
                randTile.isMine = true;
                numMines--;
            }
        }

    }

    private static void helperValues(Tile[][] gameBoard, int numMines, Random rand) {
        
    }
}
