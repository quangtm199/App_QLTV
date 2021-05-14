/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DBConnection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Microsoft Windows
 */
public class GDDangNhap extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form GDDangNhap
     */
    public GDDangNhap() {
        initComponents();
        btndangnhap.addActionListener(this);
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tftaikhoan = new javax.swing.JTextField();
        btndangnhap = new javax.swing.JButton();
        tfmatkhau = new javax.swing.JPasswordField();
        bandoc = new javax.swing.JRadioButton();
        admin = new javax.swing.JRadioButton();
        boss = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("  THƯ VIỆN QUẢN LÝ ");

        jLabel2.setText("Tài Khoản");

        jLabel3.setText("Mật Khẩu");

        tftaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftaikhoanActionPerformed(evt);
            }
        });

        btndangnhap.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btndangnhap.setText("Đăng Nhập");
        btndangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangnhapActionPerformed(evt);
            }
        });

        tfmatkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmatkhauActionPerformed(evt);
            }
        });

        buttonGroup1.add(bandoc);
        bandoc.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        bandoc.setText("Bạn Đọc");
        bandoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bandocActionPerformed(evt);
            }
        });

        buttonGroup1.add(admin);
        admin.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        admin.setText("admin");

        buttonGroup1.add(boss);
        boss.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        boss.setText("boss");
        boss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bossActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1.setText("Đăng Ký");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfmatkhau, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(tftaikhoan)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 50, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(77, 77, 77)
                .addComponent(btndangnhap)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bandoc)
                    .addComponent(boss)
                    .addComponent(admin))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tftaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(bandoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admin)
                    .addComponent(jButton1)
                    .addComponent(btndangnhap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boss, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfmatkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmatkhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfmatkhauActionPerformed
private void dangnhap(){
        }
    private void btndangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangnhapActionPerformed
dangnhap();
        
// TODO add your handling code here:
    }//GEN-LAST:event_btndangnhapActionPerformed

    private void tftaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftaikhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tftaikhoanActionPerformed

    private void bandocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bandocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bandocActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     new  GDDangky().setVisible(true); 
     this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bossActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bossActionPerformed

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
            java.util.logging.Logger.getLogger(GDDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GDDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GDDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GDDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GDDangNhap().setVisible(true);
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton admin;
    private javax.swing.JRadioButton bandoc;
    private javax.swing.JRadioButton boss;
    private javax.swing.JButton btndangnhap;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField tfmatkhau;
    private javax.swing.JTextField tftaikhoan;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(bandoc.isSelected()){if(e.getSource().equals(btndangnhap)){try {
            Connection connection = DBConnection.getConnection();
            String query = "SELECT * FROM dbo.taikhoan20173329 where TAIKHOAN20173329= ? AND MATKHAU20173329=?";
            PreparedStatement ps = connection.prepareStatement(query);
            String taikhoan = tftaikhoan.getText();
            ps.setString(1, tftaikhoan.getText());
            ps.setString(2, tfmatkhau.getText());
            ResultSet rs = ps.executeQuery();
          
            if(rs.next()){dangnhapclick();
            }else{
        JOptionPane.showMessageDialog(null, "ban da nhap sai thong tin tai khoan");}
          
        
            
            DBConnection.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(GDDangNhap.class.getName()).log(Level.SEVERE, null, ex);
        };}}else
if(admin.isSelected()){if(e.getSource().equals(btndangnhap)){try {
            Connection connection = DBConnection.getConnection();
            String query = "SELECT * FROM dbo.nhanvien20173329 where TAIKHOAN20173329= ? AND MATKHAU20173329=?";
            PreparedStatement ps = connection.prepareStatement(query);
            String taikhoan = tftaikhoan.getText();
            ps.setString(1, tftaikhoan.getText());
            ps.setString(2, tfmatkhau.getText());
            ResultSet rs = ps.executeQuery();
          
            if(rs.next()){dangnhap2click();
            }else {
        JOptionPane.showMessageDialog(null, "ban da nhap sai thong tin tai khoan");}
          
        
            
            DBConnection.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(GDDangNhap.class.getName()).log(Level.SEVERE, null, ex);
        };}}
else
    if(boss.isSelected()){if(e.getSource().equals(btndangnhap)){
        if(tfmatkhau.getText().equals("admin123")&&tftaikhoan.getText().equals("admin123")){dangnhap1click();
        }
        
        else{
JOptionPane.showMessageDialog(null, "nhap sai thong tin");}}
    }
    

        
    }
    
   
    private void dangnhapclick(){
    new GDBanDoc().setVisible(true);
    this.setLocationRelativeTo(null);
        setResizable(false);
    this.dispose();}
    private  void dangnhap1click(){
    new GDQLnhanvien().setVisible(true);
        setResizable(false);
        this.setLocationRelativeTo(null);
        this.dispose();
    }
    private void dangnhap2click(){
    new GDTrangChu().setVisible(true);
        setResizable(false);
    this.dispose();}
}
