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
}