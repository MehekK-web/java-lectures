class Parent {
   void show(){
    System.out.println("parent's show method");
   }
  }
  class chilld extends Parent{
    void show(){
      System.out.println("child's show method");
    }
  }
  public class dynamicdispatchdemo{
    public static void main(String[]args){
      Parent obj=new Child();
      obj.show();
    }
  }