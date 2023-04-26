package Buoi3.baitap;

public class GFG3 {
    public static void main (String[] args) {
        // Initializing String variable with null value
        String str = null;
        String message = (str == null) ? "" :
                str.substring(0,5);
        System.out.println(message);
//Từ dòng 6 -> 9 in ra "" vì trá trị của biến str = null mà theo biến message nếu biến str == null thì giá trị trả về true = "";
        // Initializing String variable with null value
        str = "Geeksforgeeks";
        message = (str == null) ? "" : str.substring(0,5);
        System.out.println(message);
//Từ dòng 12 -> 14 in ra "Geeks" vì lúc này giá trị của str = "Geeksforgeeks" theo message thì str lúc này k = null nên trả về giá
// trị false cx tức là str.substring(0,5) mà str.substring(0,5) là lấy kí tự từ 0 -> 5 => giá trị trả về = "Geeks" (5 kí tự được lấy ra).
    }
}
//Cú pháp tổng quát của toán tử 3 ngôi: TypeData NameBiến = (Điều kiện) ? value_true : value_false;