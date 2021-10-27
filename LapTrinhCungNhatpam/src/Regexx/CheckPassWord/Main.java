
package Regexx.CheckPassWord;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 
 * @author nhattpam
 */
/*password required: at least one upper case letter, at 
least one lower case letter, at least one digit, at 
least one special character, minium eight in lentgh
*/
public class Main {
    public static String getPassword(){
        Scanner sc = new Scanner(System.in);
        String password = "";
        while(true){
            System.out.println("input password: ");
            password = sc.nextLine();
            Pattern pUpper = Pattern.compile("^.*[A-Z]+.*$");
            Pattern pLower = Pattern.compile("^.*[a-z]+.*$");
            Pattern pDigit = Pattern.compile("^.*[0-9]+.*$");
            Pattern pSpecial = Pattern.compile("^.*[#?!@$%^&*-]+.*$");
            Pattern pLength = Pattern.compile("^.{8,}$");
            
            if(pUpper.matcher(password).find()&&pLower.matcher(password).find()&&pDigit.matcher(password).find()&&pSpecial.matcher(password).find()&&pLength.matcher(password).find()){
                System.out.println("password is Strong!!!!");
                break;
            }else
                System.err.println("Password is weak :( ");
        }
        return password;
    }
    
    public static void main(String[] args) {
        String password = getPassword();
        System.out.println("password: " + password);
    }
}
