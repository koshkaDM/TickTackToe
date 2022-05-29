package com.koshkadev.ticktacktoegame;


import java.awt.Color;
import javax.swing.JLabel;


public class Main extends javax.swing.JFrame {
    
    String turn = "X";
    int x_score = 0;
    int count = 0;
    int o_score = 0;
    JLabel lbs[] = new JLabel[9];
    int matches[][] = {
        {1, 4, 7},
        {2, 5, 8},
        {3, 6, 9},
        {7, 8, 9},
        {4, 5, 6},
        {1, 2, 3},
        {1, 5, 9},
        {3, 5, 7}
    };
  
    
    public void mark(int pos){
        if (lbs[pos-1].getText().isEmpty()){
            lbs[pos-1].setText(turn);
            changeturn();
            checkwinner();
            count++;
        }
    }
    
    public void changeturn(){
        if (turn.equals("X")){
            turn = "O";
            who_plays.setText("O's TURN");
        }else{
            turn = "X";
            who_plays.setText("X's TURN");
        }
    }

    public void checkwinner(){
        if (count == 8){
            for (int i = 0; i < matches.length; i++){
                who_plays.setText("NO ONE WINS");
                lbs[matches[i][0]-1].setBackground(Color.yellow);
                lbs[matches[i][1]-1].setBackground(Color.yellow);
                lbs[matches[i][2]-1].setBackground(Color.yellow);
            }
        }
        for (int i = 0; i < matches.length; i++){
            if (lbs[matches[i][0]-1].getText().equals("X") && lbs[matches[i][1]-1].getText().equals("X") && lbs[matches[i][2]-1].getText().equals("X")){
                who_plays.setText("X WINS");
                //JOptionPane.showMessageDialog(null, "X WINS!!!");
                lbs[matches[i][0]-1].setBackground(Color.green);
                lbs[matches[i][1]-1].setBackground(Color.green);
                lbs[matches[i][2]-1].setBackground(Color.green);
                changeturn();
                x_score++;
                xscore.setText(""+x_score);
            }
            if (lbs[matches[i][0]-1].getText().equals("O") && lbs[matches[i][1]-1].getText().equals("O") && lbs[matches[i][2]-1].getText().equals("O")){
                who_plays.setText("O WINS");
                //JOptionPane.showMessageDialog(null, "O WINS!!!");
                lbs[matches[i][0]-1].setBackground(Color.green);
                lbs[matches[i][1]-1].setBackground(Color.green);
                lbs[matches[i][2]-1].setBackground(Color.green);
                changeturn();
                o_score++;
                oscore.setText(""+o_score);
            }
        }

    }
    
    public void reset_game(){
        for (int i = 0; i < 9; i++){
            lbs[i].setText("");
            lbs[i].setBackground(Color.WHITE);
            count=0;
        }
    }
    

    public Main() {
        initComponents();
        lbs[0] = pos1;
        lbs[1] = pos2;
        lbs[2] = pos3;
        lbs[3] = pos4;
        lbs[4] = pos5;
        lbs[5] = pos6;
        lbs[6] = pos7;
        lbs[7] = pos8;
        lbs[8] = pos9;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tablero = new javax.swing.JPanel();
        pos1 = new javax.swing.JLabel();
        pos2 = new javax.swing.JLabel();
        pos3 = new javax.swing.JLabel();
        pos4 = new javax.swing.JLabel();
        pos5 = new javax.swing.JLabel();
        pos6 = new javax.swing.JLabel();
        pos7 = new javax.swing.JLabel();
        pos8 = new javax.swing.JLabel();
        pos9 = new javax.swing.JLabel();
        gamename = new javax.swing.JLabel();
        who_plays = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        restart_button = new javax.swing.JButton();
        score1 = new javax.swing.JLabel();
        score2 = new javax.swing.JLabel();
        xscore = new javax.swing.JLabel();
        oscore = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TickTackToe by Kevin");

        pos1.setBackground(new java.awt.Color(255, 255, 255));
        pos1.setFont(new java.awt.Font("Segoe Script", 1, 48)); // NOI18N
        pos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        pos1.setMaximumSize(new java.awt.Dimension(78, 78));
        pos1.setOpaque(true);
        pos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pos1MouseClicked(evt);
            }
        });

        pos2.setBackground(new java.awt.Color(255, 255, 255));
        pos2.setFont(new java.awt.Font("Segoe Script", 1, 48)); // NOI18N
        pos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        pos2.setMaximumSize(new java.awt.Dimension(78, 78));
        pos2.setOpaque(true);
        pos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pos2MouseClicked(evt);
            }
        });

        pos3.setBackground(new java.awt.Color(255, 255, 255));
        pos3.setFont(new java.awt.Font("Segoe Script", 1, 48)); // NOI18N
        pos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        pos3.setMaximumSize(new java.awt.Dimension(78, 78));
        pos3.setOpaque(true);
        pos3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pos3MouseClicked(evt);
            }
        });

        pos4.setBackground(new java.awt.Color(255, 255, 255));
        pos4.setFont(new java.awt.Font("Segoe Script", 1, 48)); // NOI18N
        pos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        pos4.setMaximumSize(new java.awt.Dimension(78, 78));
        pos4.setOpaque(true);
        pos4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pos4MouseClicked(evt);
            }
        });

        pos5.setBackground(new java.awt.Color(255, 255, 255));
        pos5.setFont(new java.awt.Font("Segoe Script", 1, 48)); // NOI18N
        pos5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        pos5.setMaximumSize(new java.awt.Dimension(78, 78));
        pos5.setOpaque(true);
        pos5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pos5MouseClicked(evt);
            }
        });

        pos6.setBackground(new java.awt.Color(255, 255, 255));
        pos6.setFont(new java.awt.Font("Segoe Script", 1, 48)); // NOI18N
        pos6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        pos6.setMaximumSize(new java.awt.Dimension(78, 78));
        pos6.setOpaque(true);
        pos6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pos6MouseClicked(evt);
            }
        });

        pos7.setBackground(new java.awt.Color(255, 255, 255));
        pos7.setFont(new java.awt.Font("Segoe Script", 1, 48)); // NOI18N
        pos7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        pos7.setMaximumSize(new java.awt.Dimension(78, 78));
        pos7.setOpaque(true);
        pos7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pos7MouseClicked(evt);
            }
        });

        pos8.setBackground(new java.awt.Color(255, 255, 255));
        pos8.setFont(new java.awt.Font("Segoe Script", 1, 48)); // NOI18N
        pos8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        pos8.setMaximumSize(new java.awt.Dimension(78, 78));
        pos8.setOpaque(true);
        pos8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pos8MouseClicked(evt);
            }
        });

        pos9.setBackground(new java.awt.Color(255, 255, 255));
        pos9.setFont(new java.awt.Font("Segoe Script", 1, 48)); // NOI18N
        pos9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        pos9.setMaximumSize(new java.awt.Dimension(78, 78));
        pos9.setOpaque(true);
        pos9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pos9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout TableroLayout = new javax.swing.GroupLayout(Tablero);
        Tablero.setLayout(TableroLayout);
        TableroLayout.setHorizontalGroup(
            TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
            .addGroup(TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TableroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TableroLayout.createSequentialGroup()
                            .addComponent(pos7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(pos8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(pos9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(TableroLayout.createSequentialGroup()
                            .addComponent(pos4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(pos5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(pos6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(TableroLayout.createSequentialGroup()
                            .addComponent(pos1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(pos2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(pos3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        TableroLayout.setVerticalGroup(
            TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
            .addGroup(TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TableroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pos3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pos1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pos2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pos6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pos4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pos5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pos9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pos7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pos8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        gamename.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        gamename.setForeground(new java.awt.Color(51, 51, 51));
        gamename.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gamename.setText("TickTackToe");

        who_plays.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        who_plays.setForeground(new java.awt.Color(102, 102, 102));
        who_plays.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        who_plays.setText(turn+"'s"+"TURN");

        icon.setFont(new java.awt.Font("Segoe Script", 2, 10)); // NOI18N
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/koshkadev/ticktacktoegame/images/KoshkaLogo45x45.png"))); // NOI18N

        restart_button.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        restart_button.setText("RESTART");
        restart_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), null, new java.awt.Color(0, 0, 0)));
        restart_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restart_buttonActionPerformed(evt);
            }
        });

        score1.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        score1.setForeground(new java.awt.Color(102, 102, 102));
        score1.setText("X SCORE:");

        score2.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        score2.setForeground(new java.awt.Color(102, 102, 102));
        score2.setText(":O SCORE");

        xscore.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        xscore.setForeground(new java.awt.Color(102, 102, 102));
        xscore.setText("0");

        oscore.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        oscore.setForeground(new java.awt.Color(102, 102, 102));
        oscore.setText("0");

        jLabel1.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        jLabel1.setText("Created by KevinDM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(restart_button, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(score1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(xscore)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(icon)
                                .addGap(30, 30, 30)
                                .addComponent(oscore)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(score2))
                            .addComponent(who_plays, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gamename, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gamename, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(who_plays)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(score1)
                            .addComponent(score2)
                            .addComponent(xscore)
                            .addComponent(oscore))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(restart_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos1MouseClicked
        mark(1);
    }//GEN-LAST:event_pos1MouseClicked

    private void pos2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos2MouseClicked
        mark(2);
    }//GEN-LAST:event_pos2MouseClicked

    private void pos3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos3MouseClicked
        mark(3);
    }//GEN-LAST:event_pos3MouseClicked

    private void pos4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos4MouseClicked
        mark(4);
    }//GEN-LAST:event_pos4MouseClicked

    private void pos5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos5MouseClicked
        mark(5);
    }//GEN-LAST:event_pos5MouseClicked

    private void pos6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos6MouseClicked
        mark(6);
    }//GEN-LAST:event_pos6MouseClicked

    private void pos7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos7MouseClicked
        mark(7);
    }//GEN-LAST:event_pos7MouseClicked

    private void pos8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos8MouseClicked
        mark(8);
    }//GEN-LAST:event_pos8MouseClicked

    private void pos9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos9MouseClicked
        mark(9);
    }//GEN-LAST:event_pos9MouseClicked

    private void restart_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restart_buttonActionPerformed
        changeturn();
        reset_game();
    }//GEN-LAST:event_restart_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Tablero;
    private javax.swing.JLabel gamename;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel oscore;
    private javax.swing.JLabel pos1;
    private javax.swing.JLabel pos2;
    private javax.swing.JLabel pos3;
    private javax.swing.JLabel pos4;
    private javax.swing.JLabel pos5;
    private javax.swing.JLabel pos6;
    private javax.swing.JLabel pos7;
    private javax.swing.JLabel pos8;
    private javax.swing.JLabel pos9;
    private javax.swing.JButton restart_button;
    private javax.swing.JLabel score1;
    private javax.swing.JLabel score2;
    private javax.swing.JLabel who_plays;
    private javax.swing.JLabel xscore;
    // End of variables declaration//GEN-END:variables
}
