package Buoi2.BaiTap.bai6_2;

public class TestBaiTap2 {
    public static void main(String[] args) {
        Circle0 circle0 = new Circle0(8);
        System.out.println(circle0);
        System.out.println("----------------------------------------");
        Rectangle0 rectangle = new Rectangle0(5,12);
        System.out.println(rectangle);
    }
}

interface GeometricObject {
    public double getArea();
    public double getPerimeter();
}
class Circle0 implements GeometricObject {
    private double radius;
    Circle0(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
    @Override
    public double getArea() {
        return radius*radius* Math.PI;
    }
    @Override
    public double getPerimeter() {
        return radius*2*Math.PI;
    }
}

class Rectangle0 implements GeometricObject {
    private double width, length;
    Rectangle0(double width,double length) {
        this.width = width;
        this.length = length;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return (width+length)*2;
    }
}