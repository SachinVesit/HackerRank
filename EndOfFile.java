import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        for (int i = 1; sc.hasNext(); System.out.println(i + " " + sc.nextLine()), i++)
            ;

    }

}
