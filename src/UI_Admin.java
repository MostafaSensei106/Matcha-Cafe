/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;

/**
 *
 * @author Mostafa_Sensei106
 */
public class UI_Admin extends javax.swing.JFrame {

    /**
     * Creates new form UI_Admin
     */
    public UI_Admin() {
        initComponents();
        this.setLocationRelativeTo(this);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Admin_choose_panal = new javax.swing.JPanel();
        btn_admin_back = new javax.swing.JButton();
        Btn_Emp_Mange = new javax.swing.JButton();
        To_Items_Manag = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(254, 223, 205));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Wellcom To MatchaManagement System");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Hi ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Admin_choose_panal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btn_admin_back.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_admin_back.setText("Exit");
        btn_admin_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_admin_backMouseClicked(evt);
            }
        });
        btn_admin_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_admin_backActionPerformed(evt);
            }
        });

        Btn_Emp_Mange.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn_Emp_Mange.setText("Employer’s Management's");
        Btn_Emp_Mange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_Emp_MangeMouseClicked(evt);
            }
        });
        Btn_Emp_Mange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Emp_MangeActionPerformed(evt);
            }
        });

        To_Items_Manag.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        To_Items_Manag.setText("Item Management");
        To_Items_Manag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                To_Items_ManagMouseClicked(evt);
            }
        });
        To_Items_Manag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                To_Items_ManagActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(254, 223, 205));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/بدون اسم4_20231216070714.png"))); // NOI18N
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setPreferredSize(new java.awt.Dimension(1024, 1024));

        javax.swing.GroupLayout Admin_choose_panalLayout = new javax.swing.GroupLayout(Admin_choose_panal);
        Admin_choose_panal.setLayout(Admin_choose_panalLayout);
        Admin_choose_panalLayout.setHorizontalGroup(
            Admin_choose_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Admin_choose_panalLayout.createSequentialGroup()
                .addGroup(Admin_choose_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Admin_choose_panalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_admin_back, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Admin_choose_panalLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(Btn_Emp_Mange, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Admin_choose_panalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Admin_choose_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Admin_choose_panalLayout.createSequentialGroup()
                        .addComponent(To_Items_Manag)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Admin_choose_panalLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        Admin_choose_panalLayout.setVerticalGroup(
            Admin_choose_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Admin_choose_panalLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(To_Items_Manag, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(Btn_Emp_Mange, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btn_admin_back, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Admin_choose_panal, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(Admin_choose_panal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void To_Items_ManagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_To_Items_ManagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_To_Items_ManagActionPerformed

    private void btn_admin_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_admin_backMouseClicked
        // TODO add your handling code here:
        UI_Login UI_Login = new UI_Login();
        UI_Login.show();
        UI_Login.setTitle("Matcha Cafe - Login");
        dispose();
    }//GEN-LAST:event_btn_admin_backMouseClicked

    private void btn_admin_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admin_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_admin_backActionPerformed

    private void Btn_Emp_MangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Emp_MangeMouseClicked
        // TODO add your handling code here:
        UI_Employer To_Employer = new UI_Employer();
        To_Employer.show();
        To_Employer.setTitle("Matcha - Employer");
        To_Employer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_Btn_Emp_MangeMouseClicked

    private void To_Items_ManagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_To_Items_ManagMouseClicked
        // TODO add your handling code here:
        UI_Items To_Items = new UI_Items();
        To_Items.show();
        To_Items.setTitle("Matcha - Item Mangements");
        To_Items.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_To_Items_ManagMouseClicked

    private void Btn_Emp_MangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Emp_MangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Emp_MangeActionPerformed

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
            java.util.logging.Logger.getLogger(UI_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//              new UI_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Admin_choose_panal;
    private javax.swing.JButton Btn_Emp_Mange;
    private javax.swing.JButton To_Items_Manag;
    private javax.swing.JButton btn_admin_back;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
