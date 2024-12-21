package Main.java.Models;

import Main.java.Factories.BotPlayingStrategyFactory;

public class Bot extends Player{
    private DifficultyLevel difficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(Character symbol, String name, int id, PlayerType playerType, DifficultyLevel difficultyLevel) {
        super(symbol, name, id, playerType);
        this.difficultyLevel = difficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(difficultyLevel);
    }

    private DifficultyLevel difficultyLevel;

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;

    }


    @Override
    public Cell makeMove(Board board) {
       Cell cell=botPlayingStrategy.makeMove(board);
       cell.setCellState(CellState.Filled);
       cell.setPlayer(this);
       return cell;
    }
}
