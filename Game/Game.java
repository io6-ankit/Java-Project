import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Enter the 0 for Rock,1 for Paper and 2 for Scissor:");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        Random random = new Random();
        int computerInput = random.nextInt(3);
        if (userInput == computerInput) {
            System.out.println("Draw");
        } else if (userInput == 0 && computerInput == 1) {
            System.out.println("Computer is winner");

        } else if (userInput == 1 && computerInput == 2) {
            System.out.println("Computer is winner");
        } else if (userInput == 0 && computerInput == 2) {
            System.out.println("Computer is winner");
        } else {
            System.out.println("you are winner");
        }
        System.out.println("Computer Input " + " " + computerInput);
    }

}
