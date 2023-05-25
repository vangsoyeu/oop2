package Buoi6.baitap;

import java.util.PrimitiveIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneXample {
    private final String PHONE_REGEX = "\\(\\d{2}\\)-0\\d{9}";
    boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

class PhoneExampleTEST {
    public static void main(String[] args) {
        PhoneXample phone = new PhoneXample();
        String[] numberPhone = {"(84)-0978489648", "(84)-0336172381"};
        for (String phoneExample: numberPhone) {
            boolean isValidate = phone.validate(phoneExample);
            System.out.println(phoneExample + " => " + isValidate);
        }
    }
}
