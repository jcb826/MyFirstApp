import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
        // guess the value of the die

        int die = 1 + (int) (Math.random() * 10);
        Scanner sc = new Scanner(System.in);
        System.out.println("guess the value of the die ! ");
        int i = sc.nextInt();
        if (i == die) {
            System.out.println("you win");
        } else {
            System.out.println("you lose");
            System.out.println(die);
        }
    }
}
