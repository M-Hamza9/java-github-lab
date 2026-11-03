import java.util.ArrayList;

class Book {
    String name;
    int id;
    String author;
    String title;
}

class Person {
    int id;
    String name;
    String phoneno;
}

class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Person> persons = new ArrayList<>();

    public void addBook(String name, int id, String author, String title) {
        Book book = new Book();

        book.name = name;
        book.id = id;
        book.author = author;
        book.title = title;

        books.add(book);
    }

    public void addPerson(int id, String name, String phoneno) {
        Person person = new Person();

        person.id = id;
        person.name = name;
        person.phoneno = phoneno;

        persons.add(person);
    }
}

public class Project {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook("Java Basics", 1, "James Gosling", "Java Programming");
        library.addBook("Python Basics", 2, "Guido", "Python Programming");

        library.addPerson(101, "Hamza", "03001234567");

    }
}