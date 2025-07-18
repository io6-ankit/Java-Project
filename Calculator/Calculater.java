import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        double num1, num2;
        char operator;
        double result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple calculator in java :");
        System.out.print("Enter the first number:");
        num1 = sc.nextDouble();
        System.out.print("Enter the Operator(+,-,/,*):");
        operator = sc.next().charAt(0);
        System.out.print("Enter the second number:");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;

                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Can not divide by zero");
                    return;
                }
                break;

            default:
                System.out.println("Inviled operator");
                return;

        }
        System.out.println("Result=" + result);
    }
}