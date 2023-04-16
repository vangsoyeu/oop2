package Buoi1;

public class Animal {
    private double weight,height;
    Animal() {
        weight = 0.0;
        height = 0.0;
    }
    Animal(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "A Animal with weight: "+getWeight()+" and height: "+ getHeight();
    }
}
class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal);

        Animal animal1 = new Animal(5, 6);
        System.out.println(animal1);

        Animal animal2 = new Animal();
        animal2.setHeight(1);
        animal2.setWeight(10);
        System.out.println(animal2);
    }
}

class Cat extends Animal{
    private double age;
    Cat() {
        super();
        age = 1.0;
    }
    Cat(double age) {
        this.age = age;
    }
    Cat(double weight, double height, double age) {
        super(weight, height);
        this.age = age;
    }
    public double getAge() {
        return age;
    }
    public void setAge(double age) {
        this.age = age;
    }
    public void sound() {
        System.out.println("Mew.....");
    }
    public void eat() {
        System.out.println("Eating.....");
    }

    @Override
    public String toString() {
        return  "A Cat with age: "+getAge()+", which is a subclass of "+super.toString();
    }
}

class TestCat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat);

        cat = new Cat(3.5);
        System.out.println(cat);

        cat = new Cat(3.5, 5, 10);
        System.out.println(cat);

    }
}