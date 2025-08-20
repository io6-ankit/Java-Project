import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isNum = true;
        if (num <= 1) {
            isNum = false;

        } else {
            for (int x = 2; x <= num / 2; x++) {
                if (num % x == 0) {
                    isNum = false;
                    break;
                }

            }

        }

        if (isNum) {
            System.out.println("Number is Prime ");
        } else {
            System.out.println("Number is Not a Prime number");
        }
    }
}