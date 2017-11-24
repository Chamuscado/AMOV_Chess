package Chess;

import Chess.Pieces.*;

import java.util.ArrayList;

public class Chess {
    ArrayList<PieceInterface>[] pieces;
    Board board;

    public Chess() {
        pieces = new ArrayList[2];
        pieces[0] = new ArrayList<>();
        pieces[1] = new ArrayList<>();
        board = new Board(new CoordV2(8, 8));

    }

    public void initBoard() {
        for (int j = 0; j < 2; j++) {
            pieces[j].add(new Rook());
            pieces[j].add(new Knight());
            pieces[j].add(new Bishop());
            pieces[j].add(new Queen());
            pieces[j].add(new King());
            pieces[j].add(new Bishop());
            pieces[j].add(new Knight());
            pieces[j].add(new Rook());
            for (int i = 0; i < 8; i++)
                pieces[j].add(new Pawn());
        }
        board.initBoard(pieces);
    }

    public void move(Coord pos1, Coord pos2) {
        board.movePiece(new CoordV2(pos1), new CoordV2(pos2));
    }

    public void move(String move) {
        Coord start = new Coord();
        Coord end = new Coord();

        start.setLetter(move.charAt(1));
        start.setNumb(move.charAt(2) - '0');
        end.setLetter(move.charAt(4));
        end.setNumb(move.charAt(5) - '0');

        move(start, end);
    }

    public void printBoard() {
        board.printBoard();
    }



}
