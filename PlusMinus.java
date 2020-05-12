import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double x = arr.length;
        double positive = 0, negative = 0 , zero = 0;
        for (int i = 0; i < x; i++) {
            if (arr[i] == 0) {
                ++zero;
            }
            if (arr[i] > 0) {
                ++positive;
            }
            if (arr[i] < 0) {
                ++negative;
            }

        }

        double pos = Math.abs(positive) / x;
        double neg = Math.abs(negative) / x;
        double zro = Math.abs(zero) / x;
        System.out.format("%.6f", pos);
        System.out.println();
        System.out.format("%.6f", neg);
        System.out.println();
        System.out.format("%.6f", zro);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
