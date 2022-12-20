import java.util.Scanner;

public class Check {
    Scanner scanner = new Scanner(System.in);
    protected int userInputCheck() {

        if (scanner.hasNextInt()) {
            int userInput = scanner.nextInt();
            if (userInput == 1 || userInput == 2) {
                return userInput;
            } else {
                System.out.println("Wrong input!");
                return -1;
            }
        }
        return -1;
    }

    protected int validationOfMaxNumber() {

        while (true) {
            System.out.print("Please enter the max number (2 - 100): ");
            int maxNumber = scanner.nextInt();
            if (maxNumber > 1 && maxNumber < 100) {
                return maxNumber;
            }
            continue;
        }
    }

    protected boolean isAlive(int lives) {
        if (lives == 1) {
            return false;
        }
        return true;
    }

}
