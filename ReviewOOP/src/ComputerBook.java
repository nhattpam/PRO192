
/**
 * 
 * @author nhattpam
 */
public class ComputerBook extends Book{
    private String author;
    private String PublisherName;

    public ComputerBook() {
    }

    public ComputerBook(String author, String PublisherName, int BookID, String BookTitle, double Price, int Quanity) {
        super(BookID, BookTitle, Price, Quanity);
        this.author = author;
        this.PublisherName = PublisherName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisherName() {
        return PublisherName;
    }

    public void setPublisherName(String PublisherName) {
        this.PublisherName = PublisherName;
    }

    @Override
    void PrintBook() {
        System.out.println("Book ID: " + this.BookID);
        System.out.println("Book title: " + this.BookTitle);
        System.out.println("Price: " + this.Price);
        System.out.println("Quanity: " + this.Quanity);
        System.out.println("Book author: " + getAuthor());
        System.out.println("Publisher name: " + getPublisherName());
    }

    @Override
    public double SubTotal() {
        return super.SubTotal(); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
