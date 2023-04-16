package Buoi1;

public class People {
    private String name;
    private boolean gender;
    private int age;
    People() {
        name = "Tên mặc định";
        age = 0;
        gender = false;
    }
    People(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public void Eat() {
        System.out.println("People eating...");
    }
    public void Sleep() {
        System.out.println("People sleep...");
    }
    @Override
    public String toString() {
        return "A people with name: "+getName()+", age: "+getAge()+" and gender: "+(isGender()?"nam":"nữ");
    }
}
class PeopleTest {
    public static void main(String[] args) {
        People people = new People();
        System.out.println(people);

        people = new People("Nguyen Van C", 18, false);
        System.out.println(people);

        people.setAge(20);
        System.out.println(people);
    }
}
class Student extends People {
    private String classname;
    public Student() {
        super();
        classname = "D101_C1K14";
    }
    public Student(String classname){
        super();
        this.classname = classname;
    }
    public Student(String name,boolean gender,int age,String classname) {
        super(name, age, gender);
        this.classname = classname;
    }
    public String getClassname() {
        return classname;
    }
    public void setClassname(String classname) {
        this.classname = classname;
    }
    public void student() {
        System.out.println("Students are studying hard :))))");
    }
    @Override
    public String toString() {
        return "A Student with class name: "+getClassname()+", which is a subclass of "+super.toString();
    }
}
class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);

        Student student1= new Student("C101_D2K14");
        System.out.println(student);

        student = new Student("Ta Van A", false, 23, "IBSK1D1");
        System.out.println(student);
    }
}

class Employee extends People {
    private String enterprise;
    public Employee() {
        super();
        enterprise = "CodeGym";
    }
    public Employee(String enterprise) {
        super();
        this.enterprise = enterprise;
    }
    public Employee(String name, boolean gender, int age, String enterprise) {
        super(name, age, gender);
        this.enterprise = enterprise;
    }
    public String getEnterprise() {
        return enterprise;
    }
    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }
    public void work() {
        System.out.println("workers working...");
    }

    @Override
    public String toString() {
        return "A Employee work at enterprise: "+getEnterprise()+", which is a subclass of "+super.toString();
    }
}
class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);

        employee = new Employee("Nguyen Thi A", true, 21, "FPT");
        System.out.println(employee);

        employee.work();
        employee.setEnterprise("Viettel");
        System.out.println(employee);
    }
}