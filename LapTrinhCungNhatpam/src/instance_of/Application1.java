
package instance_of;

/**
 * 
 * @author nhattpam
 */
public class Application1 {
    public static void main(String[] args) {
        Shape shape = new Triangle();
        
        System.out.println(shape instanceof Rectangle);//false shape khong thuoc rectangle
        
    }
}
