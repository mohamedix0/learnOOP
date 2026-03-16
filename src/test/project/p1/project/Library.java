package test.project.p1.project;
import java.util.Scanner;

public class Library {
    Scanner input = new Scanner(System.in);
    Book booksArray[] = new Book[100];
    static int totalBooks = 0;

    public void addBook() {
        System.out.print("Please enter book id: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Please enter book title: ");
        String title = input.nextLine();
        System.out.print("Please enter book author: ");
        String author = input.nextLine();
        System.out.print("Please enter copies: ");
        int copies = input.nextInt();

        Book book = new Book(id,title,author,copies);

        booksArray[totalBooks] = book;
        System.out.println(book.title + " Added successfully:^-^");
        totalBooks++;
    }

    public void displayAllBooks() {
        for (int i = 0;i<totalBooks; i++) {
            System.out.println("Book " + (i+1));
            Book b = booksArray[i];
            b.displayBookInfo();
            System.out.print("\n\n");
        }
    }

    public void addBooks(int booksNumber) {
        for (int i = 1; i<=booksNumber;i++) {
            System.out.println("Book " + i);
            this.addBook();
        }
    }

    public void searchBook(String title) {
        for (int i = 0;i<totalBooks;i++) {
            if (booksArray[i].title.equalsIgnoreCase(title)) {
                booksArray[i].displayBookInfo();
                return;
            }
        }
        System.out.println("Book not founded");
    }
}
