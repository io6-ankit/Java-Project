import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Please enter the number");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int t1 = num;

        int length = 0;
        while (t1 != 0) {
            t1 = t1 / 10;
            length = length + 1;
        }
        System.out.println("Length" + " " + length);
        int t2 = num;
        // int arm = 1;
        int reverse;
        int multi = 0;
        while (t2 != 0) {
            reverse = t2 % 10;
            int arm = 1;
            // reverse = (reverse * 10) + digit;
            for (int x = 1; x <= length; x++) {
                arm = arm * reverse;
            }
            multi = multi + arm;
            t2 = t2 / 10;
        }
        System.out.println("Multi" + " " + multi);
        if (num == multi) {
            System.out.println("Number is Armstrong number");
        } else {
            System.out.println("Number is not Armstrong Number");
        }
    }
}