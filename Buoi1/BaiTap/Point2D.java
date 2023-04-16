package Buoi1.BaiTap;

public class Point2D {
    public float x,y;
    Point2D() {
        x=y=0.0f;
    }
    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] xy = {x,y};
        return xy;
    }
    @Override
    public String toString() {
        return "Element x: "+getXY()[0]
                + "\nElement y: "+getXY()[1];
    }
}
class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        System.out.println("---------------------------");

        point2D = new Point2D(3,5);
        System.out.println(point2D);
    }
}

class Point3D extends Point2D{
    private float z;
    Point3D() {
    }
    Point3D(float x,float y,float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ() {
        int list = getXY().length;
        float[] xyz = new float[list+1];
        for (int i = 0; i < getXY().length; i++) {
            xyz[i] = getXY()[i];
        }
        xyz[getXY().length] = z;
        return xyz;
    }
    @Override
    public String toString() {
        return super.toString()+"\nElement z: "+getXYZ()[2];
    }
}
class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        System.out.println("------------------------");
        point3D = new Point3D(3, 4, 5);
        System.out.println(point3D);
    }
}