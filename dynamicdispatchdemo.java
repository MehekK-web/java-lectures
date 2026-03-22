<<<<<<< HEAD
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
=======
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
>>>>>>> 550528f2f4bf291b1e48435bfbe6e10fdbe50033
  }