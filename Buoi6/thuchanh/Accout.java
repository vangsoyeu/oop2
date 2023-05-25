package Buoi6.thuchanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Accout {
    private static final String ACCOUT_REGEX = "^[_a-z0-9]{6,}$";

    public Accout() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Accout acc = new Accout();
        String[] validAccount = new String[]{"123abc_", "_abc123", "______", "12345", "1234_", "abcde"};
        for (String account : validAccount) {
            boolean isValid = acc.validate(account);
            System.out.println("Account is " + account + " is valid: " + isValid + ".");
        }
    }
}

//class AccoutExampleTest {
//    public static void main(String[] args) {
//        Accout accout = new Accout();
        //Cách 1:
//        String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
//        String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};
//        for (String account : validAccount) {
//            boolean isValid = accout.validate(account);
//            System.out.println("Account is " + account + " is valid: " + isValid);
//        }
//        for (String account : invalidAccount) {
//            boolean isValid = accout.validate(account);
//            System.out.println("Account is " + account + " is valid: " + isValid);
//        }


        //Cách 2:
//        boolean isValid;
//        //Trả về true:
//        String acc1 = "123abc_";
//        isValid = accout.validate(acc1);
//        System.out.println("Account is " + acc1 + " is valid: " + isValid);
//        String acc2 = "_abc123";
//        isValid = accout.validate(acc2);
//        System.out.println("Account is " + acc2 + " is valid: " + isValid);
//        String acc3 = "_______";
//        isValid = accout.validate(acc3);
//        System.out.println("Account is " + acc3 + " is valid: " + isValid);
//        System.out.println("-----------------------------------------------");
//        //Trả về false
//        String acc4 = "12345";
//        isValid = accout.validate(acc4);
//        System.out.println("Account is " + acc4 + " is valid: " + isValid);
//        String acc5 = "abcde";
//        isValid = accout.validate(acc5);
//        System.out.println("Account is " + acc5 + " is valid: " + isValid);
//    }
//}
