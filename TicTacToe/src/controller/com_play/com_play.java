/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.com_play;

/**
 *
 * @author Nilanga
 */
public class com_play {

    //This method returns the column which should be filled to get 3 in a row
    public int twoCellsFilledRow(String[][] board, String sign) {
        for (int i = 0; i < 3; i++) {
            if ((!board[i][0].isEmpty() && board[i][0].equals(board[i][1]) && board[i][0].equals(sign)) || (!board[i][1].isEmpty() && board[i][1].equals(board[i][2]) && board[i][1].equals(sign)) || (!board[i][0].isEmpty() && board[i][0].equals(board[i][2]) && board[i][0].equals(sign))) {
                return i;
            }
        }
        return 0;
    }

    //This method returns the column which should be filled to get 3 in a column
    public int twoCellsFilledCol(String[][] board, String sign) {
        for (int i = 0; i < 3; i++) {
            if ((!board[0][i].isEmpty() && board[0][i].equals(board[i][1]) && board[0][i].equals(sign)) || (!board[1][i].isEmpty() && board[1][i].equals(board[2][i]) && board[1][i].equals(sign)) || (!board[0][i].isEmpty() && board[0][i].equals(board[2][i])) && board[0][i].equals(sign)) {
                return i;
            }
        }
        return 0;
    }

    //This method returns the row which the diagonal cell should be filled to get 3 in a diagonal
    public int twoCellsFilledDiagonal(String[][] board, String sign) {
        if (!board[0][0].isEmpty() && board[0][0].equals(board[1][1]) && board[0][0].equals(sign)) {
            return 2;
        } else if (!board[1][1].isEmpty() && board[1][1].equals(board[2][2]) && board[1][1].equals(sign)) {
            return 0;
        } else if (!board[0][0].isEmpty() && board[0][0].equals(board[2][2]) && board[0][0].equals(sign)) {
            return 1;
        }
        return 0;
    }

    //This method tries to win the computer
    public void tryToWin(String[][] board, String comSign) {
        if (twoCellsFilledRow(board, comSign) != 0) {
            for (int i = 0; i < 3; i++) {
                if (board[twoCellsFilledRow(board, comSign)][i].isEmpty()) {
                    board[twoCellsFilledRow(board, comSign)][i] = comSign;
                }
            }
        } else if (twoCellsFilledCol(board, comSign) != 0) {
            for (int i = 0; i < 3; i++) {
                if (board[i][twoCellsFilledRow(board, comSign)].isEmpty()) {
                    board[i][twoCellsFilledRow(board, comSign)] = comSign;
                }
            }
        } else if (twoCellsFilledDiagonal(board, comSign) != 0) {
            if (board[twoCellsFilledRow(board, comSign)][twoCellsFilledRow(board, comSign)].isEmpty()) {
                board[twoCellsFilledRow(board, comSign)][twoCellsFilledRow(board, comSign)] = comSign;
            }
        }
    }

    //This method will block chances of player to win
    public void blockPlayerWin(String[][] board, String playerSign, String comSign) {
        if (twoCellsFilledRow(board, playerSign) != 0) {
            for (int i = 0; i < 3; i++) {
                if (board[twoCellsFilledRow(board, playerSign)][i].isEmpty()) {
                    board[twoCellsFilledRow(board, playerSign)][i] = comSign;
                }
            }
        } else if (twoCellsFilledCol(board, playerSign) != 0) {
            for (int i = 0; i < 3; i++) {
                if (board[i][twoCellsFilledRow(board, playerSign)].isEmpty()) {
                    board[i][twoCellsFilledRow(board, playerSign)] = comSign;
                }
            }
        } else if (twoCellsFilledDiagonal(board, playerSign) != 0) {
            if (board[twoCellsFilledRow(board, playerSign)][twoCellsFilledRow(board, playerSign)].isEmpty()) {
                board[twoCellsFilledRow(board, playerSign)][twoCellsFilledRow(board, playerSign)] = comSign;
            }
        }
    }

    public String oneCellFilled(String[][] board, String comSign) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!board[i][j].isEmpty() && board[i][j].equals(comSign)) {
                    return (String) (i + "." + j);
                }
            }
        }
        return null;

    }

    public void makeTwoInRow(String[][] board, String comSign) {
        if (oneCellFilled(board, comSign) != null) {
            int row = Integer.parseInt(oneCellFilled(board, comSign).split(".")[0]);
            int col = Integer.parseInt(oneCellFilled(board, comSign).split(".")[1]);

        }
    }
}