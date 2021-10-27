package Regexx.CheckSoDienThoai;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author nhattpam
 */
public class Main {

    public static String getPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        String phonenumber = "";
        while (true) {
            System.out.println("input phone number: ");
            phonenumber = sc.nextLine();
            Pattern p = Pattern.compile("^[0-9]{10}$");
            Pattern p1 = Pattern.compile("^[0-9]{3}-[0-9]{3}-[0-9]{4}$");
            Pattern p2 = Pattern.compile("^[0-9]{3}.[0-9]{3}.[0-9]{4}$");
            Pattern p3 = Pattern.compile("^[0-9]{3} [0-9]{3} [0-9]{4}$");
            Pattern p4 = Pattern.compile("^[0-9]{3}-[0-9]{3}-[0-9]{4} (x|ext)[0-9]{4}$");
            Pattern p5 = Pattern.compile("^\\([0-9]{3}\\)-[0-9]{3}-[0-9]{4}$");

            if (p.matcher(phonenumber).find() || p1.matcher(phonenumber).find() || p2.matcher(phonenumber).find()
                    || p3.matcher(phonenumber).find() || p4.matcher(phonenumber).find()
                    || p5.matcher(phonenumber).find()) {
                System.out.println("phone number is ok!!");
                break;
            } else {
                System.err.println("phone number is not ok :(");
            }
        }
        return phonenumber;
    }

    public static void main(String[] args) {
        String phonenumber = getPhoneNumber();
        System.out.println("phone number: " + phonenumber);
    }
}
/*
day so dien thoai
1. 1234567890 -> "^[0-9]{10}$"
2. 123-456-7890 -> "^[0-9]{3}-[0-9]{3}-[0-9]{4}$"
3. 123.456.7890 -> "^[0-9]{3}.[0-9]{3}.[0-9]{4}$"
4. 123 456 789 -> "^[0-9]{3} [0-9]{3} [0-9]{4}$"
5. 123-456-7890 x1234 -> "^[0-9]{3}-[0-9]{3}-[0-9]{4} (x|ext)[0-9]{4}$"
6. 123-456-7890 ex1234 -> "^[0-9]{3}-[0-9]{3}-[0-9]{4} (x|ext)[0-9]{4}$"
7. (123)-456-7890 -> "^\\([0-9]{3}\\)-[0-9]{3}-[0-9]{4}$"
 */
