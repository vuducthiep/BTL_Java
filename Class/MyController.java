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
public class MyController implements controller {

    @Override
    public <T> void writeToFile(List<T> list, String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            for (T item : list) {
                fileWriter.write(item.toString() + System.lineSeparator());
            }
            fileWriter.close();
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
                    T item = (T) line;
                    list.add(item);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return list;
    
    }

    public void writeAccoutToFile(String account,String password ,String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) { // 'true' for appending
            fileWriter.write(account +", "+ password + System.lineSeparator());
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

    
}
