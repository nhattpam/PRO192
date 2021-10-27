
/**
 * 
 * @author nhattpam
 */
public class BookManagement  extends ComputerBook implements IBookCommand{

    @Override
    public void addBook(ComputerBook b) {
        System.out.println("Book is added successfully");
    }

    @Override
    public void updateBook(ComputerBook b) {
        System.out.println("Book is updated successfully");
    }
    

}
