package Test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RunMain {

    /**
     * This method show menu in home in begin or after an action.
     */
//    public static void showHome() {
//        for (String s : Arrays.asList(
//                "1. list all books
//                 2. add a new book
//                 3. edit book
//                 4. delete a book
//                 5. search books by name
//                 6. sort books descending by price
//                 0. save & exit"
//        )){
//            System.out.print(s);
//        }
//    }

    /**
     * This method is action add a word to list.
     *
     * @param in  is scanner to read information
     * @param lib is BookManager object
     */
    static Scanner sc= new Scanner(System.in);
    public static void showAdd(BookManager lib) {
        System.out.print("Enter book id: ");
        int otherId = sc.nextInt();
        System.out.print("Enter book name: ");
        sc.nextLine();
        String otherName = sc.nextLine();
        System.out.print("Enter book price: ");
        double otherPrice = sc.nextDouble();
        if (lib.getBookById(otherId) != null) {
            System.out.println("Duplicated ID!");
        } else {
            lib.add(new Book(otherName, otherPrice, otherId));
            System.out.println("Added successfully.");
        }
    }

    /*
     * This method is action edit a word from list.
     *
     * @param in  is scanner to read information
     * @param lib is BookManager object
     */
    public static void showEdit( BookManager lib) {
        System.out.print("Enter book id: ");
        int targetId = sc.nextInt();
        if (lib.getBookById(targetId) == null) System.out.println("Invalid ID!");
        else {
            System.out.print("Enter book name: ");
            String otherName = sc.nextLine();
            System.out.print("Enter book price: ");
            double otherPrice = sc.nextDouble();
            lib.getBookById(targetId).setPrice(otherPrice);
            lib.getBookById(targetId).setName(otherName);
            System.out.println("Updated successfully.");
        }
    }

    /*
     * This method is action delete a word form list.
     *
     * @param in is scanner to read information
     * @param lib is BookManager object
     */
    public static void showDelete(BookManager lib) {
        System.out.print("Enter book id: ");
        int targetId = sc.nextInt();
        if (lib.getBookById(targetId) == null) {
            System.out.println("Invalid ID!");
        } else {
            lib.remove(lib.getBookById(targetId));
            System.out.println("Deleted successfully.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookManager lib = new BookManager();
        lib.loadFromFile();
        ArrayList<Book> books=new ArrayList<>();
        System.out.println("Loading books...");
        System.out.println("-------------------------");
        int input;
        do{
            System.out.println("1. list all books");
            System.out.println("2. add a new book");
            System.out.println("3. edit book");
            System.out.println("4. delete a book");
            System.out.println("5. search books by name");
            System.out.println("6. sort books descending by price");
            System.out.println("0. save & exit");
            System.out.println("-------------------------");
            System.out.println("Your option: ");
            input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 1:
                    lib.printBooks(lib.getBooks());
                    break;
                case 2:
                    showAdd(lib);
                    break;
                case 3:
                    showEdit(lib);
                    break;
                case 4:
                    showDelete(lib);
                    break;
                case 5:
                    System.out.print("Enter keyword: ");
                    String word = sc.nextLine();
                    lib.printBooks((ArrayList<Book>) lib.searchByName(word));
                    break;
                case 6:
                    System.out.println("After sorting:");
                    lib.sortDesByPrice();
                    lib.printBooks(lib.getBooks());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (input !=6);
        lib.saveToFile();
        System.out.println("Saving to file...");
        System.out.println("Bye!");
    }
}