package Kiem_Tra_Doc_Ghi_File;

import java.io.*;

public class TestOIText {
    //phương thức write vào File dùng FileWriter:
    public void writeDataToFileWithFileWriter(String[] song, File file) throws IOException {
        //khai báo FileWriter:
        FileWriter writer = new FileWriter(file);
        //dùng vòng lặp for để duyệt mảng và ghi từng phần tử của mảng vào File:
        for (int i = 0; i < song.length; i++) {
            writer.write(song[i]+"\n");
        }

        //Đóng:
        writer.close();
    }

    //Phương thức read trong file dùng FileReader:
    public void readDataToFileWithFileReader(File file) throws IOException {
        //Khai báo FileReader:
        FileReader reader = new FileReader(file);
        int ch;
        //Gán biến ch là giá trị trả về của reader.read()
        while ((ch = reader.read()) != -1) { // => điều kiện có nghĩa là nếu như không có ký tự nào để đọc thì sẽ trả về -1 và dừng vòng lặp.
            System.out.print((char) ch);    // In ký tự tương ứng với giá trị ch đầu ra và chuyển đổi kiểu dữ liệu từ int sang char trước khi in.
        }

        //Đóng:
        reader.close();
    }

    //Phương thức write vào File bằng BufferedWriter:
    public void writeDataToFileWithBufferWriter(String[] song, File file) throws IOException {
        //khai báo BufferedWriter:
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        //Sử dụng vòng lặp for để duyệt mảng và ghi từng giá trị của mảng vào file.
        for (int i = 0; i < song.length; i++) {
            bufferedWriter.write(song[i]+"\n"); // sử dụng \n để xuống dòng với mỗi 1 giá trị của mảng.
        }

        //Đóng:
        bufferedWriter.close();
    }

    //Phương thức read trong file bằng BufferedReader:
    public void readDataToFileWithBufferReader(File file) throws IOException {
        //khai báo:
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int ch;
        //Gán biến ch là giá trị trả về của reader.read()
        while ((ch = reader.read()) != -1) { // => điều kiện này có nghĩa là khi không đọc được ký tự nào trong file thì giá trị trả về -1 và dừng vòng lặp.
            System.out.print((char) ch);    // chuyển đổi kiểu dữ liệu của ch từ int sang char và in ra từng ký tự của ch tương ứng với giá trị đầu ra tiêu chuẩn.
        }

        //Đóng file:
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

