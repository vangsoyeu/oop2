package Buoi1.BaiTap;

public class Circle {
    private String color;
    private double radius;

    Circle() {
    }
    Circle(String color) {
        this.color = color;
    }
    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with radius = "+getRadius()+" (area of the circle = "+getArea()+")"+" and color is "+getColor();
    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(8,"red");
        System.out.println(circle);
    }
}
class Cylinder extends Circle{
    private double height;
    Cylinder() {
    }
    Cylinder(double height) {
        this.height = height;
    }
    Cylinder(double height,double radius,String color) {
        super(radius,color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return Math.PI*Math.pow(getRadius(),2)*height;
    }
    @Override
    public String toString() {
        return "The cylinder has length = " + getHeight()+", which is a subclass of "+super.toString()+"==> Cylindrical volume = "+getVolume();
    }
}
class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(2.5);
        System.out.println(cylinder);

        cylinder = new Cylinder(5.0,3.5,"pink");
        System.out.println(cylinder);
    }
}