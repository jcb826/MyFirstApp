public class Casting {
    public static void main(String[] args) {

        /* Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double
        */
        byte a = 12;
        System.out.println("byte value : " + a);
        // Implicit Typecasting
        short b = a;
        System.out.println("short value : " + b);
        int c = b;
        System.out.println("int value : " + c);
        long d = c;
        System.out.println("long value : " + d);
        float e = d;
        System.out.println("float value : " + e);
        double f = e;
        System.out.println("double value : " + f);


        int anInt = 5;
        double aDouble = anInt; // Automatic casting: int to double

        System.out.println(anInt);      // Outputs 5
        System.out.println(aDouble);   // Outputs 5.0
        /*
        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
        */
        double temperature = 6.47d;
        int temperatureCasted = (int) temperature; // Manual casting: double to int

        System.out.println(temperature);   // Outputs 6.47
        System.out.println(temperatureCasted);

    }
}
