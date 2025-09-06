// Q. 
//    *             *
//    * *         * *
//    * * *     * * *
//    * * * * * * * *
//    * * * * * * * *
//    * * *     * * *
//    * *         * *
//    *             *
//
//

public class Elevenstar {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * n - (i + i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 4 - i; j >= 0; j--) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 + (i + i) - 4; j++) {
                System.out.print(" ");
            }
            for (int j = 4 - i; j >= 0; j--) {
                System.out.print("*");
            }
            // System.out.println();

            System.out.println();
        }
    }
}
