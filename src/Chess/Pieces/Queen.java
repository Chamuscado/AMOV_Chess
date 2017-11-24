package Chess.Pieces;

import Chess.Player;

public class Queen extends Piece {

    public Queen(Player player) {
        super(player);
    }

    @Override
    public String toString() {
        return "Q";
    }
}
