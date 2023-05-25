package Buoi6.baitap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    static boolean validate(String class_regex,String regex) {
        Pattern pattern = Pattern.compile(class_regex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ClassExample classExample = new ClassExample();
        final String CLASS_REGEX = "^[CAP][0-9]{4}[GHIK]$";
        String[] class_name = new String[]{"C2023G", "A6459K", "P9913I", "H0562G", "L1017B", "D8420F"};
        int i = 0;
        for (String class_student: class_name) {
            boolean isValid = validate(CLASS_REGEX, class_student);
            System.out.println(class_student + " => " + isValid);
            if (i == 2) System.out.println("------------------");
            i++;
        }
    }
}


