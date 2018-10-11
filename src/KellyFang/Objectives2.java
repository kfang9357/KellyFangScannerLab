package KellyFang;

import java.util.Scanner;

public class Objectives2 {
    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);
        int guess2 = 50;
        System.out.println("is your number " + guess2 + "?");
        String correct = input2.nextLine();
        while (!input2.equals("correct")) ;
        {
            if (correct.equals("lower")) {
                guess2 = guess2 / 2;
            }
            System.out.println("is your number " + guess2);
        }
    }
}
