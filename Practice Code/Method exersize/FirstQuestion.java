
public class FirstQuestion {
    static void table(int x) {
        for (int i = 1; i <= 10; i++) {
            int num = x * i;
            System.out.println(x + "x" + i + "=" + num);
        }
    }

    public static void main(String[] args) {
        table(7);
    }

}
