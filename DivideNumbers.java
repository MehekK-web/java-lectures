//write a program in  java to divide two numbers where you should be checking the condition of divide by 0 error.
import java.util.Scanner;

class DivideNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (b == 0)
        {
            System.out.println("Error: Division by zero is not allowed");
        }
        else
        {
            int result = a / b;
            System.out.println("Result = " + result);
        }
    }
}
