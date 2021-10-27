package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author nhattpam
 */
public class Demo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

//        for (String s : list) {
//            if(s.equals("A")){
//                list.remove(s);
//            }
//        }
        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            String s = itr.next();
            if (s.equals("A")) {
                itr.remove();
            }
        }
        for (String s : list) {
                System.out.println(s);
        }
    }
}
