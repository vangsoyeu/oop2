package Buoi2;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[1];
        animals[0] = new Cat();
        for (Animal animal:animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Cat) {
                Edible edibler = (Cat) animal;
                System.out.println(edibler.howtoEat());
            }
        }
    }
}

class Cat extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Cat: mew mew...";
    }
    @Override
    public String howtoEat() {
        return "mouth";
    }
}

