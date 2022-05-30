/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import src.DB;

/**
 *
 * @author ThurunuYM
 */
public class Student extends javax.swing.JFrame {

    /**
     * Creates new form Student
     */
    public Student() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_bar = new javax.swing.JLabel();
        txt_bar = new javax.swing.JTextField();
        lbl_name = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        txt_num = new javax.swing.JTextField();
        txt_ad = new javax.swing.JTextField();
        lbl_ad = new javax.swing.JLabel();
        lbl_num = new javax.swing.JLabel();
        btn_clear = new javax.swing.JButton();
        lbl_topic = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(825, 600));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Admission", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_bar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bar.setText("Bar Code :");
        jPanel2.add(lbl_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 81, 31));
        jPanel2.add(txt_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 330, -1));

        lbl_name.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name.setText("Student Name :");
        jPanel2.add(lbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        jPanel2.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 330, -1));

        btn_save.setText("SAVE");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel2.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 139, 106));
        jPanel2.add(txt_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 330, -1));
        jPanel2.add(txt_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 330, -1));

        lbl_ad.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ad.setText("Address :");
        jPanel2.add(lbl_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        lbl_num.setForeground(new java.awt.Color(255, 255, 255));
        lbl_num.setText("Contact no:");
        jPanel2.add(lbl_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel2.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 139, 106));

        lbl_topic.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        lbl_topic.setForeground(new java.awt.Color(255, 255, 255));
        lbl_topic.setText(" STUDENT MANAGE");
        lbl_topic.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbl_topic, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbl_topic, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        try {
            String b = "insert into student (`bar code`,`student name`,`contact number`,`adress`) values ('"+txt_bar.getText()+"','"+txt_name.getText()+"','"+txt_num.getText()+"','"+txt_ad.getText()+"');";
            DB.getConnection().createStatement().executeUpdate(b);
//            DB.getConnection().createStatement().executeUpdate("insert into student ('bar code','student name','contact number',adress) values ('"+txt_bar.getText()+"','"+txt_name.getText()+"','"+txt_num.getText()+"','"+txt_ad.getText()+"');");
            JOptionPane.showMessageDialog(rootPane,"Saved");
        
        } catch (Exception e) {
            e.printStackTrace();
    
        }
        txt_bar.setText("");
        txt_name.setText("");
        txt_num.setText("");
        txt_ad.setText("");
    }//GEN-LAST:event_btn_saveActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.dispose();    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
    new Home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_bar.setText("");
        txt_name.setText("");
        txt_num.setText("");
        txt_ad.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_ad;
    private javax.swing.JLabel lbl_bar;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_num;
    private javax.swing.JLabel lbl_topic;
    private javax.swing.JTextField txt_ad;
    private javax.swing.JTextField txt_bar;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_num;
    // End of variables declaration//GEN-END:variables
}
