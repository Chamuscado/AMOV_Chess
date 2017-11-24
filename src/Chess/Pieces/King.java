package Chess.Pieces;

public class King extends Piece {

    @Override
    public byte getPlayer() {
        return 0;
    }

    @Override
    public String toString() {
        return "K";
    }
}
