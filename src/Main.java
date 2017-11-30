import Chess.*;

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
            else if (cmd.compareTo("fim") == 0)
                break;
            else if (cmd.compareTo("select") == 0) {
                cmd = sline.next();
                game.setSelected(new Coord(cmd.charAt(0), cmd.charAt(1) - '0'));
            } else if (cmd.compareTo("moveto") == 0) {
                cmd = sline.next();
                game.moveTo(new Coord(cmd.charAt(0), cmd.charAt(1) - '0'));
            }

            game.printBoard();
        }
    }
}
