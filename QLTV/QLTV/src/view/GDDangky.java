/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Microsoft Windows
 */
public class GDDangky extends javax.swing.JFrame {

    /**
     * Creates new form GDDangky
     */
    public GDDangky() {
        initComponents();
        btndangky.addActionListener(null);setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tftaikhoan = new javax.swing.JTextField();
        tfmatkhau = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfmataikhoan = new javax.swing.JTextField();
        tfngaybatdau = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btndangky = new javax.swing.JButton();
        tfquaylai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tài Khoản");

        jLabel2.setText("Mật Khẩu");

        tftaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftaikhoanActionPerformed(evt);
            }
        });

        tfmatkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmatkhauActionPerformed(evt);
            }
        });

        jLabel3.setText("Mã Tài Khoản");

        jLabel4.setText("Ngày Bắt Đầu");

        tfmataikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmataikhoanActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("THÊM TÀI KHOẢN");

        btndangky.setText("Đăng Ký");
        btndangky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangkyActionPerformed(evt);
            }
        });

        tfquaylai.setText("Quay Lại");
        tfquaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfquaylaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tftaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(tfmatkhau, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(tfmataikhoan)
                            .addComponent(tfngaybatdau))))
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(tfquaylai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btndangky)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfmataikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tftaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(tfmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfngaybatdau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndangky)
                    .addComponent(tfquaylai))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tftaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftaikhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tftaikhoanActionPerformed

    private void tfmatkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmatkhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfmatkhauActionPerformed

    private void tfmataikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmataikhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfmataikhoanActionPerformed

    private void btndangkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangkyActionPerformed
        try {
            // TODO add your handling code here:
            if(tfmataikhoan.getText().equals("")){
                JOptionPane.showMessageDialog(null, "ma tai khoan khong duoc rong");
                tfmataikhoan.requestFocus();
                return;}
            else if(tfmatkhau.getText().equals("")){
                JOptionPane.showMessageDialog(null, "mat khau khong duoc rong");
                tfmatkhau.requestFocus();
                return;}
            else if(tftaikhoan.getText().equals("")){
                JOptionPane.showMessageDialog(null, "tai khoan khong duoc rong");
                tftaikhoan.requestFocus();
                return;}
            else if (tfngaybatdau.getText().equals("")){
                JOptionPane.showMessageDialog(null, "tai khoan khong duoc rong");
                tfngaybatdau.requestFocus();
                return;}
            String matk=tfmataikhoan.getText();
            if (matk.length()!=5){JOptionPane.showMessageDialog(null, "ma tai khoan phai co 5 ki tu");
            return; }
            
            
            
            String a =  tfmataikhoan.getText(0, 2);
            boolean b1=a.equals("TK");
            
            boolean b2=Character.isDigit(matk.charAt(2));
            boolean b3=Character.isDigit(matk.charAt(3));
            boolean b4=Character.isDigit(matk.charAt(4));
            
            if((b1&&b2&&b3&&b4)==false){
                JOptionPane.showMessageDialog(null, "ma tai khoan khong dung dinh dang. TKxxx");
                
                tfmataikhoan.requestFocus();           
                return;
            }
            
            
            
            
           
        } catch (BadLocationException ex) {
            Logger.getLogger(GDDangky.class.getName()).log(Level.SEVERE, null, ex);
        }
       if(checktrungmataikhoan()||checktrungtaikhoan()){
       JOptionPane.showMessageDialog(null, "ma tai khoan da ton tai");
       tfmataikhoan.requestFocus();}
       else{
            try {
                Connection connection = DBConnection.getConnection();
                String query = "insert into dbo.taikhoan20173329(mataikhoan20173329,taikhoan20173329,matkhau20173329,ngaybatdau20173329) "
                        + "values (?,?,?,?)";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, tfmataikhoan.getText());
                ps.setString(2, tftaikhoan.getText());
                ps.setString(3, tfmatkhau.getText());
                ps.setString(4, tfngaybatdau.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "them thanh cong");
                dangkyclick();
                DBConnection.closeConnection(connection);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ban phai nhap thang truoc ngay sau theo dinh dang  mm-dd-yy");
            }
       
       }
    }//GEN-LAST:event_btndangkyActionPerformed

    private void tfquaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfquaylaiActionPerformed
        // TODO add your handling code here:
        new GDDangNhap().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tfquaylaiActionPerformed
private boolean checktrungmataikhoan(){
        try {
            Connection connection = DBConnection.getConnection();
            String query ="SELECT * From dbo.TaiKhoan20173329 where mataikhoan20173329 = ?";
            PreparedStatement ps = connection.prepareStatement(query);
           
            ps.setString(1,tfmataikhoan.getText());
            
              ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            return true;}
            DBConnection.closeConnection(connection);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }return false;

}
private boolean checktrungtaikhoan(){
        try {
            Connection connection = DBConnection.getConnection();
            String query ="SELECT * From dbo.TaiKhoan20173329 where taikhoan20173329 = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            
            ps.setString(1,tfmataikhoan.getText());
            ResultSet rs = ps.executeQuery();
              while(rs.next()){
            return true;}
              DBConnection.closeConnection(connection);
        } catch (SQLException ex) {
           ex.printStackTrace();
        }return false;
}
private void dangkyclick(){
new GDBanDoc().setVisible(true);
this.dispose();}
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
            java.util.logging.Logger.getLogger(GDDangky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GDDangky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GDDangky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GDDangky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GDDangky().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndangky;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tfmataikhoan;
    private javax.swing.JPasswordField tfmatkhau;
    private javax.swing.JTextField tfngaybatdau;
    private javax.swing.JButton tfquaylai;
    private javax.swing.JTextField tftaikhoan;
    // End of variables declaration//GEN-END:variables
}
