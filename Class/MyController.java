package Class;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Class.NhanVien;

/**
 *
 * @author Dell
 */
public class MyController implements Controller {

    @Override
    public <T> void writeToFile(List<T> list, String fileName) {
        File file = new File(fileName);
        try (FileWriter fileWriter = new FileWriter(file)) {
            for (T item : list) {
                fileWriter.write(item.toString() + System.lineSeparator());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public <T> List<T> readDataFromFile(String fileName) {
        List<T> list = new ArrayList<>();
        File file = new File(fileName);
        if (file.exists() && file.length() > 0) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Assuming T has a constructor that takes a String
                    T item = (T) line;  // This cast might not be safe
                    list.add(item);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return list;
    }

    public void writeAccountToFile(String account, String password, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) { // 'true' for appending
            fileWriter.write(account + ", " + password + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readAccountFromFile(String fileName) {
        StringBuilder accounts = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            String account;
            while ((account = in.readLine()) != null) {
                accounts.append(account).append(System.lineSeparator());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return accounts.toString();
    }

    @Override
    public void writeAccoutToFile(String accout, String password, String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
