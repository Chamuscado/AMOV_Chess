import Chess.Chess;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Chess game = new Chess();
        game.initBoard();
        game.printBoard();
        Scanner in = new Scanner(System.in);
        while (true) {
            String line = in.nextLine();
            Scanner sline = new Scanner(line);
            String cmd = sline.next();

            if (cmd.compareTo("move") == 0)
                game.move(sline.nextLine());

            game.printBoard();
        }
    }
}
