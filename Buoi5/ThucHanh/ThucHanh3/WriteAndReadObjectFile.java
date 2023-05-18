package Buoi5.ThucHanh.ThucHanh3;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;

public class WriteAndReadObjectFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Tạo đối tượng
        Animal animal = new Animal("Cat");
        //Đường dẫn đến file:
        File file = new File("C:\\Users\\Vang So Yeu\\IdeaProjects\\test.txt");
        //khai báo ObjectOutputStream để ghi dữ liệu
        ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(file));
        //Ghi đối tượng vào fileluwuu trữ
        ous.writeObject(animal);
        //Khai báo ObjectInputStream để đọc dữ liệu
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        Animal newAnimal = (Animal) ois.readObject();
        System.out.println("Animal name: " + newAnimal.nameAnimal);
        ous.close();
        ois.close();
    }
}

class Animal implements Serializable{
    String nameAnimal;
    Animal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }
}
