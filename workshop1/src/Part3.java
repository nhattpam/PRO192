
import java.util.Scanner;

/**
 *
 * @author meoca
 */                 //4 points
public class Part3 {

    public static void main(String[] args) {
        String[] list = new String[10];
        //input the list of names
        System.out.println("Please enter the ten names:");
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println(i + ": ");
            // Ensure that message is readable before
            // asking for input
            System.out.flush();

            //store the input
            list[i] = sc.nextLine();
        }
//        C1:
          for (String l : list){
              System.out.println(capitalizeWord(l));
          }
        
    }

//    split: Tra ve cac chu truoc regex . Ở đây mình chọn trước dấu cách
    public static String capitalizeWord(String str) {
        String words[] = str.split("\\s+"); // "\\s+ : cách hoặc nhiều dấu cách"
        String capitalizeWord = "";
        for (String w : words) {
            String first = w.substring(0, 1);
            String afterfirst = w.substring(1);
            capitalizeWord += first.toUpperCase() + afterfirst + " ";
        }
        return capitalizeWord.trim(); //trim : xóa khoảng trắng đầu và cuối chuỗi
    }
    
}
