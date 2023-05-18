package Buoi5.BaiTap;

import java.io.*;

public class Student implements Serializable{
    private String idStudent;
    private String name;
    private int age;
    private String lopHoc;
    Student(String idStudent, String name, int age, String lopHoc) {
        this.idStudent = idStudent;
        this.name = name;
        this.age = age;
        this.lopHoc = lopHoc;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getIdStudent() {
        return idStudent;
    }
    public String getLopHoc() {
        return lopHoc;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }
    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }
}

class StudentProcess {
    public static boolean write(Student objStudent, File filename) {
        try {
            ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(filename));
            ous.writeObject(objStudent);
            ous.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Student[] read(File filename) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            return (Student[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}

class StudentApp extends StudentProcess{
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Vang So Yeu\\IdeaProjects\\student.txt");
        Student[] students = new Student[5];
        students[0] = new Student("MS01", "Nam", 18, "CLASS D");
        students[1] = new Student("MS02", "Thùy", 18, "CLASS A");
        students[2] = new Student("MS03", "Hải", 18, "CLASS B");
        students[3] = new Student("MS04", "Hùng", 18, "CLASS C");
        students[4] = new Student("MS05", "Hạnh", 18, "CLASS D");

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("id" +i, "name" + i, 20 + i, "class" + i);
            write(students[i], file);
        }
    }
}
