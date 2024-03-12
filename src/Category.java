
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Faith
 */
public class Category extends javax.swing.JFrame {

    private int id = 0;

    /**
     * Creates new form Category
     */
    public Category() {
        initComponents();
        setLocationRelativeTo(null);

    }

    private boolean validateFields() {
        if (txtName.getText().equals("")) {
            return true;
        } else {
            return false;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableCategory = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnCls = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ));
        tableCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCategory);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 91, -1, 410));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 316, -1));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, -1, -1));

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, -1, -1));

        btnCls.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCls.setText("Close");
        btnCls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClsActionPerformed(evt);
            }
        });
        getContentPane().add(btnCls, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, -1, -1));

        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 170, 30));

        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 840, 470));

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INVENTORY MANAGEMENT SYSTEM");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 5, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Category");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 60));

        jPanel3.setBackground(new java.awt.Color(153, 0, 153));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 530, 840, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        DefaultTableModel model = (DefaultTableModel) tableCategory.getModel();
        String query = "SELECT * FROM category_tb ";
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "");
            PreparedStatement pt = con.prepareStatement(query);
            ResultSet rs = pt.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("id"),
                    rs.getString("name"),});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error connecting to database: " + e.getMessage());
        }
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_formComponentShown

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String name = txtName.getText();
        if (validateFields()) {
            JOptionPane.showMessageDialog(null, "All fields are required");
        } else {
            try {
                String query = "INSERT into category_tb(name) VALUES (?)";
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "");
                PreparedStatement pt = con.prepareStatement(query);
                pt.setString(1, name);
                pt.executeUpdate();
                JOptionPane.showMessageDialog(null, "category successfully added");
                setVisible(false);
                new Category().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClsActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnClsActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        setVisible(false);
        new Category().setVisible(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void tableCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCategoryMouseClicked
        // TODO add your handling code here:
        int index = tableCategory.getSelectedRow();
        TableModel model = tableCategory.getModel();
        String idstr = model.getValueAt(index, 0).toString();
        id = Integer.parseInt(idstr);

        String name = model.getValueAt(index, 1).toString();
        txtName.setText(name);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);


    }//GEN-LAST:event_tableCategoryMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String name = txtName.getText();
        if (validateFields()) {
            JOptionPane.showMessageDialog(null, "All fields are required");
        } else {
            try {
                String query = "update category_tb set name = ? where id = ?";
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "");
                PreparedStatement pt = con.prepareStatement(query);
                pt.setString(1, name);
                pt.setInt(2, id);
                pt.executeUpdate();
                JOptionPane.showMessageDialog(null, "category successfully Updated");
                setVisible(false);
                new Category().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel searchmodel = (DefaultTableModel) tableCategory.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(searchmodel);
        tableCategory.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter("(?i)" + txtsearch.getText()));
    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel searchmodel = (DefaultTableModel) tableCategory.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(searchmodel);
        tableCategory.setRowSorter(obj);
          obj.setRowFilter(RowFilter.regexFilter("(?i)" + txtsearch.getText()));
    }//GEN-LAST:event_txtsearchKeyReleased

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCls;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCategory;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
