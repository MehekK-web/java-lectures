class A
{
    void add(int a, int b)
    {
        System.out.println("Sum = " + (a + b));
    }

    void add(int a, int b, int c)
    {
        System.out.println("Sum = " + (a + b + c));
    }

    public static void main(String[] args)
    {
        A a1 = new A();
        a1.add(10, 20);
        a1.add(10, 20, 30);
    }
}
  

