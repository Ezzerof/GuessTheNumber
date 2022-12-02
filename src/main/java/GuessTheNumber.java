import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    private boolean isOn = true;

    public void startApp() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (isOn) {
            System.out.print("\nPlease enter the limit or 0 to exit: ");
            int limit = scanner.nextInt();

            if (limit == 0) {
                isOn = false;
            }

            if (limitValidation(limit)) {
                int guessNo = random.nextInt(0, limit);
                int lives = 5;

                while (lives > 0) {
                    System.out.print("\nGuess the number: ");
                    int userInp = scanner.nextInt();

                    if (userInp != guessNo) {
                        lives--;
                        System.out.printf("Wrong answer. Lives = %d", lives);
                    } else {
                        System.out.println("You won!");
                        break;
                    }
                }
            }
        }
    }

    private boolean limitValidation(int limit) {

        if (limit > 1000 || limit < 0) {
            return false;
        }
        return true;
    }

}
