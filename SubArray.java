import java.io.*;
import java.util.*;

public class SubArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int[] a = new int[x];
        for(int i = 0; i < a.length; i++){
            a[i] = scan.nextInt();
        }

        
        
        scan.close();
    }
}