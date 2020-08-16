package darya;
import javax.swing.JFrame;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RegistrationForm extends javax.swing.JFrame {
    public RegistrationForm() {
        initComponents();
        this.setLocationRelativeTo(null); //centers form in the screen
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_FN = new javax.swing.JTextField();
        jPasswordField_PASS = new javax.swing.JPasswordField();
        jButton2_Register_ = new javax.swing.JButton();
        jLabel1Register = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_UN = new javax.swing.JTextField();
        jTextField_LN = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField_REPASS = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_ADDRESS = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(49, 92, 127));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Last Name:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 16));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Password:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 16));

        jTextField_FN.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_FN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_FN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FNActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_FN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 176, -1));

        jPasswordField_PASS.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField_PASS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jPasswordField_PASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 176, -1));

        jButton2_Register_.setBackground(new java.awt.Color(48, 93, 122));
        jButton2_Register_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2_Register_.setForeground(new java.awt.Color(255, 255, 255));
        jButton2_Register_.setText("Register");
        jButton2_Register_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2_Register_MouseClicked(evt);
            }
        });
        jButton2_Register_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_Register_ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2_Register_, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, -1, -1));

        jLabel1Register.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1Register.setForeground(new java.awt.Color(48, 93, 122));
        jLabel1Register.setText("Click here to Login");
        jLabel1Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1RegisterMouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Username:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 16));

        jTextField_UN.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_UN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_UN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UNActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_UN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 176, -1));

        jTextField_LN.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_LN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_LN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LNActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_LN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 176, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Confirm Password:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 16));

        jPasswordField_REPASS.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField_REPASS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jPasswordField_REPASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 176, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Address:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, 16));

        jTextArea_ADDRESS.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea_ADDRESS.setColumns(20);
        jTextArea_ADDRESS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea_ADDRESS.setRows(5);
        jTextArea_ADDRESS.setPreferredSize(new java.awt.Dimension(200, 85));
        jScrollPane1.setViewportView(jTextArea_ADDRESS);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Susan\\Documents\\NetBeansProjects\\OOP II\\Darya\\src\\darya\\water2.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 6, 490, 470));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("First Name");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 16));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(48, 93, 122));
        jLabel2.setText("Darya Register");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_FNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FNActionPerformed

    private void jLabel1RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1RegisterMouseClicked
        LoginForm lgf = new LoginForm();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel1RegisterMouseClicked

    private void jButton2_Register_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_Register_ActionPerformed
        String id = null;
        String fname = jTextField_FN.getText();
        String lname = jTextField_LN.getText();
        String uname = jTextField_UN.getText();
        String pass = String.valueOf(jPasswordField_PASS.getPassword());
        String re_pass = String.valueOf(jPasswordField_REPASS.getPassword());
        String address = jTextArea_ADDRESS.getText();
        
        if(uname.equals(""))
        {
             JOptionPane.showMessageDialog(null, "  Add a User Name");
        }
        else if(pass.equals(""))
        {
             JOptionPane.showMessageDialog(null, "  Add a Password");
        }
        else if(re_pass.equals(""))
        {
             JOptionPane.showMessageDialog(null, "  Confirm Password");
        }
        else if(checkUsername(uname))
        {
             JOptionPane.showMessageDialog(null, "  This username already exists");
        }
        else
        {
            PreparedStatement ps;
            String query = "INSERT INTO `the_app_users`(`u_id`,`u_fname`, `u_lname`, `u_uname`, `u_pass`, `u_address`) VALUES (?,?,?,?,?,?)";

            try
            {
                ps = MyConnection.getConnection().prepareStatement(query);

                ps.setString(1, id);
                ps.setString(2, fname);
                ps.setString(3, lname);
                ps.setString(4, uname);
                ps.setString(5, pass);
                ps.setString(6, address);

                if(ps.executeUpdate() > 0 )
                {
                JOptionPane.showMessageDialog(null, "New User Add");
                }
            }
            catch(SQLException ex)
            {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2_Register_ActionPerformed

    private void jTextField_UNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UNActionPerformed

    private void jTextField_LNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_LNActionPerformed

    private void jButton2_Register_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2_Register_MouseClicked
       
    }//GEN-LAST:event_jButton2_Register_MouseClicked

    /**
     * @param args the command line arguments
     */
    //function to check if the user already exists
    
    public boolean checkUsername(String uname)
    {
    PreparedStatement ps;
    ResultSet rs;
    boolean checkUser = false; 
    
    String query = "SELECT * FROM `the_app_users` WHERE `u_uname` =?";
    
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, uname);
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                checkUser = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
     return checkUser;
    }
    
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
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2_Register_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel1Register;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_PASS;
    private javax.swing.JPasswordField jPasswordField_REPASS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_ADDRESS;
    private javax.swing.JTextField jTextField_FN;
    private javax.swing.JTextField jTextField_LN;
    private javax.swing.JTextField jTextField_UN;
    // End of variables declaration//GEN-END:variables
}
