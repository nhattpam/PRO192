
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;


/**
 * 
 * @author nhattpam
 */
public class Employee implements Comparable{
    private String id;
    private String name;
    private int salary;
    private Date dateOfBirth;

    public Employee(String id, String name, int salary, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dob = sdf.format(dateOfBirth);
        return "[ ID=" + id + ",name=" + name + ", salary=" + salary + ",DoB=" + dob + "]";
    }
    
    
    
    @Override
    public int compareTo(Object o) {
        return id.compareTo(((Employee)o).id);
    }
    
    public static Comparator compareBySalary = new Comparator() {
        @Override
        public int compare(Object t, Object t1) {
            Employee e1 = (Employee) t;
            Employee e2 = (Employee) t1;
            
            int d = Integer.compare(e1.salary, e2.salary);
            if(d>0)
                return -1;
            
            if(d==0)
                return e1.id.compareTo(e2.id);
            return 1;
        }
    };
    
    public static Comparator compareByDateOfBirth = new Comparator() {
        @Override
        public int compare(Object t, Object t1) {
            Employee e1 = (Employee) t;
            Employee e2 = (Employee) t1;
            
            int d = e1.dateOfBirth.compareTo(e2.dateOfBirth);
            if(d>0)
                return -1;
            
            if(d==0)
                return 0;
            return 1;
        }
    };
    public static Comparator compareByName = new Comparator() {
        @Override
        public int compare(Object t, Object t1) {
            Employee e1 = (Employee) t;
            Employee e2 = (Employee) t1;
            
            int d = e1.name.compareTo(e2.name);
            if(d>0)
                return 1;
            
            if(d==0)
                return 0;
            return -1;
        }
    };
    
}
