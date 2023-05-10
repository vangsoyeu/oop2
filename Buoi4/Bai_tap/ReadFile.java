package Buoi4.Bai_tap;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String filename = "example.txt";
        String data = input.next();

        try {
            //Ghi dữ liệu vào file
            FileWriter writer = new FileWriter(filename);
            writer.write(data);
            writer.close();

            //Đọc dữ liệu trong file đó
            FileReader reader = new FileReader(filename);
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
