
public class ThirdQuestion {
    // ye maine apne aap normal kiya hai
    static void naturalNumber(int x) {
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum = sum + i;
        }
        System.out.println("sum" + "=" + sum);
    }

    // ye vala recursive method se kiya gya hai
    static int SecondMethod(int a) {
        if (a == 1) {
            return 1;
        }
        return a + SecondMethod(a - 1);
    }

    static int Fibonacci(int x) {
        if (x == 1) {
            return 0;
        } else if (x == 2) {
            return 1;
        } else {
            return Fibonacci(x - 1) + Fibonacci(x - 2);
        }
    }

    public static void main(String[] args) {
        naturalNumber(5);
        int c = SecondMethod(4);
        System.out.println(c + "c");
        int fib = Fibonacci(15);
        System.out.print(fib);
    }
}
