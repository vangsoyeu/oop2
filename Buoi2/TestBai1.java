package Buoi2;
class a_TestBai1 {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        System.out.println(tiger.makeSound());
        Animal chicken = new Chicken();
        System.out.println(chicken.makeSound());
    }
}
abstract class Animal {abstract String  makeSound();}
interface Edible {public abstract String howtoEat();}
class Tiger extends Animal {
    @Override
    String makeSound() {
        return "Tiger: Gào....!";
    }
}
class Chicken extends Animal{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
}
class Chicken2 extends Animal implements Edible {
    public String howtoEat() {
        return "could be fried";
    }
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
}
class Chicken2Test {
    public static void main(String[] args) {
        Chicken2 chicken = new Chicken2();
        System.out.println(chicken.makeSound());
        System.out.println(chicken.howtoEat());
    }
}
abstract class Fruit implements Edible { }
class Apple extends Fruit {
    @Override
    public String howtoEat() {
        return "Apple could be slided";
    }
}
class Orange extends Fruit {
    @Override
    public String howtoEat() {
        return "Orange could be juiced";
    }
}
class FruitTest {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1]= new Orange();
        for (Fruit fruit: fruits) {
            System.out.println(fruit.howtoEat());
        }
    }
}