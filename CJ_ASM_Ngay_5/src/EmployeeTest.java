
import static java.util.Collections.list;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;
import static java.util.Collections.list;


/**
 *
 * @author nhattpam
 */
public class EmployeeTest {

    public static void main(String[] args) {
        EmployeeData empData = new EmployeeData();
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("\n!!!Welcome to My Company!!!\n" + "Select the operation you want to perform:");
        do {
            System.out.println("*******************************************");
            System.out.println("1. Add new employee");
            System.out.println("2. Display the employee details");
            System.out.println("3. Delete employeee");
            System.out.println("4. Publish the entire list");
            System.out.println("5. Sort theo ten");
            System.out.println("6. Exit");

            System.out.println("*******************************************");
            System.out.println("Choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    empData.addEmployee();
                    break;
                case 2:
                    empData.findEmployee();
                    break;
                case 3:
                    empData.removeEmplyee();
                    break;
                case 4:
                    empData.printEmployeeList();
                    break;
                case 5:
                    empData.sortTheoName();
                    break;
                default:
                    System.out.println("Not a valid choice!!!");

            }
        } while (choice != 5);

    }
}
