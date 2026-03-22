interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

class Demo implements A, B {
    public void show() {
        A.super.show();
    }
}

public class DiamondDemo {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show();
    }
}
