package Buoi3.baitap;

import javax.management.MBeanAttributeInfo;

public class GFG2 {
    public static void main(String[] args) {
        String ptr = null;
//        if (ptr.equals("gfg")) {
//            System.out.println("Same");
//        } else {
//            System.out.println("Not Same");
//        }
// Khi chạy mã lệnh trên xảy ra ngoại lệ NullPointerException tại vì không thể đọc "String.equals(Object)" bởi vì "ptr" là null.
        try {
            if (ptr.equals("gfg")) {
                System.out.println("Same");
            } else {
                System.out.println("Not Same");
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException Caught");
        }
// Khi chạy chương trình
    }
}
