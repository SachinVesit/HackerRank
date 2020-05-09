import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int x = 0;
        int y = 0;
        int alength = a.length();
        int blength = b.length();
        if (alength < 1 || alength > 50) {
            return false;
        }
        if (alength != blength) {
            return false;
        }
        String str1 = a.toLowerCase();
        String str2 = b.toLowerCase();
        for (x = 0; x < alength; x++) {
            y ^= str1.charAt(x);
            y ^= str2.charAt(x);
        }

        return y == 0;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
