/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Start;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import StaffManager.Main;
import Class.NhanVien;
import Class.SetUpCloseOperation;


/**
 *
 * @author Admin
 */
public class SortBySalary extends javax.swing.JFrame {
    Main main = new Main();
    List<NhanVien> list = main.getList();
    /**
     * Creates new form SortBySalary
     */
    public SortBySalary() {
        initComponents();
        displayList(list);
        SetUpCloseOperation.applyCloseOperation(this);
    }
    
    private void displayList(List<NhanVien> list) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    
    int stt = 1;
    for (NhanVien nv : list) {
        double salary = nv.getHeSoLuong() * nv.getSoNgayCong();
        model.addRow(new Object[]{stt++, nv.getMa(), nv.getTen(), nv.getChucVu(), nv.getHeSoLuong(), nv.getSoNgayCong(), salary});
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        sapTang = new javax.swing.JButton();
        sapGiam = new javax.swing.JButton();
        duoi5tr = new javax.swing.JButton();
        between5_10tr = new javax.swing.JButton();
        tren10tr = new javax.swing.JButton();
        sapTang1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Danh sách Lương ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Nhân viên", "Tên Nhân viên", "Chức vụ", "Hệ số lương", "Số ngày công", "Lương"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        sapTang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sapTang.setText("Sắp xếp tăng");
        sapTang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sapTangActionPerformed(evt);
            }
        });

        sapGiam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sapGiam.setText("Sắp xếp giảm");
        sapGiam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sapGiamActionPerformed(evt);
            }
        });

        duoi5tr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        duoi5tr.setText("Dưới 5tr");
        duoi5tr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duoi5trActionPerformed(evt);
            }
        });

        between5_10tr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        between5_10tr.setText("5tr-10tr");
        between5_10tr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                between5_10trActionPerformed(evt);
            }
        });

        tren10tr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tren10tr.setText("Trên 10tr");
        tren10tr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tren10trActionPerformed(evt);
            }
        });

        sapTang1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sapTang1.setText("Quay lại");
        sapTang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sapTang1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sapTang1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(291, 291, 291))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(sapTang)
                        .addGap(37, 37, 37)
                        .addComponent(sapGiam)
                        .addGap(36, 36, 36)
                        .addComponent(duoi5tr, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(between5_10tr, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(tren10tr)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addComponent(sapTang1))
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sapTang)
                    .addComponent(sapGiam)
                    .addComponent(duoi5tr)
                    .addComponent(between5_10tr)
                    .addComponent(tren10tr))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sapTangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sapTangActionPerformed
        // TODO add your handling code here:
        
        List<NhanVien> list = main.getList();
        list.sort(Comparator.comparingDouble(nv -> nv.getHeSoLuong() * nv.getSoNgayCong()));
        displayList(list);
    }//GEN-LAST:event_sapTangActionPerformed

    private void between5_10trActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_between5_10trActionPerformed
        // TODO add your handling code here:
        List<NhanVien> filteredList = main.getList().stream()
            .filter(nv -> {
                double salary = nv.getHeSoLuong() * nv.getSoNgayCong();
                return salary >= 5000000 && salary <= 10000000;
            })
            .toList();
        displayList(filteredList);
    }//GEN-LAST:event_between5_10trActionPerformed

    private void sapGiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sapGiamActionPerformed
        // TODO add your handling code here:
        List<NhanVien> list = main.getList();
        list.sort(Comparator.comparingDouble(nv -> nv.getHeSoLuong() * nv.getSoNgayCong()));
        Collections.reverse(list);
        displayList(list);
    }//GEN-LAST:event_sapGiamActionPerformed

    private void duoi5trActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duoi5trActionPerformed
        // TODO add your handling code here:
        List<NhanVien> filteredList = main.getList().stream()
            .filter(nv -> nv.getHeSoLuong() * nv.getSoNgayCong() < 5000000)
            .toList();
        displayList(filteredList);
    }//GEN-LAST:event_duoi5trActionPerformed

    private void tren10trActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tren10trActionPerformed
        // TODO add your handling code here:
        List<NhanVien> filteredList = main.getList().stream()
            .filter(nv -> nv.getHeSoLuong() * nv.getSoNgayCong() > 10000000)
            .toList();
        displayList(filteredList);
    }//GEN-LAST:event_tren10trActionPerformed

    private void sapTang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sapTang1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new SalaryScreen().setVisible(true);
    }//GEN-LAST:event_sapTang1ActionPerformed

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
            java.util.logging.Logger.getLogger(SortBySalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortBySalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortBySalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortBySalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortBySalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton between5_10tr;
    private javax.swing.JButton duoi5tr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton sapGiam;
    private javax.swing.JButton sapTang;
    private javax.swing.JButton sapTang1;
    private javax.swing.JButton tren10tr;
    // End of variables declaration//GEN-END:variables
}