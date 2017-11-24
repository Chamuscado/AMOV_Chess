package Chess;

import Chess.Pieces.Piece;

import java.util.ArrayList;

public class Player {
    ArrayList<Piece> pieces;

    public Player() {
        pieces = new ArrayList<>();
    }

    public void addPiece(Piece piece) {
        pieces.add(piece);
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }
}
