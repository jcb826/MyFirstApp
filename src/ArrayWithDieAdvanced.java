public class ArrayWithDieAdvanced {
    public static void main(String[] args) {

        int myArray[] = new int[501];
        int dieCount = 0;
        int die = 0;

        for (int i = 0; i < 501; i++) {
            die = 1 + (int) (Math.random() * 10);
            if (die == 10) {
                dieCount = dieCount + 1;
            }
            myArray[i] = die;
        }
        for (int i = 0; i < 501; i++) {
            System.out.println("Value "+myArray[i] + " index  " + i);
        }
        System.out.println(" 10 rolled " + dieCount + " times");
    }
}
