import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolveMeFirst {

    private static Scanner in;

    static int solveMeFirst(int a, int b) {
        return a + b;

    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        int a, b, sum;
        a = in.nextInt();
        b = in.nextInt();
        sum = solveMeFirst(a, b);
        System.out.println(sum);
        in.close();
    }

}
