public class BubbleSortOptimized {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 5, 4};
        int length = myArray.length;
        int count = 0;
        boolean swap;

        for (int i = 0; i < length - 1; i++) {
            swap = false;
            for (int j = 0; j < length - 1 - i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    // swapping values
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                    swap = true;
                }
            }
            count++;
            // If swap contains false the array is sorted
            if (!swap) break;
        }
        System.out.println("We went through the array: " + count + " times");
    }
}
