package Chess.Pieces;

import Chess.Board;
import Chess.Square;

public class Piece implements PieceInterface {

    Square square;

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    @Override
    public byte getPlayer() {
        return 0;
    }

    @Override
    public int[][] gerDesloc(Board board) {
        return new int[0][];
    }
}
