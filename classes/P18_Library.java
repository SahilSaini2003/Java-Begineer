package classes;

import java.util.Scanner;

class Library{
    String[] books,issuedBooks;
    int noOfBooks,noOfIssuedBooks;
    Library(){
        this.books = new String[100];
        this.noOfBooks = 0;
        this.issuedBooks = new String[100];
        this.noOfIssuedBooks = 0;
    }
    void addBooks(String book){
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println("\t"+book+" has been Added.");
    }
    void showBooks(){
        for (int i = 0; i < noOfBooks; i++) {
            System.out.format("\t%d. %s\n",i+1,this.books[i]);
        }
    }
    void issueBooks(int no){
        this.issuedBooks[noOfIssuedBooks] = this.books[no-1];
        noOfIssuedBooks++;
        System.out.println("Successully Issued");
        do {
            this.books[no-1] = this.books[no];
            no++;
        } while (this.books[no-1] != null);
        noOfBooks--;
    }
    void isssuedBook(){
        for (int i = 0; i < noOfIssuedBooks; i++) {
            System.out.format("\t%d. %s\n",i+1,this.issuedBooks[i]);
        }
    }
    void returnBook(int book){
        this.books[noOfBooks] = this.issuedBooks[book - 1];
        noOfBooks++;
        do {
            this.issuedBooks[book - 1] = this.issuedBooks[book];
            book++;
        } while (this.issuedBooks[book-1] != null);
        noOfIssuedBooks--;
    }
}
public class P18_Library {
    public static void main(String[] args) {
        Library lib = new Library();
        try (Scanner myObj = new Scanner(System.in)) {
            int choice = 0;
            do {
                System.out.print("Available Options:\n\t1. Add Book\n\t2. Show Available Books\n\t3. Issue Book\n\t4. Issued Book\n\t5. Return Book\n\t6. Quit\n\tEnter Your Choice:-");
                choice = myObj.nextInt();
                switch (choice) {
                    case 1:
                        myObj.nextLine();
                        System.out.print("\tEnter Book Name:-");
                        String book = myObj.nextLine();
                        lib.addBooks(book);
                        break;
                    case 2:
                        System.out.println("\tAvailable Books are");
                        lib.showBooks();
                        break;
                    case 3:
                        myObj.nextLine();
                        System.out.print("Enter The Number Of Book To Be Issued:-");
                        int isssuedBook = myObj.nextInt();
                        lib.issueBooks(isssuedBook);
                    case 4:
                        System.out.println("\tIssued Books Are");
                        lib.isssuedBook();
                        break;
                    case 5:
                        System.out.println("\tIssued Books Are");
                        lib.isssuedBook();
                        System.out.print("Enter The Number Of book to Return:-");
                        int returnBook = myObj.nextInt();
                        lib.returnBook(returnBook);
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("\tInvalid Choice");
                        break;
                }
            } while (choice != 6);
        }
    }
}
