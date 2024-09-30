public class ArraySmallerNumber {
    public static void main(String[] args) {
        int[] myArray = {5, 9, 7, 474, 5, 4, 2, 0, 89};
        int arrLength = myArray.length;
        int minValue = myArray[0];
        System.out.println(" This array contains " + arrLength + " values");
        for (int i = 1; i < arrLength; i++) {
            if (myArray[i] < minValue) {
                minValue = myArray[i];
            }
        }
        System.out.println(" The smallest value is " + minValue);
    }
}
