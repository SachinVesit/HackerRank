import java.util.*;

public class SubArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int sum = 0;
        int[] a = new int[x];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
            int y = a[i];
            if (y < 0)
                sum++;
            for (int j = i - 1; j >= 0; j--) {
                y = y + a[j];
                if (y < 0)
                    sum++;
            }

        }
        System.out.println(sum);
        scan.close();
    }
}