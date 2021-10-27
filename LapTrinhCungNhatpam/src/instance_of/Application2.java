package instance_of;

/**
 *
 * @author nhattpam
 */
public class Application2 {
    private void check(Shape shape) {
        if (shape instanceof Triangle) {
            Triangle triangle = (Triangle) shape;

            System.out.println("This is triangle: " + triangle.toString());
        }
    }
    public static void main(String[] args) {
        Application2 application2 = new Application2();
        application2.check(new Triangle());
    }
}
