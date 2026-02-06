final class Demo {
    final int x = 5;
    final void show() {
        System.out.println("Hello Final");
    }
}

public class Mainf {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show();
        System.out.println(obj.x);
    }
}

