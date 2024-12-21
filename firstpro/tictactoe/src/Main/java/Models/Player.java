package Main.java.Models;

public abstract class Player {
    private Character symbol;
    private string name;
    private int id;
    private PlayerType playerType;

    public abstract Cell makeMove(Board board);

    public Player(Character symbol, String name, int id, PlayerType playerType) {
        this.symbol = symbol;
        this.name = name;
        this.id = id;
        this.playerType = playerType;
    }

    public Character getSymbol() {
        return symbol;
    }

    public void setSymbol(Character symbol) {
        this.symbol = symbol;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
