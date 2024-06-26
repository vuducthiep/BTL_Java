/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package StaffManager;

import Class.NhanVien;
import Class.SetUpCloseOperation;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class SearchNV extends javax.swing.JFrame {

    /**
     * Creates new form SearchNV
     */
    
    DefaultTableModel model;
    
    private Main parentFrame;
    List<NhanVien> list;
    
    public SearchNV() {
        this.list = parentFrame.getList();
        initComponents();
        SetUpCloseOperation.applyCloseOperation(this);
    }
    
    public SearchNV(Main parentFrame) {
        initComponents(); // Đưa phương thức này lên đầu constructor
        this.parentFrame = parentFrame;
        this.list = parentFrame.getList();
        
        model = (DefaultTableModel) jTable1.getModel();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchByName = new javax.swing.JButton();
        searchByCode = new javax.swing.JButton();
        searchByAge = new javax.swing.JButton();
        searchByAddress = new javax.swing.JButton();
        searchByPosition = new javax.swing.JButton();
        Return = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Nhân viên", "Tên Nhân viên", "Tuổi", "Địa chỉ", "Giới tính", "Chức vụ", "Hệ số lương", "Số ngày công"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("TÌM KIẾM NHÂN VIÊN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nhân viên tìm được");

        searchByName.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        searchByName.setText("Tên");
        searchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByNameActionPerformed(evt);
            }
        });

        searchByCode.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        searchByCode.setText("Mã Nhân viên");
        searchByCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByCodeActionPerformed(evt);
            }
        });

        searchByAge.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        searchByAge.setText("Tuổi");
        searchByAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByAgeActionPerformed(evt);
            }
        });

        searchByAddress.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        searchByAddress.setText("Địa chỉ");
        searchByAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByAddressActionPerformed(evt);
            }
        });

        searchByPosition.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        searchByPosition.setText("Chức vụ");
        searchByPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByPositionActionPerformed(evt);
            }
        });

        Return.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Return.setText("Quay lại");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(searchByName)
                .addGap(42, 42, 42)
                .addComponent(searchByCode)
                .addGap(52, 52, 52)
                .addComponent(searchByAge)
                .addGap(61, 61, 61)
                .addComponent(searchByAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchByPosition)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchByName)
                    .addComponent(searchByCode)
                    .addComponent(searchByAge)
                    .addComponent(searchByAddress)
                    .addComponent(searchByPosition))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchByCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByCodeActionPerformed
        openEnterToSearch("Mã nhân viên");
    }//GEN-LAST:event_searchByCodeActionPerformed

    private void searchByAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByAgeActionPerformed
        openEnterToSearch("Tuổi");
    }//GEN-LAST:event_searchByAgeActionPerformed

    private void searchByAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByAddressActionPerformed
        openEnterToSearch("Địa chỉ");
    }//GEN-LAST:event_searchByAddressActionPerformed

    private void searchByPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByPositionActionPerformed
        openEnterToSearch("Chức vụ");
    }//GEN-LAST:event_searchByPositionActionPerformed

    private void searchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByNameActionPerformed
        openEnterToSearch("Tên");
    }//GEN-LAST:event_searchByNameActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:
        dispose();
        parentFrame.setVisible(true);
    }//GEN-LAST:event_ReturnActionPerformed

    
    private void openEnterToSearch(String label) {
        EnterToSearch enterToSearch = new EnterToSearch(label, this);
        enterToSearch.setVisible(true);
    }
    
    public void processSearchData(String label, String data) {
    // Tạo một danh sách tạm thời để lưu kết quả tìm kiếm
        List<NhanVien> searchResult = new ArrayList<>();

        // Tìm kiếm trong danh sách và thêm các kết quả phù hợp vào danh sách tạm thời
        switch (label) {
            case "Tên":
                for (NhanVien nv : list) {
                    if (nv.getTen().contains(data)) {
                        searchResult.add(nv);
                    }
                }
                break;
            case "Mã nhân viên":
                for (NhanVien nv : list) {
                    if (nv.getMa().equalsIgnoreCase(data)) {
                        searchResult.add(nv);
                    }
                }
                break;
            case "Tuổi":
                int age;
                try {
                    age = Integer.parseInt(data);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập tuổi dưới dạng số nguyên!");
                    return;
                }
                for (NhanVien nv : list) {
                    if (nv.getTuoi() == age) {
                        searchResult.add(nv);
                    }
                }
                break;
            case "Địa chỉ":
                for (NhanVien nv : list) {
                    if (nv.getDiaChi().equalsIgnoreCase(data)) {
                        searchResult.add(nv);
                    }
                }
                break;
            case "Chức vụ":
                for (NhanVien nv : list) {
                    if (nv.getChucVu().equalsIgnoreCase(data)) {
                        searchResult.add(nv);
                    }
                }
                break;
            default:
                JOptionPane.showMessageDialog(this, "Loại tìm kiếm không hợp lệ");
                return;
        }
         // Cập nhật bảng hiển thị kết quả
        updateTable(searchResult);
    }
    
    private void updateTable(List<NhanVien> searchResult) {
        // Lấy model của jTable1 thông qua jScrollPane1
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        // Xóa dữ liệu hiện có trong bảng
        model.setRowCount(0);

        // Thêm dữ liệu mới vào bảng từ danh sách kết quả tìm kiếm
        int stt = 1;
        for (NhanVien nv : searchResult) {
            model.addRow(new Object[]{stt++, nv.getMa(), nv.getTen(), nv.getTuoi(), nv.getDiaChi(), nv.getGioiTinh(), nv.getChucVu(), nv.getHeSoLuong(), nv.getSoNgayCong()});
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
            java.util.logging.Logger.getLogger(SearchNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Return;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton searchByAddress;
    private javax.swing.JButton searchByAge;
    private javax.swing.JButton searchByCode;
    private javax.swing.JButton searchByName;
    private javax.swing.JButton searchByPosition;
    // End of variables declaration//GEN-END:variables
}
