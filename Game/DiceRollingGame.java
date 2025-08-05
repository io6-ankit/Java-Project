import java.util.Random;
import java.util.Scanner;

public class DiceRollingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String name;
        int num;
        int computerinput = random.nextInt(6) + 1;
        System.out.println("🎲 Welcome to Dice Rolling Game !");
        System.out.print("Enter the your name :" + " ");
        name = sc.nextLine();
        System.out.println("Hi" + " " + name + " " + "Please enter the Roll the Dice !");
        num = sc.nextInt();
        System.out.println(name + " " + "Rolled :" + " " + +num);
        System.out.println("Computer Rolled: " + " " + computerinput);
        if (num > computerinput) {
            System.out.println("🎉 You are win !");
        } else if (num == computerinput) {
            System.out.println("It is a Tie!");
        } else {
            System.out.println(" 🎉 Computer is win !");
        }
    }
}
