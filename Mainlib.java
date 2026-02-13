class Book{
  String title;
  String author;
  String isbn;
  public Book(String title, String author, String isbn){
    this.title=title;
    this.author=author;
    this.isbn=isbn;
  }
}
class Library{
  Book books[]=new Book[10];
  int count=0;
  public void addbook(Book book){
    books[count]= book;
        count++;
        System.out.println("book added: "+ book.title);
        
  }
public void searchBytitle(String title){
 for(int i=0;i<count;i++){
  if(books[i].title.equals(title)){
    System.out.println("book"+books[i].title+"found");
    
  }
  else{
    System.out.println("book"+ title +"not found");
  }
 }
}
void display(){
 for(int i=0;i<count;i++){
  System.out.println("title:"+books[i].title);
  System.out.println("author:"+books[i].author);
  System.out.println("isbn:"+books[i].isbn);
 }
}
}
public class Mainlib {
  public static void main(String[] args){
    Library library = new Library();
        Book book1 = new Book("java", "James","100");
        Book book2 = new Book("c++", "Dahl", "489");
        Book book3 = new Book("Silent Patient", "Enid", "222");
        
        library.addbook(book1);
        library.addbook(book2);
        library.addbook(book3);
        
    library.display();
    library.searchBytitle("c++");
  }
  
}
