package Buoi3.thuchanh;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = Integer.parseInt(scanner.next());
            if (99 % n == 0) {
                System.out.println(n + " is a factor of 99.");
            }
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println("Exception encountered "+ex);
        }
//        catch (ArithmeticException ex) {
//            System.out.println("Arithmetic " + ex);
//        } catch (NumberFormatException ex) {
//            System.out.println("Number Fomat Exception "+ex);
//        }
    }
}
