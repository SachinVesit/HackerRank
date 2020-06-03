import java.util.*;

class ArrayListQuery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> arrList = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            int d = scan.nextInt();
            arrList.add(new ArrayList<Integer>(d));
            for (int j = 0; j < d; j++) {
                int dd = scan.nextInt();
                arrList.get(i).add(dd);
            }
        }

        int q = scan.nextInt();
        for (int k = 0; k < q; k++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            try {
                System.out.println(arrList.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }

        scan.close();
    }
}