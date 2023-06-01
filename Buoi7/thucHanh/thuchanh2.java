package Buoi7.thucHanh;

public class thuchanh2 {
    //Trước đó:
//    public static String fizzBuzz(int number){
//        if (number % 3 == 0 && number % 5 == 0) {
//            return "FizzBuzz";
//        }
//        if (number % 3 == 0) {
//            return "Fizz";
//        }
//        if (number % 5 == 0) {
//            return "Buzz";
//        }
//        return number + "";
//    }

    //sau đó:
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }


    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
}
