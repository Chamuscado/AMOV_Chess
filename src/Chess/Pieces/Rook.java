package Chess.Pieces;

public class Rook implements Piece {


    @Override
    public byte getPlayer() {
        return 0;
    }

    @Override
    public int[][] gerDesloc() {
        return new int[0][];
    }
    @Override
    public String toString() {
        return "R";
    }
}
