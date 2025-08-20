
public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int f = num;

        for (int x = 1; x < num; x++) {
            f = f * (num - x);
            System.out.println(f);
        }
        System.out.println(f);

    }
}
