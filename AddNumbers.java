//Write a program in java where you should be passing two variables inside a function with float data types and performing their addition inside the  main function using double data types.
class AddNumbers
{
    static double add(float a, float b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        float a = 10.5f;
        float b = 20.5f;

        AddNumbers an =new AddNumbers();
        double sum = an.add(a,b);
        System.out.println("Sum = " + sum);
    }
}