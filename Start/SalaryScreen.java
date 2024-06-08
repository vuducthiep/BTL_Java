/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Start;

import java.util.List;
import StaffManager.Main;
import Class.NhanVien;
import Class.SetUpCloseOperation;
import javax.swing.JOptionPane;
import Class.FileIO;

/**
 *
 * @author UyVo
 */
public class SalaryScreen extends javax.swing.JFrame {

    /**
     * Creates new form Salary_Screen
     */
    public SalaryScreen() {
        initComponents();
        SetUpCloseOperation.applyCloseOperation(this);
    }

    Main main = new Main();
        List<NhanVien> list = main.getList();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inputCode = new javax.swing.JTextField();
        tenNV = new javax.swing.JLabel();
        tienLuongNV = new javax.swing.JLabel();
        soNgayCongNV = new javax.swing.JLabel();
        heSoLuongNV = new javax.swing.JLabel();
        tinhLuong = new javax.swing.JButton();
        sapXep = new javax.swing.JButton();
        max = new javax.swing.JButton();
        Min = new javax.swing.JButton();
        min1 = new javax.swing.JButton();
        ThanhToanLuong = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tính lương");

        jLabel3.setText("Tên Nhân viên:");

        jLabel4.setText("Hệ số lương:");

        jLabel5.setText("Ngày công:");

        jLabel6.setText("Tiền lương:");

        jLabel7.setText("Mã Nhân viên:");

        inputCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCodeActionPerformed(evt);
            }
        });

        tinhLuong.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tinhLuong.setText("Tính");
        tinhLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinhLuongActionPerformed(evt);
            }
        });

        sapXep.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        sapXep.setText("Sắp xếp");
        sapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sapXepActionPerformed(evt);
            }
        });

        max.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        max.setText("Max");
        max.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxActionPerformed(evt);
            }
        });

        Min.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Min.setText("Min");
        Min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinActionPerformed(evt);
            }
        });

        min1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        min1.setText("Quay lại trang chủ");
        min1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                min1ActionPerformed(evt);
            }
        });

        ThanhToanLuong.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ThanhToanLuong.setText("Thanh toán lương");
        ThanhToanLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThanhToanLuongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel7))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(tienLuongNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(soNgayCongNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                                    .addComponent(heSoLuongNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(inputCode, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(tenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(sapXep)
                                .addGap(62, 62, 62)
                                .addComponent(max)
                                .addGap(56, 56, 56)
                                .addComponent(Min, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThanhToanLuong)
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tinhLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(min1))
                .addGap(208, 208, 208)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addGap(307, 307, 307))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(min1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(soNgayCongNV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heSoLuongNV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tienLuongNV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tinhLuong)
                    .addComponent(sapXep)
                    .addComponent(max)
                    .addComponent(Min)
                    .addComponent(ThanhToanLuong))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCodeActionPerformed

    private void sapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sapXepActionPerformed
        // TODO add your handling code here:
        SortBySalary sortBySalary = new SortBySalary();
        sortBySalary.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sapXepActionPerformed

    private void maxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxActionPerformed
        // Tìm nhân viên có lương cao nhất
        NhanVien maxSalaryEmployee = null;
        double maxSalary = Double.MIN_VALUE;
        for (NhanVien nv : list) {
            double salary = nv.getHeSoLuong() * nv.getSoNgayCong();
            if (salary > maxSalary) {
                maxSalary = salary;
                maxSalaryEmployee = nv;
            }
        }

        // Hiển thị thông tin của nhân viên có lương cao nhất
        if (maxSalaryEmployee != null) {
            tenNV.setText(maxSalaryEmployee.getTen());
            soNgayCongNV.setText(String.valueOf(maxSalaryEmployee.getSoNgayCong()));
            heSoLuongNV.setText(String.valueOf(maxSalaryEmployee.getHeSoLuong()));
            tienLuongNV.setText(String.valueOf(maxSalary));
            inputCode.setText(maxSalaryEmployee.getMa()); // Điền mã nhân viên vào ô mã nhân viên
        } else {
            // Nếu không có nhân viên nào, hiển thị thông báo
            tenNV.setText("Không có nhân viên");
            soNgayCongNV.setText("");
            heSoLuongNV.setText("");
            tienLuongNV.setText("");
        }
    }//GEN-LAST:event_maxActionPerformed

    private void MinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinActionPerformed
        // TODO add your handling code here:
        // Tìm nhân viên có lương thấp nhất
        NhanVien minSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;
        for (NhanVien nv : list) {
            double salary = nv.getHeSoLuong() * nv.getSoNgayCong();
            if (salary < minSalary) {
                minSalary = salary;
                minSalaryEmployee = nv;
            }
        }

        // Hiển thị thông tin của nhân viên có lương thấp nhất
        if (minSalaryEmployee != null) {
            tenNV.setText(minSalaryEmployee.getTen());
            soNgayCongNV.setText(String.valueOf(minSalaryEmployee.getSoNgayCong()));
            heSoLuongNV.setText(String.valueOf(minSalaryEmployee.getHeSoLuong()));
            tienLuongNV.setText(String.valueOf(minSalary));
            inputCode.setText(minSalaryEmployee.getMa()); // Điền mã nhân viên vào ô mã nhân viên
        } else {
            // Nếu không có nhân viên nào, hiển thị thông báo
            tenNV.setText("Không có nhân viên");
            soNgayCongNV.setText("");
            heSoLuongNV.setText("");
            tienLuongNV.setText("");
        }
    }//GEN-LAST:event_MinActionPerformed

    private void tinhLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinhLuongActionPerformed
            // TODO add your handling code here:
            // Lấy mã nhân viên từ ô nhập
        String code = inputCode.getText();

        // Tìm nhân viên trong danh sách
        NhanVien foundEmployee = null;
        for (NhanVien nv : list) {
            if (nv.getMa().equals(code)) {
                foundEmployee = nv;
                break;
            }
        }

        // Nếu tìm thấy nhân viên, hiển thị thông tin lên giao diện
        if (foundEmployee != null) {
            tenNV.setText(foundEmployee.getTen());
            heSoLuongNV.setText(String.valueOf(foundEmployee.getHeSoLuong()));
            soNgayCongNV.setText(String.valueOf(foundEmployee.getSoNgayCong()));
            
            // Tính lương cơ bản: hệ số lương * số ngày công
            double luongCoBan = foundEmployee.getHeSoLuong() * foundEmployee.getSoNgayCong();
            tienLuongNV.setText(String.valueOf(luongCoBan));
        } else {
            // Nếu không tìm thấy nhân viên, hiển thị thông báo
            tenNV.setText("Không tìm thấy nhân viên");
            heSoLuongNV.setText("");
            soNgayCongNV.setText("");
            tienLuongNV.setText("");
        }
    }//GEN-LAST:event_tinhLuongActionPerformed

    private void min1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_min1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MainMenu().setVisible(true);
        
    }//GEN-LAST:event_min1ActionPerformed

    private void ThanhToanLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThanhToanLuongActionPerformed
        // Get the employee code from the input field
    String code = inputCode.getText();
    
    // Find the employee in the list
    NhanVien foundEmployee = null;
    for (NhanVien nv : list) {
        if (nv.getMa().equals(code)) {
            foundEmployee = nv;
            break;
        }
    }
    
    // If employee is found, proceed with payment
    if (foundEmployee != null) {
        // Show confirmation dialog
        int response = JOptionPane.showConfirmDialog(this, 
                "Bạn có chắc chắn muốn thanh toán?", 
                "Xác nhận thanh toán", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
        
        // If the user confirms
        if (response == JOptionPane.YES_OPTION) {
            // Set the number of working days to 0
            foundEmployee.setSoNgayCong(0);
            
            // Update the UI to reflect the changes
            tenNV.setText(foundEmployee.getTen());
            heSoLuongNV.setText(String.valueOf(foundEmployee.getHeSoLuong()));
            soNgayCongNV.setText(String.valueOf(foundEmployee.getSoNgayCong()));
            tienLuongNV.setText("0.0");
            
            // Write the updated list to file
            FileIO.writeToFile(list, "src\\NhanVien.txt");
            
            // Show success message
            JOptionPane.showMessageDialog(this, 
                    "Thanh toán thành công!", 
                    "Thông báo", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
    } else {
        // If the employee is not found, show an error message
        JOptionPane.showMessageDialog(this, 
                "Không tìm thấy nhân viên!", 
                "Lỗi", 
                JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_ThanhToanLuongActionPerformed

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
            java.util.logging.Logger.getLogger(SalaryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalaryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalaryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalaryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalaryScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Min;
    private javax.swing.JButton ThanhToanLuong;
    private javax.swing.JLabel heSoLuongNV;
    private javax.swing.JTextField inputCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton max;
    private javax.swing.JButton min1;
    private javax.swing.JButton sapXep;
    private javax.swing.JLabel soNgayCongNV;
    private javax.swing.JLabel tenNV;
    private javax.swing.JLabel tienLuongNV;
    private javax.swing.JButton tinhLuong;
    // End of variables declaration//GEN-END:variables
}