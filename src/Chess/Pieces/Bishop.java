package Chess.Pieces;

import Chess.Board;
import Chess.Player;

public class Bishop extends Piece{

    public Bishop(Player player) {
        super(player);
    }

    @Override
    public String toString() {
        return "B";
    }
}
