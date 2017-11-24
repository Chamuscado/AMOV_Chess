package Chess.Pieces;

import Chess.Board;

public class Piece implements PieceInterface{
    @Override
    public byte getPlayer() {
        return 0;
    }

    @Override
    public int[][] gerDesloc(Board board) {
        return new int[0][];
    }
}
