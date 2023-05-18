package Buoi5.ThucHanh.ThucHanh1;

import java.io.*;
import java.util.Scanner;

public class DemoFileInputAndFileOutput implements Serializable{
    public static void main(String[] args) throws IOException, FileNotFoundException {
        // Khai báo:
        File file = new File("C:\\Users\\Vang So Yeu\\IdeaProjects\\Luyen Tap OOP2\\src\\Buoi5\\ThucHanh\\ThucHanh1\\parson.dat");
        FileOutputStream fos = new FileOutputStream(file);
        FileInputStream fis = new FileInputStream(file);

        //Ghi dữ liệu vào file:
        String name = "Pham Hoai Nam";
        byte[] arr = name.getBytes();
        fos.write(arr);

        //Đọc dữ liệu vừa ghi vào file:
        int i = fis.read();
        while (i != -1) {
            System.out.print((char) i);
            i = fis.read();
        }


        //Đóng file:
        fis.close();
        fos.close();
    }
}
