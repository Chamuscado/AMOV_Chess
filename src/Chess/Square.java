package Chess;

import Chess.Pieces.PieceInterface;

public class Square {
    PieceInterface piece;
    int color;
    int backColor;

    public Square() {
        piece = null;
        color = 0;
        color = 0;
    }

    public PieceInterface removePiece() {
        PieceInterface p = piece;
        piece = null;
        return p;
    }

    public PieceInterface getPiece() {
        return piece;
    }

    public void setPiece(PieceInterface piece) {
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
