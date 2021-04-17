package example.java.com;
//We have n books and we put them on the shelves. Each shelf can hold k books.
//How many shelves will be occupied by books and how many books will there be in the last used shelf?

public class BooksOnShelves {
	private int numOfBooks;
	private int	shelfCap;
	
	public BooksOnShelves( int numOfBooks, int shelfCap){
		this.numOfBooks=numOfBooks;
		this.shelfCap=shelfCap;
	}
	
	public int getNumOfShelves() {
		if(numOfBooks%shelfCap==0) {
			return numOfBooks/shelfCap;
		}
		else 
		{
			return numOfBooks/shelfCap+1;
		}
	}
	
	public int getBooksOnLastShelf() {
		if(numOfBooks%shelfCap==0) {
			return shelfCap;
		}
		else
		{
			return numOfBooks%shelfCap;
		}
	}
}
