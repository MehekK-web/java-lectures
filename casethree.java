abstract class transport {
    String id, d;

    transport(String id, String d) {
        this.id = id;
        this.d = d;
    }

    abstract void dispatch();
}
interface gps {
    void getco();
}
interface auto {
    void nav();
}
class truck extends transport {
    truck(String id, String d) {
        super(id, d);
    }

    void dispatch() {
        System.out.println("truck going to " + d);
    }
}

class ship extends transport {

    ship(String id, String d) {
        super(id, d);
    }

    void dispatch() {
        System.out.println("ship going to " + d);
    }
}

class drone extends transport implements gps, auto {

    drone(String id, String d) {
        super(id, d);
    }

    void dispatch() {
        System.out.println("drone flying to " + d);
    }

    public void getco() {
        System.out.println("getting gps coordinates");
    }

    public void nav() {
        System.out.println("self navigation on");
    }
}

public class casethree{
      public static void main(String[] args) {
        transport[] arr = new transport[3];
        arr[0] = new truck("t1", "mumbai");
        arr[1] = new ship("s1", "dubai");
        arr[2] = new drone("d1", "pune");
        for (transport t : arr) {
            t.dispatch();
        }
        drone d = new drone("d2", "delhi");
        d.getco();
        d.nav();
    }
}

