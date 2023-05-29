package Kiem_Tra_Doc_Ghi_File;

import java.io.*;

public class TestOIText {
    public void writeDataToFileWithFileWriter(String[] song, File file) throws IOException {
        FileWriter writer = new FileWriter(file);
        for (int i = 0; i < song.length; i++) {
            writer.write(song[i]+"\n");
        }
        writer.close();
    }

    public void readDataToFileWithFileReader(File file) throws IOException {

        FileReader reader = new FileReader(file);
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        reader.close();
    }

    public void writeDataToFileWithBufferWriter(String[] song, File file) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < song.length; i++) {
            bufferedWriter.write(song[i]+"\n");
        }
        bufferedWriter.close();
    }

    public void readDataToFileWithBufferReader(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        //Tạo 1 file:
        File file = new File("C:\\Users\\Vang So Yeu\\IdeaProjects\\Kien_Thuc_Them_Ve_Java\\src\\Kiem_Tra_Doc_Ghi_File\\list_song.txt");
        //Mảng các bài hát:
        String[] arraySong = new String[]{"Hello califonia", "We don’t talk any more", "Nắng ấm xa dần", "Em của ngày hôm qua", "Thất tình"};
        //Tạo đối tượng để gọi đến phương thức:
        TestOIText testOIText = new TestOIText();
        //Sử dụng FileWriter vs FileReader.
        testOIText.writeDataToFileWithFileWriter(arraySong,file);
        testOIText.readDataToFileWithFileReader(file);

        System.out.println("-------------------------------------------------");

        //Sử dụng BufferWriter và BufferReader:
        testOIText.writeDataToFileWithBufferWriter(arraySong, file);
        testOIText.readDataToFileWithBufferReader(file);
    }
}
