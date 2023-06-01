package Buoi7.thucHanh;

public class thuchanh3 {
    //trước đó: là 1 đường link mà hướng dẫn bảo nhưng chả thấy j.
    //Sau đó:
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static double getPerimeter(int radius) {
        return 2 * Math.PI  * radius;
    }

    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println(getVolume(5, 13));
    }
}
