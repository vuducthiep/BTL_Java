/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Admin
 */
public class NhanVien{
    private String ma, ten;
    private int tuoi;
    private String diaChi, gioiTinh, chucVu;

    
    private double heSoLuong;
    private int soNgayCong;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    
   
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    

    public String getDiaChi() {
        return diaChi;
    }

    
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public NhanVien(String ma, String ten, int tuoi, String diaChi, String gioiTinh, String chucVu, double heSoLuong, int soNgayCong) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.chucVu = chucVu;
        this.heSoLuong = heSoLuong;
        this.soNgayCong = soNgayCong;
    }

    public NhanVien() {
    }

    @Override
    public String toString() {
    return String.format(
        "Mã: %s\n" +
        "Tên: %s\n" +
        "Tuổi: %d\n" +
        "Địa chỉ: %s\n" +
        "Giới tính: %s\n" +
        "Chức vụ: %s\n" +
        "Hệ số lương: %.2f\n" +
        "Số ngày công: %d",
        ma, ten, tuoi, diaChi, gioiTinh, chucVu, heSoLuong, soNgayCong
    );
}

    

}
