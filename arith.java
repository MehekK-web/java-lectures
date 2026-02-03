<<<<<<< HEAD
import java.util.Scanner;

class Calc {
    int a, b;

    Calc(int x, int y) {
        a = x;
        b = y;
    }

    void calc(int ch) {
        if (ch == 1)
            System.out.println(a + b);
        else if (ch == 2)
            System.out.println(a - b);
        else if (ch == 3)
            System.out.println(a * b);
        else if (ch == 4)
            System.out.println(a / b);
        else
            System.out.println("Wrong choice");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.print("1-Sum 2-Sub 3-Mul 4-Div : ");
        int ch = sc.nextInt();

        Calc c = new Calc(x, y);
        c.calc(ch);
    }
}
=======
import java.util.Scanner;

class Calc {
    int a, b;

    Calc(int x, int y) {
        a = x;
        b = y;
    }

    void calc(int ch) {
        if (ch == 1)
            System.out.println(a + b);
        else if (ch == 2)
            System.out.println(a - b);
        else if (ch == 3)
            System.out.println(a * b);
        else if (ch == 4)
            System.out.println(a / b);
        else
            System.out.println("Wrong choice");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.print("1-Sum 2-Sub 3-Mul 4-Div : ");
        int ch = sc.nextInt();

        Calc c = new Calc(x, y);
        c.calc(ch);
    }
}
>>>>>>> 099d97bbdbf923c282a8f2bcc170e8f8501d40f5
