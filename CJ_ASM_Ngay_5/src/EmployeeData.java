import java.util.*;


public class EmployeeData {
    
    ArrayList empList = new ArrayList();
    
    void addEmployee(){
     
        String name , address , code;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter employee code: ");
        code= input.nextLine();
        
        System.out.println("Enter the name: ");
        name= input.nextLine();
        
        System.out.println("Enter the address: ");
        address = input.nextLine();
        
        EmployeeDetail emp = new EmployeeDetail(code.toUpperCase(),name,address);
        empList.add(emp);
    }
    void removeEmplyee(){
        String searchCode;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Employee code: ");
        searchCode = input.nextLine();
        
        for(Object obj:empList ){
            EmployeeDetail emp = (EmployeeDetail)obj;
            if(emp.empCode.equals(searchCode.toUpperCase())){
                    empList.remove(emp);
                    System.out.println("Employee code:"+ searchCode +"Removed");
                    return;
                    
            }
        }
        System.out.println("employee not found!!!");
    } 
    
    void findEmployee(){
        String searchCode;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Employess code: ");
        searchCode = input.nextLine();
        for(Object obj:empList ){
            EmployeeDetail emp = (EmployeeDetail)obj;
            if(emp.empCode.equals(searchCode.toUpperCase())){
                    System.out.println("Employee Detail: ");
                    System.out.println(emp);
                    return;
            }
        }
        System.out.println("Employee not found!!");
    }
    void printEmployeeList(){
        int i = 0;
        System.out.println("the size of list = " + empList.size());
        for (Object emp : empList) {
            System.out.printf("----------Number %d -------------", ++i);
            System.out.println(emp);
        }
    }
    public void sortTheoName(){
        Collections.sort(empList, new Comparator<EmployeeDetail>(){
            @Override
            public int compare(EmployeeDetail t, EmployeeDetail t1) {
                return t.getName().compareToIgnoreCase(t1.getName());
            }
            
        });
        for (Object o : empList) {
            EmployeeDetail emp = (EmployeeDetail)o;
            System.out.println(emp);
        }
    }
    
}