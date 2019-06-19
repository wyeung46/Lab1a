/**
 * This class models a person.
 *
 * @author Wendell Yeung
 * @version 1.0
 *
 */

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    double x;

    public Person(String theFirstName, String theLastName, int theBirthYear, String theSex, double theWeightPounds, String theHighestEducationLevel) {
        this.setFirstName(theFirstName);
        this.setLastName(theLastName);
        this.setBirthYear(theBirthYear);
    }

    private void setFirstName(String first) {
        if (first == null) {
            throw new IllegalArgumentException("Names cannot be null");
        } else {
            this.firstName = first;
        }
    }

    private void setLastName(String last) {
        if (last == null) {
            throw new IllegalArgumentException("Names cannot be null");
        } else {
            this.lastName = last;
        }
    }

    private void setBirthYear(int theBirthYear) {
        if (theBirthYear <= 2018) {
            this.birthYear = theBirthYear;
        } else {
            throw new IllegalArgumentException("Invalid birth year.");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }
}
