import java.util.*;

class Book {
    private String ISBN;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean status) {
        isAvailable = status;
    }
}

class Lib {
    private List<Book> books;

    public Lib() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(String ISBN) {
        boolean found = false;

        for (Book book : books) {
            if (book.getISBN().equals(ISBN) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("You have borrowed: " + book.getTitle());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Sorry, the book is not available.");
        }
    }

    public void returnBook(String ISBN) {
        boolean found = false;

        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                book.setAvailable(true);
                System.out.println("You have returned: " + book.getTitle());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Sorry, the book does not belong to this library.");
        }
    }

    public void displayAvailableBooks() {
        System.out.println("\nAvailable books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}


class Case1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Lib library = new Lib();

        
        library.addBook(new Book("101", "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("102", "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("103", "1984", "George Orwell"));

        int option;

        do {
            System.out.println("\n1. See all books");
            System.out.println("2. Borrow book");
            System.out.println("3. Exit");
            System.out.print("Enter option: ");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    library.displayAvailableBooks();
                    break;

                case 2:
                    System.out.print("Enter ISBN: ");
                    String ISBN = sc.next();
                    library.borrowBook(ISBN);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (option != 3);

        sc.close();
    }
}