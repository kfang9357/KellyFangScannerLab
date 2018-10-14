package KellyFang;
import java.util.Scanner;
public class Objective2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello player! What is your name?");
        String name = input.nextLine();
        System.out.println(name + " pick a number from 1 - 20 and I'll guess it.");

        boolean correct = false;
        int x = 0;
        int min = 1;
        int max = 20;
        int guess = 10;

        System.out.println("Let me know if my guess is too high or too low.");

        while (correct == false) {
            System.out.println("Is your number " + guess + "?");
            String response = input.nextLine();
            if (response.equals("too low")) {
                min = guess;
                guess = (int) (max - min) / 2 + min;
                x++;
            } else if (response.equals("too high")) {
                max = guess;
                guess = (int) (max - min) / 2 + min;
                x++;
            } else if (response.equals("correct")) {
                correct = true;
                System.out.println("It took me " + x + " tries to guess correctly.");
            }
        }
        System.out.println(name + " thank you for playing!");
    }
}