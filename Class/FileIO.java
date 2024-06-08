/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Admin
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIO {
    
    // Phương thức đọc dữ liệu từ file và trả về một danh sách các đối tượng NhanVien
    public static List<NhanVien> readFromFile(String fileName) {
        List<NhanVien> list = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Tách dữ liệu từ file thành các trường tương ứng của đối tượng NhanVien
                String[] data = line.split(", ");
                String ma = data[0];
                String ten = data[1];
                int tuoi = Integer.parseInt(data[2]);
                String diaChi = data[3];
                String gioiTinh = data[4];
                String chucVu = data[5];
                double heSoLuong = Double.parseDouble(data[6]);
                int soNgayCong = Integer.parseInt(data[7]);
                
                // Tạo đối tượng NhanVien và thêm vào danh sách
                NhanVien nv = new NhanVien(ma, ten, tuoi, diaChi, gioiTinh, chucVu, heSoLuong, soNgayCong);
                list.add(nv);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    // Phương thức ghi danh sách đối tượng NhanVien vào file
    public static void writeToFile(List<NhanVien> list, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (NhanVien nv : list) {
                // Ghi thông tin của mỗi đối tượng NhanVien vào file, mỗi dòng cho một đối tượng
                bw.write(nv.getMa() + ", " + nv.getTen() + ", " + nv.getTuoi() + ", " + nv.getDiaChi() + ", " +
                         nv.getGioiTinh() + ", " + nv.getChucVu() + ", " + nv.getHeSoLuong() + ", " +
                         nv.getSoNgayCong());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
