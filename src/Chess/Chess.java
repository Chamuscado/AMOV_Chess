package Chess;

import Chess.Pieces.*;

import java.util.ArrayList;

public class Chess {
    Player[] players;
    Board board;
    Piece selected;

    public Chess() {
        players = new Player[2];
        players[0] = new Player();
        players[1] = new Player();
        board = new Board(new CoordV2(8, 8));
        selected = null;
    }

    public void initBoard() {
        for (int j = 0; j < 2; j++) {
            players[j].addPiece(new Rook(players[j]));
            players[j].addPiece(new Knight(players[j]));
            players[j].addPiece(new Bishop(players[j]));
            players[j].addPiece(new Queen(players[j]));
            players[j].addPiece(new King(players[j]));
            players[j].addPiece(new Bishop(players[j]));
            players[j].addPiece(new Knight(players[j]));
            players[j].addPiece(new Rook(players[j]));
            for (int i = 0; i < 8; i++)
                players[j].addPiece(new Pawn(players[j]));
        }
        board.initBoard(players);
    }

    public void setSelected(Coord pos) {

        setSelected(new CoordV2(pos));
    }

    public void setSelected(CoordV2 pos) {

        selected = board.getPieceAt(pos.X, pos.Y);
    }

    public void moveTo(Coord pos) {
        if(selected !=null)
        board.movePiece(selected.getSquare().getPos(), new CoordV2(pos));
        else
            System.out.println("Piece not selected!");
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
        System.out.println("Piece Selected: " + selected);
        board.printBoard();
    }


}
