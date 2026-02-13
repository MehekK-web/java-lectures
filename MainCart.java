class Product{
  String name;
  double price;
  public Product(String name, double price){
    this.name=name;
    this.price=price;
  }
}
   class ShoppingCart{
    Product product[]=new Product[100];
    int count=0;
    void addProduct(Product p){
      product[count]=p;
      count++;
      System.out.println("products added");
    }
    void removeProduct(String name) {
      for(int i=0;i<count;i++){
        if(product[i].name.equals(name)){
          for(int j=i;j<count-1;j++){
            product[j]=product[j+1];
            
          }
          count--;
          System.out.println("product removed");
        }
        else{
          System.out.println("product not found");
        }
        
      }
    }
    void totalCost(){
      double total=0;
      for(int i=0;i<count;i++){
        total=total+product[i].price;
      }
      System.out.println("Total cost: "+total);
    }
    void displayCart(){
      for(int i=0;i<count;i++){
        System.out.println("product name: "+product[i].name);
        System.out.println("product price: "+product[i].price);
      }
    }
  }

public class MainCart {
  public static void main(String[]args){
    ShoppingCart cart = new ShoppingCart();
    Product p1 = new Product("laptop", 50000);
    Product p2 = new Product("phone", 20000);
    Product p3 = new Product("headphones", 5000);
    
    cart.addProduct(p1);
    cart.addProduct(p2);
    cart.addProduct(p3);
    
    cart.displayCart();
    cart.totalCost();
    
    cart.removeProduct("phone");
    cart.displayCart();
  }

}
