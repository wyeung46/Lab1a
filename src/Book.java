
/**
 * This class models a book.
 *
 * @author Wendell Yeung
 * @version 1.0
 *
 */

public class Book {
    private String title;
    private Date datePublished;

    /**
     * Constructor for the class Book
     *
     * @param title a String that represents the title of the book the user wants to enter.
     * @param datePublished a Date object that represents the date the user's book was published.
     */
    public Book(final String title, final Date datePublished)
    {
        setTitle(title);
    }

    /**
     * Constructor for the class Book, that takes the date published as separate year, month, day parameters.
     *
     * @param title a String that represents the title of the book the user wants to enter.
     * @param year an int that represents the year the user wants to use.
     * @param month an int that represents the month the user wants to use.
     * @param day an int that represents the day the user wants to use.
     */
    public Book(String title, int year, int month, int day)
    {
        setTitle(title);
        datePublished = new Date(year, month, day);
    }

    /**
     * This method sets the Book object's title.
     * @param title a String that represents the entered title of the book.
     */
    public void setTitle(String title)
    {
        if(title == null)
        {
            throw new IllegalArgumentException("Invalid title");
        }
        else
        {
            this.title = title;
        }
    }

    /**
     * This method sets the date the Book was published.
     *
     * @param datePublished a Date object that represents the date the Book object was published.
     */
    public void setDatePublished(Date datePublished)
    {
        if(datePublished == null)
        {
            throw new IllegalArgumentException("Invalid date");
        }
        else
        {
            this.datePublished = datePublished;
        }
    }

    /**
     * This method returns the class's title.
     *
     * @return a String that represents the class's title.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * This method returns the class's date published.
     *
     * @return a datePublished object that represents the class's date published.
     */
    public Date getDatePublished()
    {
        return datePublished;
    }
}
