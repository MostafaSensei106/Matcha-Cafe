/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseEvent;
import java.sql.*;

/**
 * @author DELL
 */
public class UI_Employer extends javax.swing.JFrame {

    /**
     * Creates new form emp
     */
    public UI_Employer() {
        initComponents();
        this.setLocationRelativeTo(this);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/matcha_cafe", "root", "root");
            String sql = "SELECT * FROM m_matcha";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            DefaultTableModel model = new DefaultTableModel(new String[]{"ID ", "Password ", "Position ", "Name", "Gender", "Salary", "Phone"}, 0) {


                @Override
                public boolean isCellEditable(int row, int column) {
                    // This causes all cells to be not editable
                    return false;
                }
            };

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                int password = resultSet.getInt("Password");
                String position = resultSet.getString("Position");
                String Name = resultSet.getString("Name");
                String Gender = resultSet.getString("Gender");
                int Salary = resultSet.getInt("Salary");
                double PhoneNumber = resultSet.getDouble("Phone");
                model.addRow(new Object[]{id, password, position, Name, Gender, Salary, PhoneNumber});
            }
            // Set the model to the JTable
            Mem_TP.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mem_TP = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        text_password = new javax.swing.JTextField();
        Emp_name = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        text_salary = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        Back_To_Admin = new javax.swing.JButton();
        Gender = new javax.swing.JComboBox<>();
        Position = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Emp_Mangement");

        jPanel1.setName(""); // NOI18N

        Mem_TP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Mem_TP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Password", "Possition", "First name", "Last name", "Gender", "Salary", "Phone number"
            }
        ));
        jScrollPane1.setViewportView(Mem_TP);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Password :");

        text_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_salaryActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText(" Name :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Gender : ");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Position : ");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Salary : ");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Phone Number : ");

        btn_add.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_add.setText("Add ");
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addMouseClicked(evt);
            }
        });
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_edit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_edit.setText("Edit ");
        btn_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editMouseClicked(evt);
            }
        });
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_del.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_del.setText("Delet ");
        btn_del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_delMouseClicked(evt);
            }
        });
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });

        Back_To_Admin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Back_To_Admin.setText("Back");
        Back_To_Admin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Back_To_AdminMouseDragged(evt);
            }
        });
        Back_To_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_To_AdminActionPerformed(evt);
            }
        });

        Gender.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Femal", "مهندس" }));

        Position.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Employer" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(5, 5, 5)
                                .addComponent(Emp_name, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_password, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phone)
                            .addComponent(text_salary)
                            .addComponent(Position, 0, 120, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_edit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(btn_add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(btn_del, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(68, 68, 68))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Back_To_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(Position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Emp_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(btn_add)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(text_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(text_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_edit)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_del)
                        .addGap(4, 4, 4)))
                .addGap(28, 28, 28)
                .addComponent(Back_To_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_delActionPerformed

    private void Back_To_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_To_AdminActionPerformed
        // TODO add your handling code here:
        UI_Admin Admin_Back = new UI_Admin();
        Admin_Back.show();
        Admin_Back.setTitle("Matcha Cafe - Admin");
        dispose();
    }//GEN-LAST:event_Back_To_AdminActionPerformed

    private void Back_To_AdminMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_To_AdminMouseDragged
        // TODO add your handling code here:
        UI_Admin Back_Admin = new UI_Admin();
        Back_Admin.show();
        dispose();
        Back_Admin.setTitle("Matcha Cafe - Admin");
        Back_Admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_Back_To_AdminMouseDragged

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addActionPerformed

    private void text_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_salaryActionPerformed

    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
        // TODO add your handling code here:
        if (Emp_name.getText().isEmpty() || text_password.getText().isEmpty() || phone.getText().isEmpty() || text_salary.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Do Not Let Data Empty", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String Password = text_password.getText();
        String Name = Emp_name.getText();
        int salary = Integer.parseInt(text_salary.getText());
        Double Phone_number = Double.parseDouble(phone.getText());
        String Gen = (String) Gender.getSelectedItem();
        String Posithion_emp = (String) Position.getSelectedItem();

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/matcha_cafe", "root", "root");
            String sql = "INSERT INTO m_matcha (Password, Position, Name, Gender, Salary, Phone) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, Password);
            stmt.setString(2, Posithion_emp);
            stmt.setString(3, Name);
            stmt.setString(4, Gen);
            stmt.setInt(5, salary);
            stmt.setDouble(6, Phone_number);
            stmt.executeUpdate();
            Af_Update();

            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_btn_addMouseClicked

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_editMouseClicked

    private void btn_delMouseClicked(MouseEvent evt) {//GEN-FIRST:event_btn_delMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = Mem_TP.getSelectedRow();
        if (selectedRowIndex != -1) {

            // Retrieve data from the selected row
            Object ID = Mem_TP.getValueAt(selectedRowIndex, 0);

            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/matcha_cafe", "root", "root");
                String sql = "DELETE FROM m_matcha WHERE ID = ?";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, String.valueOf(ID)); // Assuming ID is a string; adjust if it's an integer

                stmt.executeUpdate();
                Af_Update();

                stmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }//GEN-LAST:event_btn_delMouseClicked



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
            java.util.logging.Logger.getLogger(UI_Employer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Employer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Employer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Employer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Employer().setVisible(true);
            }
        });
    }

    public void Af_Update() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/matcha_cafe", "root", "root");
            String sql = "SELECT * FROM m_matcha";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            DefaultTableModel model = new DefaultTableModel(new String[]{"ID ", "Password ", "Position ", "First Name", "Gender", "Salary", "Phone"}, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    // This causes all cells to be not editable
                    return false;
                }
            };

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                int password = resultSet.getInt("Password");
                String position = resultSet.getString("Position");
                String Name = resultSet.getString("Name");
                String Gender = resultSet.getString("Gender");
                int Salary = resultSet.getInt("Salary");
                double PhoneNumber = resultSet.getDouble("Phone");
                model.addRow(new Object[]{id, password, position, Name, Gender, Salary, PhoneNumber});
            }
            // Set the model to the JTable
            Mem_TP.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_To_Admin;
    private javax.swing.JTextField Emp_name;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JTable Mem_TP;
    private javax.swing.JComboBox<String> Position;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField text_password;
    private javax.swing.JTextField text_salary;
    // End of variables declaration//GEN-END:variables
}
