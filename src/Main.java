import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);


        int choice;

        do {
            System.out.println("===== LIBRARY INFORMATION SYSTEM =====");
            System.out.println("1. Add a Book");
            System.out.println("2. List All Books");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Search a Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();

                    Book book = new Book(title, author);
                    library.addBook(book);
                    break;

                case 2:
                    library.listBooks();
                    break;

                case 3:
                    System.out.print("Enter title to borrow: ");
                    title = scanner.nextLine();
                    library.borrowBook(title);
                    break;

                case 4:
                    System.out.print("Enter title to return: ");
                    title = scanner.nextLine();
                    library.returnBook(title);
                    break;

                case 5:
                    System.out.print("Enter title to search: ");
                    title = scanner.nextLine();
                    library.searchBook(title);
                    break;

                case 6:
                    System.out.println("Thank you for using the Library Information System!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}