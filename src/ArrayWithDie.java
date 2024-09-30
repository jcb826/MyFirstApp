public class ArrayWithDie {
    public static void main(String[] args) {
        int myArray[] = new int[500];
        for (int i = 0; i < 500; i++) {
            int die = 1 + (int) (Math.random() * 10);
            myArray[i] = die;
        }
        for (int i = 0; i < 500; i++) {
            System.out.println("Value " + myArray[i] + " index " + i);
        }
    }
}
