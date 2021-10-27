
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
       int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("input a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("input b: ");
        b = Integer.parseInt(sc.nextLine());
        System.out.println("a + b = " + (a+b));
    }
    
}
