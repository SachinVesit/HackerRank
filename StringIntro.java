import java.io.*;
import java.util.*;

public class StringIntro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        // This is output for length
        System.out.println(A.length() + B.length());

        // This is for lexicographically function

        int big = A.compareTo(B);
        int small = B.compareTo(A);

        if (big > small) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // This is for UpperCase function
        String str = A.substring(0, 1).toUpperCase() + A.substring(1);
        String str2 = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.print(str + " " + str2);
        System.out.println();

    }
}
