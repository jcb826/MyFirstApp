import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*
       Data Type  Size   Description
       byte   1 byte Stores whole numbers from -128 to 127
       short  2 bytes    Stores whole numbers from -32,768 to 32,767
       int    4 bytes    Stores whole numbers from -2,147,483,648 to 2,147,483,647
       long   8 bytes    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
       float  4 bytes    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
       double 8 bytes    Stores fractional numbers. Sufficient for storing 15 decimal digits
       boolean    1 bit  Stores true or false values
       char   2 bytes    Stores a single character/letter or ASCII values

*/

        byte a = 4;
        short b = 2;
        int c = 4;
        long d = 435;
        float e = 345.67f;
        double f = -4578.4678;
        boolean g = true;
        char h = 'c';


        int x, y, z;
        x = 3;
        y = 5;
        z = 10 / 2 + (3 * 2) * 4;
        x = y + z;


        System.out.println("Hello world");

        System.out.println(z);
        System.out.println(x);


        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number to add please !");
        // collecting the user number
        int number1 = sc.nextInt();
        System.out.println("your number is " + number1);


    }

}