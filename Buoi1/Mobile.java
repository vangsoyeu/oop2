package Buoi1;

public class Mobile {
    public void downloadApp() {

    }
}

class Iphone extends Mobile {
    @Override
    public void downloadApp() {
        System.out.println("Download Appstore....");
    }
}

class Nokia extends Mobile {
    @Override
    public void downloadApp() {
        System.out.println("Dowload CHplay.....");
    }
}

class TestMobile {
    public static void main(String[] args) {
        Nokia nokia = new Nokia();
        Iphone iphone = new Iphone();

        nokia.downloadApp();
        iphone.downloadApp();
    }
}
