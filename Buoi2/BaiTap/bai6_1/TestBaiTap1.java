package Buoi2.BaiTap.bai6_1;

public class TestBaiTap1 {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"yellow",true);
        System.out.println(circle);
        System.out.println("------------------------------------------------------------------------------------------------------");
        Rectangle rectangle = new Rectangle(5,10,"yellow",true);
        System.out.println(rectangle);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        Square square = new Square(5,"yellow",false);
        System.out.println(square);
    }
}
abstract class Shape {
    protected String color = "red";
    protected boolean filled = true;
    Shape() {}
    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape has color is "+getColor()+" and "+isFilled();
    }
}

class Circle extends Shape {
    protected double radius = 1.0;
    Circle() {}
    Circle(double radius) {
        this.radius = radius;
    }
    Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return radius*radius* Math.PI;
    }
    @Override
    public double getPerimeter() {
        return radius*2* Math.PI;
    }
    @Override
    public String toString() {
        return "Circle has radius = " + getRadius()+", which is a subclass of " + super.toString();
    }
}

class Rectangle extends Shape {
    protected double length,width;
    Rectangle() {
        length=width=1.0;
    }
    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return width*length;
    }
    @Override
    public double getPerimeter() {
        return (width+length)*2;
    }
    @Override
    public String toString() {
        return "Rectangle has width = " + getWidth()+" and height = "+getLength()+", which is a subclass of " + super.toString();
    }
}

class Square extends Rectangle {
    Square() {}
    Square(double side) {
        this.width = side;
        this.length= side;
    }
    Square(double side, String color, boolean filled) {
        super(side,side,color,filled);
    }
    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }
    @Override
    public void setWidth(double width) {
        setSide(width);
    }
    @Override
    public void setLength(double length) {
        setSide(length);
    }
    @Override
    public String toString() {
        return "Square has side = "+getSide()+", which is a subclass of "+super.toString();
    }
}