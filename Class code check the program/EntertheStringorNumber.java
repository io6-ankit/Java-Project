public class EntertheStringorNumber {
    static void enterTheString(String x) {
        System.out.println(x + "name");
    }

    static void enterthenumber(int x) {
        System.out.println(x + 5);
        for (int i = 1; i <= 10; i++) {
            int num = x * i;
            System.out.println(x + "x" + i + "=" + num);
        }

    }

    public static void main(String[] args) {
        enterTheString("Ankit");
        enterthenumber(7);
    }
}
