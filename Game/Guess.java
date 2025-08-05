import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numbertoGuess = random.nextInt(10) + 1;
        int attemts = 0;
        int guess = 0;
        System.out.println("Welcome to NumberGuess Game");
        System.out.println("Can you Guess!");
        // System.out.println(numbertoGuess + "NumbertoGuess");
        while (guess != numbertoGuess) {
            System.out.println("enter the guess");
            guess = sc.nextInt();
            attemts++;
            if (guess < numbertoGuess) {
                System.out.println("Too low ! Please try again: ");
            } else if (guess > numbertoGuess) {
                System.out.println("To high! Please try again:");
            } else {
                System.out.println("Correct! You Guess it in " + attemts + " " + "Attemts.");
            }
        }
        sc.close();
    }
}
