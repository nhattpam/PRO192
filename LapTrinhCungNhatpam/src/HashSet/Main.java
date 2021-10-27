
package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/**
 * 
 * @author nhattpam
 */
public class Main {
    public static void main(String[] args) {
        Set<String> setString  = new HashSet<String>();
        setString.add("B");
        setString.add("A");
        setString.add("E");
        setString.add("C");
        setString.add("B");
        
        for (String s : setString) {
            System.out.println(s);
        }
        System.out.println("========================");
        Iterator<String> itr = setString.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            if(itr.equals("A")){
                itr.remove();
                String s = itr.next();
                for (String se : setString) {
                    System.out.println(se);
                }
            }
        }
        System.out.println("-----------------------------");
        
        
    }
    
}
