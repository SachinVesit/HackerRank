import java.io.*;
import java.util.*;

public class LetsReview {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int x = sc.nextInt();
        String input;
        StringBuilder sb = new StringBuilder();
        while(i < x){
            input = sc.nextLine();
            sb.append(input);
            i++;
        }
        System.out.println(sb);
        sc.close();
    }
}