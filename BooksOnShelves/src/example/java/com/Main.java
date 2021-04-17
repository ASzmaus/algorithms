package example.java.com;

public class Main {
  public static void main(String ... args) {
    int numOfBooks = 10;
    int shelfCap   = 4;
    BooksOnShelves b = new BooksOnShelves(numOfBooks, shelfCap);
    System.out.println("Number of shelves: " + b.getNumOfShelves());
    System.out.println("Number of books on the last shelf: " + b.getBooksOnLastShelf());
  }
}
