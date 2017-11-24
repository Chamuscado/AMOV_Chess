package Chess.Pieces;

import Chess.Player;

public class Knight extends Piece {

    public Knight(Player player) {
        super(player);
    }

    @Override
    public String toString() {
        return "k";
    }
}
