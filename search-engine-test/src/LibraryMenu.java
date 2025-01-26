
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class LibraryMenu {
    private Library library;
    private UserInteractionLogger logger = new UserInteractionLogger();
    private LibrarySerializer serializer = new LibrarySerializer();  // Added serializer

    public LibraryMenu(Library library) {
        this.library = library;

        // Load the library data when the program starts
        List<Book> books = serializer.loadLibrary("src/resources/data/library.ser");
        if (books != null) {
            library.setBooks(books);
            System.out.println("Library loaded successfully.");
        } else {
            System.out.println("No saved library found. Loading default books.");
            library.loadBooks("src/resources/data/books.txt");
        }
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // TODO - missing code
            System.out.println("=== Main Menu ===");
            System.out.println("1. View All Books");
            System.out.println("2. Sort Books by Title");
            System.out.println("3. Sort Books by Author");
            System.out.println("4. Sort Books by Year");
            System.out.println("5. Search for a Book by keyword");
            System.out.println("6. Exit");
            int option = scanner.nextInt();
            switch(option){
                case 1:
                    library.viewAllBooks();
                    break;
                case 2:
                    SortUtil.bubbleSort(library.getBooks(), Comparator.comparing(Book::getTitle));
                    break;
                case 3:
                    SortUtil.bubbleSort(library.getBooks(), Comparator.comparing(Book::getAuthor));
                    break;
                case 4:
                    SortUtil.bubbleSort(library.getBooks(), Comparator.comparing(Book::getPublicationYear));
                    break;
                case 5:
                    System.out.println("Enter the keyword to be searched for:");
                    String keyword = scanner.nextLine();
                    library.searchBookByKeyword(keyword);
                    break;
                case 6:
                    exit(1);
                default:
                    System.out.println("Invalid option:");
            }
        }
    }

}
