package Chess.Pieces;

import Chess.Board;
import Chess.Square;

public class Rook extends Piece {

    @Override
    public byte getPlayer() {
        return 0;
    }

    @Override
    public String toString() {
        return "R(" + getSquare().getX()+"/"+getSquare().getY();
    }

    @Override
    public int[][] gerDesloc(Board board) {
        int[][] mat = new int[8][8];
        for (int i = 0; i < mat.length; ++i)
            for (int j = 0; j < mat[i].length; ++j)
                mat[i][j] = 0;

        return mat;
    }
}
