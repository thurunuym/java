/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import javax.swing.UIManager;

public class Loading extends javax.swing.JFrame {

    Timer timer;
    int count = 1;

    public Loading() {
        initComponents();
        setLocationRelativeTo(null);
        overlay.setBackground(new Color(50, 40, 100, 110));

        timer = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                lbl_3.setText(count + "%");
                pbr.setValue(count);
                
                
                if(count==100){
                    
                    System.out.println("100% reached");
                    timer.stop();
                    Login lo = new Login();
                    lo.setVisible(true);
                    
                }
                
                
            }
        });
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        overlay = new javax.swing.JPanel();
        lbl_1 = new javax.swing.JLabel();
        pbr = new javax.swing.JProgressBar();
        lbl_2 = new javax.swing.JLabel();
        lbl_3 = new javax.swing.JLabel();
        lbl_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 43)); // NOI18N
        lbl_1.setText(" SCHOOL MANAGEMENT SYSTEM");

        lbl_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_2.setText("Loading...");

        lbl_3.setForeground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout overlayLayout = new javax.swing.GroupLayout(overlay);
        overlay.setLayout(overlayLayout);
        overlayLayout.setHorizontalGroup(
            overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
            .addGroup(overlayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pbr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(overlayLayout.createSequentialGroup()
                        .addComponent(lbl_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_3)))
                .addContainerGap())
        );
        overlayLayout.setVerticalGroup(
            overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overlayLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(lbl_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(pbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_2)
                    .addComponent(lbl_3))
                .addContainerGap(218, Short.MAX_VALUE))
        );

        jPanel4.add(overlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 600));

        lbl_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libs/bgrnd.jpg"))); // NOI18N
        lbl_bg.setText("jLabel1");
        jPanel4.add(lbl_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_1;
    private javax.swing.JLabel lbl_2;
    private javax.swing.JLabel lbl_3;
    private javax.swing.JLabel lbl_bg;
    private javax.swing.JPanel overlay;
    private javax.swing.JProgressBar pbr;
    // End of variables declaration//GEN-END:variables

}
