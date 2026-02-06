abstract class Calculator {
    abstract void calculate(int a, int b);
}

class Add extends Calculator {
    void calculate(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }
}

class Sub extends Calculator {
    void calculate(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }
}

public class Calculatorapp {
    public static void main(String[] args) {
        Calculator c1 = new Add();
        c1.calculate(10, 5);

        Calculator c2 = new Sub();
        c2.calculate(10, 5);
    }
}
