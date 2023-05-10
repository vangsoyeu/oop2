package Buoi4.Bai_tap;

import javax.xml.namespace.QName;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Student implements Serializable {
    private String id;
    private String name;
    private double pointToan,pointLy,pointHoa;
    Student() {

    }
    Student(String id, String name, double pointToan, double pointLy, double pointHoa) {
        this.id = id;
        this.name = name;
        this.pointToan = pointToan;
        this.pointLy = pointLy;
        this.pointHoa = pointHoa;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPointToan() {
        return pointToan;
    }
    public void setPointToan(double pointToan) {
        this.pointToan = pointToan;
    }
    public void setPointHoa(double pointHoa) {
        this.pointHoa = pointHoa;
    }
    public double getPointHoa() {
        return pointHoa;
    }
    public double getPointLy() {
        return pointLy;
    }
    public void setPointLy(double pointLy) {
        this.pointLy = pointLy;
    }
    @Override
    public String toString() {
        return "Mã SV: " + getId() +
                " Tên SV: " + getName()+
                " Điểm Toán: "+ getPointToan()+
                " Điểm Lý: "+ getPointLy()+
                " Điểm Hóa: "+ getPointHoa();
    }

    public static boolean writeStudentDataToFile(String filename, Student sv) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
            oos.writeObject(sv);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static ArrayList<Student> docSinhVien(String fileName) {
        ArrayList<Student> sinhViens = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                Student sv = (Student) ois.readObject();
                sinhViens.add(sv);
            }
        } catch (EOFException ignored) {

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        return sinhViens.isEmpty() ? null : sinhViens;
    }

    public static void main(String[] args) {
        Student sv1 = new Student("2200695", "Phạm Hoài Nam", 6, 7, 7);
        Student sv2 = new Student("2200696", "Người Cô Đơn", 9, 8, 9);

        boolean saveDataStudent1 = writeStudentDataToFile("sinhvien.txt",sv1);
        boolean saveDataStudent2 = writeStudentDataToFile("sinhvien.txt",sv2);

        if (saveDataStudent1 && saveDataStudent2) {
            System.out.println("Lưu Thành công dữ liệu của sinh viên.");
        } else {
            System.out.println("Lưu thất bại dữ liệu của sinh viên.");
        }

        ArrayList<Student> sinhViens = docSinhVien("sinhvien.txt");
        if (sinhViens != null) {
            for (Student sv : sinhViens) {
                System.out.println(sv);
            }
        } else {
            System.out.println("KHÔNG CÓ SINH VIÊN TRONG FILE!!!");
        }
    }
}
