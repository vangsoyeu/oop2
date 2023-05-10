package Buoi4.Bai_tap;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAndReadFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("hello.txt");
            myWriter.write("Hello World!");
            myWriter.close();

            FileReader myReader = new FileReader("hello.txt");
            int ch;
            while ((ch = myReader.read()) != -1) {
                System.out.print((char) ch);
            }
            myReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
