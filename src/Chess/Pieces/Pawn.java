package Chess.Pieces;

public class Pawn extends Piece {

    @Override
    public byte getPlayer() {
        return 0;
    }

    @Override
    public String toString() {
        return "P";
    }
}
