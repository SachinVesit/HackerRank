import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTriplet {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> listNumber = new ArrayList<Integer>();
        int x = a.size();
        int awin = 0;
        int bwin = 0;
        System.out.println(x);
        for (int i = 0; i < x; i++) {
            if (a.get(i) > b.get(i)) {
                ++awin;
            }
            if (a.get(i) < b.get(i)) {
                ++bwin;
            }
        }
        listNumber.add(awin);
        listNumber.add(bwin);
        return listNumber;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(result.stream().map(Object::toString).collect(joining(" ")) + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}
