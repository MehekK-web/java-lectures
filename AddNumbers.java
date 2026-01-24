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