
public class Secondstar {
    public static void main(String[] args) {
        int n = 5;
        int m = 4;
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= m; y++) {
                if (x == 1 || y == 1 || x == n || y == m) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");

        }
    }
}
