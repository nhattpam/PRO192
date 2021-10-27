
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


/**
 * 
 * @author nhattpam
 */
public class Demo {
    static void printList(List<Employee> list){
        for (Employee emp : list) {
            System.out.println(emp);
        }
    }
    static Date getDateFromString(String date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = null;
        try{
            d = sdf.parse(date);
            
        }catch(ParseException ex){
            System.out.println(ex.getMessage());
        }
        return d;
    }
    public static void main(String[] args) {
        ArrayList<Employee> arr = new ArrayList<>();
        arr.add(new Employee("ID003", "Chaitanya", 25, getDateFromString("12/10/1990")));
        arr.add(new Employee("ID002", "Rahul", 28, getDateFromString("20/8/1990")));
        arr.add(new Employee("ID001", "Ajeet", 25, getDateFromString("11/07/1990")));
        System.out.println("Sorting on ID ascending");
        Collections.sort(arr);
        printList(arr);
        System.out.println("Sorting on descending by DateOfBirth ");
        Collections.sort(arr, Employee.compareByDateOfBirth);
        printList(arr);
        System.out.println("Sorting on descending by Salary using lamda");
        Collections.sort(arr, (Employee e1 , Employee e2) -> {
            return e2.getSalary() - (e1.getSalary());
        });
        printList(arr);
    }
}
