<<<<<<< HEAD
import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    long prn;
    
    Student(String n, int r, long p) {
        name = n;
        rollNo = r;
        prn = p;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("PRN: " + prn);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int roll = sc.nextInt();
        long prn = sc.nextLong();

        Student s = new Student(name, roll, prn);
        s.display();
    }
}
=======
import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    long prn;
    
    Student(String n, int r, long p) {
        name = n;
        rollNo = r;
        prn = p;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("PRN: " + prn);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int roll = sc.nextInt();
        long prn = sc.nextLong();

        Student s = new Student(name, roll, prn);
        s.display();
    }
}
>>>>>>> 099d97bbdbf923c282a8f2bcc170e8f8501d40f5
