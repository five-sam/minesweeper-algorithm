

// Tile gives info on the Tile being used, otherwise ends
public class Tile {
    // TODO: Learn if theres a cleaner solution than just making everything public
    public int[] coordinate;
    public int value;
    public boolean isExplored;
    public boolean isMine;
    public boolean isFlag;

    public Tile(int[] coordinate) {
        this.coordinate = coordinate;
        this.value = 0;
        this.isExplored = false;
        this.isMine = false;
        this.isMine = false;
    }
    
    public String toString() {
        if (isFlag) { return "⚑"; }

        if (!isExplored) { return "▢"; }

        if (isMine) { return "✺"; }

        return Integer.toString(value);
    }
}
