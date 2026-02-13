public class Multiplecatchexample {
 public static void main(String[]args){
  try{
    String str=null;
    System.out.println(str.length());
  }catch(NullPointerException e){
    System.out.println("error:Null pointer exception");
  }catch(Exception e){
    System.out.println("error");
  }
  System.out.println("pgm continues after exception handling");
 }  
}
