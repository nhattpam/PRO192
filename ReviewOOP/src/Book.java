
/**
 *
 * @author nhattpam
 */
public abstract class Book {

    protected int BookID;
    protected String BookTitle;
    protected double Price;
    protected int Quanity;

    abstract void PrintBook(); 

    public Book() {
    }

    public Book(int BookID, String BookTitle, double Price, int Quanity) {
        this.BookID = BookID;
        this.BookTitle = BookTitle;
        this.Price = Price;
        this.Quanity = Quanity;
    }

    public double SubTotal(){
        return (Price*Quanity)*1.1;
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int BookID) {
        this.BookID = BookID;
    }

    public String getBookTitle() {
        return BookTitle;
    }

    public void setBookTitle(String BookTitle) {
        this.BookTitle = BookTitle;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getQuanity() {
        return Quanity;
    }

    public void setQuanity(int Quanity) {
        this.Quanity = Quanity;
    }
    
    
}
