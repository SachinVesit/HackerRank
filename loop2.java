import java.util.*;

class loop2 {
    public static void main(final String[] argh) {

        int x, t, i, a = 0, b = 0, n = 0;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        for (i = 0; i < t; i++) {
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            for (x = 0; x < n; x++) {
                a += b * (int) Math.pow(2, x);
                System.out.print(a + " ");
            }
            System.out.print('\n');
        }

        in.close();
    }
}
