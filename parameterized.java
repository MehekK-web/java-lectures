class Add {

    void sum(int a, int b) {   
        int c = a + b;
        System.out.println("Sum = " + c);
    }

    public static void main(String[] args) {
        Add obj = new Add();
        obj.sum(10, 20);   
    }
}
