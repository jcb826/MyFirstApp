import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        // the goal of this program is to ask the user to enter two numbers , add them, and to show the result
        // in the output


        Scanner sc = new Scanner(System.in);
        System.out.println("give me the first number to add please !");
        // collecting the user number
        int number1 = sc.nextInt();
        System.out.println("give me the second number to add  please !");
        int number2 = sc.nextInt();
        int result = number1 + number2;
        System.out.println("the result is  " + result);
    }
}
