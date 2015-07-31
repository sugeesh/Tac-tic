/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Nilanga
 */
public class Main extends javax.swing.JFrame {

    public void checkForWins() {

        if ("X".equals(Board.jButton1.getText()) && Board.jButton2.getText() == "X" && "X".equals(Board.jButton3.getText())) {

            JOptionPane.showMessageDialog(null, "Player Wins!!!!");

        } else if ("X".equals(Board.jButton1.getText()) && "X".equals(Board.jButton4.getText()) && "X".equals(Board.jButton7.getText())) {

            JOptionPane.showMessageDialog(null, "Player Wins!!!!");

        } else if ("X".equals(Board.jButton1.getText()) && "X".equals(Board.jButton5.getText()) && "X".equals(Board.jButton9.getText())) {

            JOptionPane.showMessageDialog(null, "Player Wins!!!!");

        } else if ("X".equals(Board.jButton2.getText()) && "X".equals(Board.jButton5.getText()) && "X".equals(Board.jButton8.getText())) {

            JOptionPane.showMessageDialog(null, "Player Wins!!!!");

        } else if ("X".equals(Board.jButton3.getText()) && "X".equals(Board.jButton5.getText()) && "X".equals(Board.jButton7.getText())) {

            JOptionPane.showMessageDialog(null, "Player Wins!!!!");
        } else if ("X".equals(Board.jButton3.getText()) && "X".equals(Board.jButton6.getText()) && "X".equals(Board.jButton9.getText())) {

            JOptionPane.showMessageDialog(null, "Player Wins!!!!");

        } else if ("X".equals(Board.jButton4.getText()) && "X".equals(Board.jButton5.getText()) && "X".equals(Board.jButton6.getText())) {

            JOptionPane.showMessageDialog(null, "Player Wins!!!!");

        } else if ("X".equals(Board.jButton7.getText()) && "X".equals(Board.jButton8.getText()) && "X".equals(Board.jButton9.getText())) {

            JOptionPane.showMessageDialog(null, "Player Wins!!!!");
        }
        
        
        else if ("O".equals(Board.jButton1.getText()) && "O".equals(Board.jButton2.getText()) && "O".equals(Board.jButton3.getText())) {

            JOptionPane.showMessageDialog(null, "Computer Wins!!!!");

        } else if ("O".equals(Board.jButton1.getText()) && "O".equals(Board.jButton4.getText()) && "O".equals(Board.jButton7.getText())) {

            JOptionPane.showMessageDialog(null, "Computer Wins!!!!");

        } else if ("O".equals(Board.jButton1.getText()) && "O".equals(Board.jButton5.getText()) && "O".equals(Board.jButton9.getText())) {

            JOptionPane.showMessageDialog(null, "Computer Wins!!!!");

        } else if ("O".equals(Board.jButton2.getText()) && "O".equals(Board.jButton5.getText()) && "O".equals(Board.jButton8.getText())) {

            JOptionPane.showMessageDialog(null, "Computer Wins!!!!");

        } else if ("O".equals(Board.jButton3.getText()) && "O".equals(Board.jButton5.getText()) && "O".equals(Board.jButton7.getText())) {

            JOptionPane.showMessageDialog(null, "Computer Wins!!!!");
        } else if ("O".equals(Board.jButton3.getText()) && "O".equals(Board.jButton6.getText()) && "O".equals(Board.jButton9.getText())) {

            JOptionPane.showMessageDialog(null, "Computer Wins!!!!");

        } else if ("O".equals(Board.jButton4.getText()) && "O".equals(Board.jButton5.getText()) && "O".equals(Board.jButton6.getText())) {

            JOptionPane.showMessageDialog(null, "Computer Wins!!!!");

        } else if ("O".equals(Board.jButton7.getText()) && "O".equals(Board.jButton8.getText()) && "O".equals(Board.jButton9.getText())) {

            JOptionPane.showMessageDialog(null, "Computer Wins!!!!");
        }
        
    }

    public void computerPlay() {
        //Check for a chance to win
        if ("O".equals(Board.jButton1.getText()) && "O".equals(Board.jButton2.getText()) && Board.jButton3.getText().isEmpty()) {
            Board.jButton3.setText("O");
        } else if ("O".equals(Board.jButton1.getText()) && "O".equals(Board.jButton4.getText()) && Board.jButton7.getText().isEmpty()) {
            Board.jButton7.setText("O");
        } else if ("O".equals(Board.jButton1.getText()) && "O".equals(Board.jButton5.getText()) && Board.jButton9.getText().isEmpty()) {
            Board.jButton9.setText("O");
        } else if ("O".equals(Board.jButton2.getText()) && "O".equals(Board.jButton5.getText()) && Board.jButton8.getText().isEmpty()) {
            Board.jButton8.setText("O");
        } else if ("O".equals(Board.jButton3.getText()) && "O".equals(Board.jButton6.getText()) && Board.jButton9.getText().isEmpty()) {
            Board.jButton9.setText("O");
        } else if ("O".equals(Board.jButton3.getText()) && "O".equals(Board.jButton5.getText()) && Board.jButton7.getText().isEmpty()) {
            Board.jButton7.setText("O");
        } else if ("O".equals(Board.jButton4.getText()) && "O".equals(Board.jButton5.getText()) && Board.jButton6.getText().isEmpty()) {
            Board.jButton6.setText("O");
        } else if ("O".equals(Board.jButton7.getText()) && "O".equals(Board.jButton8.getText()) && Board.jButton9.getText().isEmpty()) {
            Board.jButton9.setText("O");
        } else if ("O".equals(Board.jButton3.getText()) && "O".equals(Board.jButton2.getText()) && Board.jButton1.getText().isEmpty()) {
            Board.jButton1.setText("O");
        } else if ("O".equals(Board.jButton7.getText()) && "O".equals(Board.jButton4.getText()) && Board.jButton1.getText().isEmpty()) {
            Board.jButton1.setText("O");
        } else if ("O".equals(Board.jButton9.getText()) && "O".equals(Board.jButton5.getText()) && Board.jButton1.getText().isEmpty()) {
            Board.jButton1.setText("O");
        } else if ("O".equals(Board.jButton8.getText()) && "O".equals(Board.jButton5.getText()) && Board.jButton2.getText().isEmpty()) {
            Board.jButton2.setText("O");
        } else if ("O".equals(Board.jButton9.getText()) && "O".equals(Board.jButton6.getText()) && Board.jButton3.getText().isEmpty()) {
            Board.jButton3.setText("O");
        } else if ("O".equals(Board.jButton7.getText()) && "O".equals(Board.jButton5.getText()) && Board.jButton3.getText().isEmpty()) {
            Board.jButton3.setText("O");
        } else if ("O".equals(Board.jButton6.getText()) && "O".equals(Board.jButton5.getText()) && Board.jButton4.getText().isEmpty()) {
            Board.jButton4.setText("O");
        } else if ("O".equals(Board.jButton9.getText()) && "O".equals(Board.jButton8.getText()) && Board.jButton7.getText().isEmpty()) {
            Board.jButton7.setText("O");
        } else if ("O".equals(Board.jButton1.getText()) && "O".equals(Board.jButton3.getText()) && Board.jButton2.getText().isEmpty()) {
            Board.jButton2.setText("O");
        } else if ("O".equals(Board.jButton1.getText()) && "O".equals(Board.jButton7.getText()) && Board.jButton4.getText().isEmpty()) {
            Board.jButton4.setText("O");
        } else if ("O".equals(Board.jButton1.getText()) && "O".equals(Board.jButton9.getText()) && Board.jButton5.getText().isEmpty()) {
            Board.jButton5.setText("O");
        } else if ("O".equals(Board.jButton2.getText()) && "O".equals(Board.jButton8.getText()) && Board.jButton5.getText().isEmpty()) {
            Board.jButton5.setText("O");
        } else if ("O".equals(Board.jButton3.getText()) && "O".equals(Board.jButton9.getText()) && Board.jButton6.getText().isEmpty()) {
            Board.jButton6.setText("O");
        } else if ("O".equals(Board.jButton3.getText()) && "O".equals(Board.jButton7.getText()) && Board.jButton5.getText().isEmpty()) {
            Board.jButton5.setText("O");
        } else if ("O".equals(Board.jButton4.getText()) && "O".equals(Board.jButton6.getText()) && Board.jButton5.getText().isEmpty()) {
            Board.jButton5.setText("O");
        } else if ("O".equals(Board.jButton7.getText()) && "O".equals(Board.jButton9.getText()) && Board.jButton8.getText().isEmpty()) {
            Board.jButton8.setText("O");
        }

        //Check if player has a chance to win

        if ("X".equals(Board.jButton1.getText()) && "X".equals(Board.jButton2.getText()) && Board.jButton3.getText().isEmpty()) {
            Board.jButton3.setText("O");
        } else if ("X".equals(Board.jButton1.getText()) && "X".equals(Board.jButton4.getText()) && Board.jButton7.getText().isEmpty()) {
            Board.jButton7.setText("O");
        } else if ("X".equals(Board.jButton1.getText()) && "X".equals(Board.jButton5.getText()) && Board.jButton9.getText().isEmpty()) {
            Board.jButton9.setText("O");
        } else if ("X".equals(Board.jButton2.getText()) && "X".equals(Board.jButton5.getText()) && Board.jButton8.getText().isEmpty()) {
            Board.jButton8.setText("O");
        } else if ("X".equals(Board.jButton3.getText()) && "X".equals(Board.jButton6.getText()) && Board.jButton9.getText().isEmpty()) {
            Board.jButton9.setText("O");
        } else if ("X".equals(Board.jButton3.getText()) && "X".equals(Board.jButton5.getText()) && Board.jButton7.getText().isEmpty()) {
            Board.jButton7.setText("O");
        } else if ("X".equals(Board.jButton4.getText()) && "X".equals(Board.jButton5.getText()) && Board.jButton6.getText().isEmpty()) {
            Board.jButton6.setText("O");
        } else if ("X".equals(Board.jButton7.getText()) && "X".equals(Board.jButton8.getText()) && Board.jButton9.getText().isEmpty()) {
            Board.jButton9.setText("O");
        } else if ("X".equals(Board.jButton3.getText()) && "X".equals(Board.jButton2.getText()) && Board.jButton1.getText().isEmpty()) {
            Board.jButton1.setText("O");
        } else if ("X".equals(Board.jButton7.getText()) && "X".equals(Board.jButton4.getText()) && Board.jButton1.getText().isEmpty()) {
            Board.jButton1.setText("O");
        } else if ("X".equals(Board.jButton9.getText()) && "X".equals(Board.jButton5.getText()) && Board.jButton1.getText().isEmpty()) {
            Board.jButton1.setText("O");
        } else if ("X".equals(Board.jButton8.getText()) && "X".equals(Board.jButton5.getText()) && Board.jButton2.getText().isEmpty()) {
            Board.jButton2.setText("O");
        } else if ("X".equals(Board.jButton9.getText()) && "X".equals(Board.jButton6.getText()) && Board.jButton3.getText().isEmpty()) {
            Board.jButton3.setText("O");
        } else if ("X".equals(Board.jButton7.getText()) && "X".equals(Board.jButton5.getText()) && Board.jButton3.getText().isEmpty()) {
            Board.jButton3.setText("O");
        } else if ("X".equals(Board.jButton6.getText()) && "X".equals(Board.jButton5.getText()) && Board.jButton4.getText().isEmpty()) {
            Board.jButton4.setText("O");
        } else if ("X".equals(Board.jButton9.getText()) && "X".equals(Board.jButton8.getText()) && Board.jButton7.getText().isEmpty()) {
            Board.jButton7.setText("O");
        } else if ("X".equals(Board.jButton1.getText()) && "X".equals(Board.jButton3.getText()) && Board.jButton2.getText().isEmpty()) {
            Board.jButton2.setText("O");
        } else if ("X".equals(Board.jButton1.getText()) && "X".equals(Board.jButton7.getText()) && Board.jButton4.getText().isEmpty()) {
            Board.jButton4.setText("O");
        } else if ("X".equals(Board.jButton1.getText()) && "X".equals(Board.jButton9.getText()) && Board.jButton5.getText().isEmpty()) {
            Board.jButton5.setText("O");
        } else if ("X".equals(Board.jButton2.getText()) && "X".equals(Board.jButton8.getText()) && Board.jButton5.getText().isEmpty()) {
            Board.jButton5.setText("O");
        } else if ("X".equals(Board.jButton3.getText()) && "X".equals(Board.jButton9.getText()) && Board.jButton6.getText().isEmpty()) {
            Board.jButton6.setText("O");
        } else if ("X".equals(Board.jButton3.getText()) && "X".equals(Board.jButton7.getText()) && Board.jButton5.getText().isEmpty()) {
            Board.jButton5.setText("O");
        } else if ("X".equals(Board.jButton4.getText()) && "X".equals(Board.jButton6.getText()) && Board.jButton5.getText().isEmpty()) {
            Board.jButton5.setText("O");
        } else if ("X".equals(Board.jButton7.getText()) && "X".equals(Board.jButton9.getText()) && Board.jButton8.getText().isEmpty()) {
            Board.jButton8.setText("O");
        } 
        //Check for a chance to make two in a row
        
        else if (Board.jButton5.getText().isEmpty()) {
            Board.jButton5.setText("O");
        } else if ("O".equals(Board.jButton1.getText())) {
            if (Board.jButton2.getText().isEmpty()) {
                Board.jButton2.setText("O");
            } else if (Board.jButton3.getText().isEmpty()) {
                Board.jButton3.setText("O");
            }
        } else if ("O".equals(Board.jButton3.getText())) {
            if (Board.jButton2.getText().isEmpty()) {
                Board.jButton2.setText("O");
            } else if (Board.jButton6.getText().isEmpty()) {
                Board.jButton6.setText("O");
            }
        } else if ("O".equals(Board.jButton7.getText())) {
            if (Board.jButton8.getText().isEmpty()) {
                Board.jButton8.setText("O");
            } else if (Board.jButton4.getText().isEmpty()) {
                Board.jButton4.setText("O");
            }
        } else if ("O".equals(Board.jButton9.getText())) {
            if (Board.jButton8.getText().isEmpty()) {
                Board.jButton8.setText("O");
            } else if (Board.jButton6.getText().isEmpty()) {
                Board.jButton6.setText("O");
            }
        }
        
        else if ("O".equals(Board.jButton2.getText())) {
            if (Board.jButton1.getText().isEmpty()) {
                Board.jButton1.setText("O");
            } else if (Board.jButton3.getText().isEmpty()) {
                Board.jButton3.setText("O");
            }
        } else if ("O".equals(Board.jButton4.getText())) {
            if (Board.jButton1.getText().isEmpty()) {
                Board.jButton1.setText("O");
            } else if (Board.jButton7.getText().isEmpty()) {
                Board.jButton7.setText("O");
            }
        } else if ("O".equals(Board.jButton8.getText())) {
            if (Board.jButton7.getText().isEmpty()) {
                Board.jButton7.setText("O");
            } else if (Board.jButton9.getText().isEmpty()) {
                Board.jButton9.setText("O");
            }
        } else if ("O".equals(Board.jButton6.getText())) {
            if (Board.jButton3.getText().isEmpty()) {
                Board.jButton3.setText("O");
            } else if (Board.jButton9.getText().isEmpty()) {
                Board.jButton9.setText("O");
            }
        } else if ("O".equals(Board.jButton5.getText())) {
            if (Board.jButton8.getText().isEmpty()) {
                Board.jButton8.setText("O");
            } else if (Board.jButton4.getText().isEmpty()) {
                Board.jButton4.setText("O");
            }else if (Board.jButton2.getText().isEmpty()) {
                Board.jButton2.setText("O");
            }else if (Board.jButton6.getText().isEmpty()) {
                Board.jButton6.setText("O");
            }
        }
        
        //Check for the best place to mark
         else if ("X".equals(Board.jButton1.getText())) {
            if (Board.jButton2.getText().isEmpty()) {
                Board.jButton2.setText("O");
            } else if (Board.jButton3.getText().isEmpty()) {
                Board.jButton3.setText("O");
            }
        } else if ("X".equals(Board.jButton3.getText())) {
            if (Board.jButton2.getText().isEmpty()) {
                Board.jButton2.setText("O");
            } else if (Board.jButton6.getText().isEmpty()) {
                Board.jButton6.setText("O");
            }
        } else if ("X".equals(Board.jButton7.getText())) {
            if (Board.jButton8.getText().isEmpty()) {
                Board.jButton8.setText("O");
            } else if (Board.jButton4.getText().isEmpty()) {
                Board.jButton4.setText("O");
            }
        } else if ("X".equals(Board.jButton9.getText())) {
            if (Board.jButton8.getText().isEmpty()) {
                Board.jButton8.setText("O");
            } else if (Board.jButton6.getText().isEmpty()) {
                Board.jButton6.setText("O");
            }
        }
        
        else if ("X".equals(Board.jButton2.getText())) {
            if (Board.jButton1.getText().isEmpty()) {
                Board.jButton1.setText("O");
            } else if (Board.jButton3.getText().isEmpty()) {
                Board.jButton3.setText("O");
            }
        } else if ("X".equals(Board.jButton4.getText())) {
            if (Board.jButton1.getText().isEmpty()) {
                Board.jButton1.setText("O");
            } else if (Board.jButton7.getText().isEmpty()) {
                Board.jButton7.setText("O");
            }
        } else if ("X".equals(Board.jButton8.getText())) {
            if (Board.jButton7.getText().isEmpty()) {
                Board.jButton7.setText("O");
            } else if (Board.jButton9.getText().isEmpty()) {
                Board.jButton9.setText("O");
            }
        } else if ("X".equals(Board.jButton6.getText())) {
            if (Board.jButton3.getText().isEmpty()) {
                Board.jButton3.setText("O");
            } else if (Board.jButton9.getText().isEmpty()) {
                Board.jButton9.setText("O");
            }
        }
        else if(Board.jButton1.getText().isEmpty()){
            Board.jButton1.setText("O");
        }else if(Board.jButton2.getText().isEmpty()){
            Board.jButton2.setText("O");
        }else if(Board.jButton3.getText().isEmpty()){
            Board.jButton3.setText("O");
        }else if(Board.jButton4.getText().isEmpty()){
            Board.jButton4.setText("O");
        }else if(Board.jButton5.getText().isEmpty()){
            Board.jButton5.setText("O");
        }else if(Board.jButton6.getText().isEmpty()){
            Board.jButton6.setText("O");
        }else if(Board.jButton7.getText().isEmpty()){
            Board.jButton8.setText("O");
        }else if(Board.jButton8.getText().isEmpty()){
            Board.jButton8.setText("O");
        }else if(Board.jButton9.getText().isEmpty()){
            Board.jButton9.setText("O");
        }
    }
}

