package Buoi2.BaiTap.bai6_3;

public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable {
    int x,y,xSpeed,ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        int result = y -= ySpeed;
        System.out.println("Movable point up: "+result);
    }
    @Override
    public void moveDown() {
        int result = y+=ySpeed;
        System.out.println("Movable Point down: "+result);
    }
    @Override
    public void moveLeft() {
        int result = x-=xSpeed;
        System.out.println("Movable Point left: "+result);
    }
    @Override
    public void moveRight() {
        int result = x+=xSpeed;
        System.out.println("Movable Point right: "+result);
    }
}

class Test {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(18,10,5,7);
        System.out.println(movablePoint);
        movablePoint.moveUp();
        movablePoint.moveDown();
        movablePoint.moveLeft();
        movablePoint.moveRight();
    }
}