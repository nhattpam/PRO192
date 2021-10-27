import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author meoca
 */             //5 points
public class Part2 {
    public static void main(String[] args) {
        boolean cont = false;
        do{
            try {
                String s = "";
                String pattern = "(^SE[0-9]{3}$)";
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the string:");
                s = sc.nextLine();
                if (!s.matches(pattern)) //nếu s mà không match với pattern thì thực hiện ở dưới
                    throw new Exception();
                System.out.println("The string is " + s);
                cont = false;
            } catch (Exception e) {
                System.out.println("The string is invalid");
                cont=true;
            }
        }while(cont);
    }
}
