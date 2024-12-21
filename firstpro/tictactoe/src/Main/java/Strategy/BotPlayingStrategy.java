package Main.java.Strategy;

import Main.java.Models.Board;
import Main.java.Models.Cell;

public interface BotPlayingStrategy {
    Cell makeMove(Board board);
}
