class Parent
{
    void display1()
    {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent
{
    void display2()
    {
        System.out.println("This is Child class");
    }
}

class InheritanceDemo
{
    public static void main(String[] args)
    {
        Child obj = new Child();
        obj.display1();
        obj.display2();
    }
}
