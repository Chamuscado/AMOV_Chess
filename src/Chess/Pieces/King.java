package Chess.Pieces;

import Chess.Player;

public class King extends Piece {

    public King(Player player) {
        super(player);
    }

    @Override
    public String toString() {
        return "K";
    }
}
