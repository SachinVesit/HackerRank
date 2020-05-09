import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        String us = "";
        String india = "";
        String china = "";
        String france = "";
        scanner.close();

        // Write your code here.

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat usa = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat ind = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat cha = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frn = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        us = usa.format(payment);
        india = ind.format(payment);
        china = cha.format(payment);
        france = frn.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
