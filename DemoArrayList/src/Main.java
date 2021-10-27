
/**
 * 
 * @author nhattpam
 */
public class Main {
    public static void main(String[] args) {
        MyArrayList arr = new MyArrayList();
        arr.add(new Product(1, "coffee"));
        arr.add(new Product(2, "milk"));
        arr.add(new Product(3, "coca"));
        System.out.println("****Print Product List****");
        arr.printAllProduct();
        System.out.println("****Get Product by Id****");
        Product p = arr.getProductById(1);
        System.out.println(p);
        System.out.println("****Remove Product: " + p.getName());
        arr.removeProduct(p);
        System.out.println("****Print Product List****");
        arr.printAllProduct();
    }
}
