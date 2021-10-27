
package TreeSet;

import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author nhattpam
 */
public class Main {
    public static void main(String[] args) {
        
        Set<String> set = new TreeSet<String>();
        
        set.add("6");
        set.add("2");
        set.add("1");
        set.add("7");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("==============================");
        set.remove("2");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
