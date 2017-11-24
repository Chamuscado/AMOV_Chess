package Chess.Pieces;

public class Queen extends Piece {

    @Override
    public byte getPlayer() {
        return 0;
    }

    @Override
    public String toString() {
        return "Q";
    }
}
