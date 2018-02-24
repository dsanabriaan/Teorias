
package tallertc;
import java.util.Scanner;
import  java.util.regex.Pattern;
import  java.util.regex.Matcher;
public class TallerTC {
    static  boolean validar (String input){
        Pattern p = Pattern.compile("^28(\\d*)[^90]$");
        Matcher m = p.matcher(input);
        return m.matches();
    }
    
    public static void main(String[] args) {
        System.err.println(validar("28444449"));
        
    }
    
}
