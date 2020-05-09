import java.util.Scanner;

public class SubStringCompare {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String[] sortedArray = new String[s.length() - k + 1];
        for (int i = 0; i <= s.length() - k; i++) {
            String str = s.substring(i, i + k);
            sortedArray[i] = str;
            // sortedArray.append(s.substring(i, i+k));
        }

        smallest = sortedArray[0];
        largest = sortedArray[0];

        for (int x = 0; x < sortedArray.length; x++) {
            if (sortedArray[x].compareTo(smallest) < 0) {
                smallest = sortedArray[x];
            }
            if (sortedArray[x].compareTo(largest) > 0) {
                largest = sortedArray[x];
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}