abstract class device {
    String brand;

    device(String brand) {
        this.brand = brand;
    }

    abstract void turnon();
}

interface remoteControlled {
    void connectToWifi();
}

interface powerSaving {
    void powerenable();
}

class smarttv extends device implements remoteControlled, powerSaving {

    smarttv(String brand) {
        super(brand);
    }

    void turnon() {
        System.out.println("turning on " + brand + " tv");
    }

    public void connectToWifi() {
        System.out.println("connecting to wifi");
    }

    public void powerenable() {
        System.out.println("power saving enabled");
    }
}

class kettle extends device {

    kettle(String brand) {
        super(brand);
    }

    void turnon() {
        System.out.println("kettle on");
    }
}

public class smartHome {
    public static void main(String[] args) {

        smarttv t = new smarttv("samsung");

        // polymorphism (upcasting)
        device d = t;
        remoteControlled r = t;
        powerSaving p = t;

        d.turnon();
        r.connectToWifi();
        p.powerenable();

        device k = new kettle("philips");
        k.turnon();
    }
}