
public class Patern {
    public static void main(String[] args) {
        for (int x = 0; x <= 3; x++) {
            for (int y = 0; y <= x; y++) {
                System.out.print("1");
            }
            System.out.println("");
        }
        for (int a = 2; a >= 0; a--) {
            for (int b = 0; b <= a; b++) {
                System.out.print("");
            }
            System.out.println("5");
        }
        System.out.println("");
        for (int i = 0; i <= 3; i++) {
            // System.out.println("");
            for (int j = i; j < 3; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("2");
            }
            System.out.println(" ");

        }
    }
}
