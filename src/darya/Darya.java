
package darya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Darya extends javax.swing.JFrame {

    public Darya() {
        initComponents();
    }
    
    DefaultTableModel model;
    String drum_capacity;
    int price;
    Connection con;
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        drum_one = new javax.swing.JRadioButton();
        drum_two = new javax.swing.JRadioButton();
        drum_three = new javax.swing.JRadioButton();
        drum_four = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        text_quantity = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        text_amount = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        orderBtn = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(48, 93, 122));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Darya Water Ordering System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(136, 136, 136))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        drum_one.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        drum_one.setText("50 Litres Drum");
        drum_one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drum_oneActionPerformed(evt);
            }
        });

        drum_two.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        drum_two.setText("100 Litres Drum");

        drum_three.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        drum_three.setText("150 Litres Drum");

        drum_four.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        drum_four.setText("200 Litres Drum");
        drum_four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drum_fourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drum_four)
                    .addComponent(drum_three)
                    .addComponent(drum_two)
                    .addComponent(drum_one))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(drum_one)
                .addGap(18, 18, 18)
                .addComponent(drum_two)
                .addGap(18, 18, 18)
                .addComponent(drum_three)
                .addGap(18, 18, 18)
                .addComponent(drum_four)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drum Capacity", "Price", "Quantity", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Quantity");

        text_quantity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Total Amount");

        text_amount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        addButton.setBackground(new java.awt.Color(48, 93, 122));
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        orderBtn.setBackground(new java.awt.Color(48, 93, 122));
        orderBtn.setForeground(new java.awt.Color(255, 255, 255));
        orderBtn.setText("Make Order");
        orderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtnActionPerformed(evt);
            }
        });

        removeButton.setBackground(new java.awt.Color(48, 93, 122));
        removeButton.setForeground(new java.awt.Color(255, 255, 255));
        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(text_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(529, 529, 529))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(text_amount)
                                .addGap(524, 524, 524))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(addButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(orderBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(37, 37, 37)
                                .addComponent(removeButton)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addButton)
                        .addComponent(removeButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(orderBtn))
                    .addComponent(jLabel3))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void drum_fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drum_fourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drum_fourActionPerformed

    private void drum_oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drum_oneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drum_oneActionPerformed

    public void sales(){
        int last_id = 0;
        //      Connection
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/darya","root","");
            String tot_amount = text_amount.getText();
            
            String query = "INSERT into sales(total) values('" + tot_amount + "')";
            Statement stmt1 = con.createStatement();
            stmt1.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
            
            ResultSet rs = stmt1.getGeneratedKeys();
            if(rs.next()){
                last_id = rs.getInt(1);
            }
            int row = jTable1.getRowCount();
            
            String prod_name = "";
            int price, qty, tot = 0;
            
            for(int i = 0; i < jTable1.getRowCount(); i++){
                prod_name = (String)jTable1.getValueAt(i, 0);
                price = (int)jTable1.getValueAt(i, 1);
                qty = (int)jTable1.getValueAt(i, 2);
                tot = (int)jTable1.getValueAt(i, 3);
                String query1 = "INSERT into sales_products(sales_ID, product_name, price, quantity, total) values('" + last_id + "', '"+ prod_name +"', '" + price + "', '" + qty + "', '" + tot + "')";
                
                Statement stmt2 = con.createStatement();
                stmt2.executeUpdate(query1);
            }
            
            JOptionPane.showMessageDialog(this, "Sales Completed!");
            
            HashMap a = new HashMap();
            a.put("invo", last_id);
            
            try {
                JasperDesign jdesign = JRXmlLoader.load("C:\\Users\\Susan\\Documents\\NetBeansProjects\\OOP II\\Darya\\src\\darya\\report1.jrxml");
                JasperReport jreport = JasperCompileManager.compileReport(jdesign);
                
                JasperPrint jprint = JasperFillManager.fillReport(jreport, a, con);
                
                JasperViewer.viewReport(jprint);
            } catch (JRException ex) {
                Logger.getLogger(Darya.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
    }
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        if(drum_one.isSelected() == true){
            drum_capacity = "50 Litres Drum";
            price = 100;
        }
        else if(drum_two.isSelected() == true){
            drum_capacity = "100 Litres Drum";
            price = 200;
        }
        else if(drum_three.isSelected() == true){
            drum_capacity = "150 Litres Drum";
            price = 250;
        }
        else if(drum_four.isSelected() == true){
            drum_capacity = "200 Litres Drum";
            price = 400;
        }
        int quantity = Integer.parseInt(text_quantity.getValue().toString());
        int total = quantity * price;
        
        model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]{
            drum_capacity,
            price,
            quantity,
            total
        });
        
        int tot_amount = 0;
        for(int i = 0; i < jTable1.getRowCount(); i++){
            tot_amount += Integer.parseInt(jTable1.getValueAt(i, 3).toString());
        }
        text_amount.setText(Integer.toString(tot_amount));
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        model.removeRow(jTable1.getSelectedRow());
        int tot_amount = 0;
        for(int i = 0; i < jTable1.getRowCount(); i++){
            tot_amount += Integer.parseInt(jTable1.getValueAt(i, 3).toString());
        }
        text_amount.setText(Integer.toString(tot_amount));
    }//GEN-LAST:event_removeButtonActionPerformed

    private void orderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtnActionPerformed
        // TODO add your handling code here:
        int tot_amount = Integer.parseInt(text_amount.getText());
        sales();
    }//GEN-LAST:event_orderBtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(Darya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Darya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Darya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Darya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Darya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JRadioButton drum_four;
    private javax.swing.JRadioButton drum_one;
    private javax.swing.JRadioButton drum_three;
    private javax.swing.JRadioButton drum_two;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton orderBtn;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField text_amount;
    private javax.swing.JSpinner text_quantity;
    // End of variables declaration//GEN-END:variables
}
