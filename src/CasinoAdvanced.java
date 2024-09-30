import java.util.Scanner;

public class CasinoAdvanced {
    public static void main(String[] args) {

        int userChoice = 0;
        int die = 1 + (int) (Math.random() * 10);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Guess the roll of die ! from 1 to 10 ! ");
            userChoice = sc.nextInt();
            if (userChoice != die) {
                System.out.println("You lose ");
            }
        }
        while (userChoice != die);
        System.out.println("You win !");
    }
}
