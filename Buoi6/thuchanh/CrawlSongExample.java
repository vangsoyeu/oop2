package Buoi6.thuchanh;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            //Đường dẫn web nhạc
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");


            //mở và đọc luồng bằng
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            //useDelimiter("\\Z") được sử dụng để thiết lập ký tự phân tách (delimiter) cho đối tượng scanner;
            // "\\Z" có nghĩa là kết thúc đầu vào;
            // => useDelimiter("\\Z") sử dụng để toàn bộ đầu vào sẽ được đọc như 1 chuỗi duy nhất.
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            //đóng scanner
            scanner.close();
            //Xóa tất cả các ký tự xuống dòng (newline)
            content = content.replaceAll("\\n+","");

            //regex
            // "name_song\"> => bắt đầu bằng 1 chuỗi cố định.
            // (.*?) => được định nghĩa bằng dấu (), chứa biểu thức .*?
            //      trong đó: . là một ký tự đại diện cho bất kỳ ký tự nào.
            //                * là  lặp lại 0 hoặc nhiều lần.
            //                ? là tìm kiếm chuỗi con ngắn nhất phù hợp.
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher matcher = p.matcher(content);

            //Phương thức find() trả về true nếu tìm thấy một chuỗi con phù hợp và false nếu không tìm thấy
            //Vòng lặp while sẽ tiếp tục lặp lại cho đến khi không còn chuỗi con phù hợp nào nữa.
            //Trong mỗi lần lặp, đoạn mã sử dụng phương thức group(1) để truy xuất chuỗi con phù hợp với
            // nhóm số 1 trong biểu thức chính quy và in ra màn hình.
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
