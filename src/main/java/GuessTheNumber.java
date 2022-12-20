import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public void startApp() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Check check = new Check();

        while (true) {

            System.out.print("Please enter the number of: \n1) Start game\n2) Exit game\nEnter: ");
            int userInput = check.userInputCheck();

            if (userInput == 2) {
                break;
            } else if (userInput == -1) {
                continue;
            }

            int maxNumber = check.validationOfMaxNumber();
            int guessNo = random.nextInt(1, maxNumber);
            int lives = 5;

            while (lives > 0) {
                System.out.print("\nGuess the number: ");
                int userInp = scanner.nextInt();

                if (userInp != guessNo) {

                    if (check.isAlive(lives)) {
                        lives--;
                        System.out.printf("Wrong answer. Lives = %d", lives);
                    } else {
                        System.out.println("You lost.\n");
                        break;
                    }

                } else {
                    System.out.println("You won!\n");
                    break;
                }
            }
        }
    }

}
