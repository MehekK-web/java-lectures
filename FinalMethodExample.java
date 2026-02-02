class Parent{
  final void display(){
      System.out.println("This is a final method in Parent class.");
  }
}
class Child extends Parent{
  // Trying to override the final method will cause a compile-time error
  /*
  void display(){
      System.out.println("Trying to override final method.");
  }
  */
}
public class FinalMethodExample {
  public static void main(String[] args) {
      Child obj = new Child();
      obj.display(); // Calls the final method from Parent class
  }
}
