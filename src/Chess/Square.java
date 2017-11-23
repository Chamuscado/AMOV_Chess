package Chess;

import Chess.Pieces.Piece;

public class Square {
    Piece piece;
    int color;
    int backColor;

    public Square() {
        piece = null;
        color = 0;
        color = 0;
    }

    public Piece removePiece() {
        Piece p = piece;
        piece = null;
        return p;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getBackColor() {
        return backColor;
    }

    public void setBackColor(int backColor) {
        this.backColor = backColor;
    }

    @Override
    public String toString() {
        return piece == null ? " " : piece.toString();
    }
}
