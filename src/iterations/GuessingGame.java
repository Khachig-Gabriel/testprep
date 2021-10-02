package iterations;

import java.util.Scanner;

public class GuessingGame {

    public void play() {

        int randomNum = (int) (Math.random() * 10);
        Scanner inputScanner = new Scanner(System.in);
        boolean userWon = false;
        do {
            System.out.println("Please insert your guess");
            int guess = inputScanner.nextInt();
            if (guess == randomNum) {
                System.out.println("You won!");
                userWon = true;
            } else {
                System.out.println("Your guess was incorrect.\nTry again");
            }
        } while (!userWon);
    }
}
