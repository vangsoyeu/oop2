package Buoi2;

public class TestMobile {
    public static void main(String[] args) {
        System.out.println("====Cách 1====");
        Iphone iphone = new Iphone();
        System.out.println(iphone.downloadApp());
        Samsung samsung = new Samsung();
        System.out.println(samsung.downloadApp());
        System.out.println("====Cách 2====");
        Mobile[] mobiles = new Mobile[2];
        mobiles[0]=new Iphone();
        mobiles[1]=new Samsung();
        for (Mobile mobile:mobiles) {
            System.out.println(mobile.downloadApp());
        }
    }
}
abstract class Mobile {abstract String downloadApp();}
class Iphone extends Mobile { @Override public String downloadApp() {
        return "Iphone: Download AppStore...";
    }}
class Samsung extends Mobile { @Override public String downloadApp() {return "Samsung: Download CHPlay...";}}