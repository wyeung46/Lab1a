
/**
 * This class models a Date.
 *
 * @author Wendell Yeung
 * @version 1.0
 *
 */

public class Date {
    private int year;
    private int month;
    private int day;

    private static final int EARLIEST_YEAR = 1;
    private static final int LATEST_YEAR = 2019;
    private static final int JANUARY = 1;
    private static final int DECEMBER = 12;
    private static final int FIRST_DAY = 1;
    private static final int LAST_DAY = 31;

    /**
     * Constructor for class Date.
     *
     * @param year an int that represents the year the user wants to use.
     * @param month an int that represents the month the user wants to use.
     * @param day an int that represents the day the user wants to use.
     */
    public Date(int year, int month, int day)
    {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    /**
     * This method sets the year. Must be between 1 and 2019.
     *
     * @param year an int that represents the year the user wants to use. Must be between 1 and 2019.
     */
    public void setYear(int year)
    {
        if((year >= EARLIEST_YEAR) && (year <= LATEST_YEAR))
        {
            this.year = year;
        }
        else
        {
            throw new IllegalArgumentException("Invalid year");
        }
    }

    /**
     * This method sets the month. Must be between 1 and 12.
     *
     * @param month an int that represents the month the user wants to use. Must be between 1 and 12.
     */
    public void setMonth(int month)
    {
        if((month >= JANUARY) && (year <= DECEMBER))
        {
            this.month = month;
        }
        else
        {
            throw new IllegalArgumentException("Invalid month");
        }
    }

    /**
     * This method sets the day. Must be between 1 and 31.
     *
     * @param day an int that represents the day the user wants to use. Must be between 1 and 31.
     */
    public void setDay(int day)
    {
        if((year >= FIRST_DAY) && (year <= LAST_DAY))
        {
            this.day = day;
        }
        else
        {
            throw new IllegalArgumentException("Invalid day");
        }
    }

    /**
     * This method returns the class's year.
     *
     * @return an int that represents the class's year.
     */
    public int getYear()
    {
        return year;
    }

    /**
     * This method returns the class's month.
     *
     * @return an int that represents the class's month.
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * This method returns the class's day.
     *
     * @return an int that represents the class's day.
     */
    public int getDay()
    {
        return day;
    }
}
