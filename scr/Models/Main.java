package Models;

public class Main {
    public static void main(String[] args) {
        Androids androidPhone = new Androids();
        System.out.println("---- Android Phone ----");
        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();
        androidPhone.runLinuxApp();

        iPhones iPhone = new iPhones();
        System.out.println("---- iPhone ----");
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.runiOSApp();
    }
}