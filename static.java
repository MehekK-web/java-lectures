import java.util.Scanner;

class Student {
    int roll;
    String name;
    static String college = "ABC College";

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    void show() {
        System.out.println(roll);
        System.out.println(name);
        System.out.println(college);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int r = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Name: ");
        String n = sc.nextLine();

        Student s = new Student(r, n);
        s.show();
    }
}
