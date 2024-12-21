package Main.java.app;

import Main.java.Controllers.GameController;
import Main.java.Models.*;
import Main.java.Strategy.ColWinningStrategy;
import Main.java.Strategy.DiagonalWinningStrategy;
import Main.java.Strategy.RowWinningStrategy;
import Main.java.Strategy.WinningStrategy;

import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        GameController gameController = new GameController();

        int dimension = 3;

        ArrayList<Player> players = new ArrayList<>();

        players.add(new HumanPlayer('X',"Keerthi",1, PlayerType.Human));
        players.add(new Bot('0',"GPT",2, PlayerType.Bot, DifficultyLevel.EASY));
       // players.add(new Bot('0',"BARD",2, PlayerType.Human, DifficultyLevel.EASY));

        ArrayList<WinningStrategy> winningStrategies = new ArrayList<>();

        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColWinningStrategy());
        winningStrategies.add(new DiagonalWinningStrategy());


        Game game = gameController.createGame(dimension, players, winningStrategies);

        gameController.printBoard(game);

        while(GameState.IN_PROG.equals(game.getGameState())){
            gameController.printBoard(game);
            gameController.makeMove(game);
        }

        if(GameState.CONCLUDED.equals(game.getGameState())){
            System.out.println(game.getWinner().getName()+" Has won the game");
        }
        if(GameState.DRAW.equals(game.getGameState())){
            System.out.println("It's a draw");
        }
    }
}
