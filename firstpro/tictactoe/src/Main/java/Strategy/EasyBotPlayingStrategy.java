package Main.java.Strategy;

import Main.java.Models.Board;
import Main.java.Models.Cell;
import Main.java.Models.CellState;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    public Cell makemove(Board board){
        for(List<Cell> row : board.getBoard()){
            for(Cell cell: row){
                if(CellState.Empty.equals(cell.getCellState())){
                    return cell;
                }
            }
        }
        return null;
    }
}
