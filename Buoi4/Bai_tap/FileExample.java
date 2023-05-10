package Buoi4.Bai_tap;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {
    static boolean writeFormFile(String fileName, String data) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(data);
            writer.close();
            return true;
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return false;
        }
    }
    static String readDataFormFile(String fileName) {
        StringBuilder data = new StringBuilder();
        try {
            FileReader reader = new FileReader(fileName);
            int ch;
            while ((ch = reader.read()) != -1) {
                data.append((char) ch);
            }
            reader.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return data.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "CayRoiDo.txt";
        System.out.print("Nhập dữ liệu cần ghi vào file text: ");
        String data = scanner.next();
        //Tạo file mới:
        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("Thành công tạo file mới.");
            } else {
                System.out.println("File đã tồn tại.");
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        //Ghi vào file vừa tạo:
        boolean writeResult = writeFormFile(fileName, data);
        if (writeResult) {
            System.out.println("Dữ liệu được ghi thành công.");
        } else {
            System.out.println("Dữ liệu ghi thất bại");
        }

        String readData = readDataFormFile(fileName);
        System.out.println("Dữ liệu được đọc trong file là "+ readData);
    }
}

