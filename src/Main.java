import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[]args){
            startApp();
    }

    public static void startApp(){
        int q=0;
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        while(q!=-1){
            System.out.println("PRESS 1 TO ADD BOOK");
            System.out.println("PRESS 2 TO DELETE BOOK");
            System.out.println("PRESS 3 TO VIEW ALL BOOKS");
            System.out.println("PRESS 4 TO GET THE BOOK BY ID");
            System.out.println("PRESS -1 TO QUIT THE APP");
            q = scanner.nextInt();

            switch (q){
                case 1 :
                    System.out.println("PLEASE ENTER THE BOOK DETAILS : ");
                    System.out.print("ID : ");
                    int id = scanner.nextInt();
                    System.out.print("Publishing year : ");
                    int pYear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tittle : ");
                    String tittle = scanner.nextLine();
                    System.out.print("Author : ");
                    String author =  scanner.nextLine();
                    library.addBook(new Books(id,pYear,tittle,author));
                    System.out.println("\n");
                    break;

                case 2 :
                    System.out.print("PLEASE ENTER THE BOOK ID TO DELETE THE BOOK : ");
                    int deleteID = scanner.nextInt();
                    library.deleteBook(deleteID);
                    System.out.println("\n");
                    break;

                case 3 :
                    library.viewBooks();
                    System.out.println("\n");
                    break;

                case 4 :
                    System.out.print("ENTER THE BOOK ID : ");
                    int bookID = scanner.nextInt();
                    System.out.println(library.getBookById(bookID).toString());
                    System.out.println("\n");
                    break;

                default:
                    break;
            }

        }
    }

}
