

/**
 * This class models a book store.
 *
 * @author Wendell Yeung
 * @version 1.0
 *
 */
import java.util.ArrayList;
import java.util.Iterator;

public class BookStore {
    private ArrayList<Book> books;
    private Book[] bookArray;

    /**
     * Constructor for the class BookStore.
     */
    public BookStore()
    {
        books = new ArrayList<Book>();
        books.add(new Book("Book 1", new Date(1, 1, 1)));
        books.add(new Book("Book 1", new Date(2, 12, 31)));
        books.add(new Book("Book 1", new Date(2019, 12, 31)));
        books.add(new Book("Book 1", new Date(2018, 11, 30)));
        books.add(new Book("Book 1", new Date(2, 2, 2)));
        Book[] bookArray = new Book[5];
        for(int i = 0; i < bookArray.length; i++)
        {
            bookArray[i] = new Book("Book 1", 1, 1, 1);
        }
    }

    public void displayBooks()
    {
        Iterator<Book> it = books.iterator();

        if(it.hasNext())
        {
            Book nextBook = it.next();
            if(nextBook != null)
            {
                if(nextBook.getTitle() != null)
                {
                    System.out.println(nextBook.getTitle());
                }
                if(nextBook.getDatePublished() != null)
                {
                    System.out.println(nextBook.getDatePublished());
                }
            }
        }

        for(int i = 0; i < bookArray.length; i++)
        {
            if(bookArray[i] != null)
            {
                if(bookArray[i].getTitle() != null)
                {
                    System.out.println(bookArray[i].getTitle());
                }
                if(bookArray[i].getDatePublished() != null)
                {
                    System.out.println(bookArray[i].getDatePublished());
                }
            }
        }
    }
}
