
public class Eightnumber {
    public static void main(String[] args) {
        int num = 0;
        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print((num = num + 1) + " ");
            }
            System.out.println(" ");
        }
    }
}
