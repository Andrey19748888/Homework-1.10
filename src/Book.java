public class Book {
    private String title;
    private Author author;
    private int year;

    @Override
    public String toString() {
        return "Название книги: " + title + ", автор: " +  author.toString() + ", год: " + year;
    }

    public int hashCode() {
        return title.hashCode() + author.hashCode() + java.util.Objects.hash(year);
    }

    public boolean equals(Book other) {
        return title.equals(other.getTitle()) && author.equals(other.getAuthor()) &&
                year == other.getYear();
    }

    public Book(String title, Author author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }



    public String getTitle() {

        return title;
    }

    public Author getAuthor() {

        return author;
    }

    public int getYear() {

        return year;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public void setAuthor(Author author) {

        this.author = author;
    }
    public void setYear(int year) {

        this.year = year;
    }
}
