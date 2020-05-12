import java.util.Scanner;

public class BigSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long y = 0;
        long[] sum = new long[x];
        for(int i = 0; i < sum.length; i++){
            sum[i] = sc.nextLong();
            y = y + sum[i];
        } 
        System.out.println(y);
        sc.close();
    }
}