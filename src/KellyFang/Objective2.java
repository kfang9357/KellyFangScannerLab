package KellyFang;
import java.util.Scanner;
public class Objective2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello player! What is your name?");
        String name = input.nextLine();
        System.out.println(name+" pick a number from 1 - 20 and I'll guess it.");

        int min = 1;
        int max = 20;

        System.out.println("Is your number 10?");

        if (!input.nextLine().equals("correct"))
        {
            {
                while (!input.nextLine().equals("correct")) {
                    if (input.nextLine().equals("too high")) {
                        max = max / 2;
                    }
                    else if (input.nextLine().equals("too low")) {
                        max = max * (3 / 2);
                    }
                    System.out.println(name + ", is your number " + max + "?");
                }
            }
        }

        System.out.println(name+" thank you for playing!");
    }
}