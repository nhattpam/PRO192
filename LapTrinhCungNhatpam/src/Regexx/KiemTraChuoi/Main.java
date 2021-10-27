package Regexx.KiemTraChuoi;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author nhattpam
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //vd1: chi nhan 1 so
        //vd2: nhap nhieu so : them dau +
        //vd3: nhap chu [a-zA-Z]
        //C1:
//        Pattern p = Pattern.compile("^[a-zA-Z]{6,10}$");
        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{6,10}$");
        while (true) {
            System.out.println("input txt: ");
            String txt = sc.nextLine();
            if (p.matcher(txt).find()) {
                System.out.println("txt is ok");
                break;
            } else {
                System.err.println("txt isn't ok");
            }
        }
        //C2:
        //System.out.println("input txt: ");
        //String txt = sc.nextLine();
//        String pattern = "(^[0-9]$)";
//        if(txt.matches(pattern)){
//            System.out.println("txt is ok");
//        }else
//            System.out.println("txt is not ok");
    }
}
