/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Microsoft Windows
 */
public class GDQLnhanvien extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form GDQLBanDoc
     */
    public GDQLnhanvien() {
        initComponents();
        btnttMuonTra.addActionListener(this);
 
        btnThemBanDoc.addActionListener(this);  setLocationRelativeTo(null);
        btnQuayLai.addActionListener(this);
        
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
        btnThemBanDoc = new javax.swing.JButton();
        btnttMuonTra = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        btnthemnhanvien = new javax.swing.JButton();
        btnBangSach = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Quản Lí Nhân Viên");

        btnThemBanDoc.setText("Thêm Bạn Đọc Mới");
        btnThemBanDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemBanDocActionPerformed(evt);
            }
        });

        btnttMuonTra.setText("Thông Tin Mượn Trả ");
        btnttMuonTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnttMuonTraActionPerformed(evt);
            }
        });

        btnQuayLai.setText("Đăng Xuất");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        btnthemnhanvien.setText(" Nhân Viên");
        btnthemnhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemnhanvienActionPerformed(evt);
            }
        });

        btnBangSach.setText("Bảng Sách");
        btnBangSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangSachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnThemBanDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addComponent(btnttMuonTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnthemnhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBangSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuayLai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnThemBanDoc)
                .addGap(34, 34, 34)
                .addComponent(btnttMuonTra)
                .addGap(30, 30, 30)
                .addComponent(btnthemnhanvien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnBangSach)
                .addGap(18, 18, 18)
                .addComponent(btnQuayLai)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnttMuonTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnttMuonTraActionPerformed
        // TODO add your handling code here:
        new GDMuonTra1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnttMuonTraActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        // TODO add your handling code here:
        new GDDangNhap().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnThemBanDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemBanDocActionPerformed
new GDThemBanDoc1().setVisible(true);
this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_btnThemBanDocActionPerformed

    private void btnthemnhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemnhanvienActionPerformed
        // TODO add your handling code here:
      new gdThemnhanvien().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnthemnhanvienActionPerformed

    private void btnBangSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangSachActionPerformed
        // TODO add your handling code here:
        new QuanLyBangSach1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBangSachActionPerformed

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
            java.util.logging.Logger.getLogger(GDQLnhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GDQLnhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GDQLnhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GDQLnhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GDQLnhanvien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBangSach;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnThemBanDoc;
    private javax.swing.JButton btnthemnhanvien;
    private javax.swing.JButton btnttMuonTra;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        
      
    }
    public void btnThemBanDocClick(){
    new GDThemBanDoc1().setVisible(true);
    
    this.dispose();}
  
  
   
    public void btnmuontraclick(){ 
    new GDMuonTra1().setVisible(true);
this.dispose();
}
public void btnthemnhanvienclick(){
new gdThemnhanvien().setVisible(true);
this.dispose();}
public void btnQuayLaiclick(){
new GDDangNhap().setVisible(true);
this.dispose();
}
}
