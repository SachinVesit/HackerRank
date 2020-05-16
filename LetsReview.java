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
        String first = sc.nextLine();
        String second = sc.nextLine();
        char[] cFirst = first.toCharArray();
        char[] cSecond = second.toCharArray();
        for(i = 0; i < cFirst.length; i++){
            if(cFirst[i] % 2 == 0){
                System.out.print(cFirst[i]);
            }
            else{
                System.out.print(cFirst[i]);
            }
        }
        sc.close();
    }
}