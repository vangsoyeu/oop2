package Buoi2;

public class TestPeople {
    public static void main(String[] args) {
        StudentInfo student = new StudentInfo("Tuan Anh", 25, true);
        student.eat();
        student.sleep();
        student.registerCourse("Programming Node JS");
        student.attendClass();
    }

}

abstract class People {
    private String name;
    private int age;
    private boolean gender;
    People(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    abstract void eat();
    abstract void sleep();
    abstract void study();
}
interface Student {
   void registerCourse(String course);
   void attendClass();
}
interface Employee {
    void work();
    void takeBreak();
}

class StudentInfo0 extends People {
    StudentInfo0(String name,int age,boolean gender) {
        super(name,age,gender);
    }
    @Override public void eat() {
        System.out.println("Eating...");
    }
    @Override public void sleep() {System.out.println("Sleep...");}
    @Override public void study() {System.out.println("Do homework...");}
}
class StudentInfo extends People implements Student{
    StudentInfo(String name,int age,boolean gender) {
        super(name,age,gender);
    }
    @Override public void eat() {
        System.out.println("Eating...");
    }
    @Override public void sleep() {System.out.println("Sleep...");}
    @Override public void study() {System.out.println("Do homework...");}
    @Override public void registerCourse(String course){System.out.println(course);}
    public void attendClass(){System.out.println("Class A");}
}