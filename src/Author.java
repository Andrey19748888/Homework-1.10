public class Author {
    private String firstName;
    private String lastName;

    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode();
    }

    public boolean equals(Author other) {       // other - "другой" объект
        return firstName.equals(other.getFirstName()) && lastName.equals(other.getLastName());
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }


    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {

        return firstName;
    }
    public String getLastName() {

        return lastName;
    }


    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

}
