package Buoi5.ThucHanh.ThucHanh2;

import java.io.*;
import java.util.Scanner;

public class DemoMethodReadAndWrite {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Vang So Yeu\\IdeaProjects\\test.txt");
        String thongTin = "File nay chx co luu du lieu j ca.";
        ghiDuLieu(file, thongTin);
        docDuLieu(file);
    }

    //Phương thức ghi dữ liệu vào file:
    public static void ghiDuLieu(File file, String thongTin) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(file);
        byte[] arr = thongTin.getBytes();
        fos.write(arr);
        fos.close();
    }

    //Phương thức đọc dữ liệu trong file:
    public static void docDuLieu(File file) throws FileNotFoundException,IOException {
        FileInputStream fis = new FileInputStream(file);
        int i= fis.read();
        while (i != -1) {
            System.out.print((char) i);
            i = fis.read();
        }
        fis.close();
    }
}
