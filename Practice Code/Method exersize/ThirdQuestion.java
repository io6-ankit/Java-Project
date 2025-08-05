
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

    // static int Series(int x) {
    // int first = 0;
    // int second = 1;
    // for (int i = 0; i <= x; i++) {
    // int next = first + second;
    // first = second;
    // second = next;
    // }
    // }

    static int VarArgsMethod(int... arr) {
        int sum = 0;
        for (int num : arr) {
            sum = sum + num;
        }
        return

        sum / arr.length;

    }

    static void RecursiveUsePrintTheStart(int x) {
        if (x >= 0) {
            RecursiveUsePrintTheStart(x - 1);
            for (int i = 0; i <= x; i++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void ReverseRecursiveUsePrintTheStar(int x) {
        if (x >= 0) {

            for (int i = 0; i <= x; i++) {
                System.out.print("*");
            }
            System.out.println();
            ReverseRecursiveUsePrintTheStar(x - 1);
        }
    }

    // 9. question answer
    static void temperatures(double x) {

        double tem = (x - 32) * 5 / 9;
        System.out.println(tem + "temperatures");
    }

    public static void main(String[] args) {
        naturalNumber(5);
        int c = SecondMethod(4);
        System.out.println(c + "c");
        int fib = Fibonacci(10);
        System.out.println(fib + "hhug");
        int first = 0;
        int second = 1;
        for (int i = 0; i <= 10; i++) {
            System.out.println(first);
            int next = first + second;
            first = second;
            second = next;

        }

        System.out.println("Varjfv:" + VarArgsMethod(2, 4, 6));
        RecursiveUsePrintTheStart(3);
        System.out.println();
        ReverseRecursiveUsePrintTheStar(4);
        temperatures(355);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;

        }
        System.out.println(sum);

    }
}
