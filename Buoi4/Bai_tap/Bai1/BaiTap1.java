package Buoi4.Bai_tap.Bai1;
import java.io.FileReader;
import java.io.IOException;

public class BaiTap1 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("numbers.txt");
            int data = reader.read();
            while (data != -1) {
                char character = (char) data;
                System.out.print(character);
                data = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
