package Main.java.Controllers;

import Main.java.Models.Game;
import Main.java.Models.Player;
import Main.java.Strategy.WinningStrategy;

import java.util.List;

public class GameController {
    public Game createGame(int dimension, List<Player> playerList, List<WinningStrategy> winningStrategyList){
        return Game.getBuilder()
                .setPlayers(playerList)
                .setDimension(dimension)
                .setWinningStrategies(winningStrategyList)
                .build();
    }
    
    public void makeMove(Game game){
        game.makemove();
    }

    }
    public void printBoard(Game game){
        game.printBoard();

    }
}
