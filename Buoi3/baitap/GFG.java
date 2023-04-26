package Buoi3.baitap;
public class GFG {
    public static void main(String[] args) {
        String s = "";
        try {
            System.out.println(getLength(s));
        } catch(IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
        s = "GeeksforGeeks";
        try {
            System.out.println(getLength(s));
        } catch(IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
        s = null;
        try {
            System.out.println(getLength(s));
        } catch(IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
    }
    public static int getLength(String s) {
        if (s == null)
            throw new IllegalArgumentException("The argument cannot be null");
        return s.length();
    }
}


// Trả lời câu hỏi:
// 1. Ngoại lệ IllegalArgumentException xảy ra khi nào?
// Ngoại lệ IllegalArgumentException trong Java được ném khi một phương thức được truyền đối số không hợp lệ hoặc không phù hợp

// 2. Giải thích mục đích của hàm getLength():
// - là 1 phương thức static của lớp String và trả về độ dài của chuỗi được truyền vào như 1 đối số. Nếu đối số là null, phương thức
// sẽ ném ra 1 ngoại lệ IllegalArgumentException với thông báo "The argument cannot be null".

