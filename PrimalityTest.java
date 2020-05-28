import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger n = scanner.nextBigInteger();
        if (n.isProbablePrime(1) == true) {
            System.out.println("prime");
        }
        if (n.isProbablePrime(1) == false) {
            System.out.println("not prime");
        }

        scanner.close();
    }
}
