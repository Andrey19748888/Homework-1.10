public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Лев", "Толстой");
        Book book1 = new Book("Voyna i Mir", author1,1800);

        Author author2 = new Author("Aлександр" , "Пушкин");
        Book book2 = new Book("Парус", author2,1789);

        Book book3 = new Book("Anna Karenina", author1, 1810);
        Author author3 = new Author("Лев", "Толстой");

        System.out.println(book1.getYear());
        book1.setYear(1865);
        System.out.println(book1.getYear());
        System.out.println("Год написания: " + book3.getYear());

        System.out.println(author1.equals(author3));
        System.out.println(author1.equals(author2));
        System.out.println(author2);


        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());
        System.out.println(author3.hashCode());

        System.out.println(book1.toString());
        System.out.println(author1.toString());

        System.out.println(book2.hashCode());

        System.out.println(java.util.Objects.hash(book2.getYear()));
        System.out.println(book2.getTitle().hashCode());
        System.out.println(book2.getAuthor().hashCode());

        System.out.println(book2.equals(book1));
    }
}

