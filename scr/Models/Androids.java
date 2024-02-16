package Models;

public class Androids implements Service.Smartphones, Service.LinuxOS {
    @Override
    public void call() {
        System.out.println("Making a call from Android phone...");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from Android phone...");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet from Android phone...");
    }

    @Override
    public void runLinuxApp() {
        System.out.println("Running a Linux application on Android phone...");
    }
}