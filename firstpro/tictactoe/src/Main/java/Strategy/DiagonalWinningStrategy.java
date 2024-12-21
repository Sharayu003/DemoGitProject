package Main.java.Strategy;

import Main.java.Models.Board;
import Main.java.Models.Move;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy {
    Map<Character,Integer> leftDiaMap = new HashMap<>();
    Map<Character,Integer> rightDiaMap = new HashMap<>();


    public boolean checkWinner(Board board, Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Character symbol = move.getPlayer().getSymbol();

        // check if move is part of left diagonal

        if(row==col){
            //check we're putting this symbol first time in this diagonal
            if(leftDiaMap.containsKey(symbol)){
                leftDiaMap.put(symbol,0);
            }
            leftDiaMap.put(symbol,leftDiaMap.get(symbol)+1);
            if(leftDiaMap.get(symbol).equals(board.getDimension())){
                return true;
            }
        }
        //check if move was part of right diagonal
        if(row+col==(board.getDimension()-1))
    }
}
