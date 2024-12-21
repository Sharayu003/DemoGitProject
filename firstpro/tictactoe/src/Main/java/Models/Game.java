package Main.java.Models;

import Main.java.Strategy.WinningStrategy;
import Main.java.exception.DuplicateSymbolForPlayer;
import Main.java.exception.MoreThanOneBotException;
import Main.java.exception.PlayersAndBoardCountMismatch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Game {
    private List<Player> playerList;
    private Board board;
    private Player winner;
    private GameState gameState;
    private int nextPlayerIndex;
    private List<Move> moves;
    private List<WinningStrategy> winningStrategies;

    private Game(List<Player> playerList, int dimension, List<WinningStrategy> winningStrategies) {
        this.nextPlayerIndex = 0;
        this.gameState = GameState.IN_PROG;
        this.moves = new ArrayList<>();
        this.board = new Board(dimension);
        this.playerList = playerList;
        this.winningStrategies = winningStrategies;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public void printBoard() {
        board.printBoard();
    }

    public void makemove() {
        Player player = playerList.get(nextPlayerIndex);
        Cell cell = player.makeMove(Board);
        Move move = new Move(cell, player);
        moves.add(move);

        if(checkWinner(move, board)){
            gameState = GameState.CONCLUDED;
            winner = player;
            return;
        }
        if(moves.size()==board.getDimension()*board.getDimension()){
            gameState = GameState.DRAW;
            return;
        }
        nextPlayerIndex++;
        nextPlayerIndex = nextPlayerIndex % playerList.size();

;    }
    private boolean checkWinner(Move move, Board board){
        for(WinningStrategy winningStrategy :  winningStrategies){
            if(winningStrategy.checkWinner(board, move)){
                return true;
            }
        }
        return false
    }

    public static class Builder{
        private List<Player> players;
        private int dimension;
        private List<WinningStrategy> winningStrategies;

        private Builder(){
            this.dimension = 0;
            this.players = new ArrayList<>();
        }

        public Builder setDimension(int dimension){
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<players> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies){
            this.winningStrategies = winningStrategies;
            return this;
        }
        public Game build(){
            validateBotCount();
            validateDimensionAndPlayerCount();
            validateUniqueSymbolForEachPlayer();
            return new Game(players, dimension, winningStrategies);
        }

        private void validateUniqueSymbolForEachPlayer() {
            HashSet<Character> symbol = new HashSet<>();
            for(Player player : players){
                if(symbol.contains(player.getSymbol())){
                    throw new DuplicateSymbolForPlayer();
                }
                symbol.add(player.getSymbol());
            }
        }

        private void validateDimensionAndPlayerCount() {
            if(players.size()!=dimension-1){
                throw new PlayersAndBoardCountMismatch();
            }
        }

        private void validateBotCount() throws MoreThanOneBotException {
            int botCount = 0;
            for(players player : players){
                if(player.getPlayerType().equals(PlayerType.Bot)){
                    botCount++;
                }
                if(botCount>1){
                    throw new MoreThanOneBotException();
                }
            }
        }

    }
}
