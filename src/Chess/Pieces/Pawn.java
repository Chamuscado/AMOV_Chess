package Chess.Pieces;

import Chess.Player;

public class Pawn extends Piece {


    public Pawn(Player player) {
        super(player);
    }

    @Override
    public String toString() {
        return "\u2659";
    }
}
