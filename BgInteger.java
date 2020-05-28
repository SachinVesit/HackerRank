import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class BgInteger {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        BigInteger x, y;
        x = scan.nextBigInteger();
        y = scan.nextBigInteger();
        System.out.println(x.add(y));
        System.out.println(x.multiply(y));

        scan.close();

    }
}