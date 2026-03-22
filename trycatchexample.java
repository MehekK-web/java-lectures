<<<<<<< HEAD
public class trycatchexample{
  public static void main(String[]args){
    int n1=10;
    int n2=0;
    try{
      int result=n1/n2;
      System.out.println("result:"+result);
    }catch(ArithmeticException e){
      System.out.println("error:cannot divide by zero");
      System.out.println("exception message"+e.getMessage());

    }
    System.out.println("pgm continues after exeption handling");
  }
=======
public class trycatchexample{
  public static void main(String[]args){
    int n1=10;
    int n2=0;
    try{
      int result=n1/n2;
      System.out.println("result:"+result);
    }catch(ArithmeticException e){
      System.out.println("error:cannot divide by zero");
      System.out.println("exception message"+e.getMessage());

    }
    System.out.println("pgm continues after exeption handling");
  }
>>>>>>> 550528f2f4bf291b1e48435bfbe6e10fdbe50033
}