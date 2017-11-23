package Chess;

import Chess.Pieces.Piece;

import java.util.ArrayList;

public class Board {
    private Square board[][];

    public Board(CoordV2 size) {
        board = new Square[size.X][size.Y];
        for (int i = 0; i < size.X; ++i)
            for (int j = 0; j < size.X; ++j)
                board[i][j] = new Square();
    }

    public void initBoard(ArrayList<Piece>[] pieces) {
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 8; i++)
                board[j][i].setPiece(pieces[0].get(j * 8 + i));
        }
        int aux = pieces[1].size() - 1;
        for (int j = 6; j < 8; j++) {
            for (int i = 0; i < 8; i++, aux--)
                board[j][i].setPiece(pieces[1].get(aux));
        }
    }

    public void movePiece(CoordV2 pos1, CoordV2 pos2) {

        if (board[pos1.X][pos1.Y].piece == null)
            return;
        Piece piece = board[pos1.X][pos1.Y].removePiece();
        board[pos2.X][pos2.Y].piece = piece;
    }

    public void printBoard() {
        int p = 1;
        System.out.print("    ");
        for (int i = 0; i < 8; ++i)
            System.out.print(((char) (i + 'A')) + " ");
        System.out.println();
        System.out.print("    ");

        for (int i = 0; i < 8; ++i)
            System.out.print("- ");

        System.out.println();
        for (Square[] i : board) {
            System.out.print(p + " | ");
            for (Object j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
            p++;
        }
    }
}