abstract class Animal {
  abstract void sound();
  void eat(){
    System.out.println("This animal eats food.");
  }
}
class Dog extends Animal {
  void sound() {
    System.out.println("dog barks");
  }
}
public class AbstractMethodEx {
  public static void main(String[] args) {
    Animal animal = new Dog();
    animal.sound(); // Calls the implemented abstract method
    animal.eat();   // Calls the concrete method from Animal class
  }
}
