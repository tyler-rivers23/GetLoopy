import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Random rand = new Random();

        Scanner in = new Scanner(System.in);
        int rollCount = 0;

        System.out.printf("%-8s %-8s %-8s %-8s %-8s%n","roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("----------------------------------------------------------");
        while (true){
            rollCount++;

            int die1 = rand.nextInt(6) + 1;
            int die2 = rand.nextInt(6) + 1;
            int die3 = rand.nextInt(6) + 1;
            int sum = die1 + die2 + die3;
            System.out.printf("%-8d %-8d %-8d %-8d %-8d%n", rollCount, die1, die2, die3, sum);

            if (die1 == die2 && die2 == die3){
                System.out.println("You rolled a triple! Game over.");
                break;
            }
            System.out.print("Do you want to roll again? (y/n)");
            String usesrInput = in.nextLine();
            if (usesrInput.equals("n")){
                break;
            }
        }
        System.out.println("thanks for playing!");
    }
}
