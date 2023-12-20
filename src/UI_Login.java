/* * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template */import javax.swing.*;import java.sql.*;import java.text.spi.BreakIteratorProvider;/** * @author Mostafa_Sensei106 */public class UI_Login extends javax.swing.JFrame {    /**     * Creates new form UI_Login     */    public UI_Login() {        initComponents();        this.setLocationRelativeTo(this);    }    /**     * This method is called from within the constructor to initialize the form.     * WARNING: Do NOT modify this code. The content of this method is always     * regenerated by the Form Editor.     */    @SuppressWarnings("unchecked")    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents    private void initComponents() {        Login_panal = new javax.swing.JPanel();        jLabel3 = new javax.swing.JLabel();        jLabel4 = new javax.swing.JLabel();        Login_btn = new javax.swing.JButton();        ID_Login = new javax.swing.JTextField();        ID_Password = new javax.swing.JPasswordField();        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);        setBackground(new java.awt.Color(102, 181, 181));        setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N        Login_panal.setToolTipText("");        Login_panal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));        Login_panal.setFocusCycleRoot(true);        Login_panal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N        jLabel3.setText("ID");        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N        jLabel4.setText("Password");        Login_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N        Login_btn.setText("Login");        Login_btn.addMouseListener(new java.awt.event.MouseAdapter() {            public void mouseClicked(java.awt.event.MouseEvent evt) {                Login_btnMouseClicked(evt);            }        });        Login_btn.addActionListener(new java.awt.event.ActionListener() {            public void actionPerformed(java.awt.event.ActionEvent evt) {                Login_btnActionPerformed(evt);            }        });        ID_Login.addActionListener(new java.awt.event.ActionListener() {            public void actionPerformed(java.awt.event.ActionEvent evt) {                ID_LoginActionPerformed(evt);            }        });        ID_Password.addActionListener(new java.awt.event.ActionListener() {            public void actionPerformed(java.awt.event.ActionEvent evt) {                jPasswordField2ActionPerformed(evt);            }        });        javax.swing.GroupLayout Login_panalLayout = new javax.swing.GroupLayout(Login_panal);        Login_panal.setLayout(Login_panalLayout);        Login_panalLayout.setHorizontalGroup(Login_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Login_panalLayout.createSequentialGroup().addGap(149, 149, 149).addGroup(Login_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel3).addComponent(jLabel4)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE).addGroup(Login_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(ID_Login, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE).addComponent(ID_Password)).addGap(128, 128, 128)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Login_panalLayout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(Login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(142, 142, 142)));        Login_panalLayout.setVerticalGroup(Login_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(Login_panalLayout.createSequentialGroup().addGap(97, 97, 97).addGroup(Login_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(ID_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel3)).addGap(7, 7, 7).addGroup(Login_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(ID_Password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)).addGap(18, 18, 18).addComponent(Login_btn).addContainerGap(99, Short.MAX_VALUE)));        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());        getContentPane().setLayout(layout);        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(Login_panal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(Login_panal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));        pack();    }// </editor-fold>//GEN-END:initComponents    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed        // TODO add your handling code here:    }//GEN-LAST:event_jPasswordField2ActionPerformed    private void ID_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_LoginActionPerformed        // TODO add your handling code here:    }//GEN-LAST:event_ID_LoginActionPerformed    private void Login_btnMouseClicked(java.awt.event.MouseEvent evt) {        // TODO add your handling code here:        try {            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/matcha_cafe", "root", "root");            if (ID_Login.getText().isEmpty()) {                JOptionPane.showMessageDialog(null, "Do Not Let UserName Empty", "Error", JOptionPane.ERROR_MESSAGE);                return;            }            if (ID_Password.getText().isEmpty()) {                JOptionPane.showMessageDialog(null, "Do Not Let Password Empty", "Error", JOptionPane.ERROR_MESSAGE);                return;            }            String sql = "SELECT * FROM m_matcha WHERE ID = ? AND Password = ?";            PreparedStatement stmt = con.prepareStatement(sql);            stmt.setString(1, ID_Login.getText());            stmt.setString(2, ID_Password.getText());            ResultSet resultSet = stmt.executeQuery();            if (resultSet.next()) {                String position = resultSet.getString("Position");                if (position.equals("Employer")) {                    JOptionPane.showMessageDialog(null, "Welcome", "Welcome", JOptionPane.INFORMATION_MESSAGE);                    return;                }                dispose();                UI_Admin Admin_choose = new UI_Admin();                Admin_choose.show();                Admin_choose.setTitle("Matcha Cafe - Admin");                Admin_choose.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            } else {                JOptionPane.showMessageDialog(null, "Error in UserName or Password", "Error", JOptionPane.ERROR_MESSAGE);            }        } catch (SQLException e) {            throw new RuntimeException(e);        }    }    private void Login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_btnActionPerformed        // TODO add your handling code here:    }//GEN-LAST:event_Login_btnActionPerformed    /**     * @param args the command line arguments     */    public static void main(String args[]) {        /* Set the Nimbus look and feel */        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html         */        try {            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {                if ("Nimbus".equals(info.getName())) {                    javax.swing.UIManager.setLookAndFeel(info.getClassName());                    break;                }            }        } catch (ClassNotFoundException ex) {            java.util.logging.Logger.getLogger(UI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);        } catch (InstantiationException ex) {            java.util.logging.Logger.getLogger(UI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);        } catch (IllegalAccessException ex) {            java.util.logging.Logger.getLogger(UI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);        } catch (javax.swing.UnsupportedLookAndFeelException ex) {            java.util.logging.Logger.getLogger(UI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);        }        //</editor-fold>        /* Create and display the form */        java.awt.EventQueue.invokeLater(new Runnable() {            public void run() {                new UI_Login().setVisible(true);            }        });    }    // Variables declaration - do not modify//GEN-BEGIN:variables    private javax.swing.JTextField ID_Login;    private javax.swing.JButton Login_btn;    public javax.swing.JPanel Login_panal;    private javax.swing.JLabel jLabel3;    private javax.swing.JLabel jLabel4;    private javax.swing.JPasswordField ID_Password;// End of variables declaration//GEN-END:variables}