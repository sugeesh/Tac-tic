/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.board;

import com.sun.org.apache.xpath.internal.operations.Equals;

/**
 *
 * @author Nilanga
 */
public class board_controller {

    public boolean isBoardFull(String[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkRowCol(String s1, String s2, String s3) {
        if (!s1.isEmpty() && s1.equals(s2) && s2.equals(s3)) {
            return true;
        }
        return false;
    }

    public boolean checkRowWin(String[][] board) {
        for(int i=0;i<3;i++){
            if(checkRowCol(board[i][0], board[i][1],board[i][2])){
                return true;
            }
        }
        return false;
    }
    
    public boolean checkColWin(String[][] board){
        for(int i=0;i<3;i++){
            if(checkRowCol(board[0][i], board[1][i],board[2][i])){
                return true;
            }
        }
        return false;
    }
    
    public boolean checkDiagonalWin(String[][] board){
        return checkRowCol(board[0][0], board[1][1],board[2][2]) || checkRowCol(board[0][2], board[1][1],board[2][0]);
    }
    
    public boolean checkForWins(String[][] board){
        if(checkRowWin(board) || checkColWin(board) || checkDiagonalWin(board)){}
        return false;
    }
}
