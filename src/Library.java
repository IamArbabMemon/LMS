import java.util.ArrayList;

public class Library {
    private static final ArrayList<Books> booksList = new ArrayList<>();


    public void addBook(Books book){
        try{
            if(bookExist(book.getId()))
                throw new Exception("Book already exist");

            booksList.add(book);
            System.out.println("Book has been added");
        }catch(Exception e){
            System.out.println("Exception Occured in adding the book "+e);

        }
    }


    public Books getBookById(int id){
        Books bookToReturn = null;
        if(!bookExist(id)){
            System.out.println("Book does not exist");
            return null;
        }

        for(Books book : booksList)
             if(book.getId()==id)
                 bookToReturn = book;

      return bookToReturn;

    }


    public void viewBooks(){
        if(booksList.isEmpty()){
            System.out.println("There is not any book");
            return;
        }

        for(Books book : booksList)
            System.out.println(book.toString());
    }

    public void deleteBook(int id){
        try{
            if(!bookExist(id))
                throw new Exception("Book does not exist");

            booksList.remove(getBookById(id));
            System.out.println("Book has been Deleted");

        }catch(Exception e){
            System.out.println("Exception Occurred in deleting the book "+e);
        }
    }

    public ArrayList<Books> getBooksArrayList(){
        return booksList;
    }

    private boolean bookExist(int id){
        for(Books book : booksList){
            if(book.getId()==id)
                return true;
        }

        return false;
    }

}
