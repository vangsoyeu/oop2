package Buoi3.baitap;

import java.util.Scanner;
class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 3 cạnh của tam giác: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        try {
            IllegalTriangleException.checkTriangle(side1, side2, side3);
            System.out.println("Ba cạnh vừa nhập là cạnh của một tam giác.");
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

    public static void checkTriangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Các cạnh phải là số dương.");
        }
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Tổng hai cạnh bất kì phải lớn hơn cạnh còn lại.");
        }
    }
}
