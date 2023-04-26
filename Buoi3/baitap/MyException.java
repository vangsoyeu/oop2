package Buoi3.baitap;

public class MyException extends Exception {
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}

// A Class that uses above MyException
class Main {
    // Driver Program
    public static void main(String args[])
    {
        try {
            // Throw an object of user defined exception
            throw new MyException("GeeksGeeks");
        }
        catch (MyException ex) {
            System.out.println("Caught");

            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }
    }
}
//Đoạn mã trên bao gồm 2 lớp: Lớp MyException và lớp Main
//kết quả "Caught" đc in ra từ dòng code thứ 21. Còn "GeeksGeeks" được in ra từ dòng 24-> được gọi đến từ dòng 18.