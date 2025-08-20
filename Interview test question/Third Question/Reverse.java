
public class Reverse {
    public static void main(String[] args) {
        int num = 151;
        int originalNumber = num;
        int reverse = 0;
        int digit = 0;
        while (num != 0) {
            digit = num % 10;
            reverse = (reverse * 10) + digit;
            num = num / 10;

        }
        System.out.print(reverse);
        if (originalNumber == reverse) {
            System.out.println("Number is palindrom:");
        } else {
            System.out.println("Number is not a palindrom:");
        }
    }
}