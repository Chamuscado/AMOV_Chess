package Chess.Pieces;

import Chess.Board;
import Chess.CoordV2;
import Chess.Player;

public class Rook extends Piece {

    public Rook(Player player) {
        super(player);
    }

    @Override
    public String toString() {
        return "R(" + getSquare().getX() + "/" + getSquare().getY() + ")";
    }

    @Override
    public int[][] gerDesloc(Board board) {
        int[][] mat = new int[8][8];
        for (int i = 0; i < mat.length; ++i)
            for (int j = 0; j < mat[i].length; ++j)
                mat[i][j] = 0;

        CoordV2 pos = getSquare().getPos();

        for (int i = pos.getX(); i < mat.length; ++i)
            //if ()
                mat[pos.getY()][i] = 1;

        return mat;
    }
}
