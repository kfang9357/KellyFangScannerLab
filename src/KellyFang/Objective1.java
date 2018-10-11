package KellyFang;
import java.util.Scanner;
 class Objectives1 {

    public static void main(String[] args) {
        double num = Math.random();
        int random  = (int)(num*11);
        Scanner input = new Scanner(System.in);
        int guess;
        System.out.println("Guess my number");
        guess = input.nextInt();

        while (guess!=random)
        {
            System.out.print("Guess again");
            guess = input.nextInt();

        }
        System.out.println("You got it! The number is "+guess);
    }

}