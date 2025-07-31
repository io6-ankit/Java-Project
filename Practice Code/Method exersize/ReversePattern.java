
public class ReversePattern {
    static void number(int x) {
        for (int i = x; i >= 1; i--) {
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
