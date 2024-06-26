/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package StaffManager;

import Class.NhanVien;
import Class.SetUpCloseOperation;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class SortNV extends javax.swing.JFrame {

    /**
     * Creates new form SortNV
     */
        DefaultTableModel model;

    private Main parentFrame;

    public SortNV(Main parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
        SetUpCloseOperation.applyCloseOperation(this);
        if (!parentFrame.list.isEmpty()) {
            refreshList();
        }
    }

    
    
    public SortNV() {
        
        initComponents();
        SetUpCloseOperation.applyCloseOperation(this);
        
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
        nameSort = new javax.swing.JButton();
        codeSort = new javax.swing.JButton();
        ageCode = new javax.swing.JButton();
        salarySort = new javax.swing.JButton();
        daySort = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Return = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setText("Sắp xếp danh sách nhân viên");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Chọn phương thức sắp xếp theo");

        nameSort.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameSort.setText("Tên");
        nameSort.setToolTipText("");
        nameSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameSortActionPerformed(evt);
            }
        });

        codeSort.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        codeSort.setText("Mã Nhân viên");
        codeSort.setToolTipText("");
        codeSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeSortActionPerformed(evt);
            }
        });

        ageCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ageCode.setText("Tuổi");
        ageCode.setToolTipText("");
        ageCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageCodeActionPerformed(evt);
            }
        });

        salarySort.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salarySort.setText("Hệ số lương");
        salarySort.setToolTipText("");
        salarySort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarySortActionPerformed(evt);
            }
        });

        daySort.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        daySort.setText("Số ngày lương");
        daySort.setToolTipText("");
        daySort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daySortActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Nhân viên", "Tên Nhân viên", "Tuổi", "Địa chỉ", "Giới tính", "Chức vụ", "Hệ số lương", "Số ngày công"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Return.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Return.setText("Quay lại trang chủ");
        Return.setToolTipText("");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(nameSort, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(codeSort)
                .addGap(45, 45, 45)
                .addComponent(ageCode)
                .addGap(40, 40, 40)
                .addComponent(salarySort)
                .addGap(57, 57, 57)
                .addComponent(daySort)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(285, 285, 285))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Return)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel2)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameSort)
                    .addComponent(codeSort, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageCode, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salarySort, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daySort, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void nameSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameSortActionPerformed

        // TODO add your handling code here:
        Collections.sort(parentFrame.list, Comparator.comparing(NhanVien::getTen));
        refreshList();
    }//GEN-LAST:event_nameSortActionPerformed

    private void codeSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeSortActionPerformed
        // TODO add your handling code here:
        Collections.sort(parentFrame.list, Comparator.comparing(NhanVien::getMa));
        refreshList();
    }//GEN-LAST:event_codeSortActionPerformed

    private void ageCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageCodeActionPerformed
        // TODO add your handling code here:
        Collections.sort(parentFrame.list, Comparator.comparing(NhanVien::getTuoi));
        refreshList();
    }//GEN-LAST:event_ageCodeActionPerformed

    private void salarySortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarySortActionPerformed
        // TODO add your handling code here:
        Collections.sort(parentFrame.list, Comparator.comparing(NhanVien::getHeSoLuong));
        refreshList();
    }//GEN-LAST:event_salarySortActionPerformed

    private void daySortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daySortActionPerformed
        // TODO add your handling code here:
        Collections.sort(parentFrame.list, Comparator.comparing(NhanVien::getSoNgayCong));
        refreshList();
    }//GEN-LAST:event_daySortActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        parentFrame.setVisible(true);
    }//GEN-LAST:event_ReturnActionPerformed

    private void refreshList() {
        model = (DefaultTableModel) jTable1.getModel();

        // Xóa hết các dòng trong bảng
        model.setRowCount(0);

        int stt = 1;
        for (NhanVien nv : parentFrame.list) {
            // Tạo một mảng chứa thông tin của mỗi nhân viên
            Object[] row = new Object[]{
                stt,
                nv.getMa(),
                nv.getTen(),
                nv.getTuoi(),
                nv.getDiaChi(),
                nv.getGioiTinh(),
                nv.getChucVu(),
                nv.getHeSoLuong(),
                nv.getSoNgayCong()
            };
            // Thêm mảng vào model của bảng
            model.addRow(row);
            stt++;
        }
    }
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
            java.util.logging.Logger.getLogger(SortNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Return;
    private javax.swing.JButton ageCode;
    private javax.swing.JButton codeSort;
    private javax.swing.JButton daySort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton nameSort;
    private javax.swing.JButton salarySort;
    // End of variables declaration//GEN-END:variables
}
