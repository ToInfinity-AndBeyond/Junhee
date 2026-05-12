public class Tv {
    String brand;
    double price;
    int channel;
    boolean isOn;

    public Tv(String brand, double price, int channel) {
        this.brand = brand;
        this.price = price;
        this.channel = channel; // default channel
        this.isOn = false; // TV is off by default
    }

    public void turnOn() {
        isOn = true;
        System.out.println("TV is turned on.");
    }
    public void turnOff() {
        isOn = false;
        System.out.println("TV is turned off.");
    }
    public void changeChannel(int newChannel) {
        if (isOn) {
            channel = newChannel;
            System.out.println("Channel changed to " + channel);
        } else {
            System.out.println("TV is off. Please turn it on first.");
        }
    }

    public static void main(String[] args) {
        Tv myTv = new Tv("Samsung", 499.99, 100);

        myTv.turnOn();
        myTv.changeChannel(5);
        myTv.turnOff();
    }
}
