class One {
    int a = 10;
}

class Two{
    int b = 15;
}

class Three {
    int c = 30;

    public static void main(String[] args) {
        One obj1 = new One();
        Two obj2 = new Two();
        Three obj3 = new Three();

        System.out.println("Value from class One: " + obj1.a);
        System.out.println("Value from class Two: " + obj2.b);
        System.out.println("Value from class Three: " + obj3.c);
    }
}
