
package ui;

import javax.swing.JInternalFrame;
import javax.swing.UIManager;


public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_back = new javax.swing.JButton();
        btn_sub = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        btn_class = new javax.swing.JButton();
        btn_te = new javax.swing.JButton();
        btn_stu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_back.setText("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 70, -1));

        btn_sub.setBackground(new java.awt.Color(0, 0, 204));
        btn_sub.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        btn_sub.setText("SUBJECTS");
        btn_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 280, 110));

        btn_exit.setText("EXIT");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 70, -1));

        btn_class.setBackground(new java.awt.Color(0, 0, 204));
        btn_class.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        btn_class.setText("CLASSES");
        btn_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_classActionPerformed(evt);
            }
        });
        jPanel1.add(btn_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 280, 110));

        btn_te.setBackground(new java.awt.Color(0, 0, 204));
        btn_te.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        btn_te.setText("TEACHERS");
        btn_te.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_teActionPerformed(evt);
            }
        });
        jPanel1.add(btn_te, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 280, 110));

        btn_stu.setBackground(new java.awt.Color(0, 0, 204));
        btn_stu.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        btn_stu.setText("STUDENTS");
        btn_stu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_stu, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 280, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libs/home_1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_teActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_teActionPerformed
        this.dispose();
        Teachers te = new Teachers();
        te.setVisible(true);
        
    }//GEN-LAST:event_btn_teActionPerformed

    private void btn_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_classActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_classActionPerformed

    private void btn_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subActionPerformed
        this.dispose();
        
        new Subject().setVisible(true);
        
    }//GEN-LAST:event_btn_subActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
       this.dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
       this.dispose();
       Login log = new Login();
       log.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_stuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stuActionPerformed
        this.dispose();
        Student st = new Student();
        st.setVisible(true);
                
    }//GEN-LAST:event_btn_stuActionPerformed

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
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_class;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_stu;
    private javax.swing.JButton btn_sub;
    private javax.swing.JButton btn_te;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
