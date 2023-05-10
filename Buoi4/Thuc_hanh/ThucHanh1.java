package Buoi4.Thuc_hanh;

import java.io.File;
import java.io.IOException;

public class ThucHanh1 {
    public static void main(String[] args) {
        File file = new File("hello.txt");
        String name = file.getName();
        String path = file.getPath();
        System.out.println("Tên file: " + name);
        System.out.println("Đường dẫn file: " + path);
    }
}
