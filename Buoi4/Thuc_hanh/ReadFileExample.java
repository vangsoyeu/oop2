package Buoi4.Thuc_hanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập đường dẫn của file: ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        int sum = 0;
        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                try {
                    int number = Integer.parseInt(line);
                    sum += number;
                } catch (NumberFormatException e) {
                    System.out.println("File chứa giá trị không phải là số.");
                    return;
                }
            }
            System.out.println("Tổng các số trong file là: " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại.");
        }
    }
}
