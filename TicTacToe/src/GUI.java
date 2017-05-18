
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeffrey A
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        setSize(500,500);
        reset();
    }
    
    private String turn = "X";
    private int count = 0;
    private int winx = 0;
    private int wino = 0;
    private String turnArray[][] = new String[3][3];
    
    public void nextTurn(){
        
        if(turn.equalsIgnoreCase("X"))
            turn = "O";
        else
            turn = "X";
        
        count++;
        
//        if(count == 9)
//            //reset();
    }
    
    public void win(){
        
        //// if X wins 
        if( (turnArray[0][0].equalsIgnoreCase("X")) && (turnArray[0][1].equalsIgnoreCase("X")) && (turnArray[0][2].equalsIgnoreCase("X")) )
        {
            JOptionPane.showMessageDialog(null, "Player X Wins !!!");
            winx++;
            reset();
        }
        else if((turnArray[1][0].equalsIgnoreCase("X")) && (turnArray[1][1].equalsIgnoreCase("X")) && (turnArray[1][2].equalsIgnoreCase("X")))
        {
            JOptionPane.showMessageDialog(null, "Player X Wins !!!");
            winx++;
            reset();
        }
        else if((turnArray[2][0].equalsIgnoreCase("X")) && (turnArray[2][1].equalsIgnoreCase("X")) && (turnArray[2][2].equalsIgnoreCase("X")))
        {
            JOptionPane.showMessageDialog(null, "Player X Wins !!!");
            winx++;
            reset();
        }
        //up - down
        else if((turnArray[0][0].equalsIgnoreCase("X")) && (turnArray[1][0].equalsIgnoreCase("X")) && (turnArray[2][0].equalsIgnoreCase("X")))
        {
            JOptionPane.showMessageDialog(null, "Player X Wins !!!");
            winx++;
            reset();
        }
        else if((turnArray[0][1].equalsIgnoreCase("X")) && (turnArray[1][1].equalsIgnoreCase("X")) && (turnArray[2][1].equalsIgnoreCase("X")))
        {
            JOptionPane.showMessageDialog(null, "Player X Wins !!!");
            winx++;
            reset();
        }
        else if((turnArray[0][2].equalsIgnoreCase("X")) && (turnArray[1][2].equalsIgnoreCase("X")) && (turnArray[2][2].equalsIgnoreCase("X")))
        {
            JOptionPane.showMessageDialog(null, "Player X Wins !!!");
            winx++;
            reset();
        }
        // if O wins
        else if( (turnArray[0][0].equalsIgnoreCase("O")) && (turnArray[0][1].equalsIgnoreCase("O")) && (turnArray[0][2].equalsIgnoreCase("O")) )
        {
            JOptionPane.showMessageDialog(null, "Player O Wins !!!");
            wino++;
            reset();
        }
        else if( (turnArray[1][0].equalsIgnoreCase("O")) && (turnArray[1][1].equalsIgnoreCase("O")) && (turnArray[1][2].equalsIgnoreCase("O")) )
        {
            JOptionPane.showMessageDialog(null, "Player O Wins !!!");
            wino++;
            reset();
        }
        else if( (turnArray[2][0].equalsIgnoreCase("O")) && (turnArray[2][1].equalsIgnoreCase("O")) && (turnArray[2][2].equalsIgnoreCase("O")) )
        {
            JOptionPane.showMessageDialog(null, "Player O Wins !!!");
            wino++;
            reset();
        }
        //up - down
        else if((turnArray[0][0].equalsIgnoreCase("O")) && (turnArray[1][0].equalsIgnoreCase("O")) && (turnArray[2][0].equalsIgnoreCase("O")))
        {
            JOptionPane.showMessageDialog(null, "Player O Wins !!!");
            wino++;
            reset();
        }
        else if((turnArray[0][1].equalsIgnoreCase("O")) && (turnArray[1][1].equalsIgnoreCase("O")) && (turnArray[2][1].equalsIgnoreCase("O")))
        {
            JOptionPane.showMessageDialog(null, "Player O Wins !!!");
            wino++;
            reset();
        }
        else if((turnArray[0][2].equalsIgnoreCase("O")) && (turnArray[1][2].equalsIgnoreCase("O")) && (turnArray[2][2].equalsIgnoreCase("O")))
        {
            JOptionPane.showMessageDialog(null, "Player O Wins !!!");
            wino++;
            reset();
        }
        
        //epecial case
        // o win
        else if((turnArray[0][0].equalsIgnoreCase("O")) && (turnArray[1][1].equalsIgnoreCase("O")) && (turnArray[2][2].equalsIgnoreCase("O")))
        {
            JOptionPane.showMessageDialog(null, "Player O Wins !!!");
            wino++;
            reset();
        }
        else if((turnArray[0][2].equalsIgnoreCase("O")) && (turnArray[1][1].equalsIgnoreCase("O")) && (turnArray[2][0].equalsIgnoreCase("O")))
        {
            JOptionPane.showMessageDialog(null, "Player O Wins !!!");
            wino++;
            reset();
        }
        // x win 
        else if((turnArray[0][0].equalsIgnoreCase("X")) && (turnArray[1][1].equalsIgnoreCase("X")) && (turnArray[2][2].equalsIgnoreCase("X")))
        {
            JOptionPane.showMessageDialog(null, "Player X Wins !!!");
            winx++;
            reset();
        }
        else if((turnArray[0][2].equalsIgnoreCase("X")) && (turnArray[1][1].equalsIgnoreCase("X")) && (turnArray[2][0].equalsIgnoreCase("X")))
        {
            JOptionPane.showMessageDialog(null, "Player X Wins !!!");
            winx++;
            reset();
        }
        
        else if(count == 9)
        {
            JOptionPane.showMessageDialog(null, "No Winner");
            reset();
        }
        
       
       xLable.setText(""+winx);
       oLable.setText(""+wino);
        
    }
    
    public void reset()
    {
         count = 0;
        //empty the labes 
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        // empty the turn array 
        for(int i=0; i < turnArray.length; i++)
        {
            for(int j=0; j < turnArray.length; j++)
            {
                turnArray[i][j] = "";
            }
        }
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        mainGrid = new javax.swing.JPanel();
        grid1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        xLable = new javax.swing.JButton();
        oLable = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Game"); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 500));

        mainGrid.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        grid1.setBackground(new java.awt.Color(255, 255, 255));
        grid1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        grid1.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        grid1.add(jButton1, java.awt.BorderLayout.CENTER);

        mainGrid.add(grid1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        mainGrid.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        mainGrid.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4, java.awt.BorderLayout.CENTER);

        mainGrid.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton5, java.awt.BorderLayout.CENTER);

        mainGrid.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton6, java.awt.BorderLayout.CENTER);

        mainGrid.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton7, java.awt.BorderLayout.CENTER);

        mainGrid.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton8, java.awt.BorderLayout.CENTER);

        mainGrid.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton9, java.awt.BorderLayout.CENTER);

        mainGrid.add(jPanel11);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton10.setText("Reset");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel1.setText("X Wins:");

        xLable.setText("0");

        oLable.setText("0");

        jLabel3.setText("O Wins:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xLable)
                .addGap(18, 18, 18)
                .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oLable)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(xLable)
                    .addComponent(oLable)
                    .addComponent(jLabel3)
                    .addComponent(jButton10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainGrid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainGrid, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(jButton1.getText().equals(""))
        {
            if(turn.equalsIgnoreCase("X"))
                jButton1.setForeground(Color.red);
            else
                jButton1.setForeground(Color.blue);
            
            jButton1.setText(turn);
            turnArray[0][0] = turn;
            System.out.println(turnArray[0][0] = turn);
            nextTurn();
            win();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(jButton2.getText().equals(""))
        {
            if(turn.equalsIgnoreCase("X"))
                jButton2.setForeground(Color.red);
            else
                jButton2.setForeground(Color.blue);
            
            jButton2.setText(turn);
            turnArray[0][1] = turn;
            System.out.println(turnArray[0][1] = turn);
            nextTurn();
            win();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(jButton3.getText().equals(""))
        {
            if(turn.equalsIgnoreCase("X"))
                jButton3.setForeground(Color.red);
            else
                jButton3.setForeground(Color.blue);
            
            jButton3.setText(turn);
            turnArray[0][2] = turn;
            System.out.println(turnArray[0][2] = turn);
            nextTurn();
            win();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        if(jButton4.getText().equals(""))
        {
            if(turn.equalsIgnoreCase("X"))
                jButton4.setForeground(Color.red);
            else
                jButton4.setForeground(Color.blue);
            
            jButton4.setText(turn);
            turnArray[1][0] = turn;
            System.out.println(turnArray[1][0] = turn);
            nextTurn();
            win();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        if(jButton5.getText().equals(""))
        {
            if(turn.equalsIgnoreCase("X"))
                jButton5.setForeground(Color.red);
            else
                jButton5.setForeground(Color.blue);
            
            jButton5.setText(turn);
            turnArray[1][1] = turn;
            System.out.println(turnArray[1][1] = turn);
            nextTurn();
            win();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        if(jButton6.getText().equals(""))
        {
            if(turn.equalsIgnoreCase("X"))
                jButton6.setForeground(Color.red);
            else
                jButton6.setForeground(Color.blue);
            
            jButton6.setText(turn);
            turnArray[1][2] = turn;
            System.out.println(turnArray[1][2] = turn);
            nextTurn();
            win();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        if(jButton7.getText().equals(""))
        {
            if(turn.equalsIgnoreCase("X"))
                jButton7.setForeground(Color.red);
            else
                jButton7.setForeground(Color.blue);
            
            jButton7.setText(turn);
            turnArray[2][0] = turn;
            System.out.println(turnArray[2][0] = turn);
            nextTurn();
            win();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        if(jButton8.getText().equals(""))
        {
            if(turn.equalsIgnoreCase("X"))
                jButton8.setForeground(Color.red);
            else
                jButton8.setForeground(Color.blue);
            
            jButton8.setText(turn);
            turnArray[2][1] = turn;
            System.out.println(turnArray[2][1] = turn);
            nextTurn();
            win();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        if(jButton9.getText().equals(""))
        {
            if(turn.equalsIgnoreCase("X"))
                jButton9.setForeground(Color.red);
            else
                jButton9.setForeground(Color.blue);
            
            jButton9.setText(turn);
            turnArray[2][2] = turn;
            System.out.println(turnArray[2][2] = turn);
            nextTurn();
            win();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel grid1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel mainGrid;
    private javax.swing.JButton oLable;
    private javax.swing.JButton xLable;
    // End of variables declaration//GEN-END:variables
}
