import java.io.*;
import java.util.*;

public class StringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        int length = s.length();
        String token = "[ !,?.\\_'@]+";
        String strArray[] = s.trim().split(token);
        if (s == "" || s.trim().equals("")) {
            System.out.println("0");
        } else if (length >= 400000) {
            return;
        } else {
            System.out.println(strArray.length);
        }

        for (String item : strArray) {
            System.out.println(item);
        }
        scan.close();
    }
}
