package Kiem_Tra_Doc_Ghi_File;

public class People {
    private String name;
    private int age;
    private String sex;
    private double height;
    private double weight;
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
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public People() {}
    public People(String name, int age, String sex, double height, double weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", height=" + height +"m"+
                ", weight=" + weight +"kg"+
                '}';
    }
}

class Teacher extends People {
    private String level;
    private int experience;
    private String subject;
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    Teacher() {
        super();
    }
    Teacher(String name, int age, String sex, double height, double weight, String level, int experience, String subject) {
        super(name, age, sex, height, weight);
        this.level = level;
        this.experience = experience;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString()+" là "+"Teacher{" +
                "level='" + level + '\'' +
                ", experience=" + experience +"năm"+
                ", subject='" + subject + '\'' +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        //Tạo đối tượng People:
        People people = new People("Nguyễn Thị Hằng", 32, "Nữ", 1.70, 55);
        People people1 = new People("Lê Văn Sơn", 40, "Nam", 1.78, 75);
        People people2= new People("Lò Thị Nga", 20, "Nữ", 1.67, 52);
        People people3 = new People("Phạm Văn Quyết", 39, "Nam", 1.75, 67);

        //In ra thông tin đối tượng trên:
        System.out.println(people.toString());
        System.out.println(people1.toString());
        System.out.println(people2.toString());
        System.out.println(people3.toString());

        System.out.println("-------------------------------------------------------------------------------------------");

        //Tạo đối tượng Teacher:
        Teacher teacher = new Teacher("Vũ Hà Anh", 35, "Nữ", 1.66, 54, "THS", 5, "Văn");
        Teacher teacher1 = new Teacher("Phạm Văn Thành", 48, "Nam", 1.78, 80, "TS", 18, "Toán Cao Cấp");
        Teacher teacher2 = new Teacher("Nguyễn Thành An", 39, "Nam", 1.72,77,"TS", 8,"lịch Sử Thế Giới");

        //In ra thông tin của đối tượng trên:
        System.out.println(teacher.toString());
        System.out.println(teacher1.toString());
        System.out.println(teacher2.toString());

    }
}
