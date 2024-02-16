package Models;

class iPhones implements Service.Smartphones, Service.iOS {
    @Override
    public void call() {
        System.out.println("Making a call from iPhone...");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from iPhone...");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet from iPhone...");
    }

    @Override
    public void runiOSApp() {
        System.out.println("Running an iOS application on iPhone...");
    }
}
