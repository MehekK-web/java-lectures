<<<<<<< HEAD
class A {
    int b= 7;
}

class super1 extends A {

    void show() {
        
        System.out.println("super b = " + super.b);
    }

    public static void main(String[] args) {
        super1 obj = new super1();
        obj.show();
    }
}
=======
class A {
    int b= 7;
}

class C extends A {

    void show() {
        
        System.out.println("super b = " + super.b);
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
>>>>>>> 099d97bbdbf923c282a8f2bcc170e8f8501d40f5
