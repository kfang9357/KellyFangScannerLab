package KellyFang;
import java.util.Scanner;
public class Objective2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Is your number:");
        System.out.println("type 1: 1-10");
        System.out.println("type 2: 1-100");
        System.out.println("type 3: 1-1000");
        System.out.println("type 4: 1-10000");

        int min = 1;
        int max = 0;

        if (input.nextLine().equals("1")) {
            max = 10;
        }
        else if (input.nextLine().equals("2")) {
            max = 100;
        }
        else if (input.nextLine().equals("3")) {
            max = 1000;
        }
        else if (input.nextLine().equals("4")) {
            max = 10000;
        }
     System.out.println(max);
    }
}