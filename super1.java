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
