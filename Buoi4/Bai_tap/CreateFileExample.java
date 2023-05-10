package Buoi4.Bai_tap;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        String fileName = "example";
        try {
            //Tạo file mới
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File create:" + file.getName());
            } else {
                System.out.println("File đã tồn tại");
            }

            //Kiểm tra xem xét file có tồn tại hay không
            if (file.exists()) {
                System.out.println("File có tồn tại");
            } else {
                System.out.println("File không tồn tại");
            }

            //Kiểm tra xem xét file có là thư mục không
            if (file.isDirectory()) {
                System.out.println("The file is a derectory");
            } else {
                System.out.println("The File isn't a derectory");
            }

            //HIển thị đường dẫn của file
            String abs = file.getAbsolutePath();
            System.out.println("The absolute path of the file is: " + abs);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
