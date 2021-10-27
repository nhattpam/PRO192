
/**
 * 
 * @author nhattpam
 */
public class Program {
    public static void main(String[] args) {
        ComputerBook obj = new ComputerBook("Nhat Pham", "Sai Gon", 1, "Trinh tham", 2.5, 12121);
        obj.PrintBook();
        obj.SubTotal();
        BookManagement bm = new BookManagement();
        bm.addBook(obj);
        bm.updateBook(obj);
    }
}
