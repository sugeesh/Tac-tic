/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.com_play;

import java.util.Random;

/**
 *
 * @author Nilanga
 */
public class ComputerPlay {

    //This method returns the column which should be filled to get 3 in a row
    public int twoCellsFilledRow(String[][] board, String sign) {
        for (int i = 0; i < 3; i++) {
            if ((!board[i][0].isEmpty() && board[i][0].equals(board[i][1]) && board[i][0].equals(sign)) // 0 and 1 
                    || (!board[i][1].isEmpty() && board[i][1].equals(board[i][2]) && board[i][1].equals(sign)) //1 and 2
                    || (!board[i][0].isEmpty() && board[i][0].equals(board[i][2]) && board[i][0].equals(sign))) { //0 and 2
                return i;
            }
        }
        return -1;
    }

    //This method returns the column which should be filled to get 3 in a column
    public int twoCellsFilledCol(String[][] board, String sign) {
        for (int i = 0; i < 3; i++) {
            if ((!board[0][i].isEmpty() && board[0][i].equals(board[1][i]) && board[0][i].equals(sign))   // 0 and 1
                    || (!board[1][i].isEmpty() && board[1][i].equals(board[2][i]) && board[1][i].equals(sign)) // 1 and 2
                    || (!board[0][i].isEmpty() && board[0][i].equals(board[2][i])) && board[0][i].equals(sign)) { //0 and 2
                return i;
            }
        }
        return -1;
    }

    //This method returns the row which the diagonal cell should be filled to get 3 in a diagonal
    public int twoCellsFilledFirstDiagonal(String[][] board, String sign) {
        if (!board[0][0].isEmpty() && board[0][0].equals(board[1][1]) && board[0][0].equals(sign)) {
            return 2;
        } else if (!board[1][1].isEmpty() && board[1][1].equals(board[2][2]) && board[1][1].equals(sign)) {
            return 0;
        } else if (!board[0][0].isEmpty() && board[0][0].equals(board[2][2]) && board[0][0].equals(sign)) {
            return 1;
        }
        return -1;
    }
    
    //This method returns the row which the diagonal cell should be filled to get 3 in a diagonal
    public int[] twoCellsFilledSecondDiagonal(String[][] board, String sign) {
        if (!board[0][2].isEmpty() && board[0][2].equals(board[1][1]) && board[0][2].equals(sign)) {
            return new int[]{2,0};
        } else if (!board[1][1].isEmpty() && board[1][1].equals(board[2][0]) && board[1][1].equals(sign)) {
            return new int[]{0,2};
        } else if (!board[0][2].isEmpty() && board[0][2].equals(board[2][0]) && board[0][0].equals(sign)) {
            return new int[]{1,1};
        }
        return new int[]{-1,-1};
    }
    
    

    //This method tries to win the computer
    public boolean tryToWin(String[][] board, String comSign) {
        boolean bool = false;
        if (twoCellsFilledRow(board, comSign) != -1) {
            for (int i = 0; i < 3; i++) {
                if (board[twoCellsFilledRow(board, comSign)][i].isEmpty()) {
                    board[twoCellsFilledRow(board, comSign)][i] = comSign;
                    bool = true;
                }
            }
        } else if (twoCellsFilledCol(board, comSign) != -1) {
            for (int i = 0; i < 3; i++) {
                if (board[i][twoCellsFilledCol(board, comSign)].isEmpty()) {
                    board[i][twoCellsFilledCol(board, comSign)] = comSign;
                    bool = true;
                }
            }
        } else if (twoCellsFilledFirstDiagonal(board, comSign) != -1) {
            if (board[twoCellsFilledFirstDiagonal(board, comSign)][twoCellsFilledFirstDiagonal(board, comSign)].isEmpty()) {
                board[twoCellsFilledFirstDiagonal(board, comSign)][twoCellsFilledFirstDiagonal(board, comSign)] = comSign;
                bool = true;
            }
        }
        System.out.println("tryTowin");
        return bool;
    }

    //This method will block chances of player to win
    public boolean blockPlayerWin(String[][] board, String playerSign, String comSign) {
        boolean bool = false;
        if (twoCellsFilledRow(board, playerSign) != -1) {
            for (int i = 0; i < 3; i++) {
                if (board[twoCellsFilledRow(board, playerSign)][i].isEmpty()) {
                    board[twoCellsFilledRow(board, playerSign)][i] = comSign;
                    bool = true;
                }
            }
        } else if (twoCellsFilledCol(board, playerSign) != -1) {
            for (int i = 0; i < 3; i++) {
                if (board[i][twoCellsFilledCol(board, playerSign)].isEmpty()) {
                    board[i][twoCellsFilledCol(board, playerSign)] = comSign;
                    bool = true;
                }
            }
        } else if ( twoCellsFilledFirstDiagonal(board, playerSign) != -1) {
            if (board[twoCellsFilledFirstDiagonal(board, playerSign)][twoCellsFilledFirstDiagonal(board, playerSign)].isEmpty()) {
                board[twoCellsFilledFirstDiagonal(board, playerSign)][twoCellsFilledFirstDiagonal(board, playerSign)] = comSign;
                bool = true;
            }
        } else if ( twoCellsFilledSecondDiagonal(board, playerSign)[0] != -1 ) {
            if (board[twoCellsFilledSecondDiagonal(board, playerSign)[0]][twoCellsFilledSecondDiagonal(board, playerSign)[1]].isEmpty()) {
                board[twoCellsFilledSecondDiagonal(board, playerSign)[0]][twoCellsFilledSecondDiagonal(board, playerSign)[1]] = comSign;
                bool = true;
            }
        }
        
        System.out.println("bolckPlayerWin");
        return bool;
    }

    public boolean oneCellRowFill(String[][] board, String comSign) {
        boolean bool = false;
        L1:
        for (int i = 0; i < 3; i++) {
            int k = 0;
            int p = 0;
            for (int j = 0; j < 3; j++) {
                if (!board[i][j].isEmpty() && board[i][j].equals(comSign)) {
                    k++;
                } else if (board[i][j].isEmpty()) {
                    p++;
                }
            }
            if (k == 1 && p == 2) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j].isEmpty()) {
                        board[i][j] = comSign;
                        bool = true;
                        break L1;
                    }
                }
            }
        }
        
        
        System.out.println("OneCellRowFill");
        return bool;
    }

    public boolean oneCellColumnFill(String[][] board, String comSign) {
        boolean bool = false;
        L1:
        for (int i = 0; i < 3; i++) {
            int k = 0;
            int p = 0;
            for (int j = 0; j < 3; j++) {
                if (!board[j][i].isEmpty() && board[j][i].equals(comSign)) {
                    k++;
                } else if (board[j][i].isEmpty()) {
                    p++;
                }
            }
            if (k == 1 && p == 2) {
                for (int j = 0; j < 3; j++) {
                    if (board[j][i].isEmpty()) {
                        board[j][i] = comSign;
                        bool = true;
                        break L1;
                    }
                }
            }
        }
        System.out.println("OneCellColumnFill");
        return bool;
    }

//    public String oneCellFilled(String[][] board, String comSign) {
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (!board[i][j].isEmpty() && board[i][j].equals(comSign)) {
//                    return (String) (i + "." + j);
//                }
//            }
//        }
//        return null;
//
//    }
//    public void makeTwoInRow(String[][] board, String comSign) {
//        if (oneCellFilled(board, comSign) != null) {
//            int row = Integer.parseInt(oneCellFilled(board, comSign).split(".")[0]);
//            int col = Integer.parseInt(oneCellFilled(board, comSign).split(".")[1]);
//           
//        }
//    }
    public boolean fisrtCellFill(String[][] board, String comSign) {
        Random random = new Random();
        int row = 0;
        int column = 0;

        System.out.println("First Cell Fill");
        while (true) {
            row = random.nextInt(3);
            column = random.nextInt(3);

            if (board[column][row].isEmpty()) {
                board[column][row] = comSign;
                break;
            }
        }
        System.out.println("FirstCellFill");
        return true;
    }

}
