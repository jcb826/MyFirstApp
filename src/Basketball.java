import java.util.Scanner;

public class Basketball {
    public static void main(String[] args) {
        //test passed if under 220 pounds and higher than 63 inches and younger than 25 years old
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------------");
        System.out.println("Welcome to our Basketball team !");
        System.out.println("-------------------------------------------------------");
        System.out.println("Your weight ?");
        int weight = sc.nextInt();
        System.out.println("How tall are you ? ");
        int height = sc.nextInt();
        System.out.println("How old are you ?");
        int age = sc.nextInt();
        if (weight < 220 && height > 63 && age < 25) {
            System.out.println(" Test passed !");
        } else
            System.out.println("Test failed");
    }
}
