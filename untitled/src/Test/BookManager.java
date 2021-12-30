package Test;
import java.io.*;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;


public class BookManager {
    private final ArrayList<Book> books;

    /**
     * Constructor.
     */
    public BookManager() {
        this.books = new ArrayList<>();
    }

    /**
     * Get books.
     */
    public ArrayList<Book> getBooks() {
        return books;
    }

    /**
     * Load from file.
     */
    public void loadFromFile() {
        try {
            File f = new File("books.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                int ID = Integer.parseInt(sc.next());
                String name = sc.nextLine();
                double price = Double.parseDouble(name.substring(name.length() - 6).trim());
                name = name.substring(0, name.length() - 6).replaceAll("\\s\\s+", " ").trim();
                Book book = new Book( name, price, ID);
                add(book);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File dose not exist!");
        }
    }

    /**
     * Print books.
     */
    public void printBooks(ArrayList<Book> books) {
        if (books.size() != 0) {
            System.out.printf("%-5s %-45s %-10s", "ID", "Name", "Price");
            System.out.println();
            for (Book book : books) {
                System.out.println(book.toString());
            }
        }
        else {
            System.out.println("(empty)");
        }
    }
    /**
     * Add.
     */
    public void add(Book book) {
        for (Book value : books) {
            if (value.getId() == book.getId()) {
                return;
            }
        }
        books.add(book);
    }
    /**
     * Get book by ID.
     */
    public Book getBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
    /**
     * Remove.
     */
    public void remove(Book book) {
        books.remove(book);
    }

    /**
     * Sort book.
     */
    public void sortDesByPrice() {
        for (int i = 0; i < books.size() - 1; i++) {
            for (int j = i + 1; j < books.size(); j++) {
                if (books.get(i).getPrice() < books.get(j).getPrice()) {
                    Book m = books.get(i);
                    books.set(i, books.get(j));
                    books.set(j, m);
                }
            }
        }
    }

    /**
     * Search some book.
     */
    public List<Book> searchByName(String keyword) {
        List<Book> findOut = new ArrayList<>();
        for (Book book : books) {
            if (book.getName().toLowerCase().contains(keyword.toLowerCase())) {
                findOut.add(book);
            }
        }
        return findOut;
    }
    /**
     * Save file.
     */
    public void saveToFile() {
        try {
            Formatter f = new Formatter("books.txt");
            for (Book book : books) {
                f.format("%5d %-45s %10.2f %s", book.getId(), book.getName(),
                        book.getPrice(), "\n");
            }
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File dose not exist!");
        }
    }
}