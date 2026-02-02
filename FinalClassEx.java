final class FinalClass {
    void show() {
        System.out.println("This is final class.");
    }
}
public class FinalClassEx {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show(); // Calls the method from FinalClass
    }
}