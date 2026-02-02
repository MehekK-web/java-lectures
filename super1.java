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
