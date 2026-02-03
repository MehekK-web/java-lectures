<<<<<<< HEAD
class One {
    int x = 3;
}

class Two extends One {
    int x = 9;

    void show() {
        System.out.println("this x = " + this.x);
        System.out.println("super x = " + super.x);
    }

    public static void main(String[] args) {
        Two obj = new Two();
        obj.show();
    }
}
=======
class One {
    int x = 3;
}

class Two extends One {
    int x = 9;

    void show() {
        System.out.println("this x = " + this.x);
        System.out.println("super x = " + super.x);
    }

    public static void main(String[] args) {
        Two obj = new Two();
        obj.show();
    }
}
>>>>>>> 099d97bbdbf923c282a8f2bcc170e8f8501d40f5
