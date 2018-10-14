package KellyFang;
import java.util.Scanner;
 class Objectives1 {

    public static void main(String[] args) {
        double num = Math.random();
        int random  = (int)(num*11);
        //System.out.println(random);
        Scanner input = new Scanner(System.in);
        int guess;
        System.out.println("Guess my number");
        guess = input.nextInt();
        int counter =1;

        while (guess!=random)
        {
            System.out.print("Guess again");
            counter++;
            guess = input.nextInt();

        }
        System.out.println("You got it! The number is "+guess);
        System.out.println("It took you "+counter+" tries to guess my number.");
    }

}