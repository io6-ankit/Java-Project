
public class Pattern {
    static void number(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        number(4);
    }
}
