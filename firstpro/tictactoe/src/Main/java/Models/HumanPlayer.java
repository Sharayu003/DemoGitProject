package Main.java.Models;

import java.util.Scanner;

public class HumanPlayer extends Player{

    public Scanner scanner;

    @Override
    public Cell makeMove(Board board){
        System.out.println(this.getName()+"Its Your turn to make move, Enter row and col");
        int row = Scanner.nextInt();
        int col = Scanner.nextInt();

        while(!validateRowAndCol(row, col,board)){
            System.out.println(this.getName()+"Invalid move, please enter row and col again");
             row = Scanner.nextInt();
             col = Scanner.nextInt();
        }
        Cell cell = board.getBoard().get(row).get(col);
        cell.setCellState(CellState.Filled);
        cell.setPlayer(this);
        return cell;

    }

    private boolean validateRowAndCol(int row, int col, Board board) {
        if(row>=board.getDimension() || row<0){
            return false;
        }
        if(col>=board.getDimension() || col<0){
            return false;
        }
        if(CellState.Filled.equals(board.getBoard().get(row).get(col).getCellState())){
            return false;
        }
        return true;
    }

    public HumanPlayer(Character symbol, String name, int id, PlayerType playerType, Scanner scanner) {
        super(symbol, name, id, playerType);
        this.scanner = scanner;
    }
}
