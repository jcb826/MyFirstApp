public class BubbleSort {
    public static void main(String[] args) {
        // an array with some int not sorted
        int[] arr = {1, 2, 3, 4, 6, 5};
        // declaration of variable temp to store temporary values
        int temp = 0;
        // writing the value of index 4 in temp
        temp = arr[4];
        // changing the value at index 4 with the value at index 5
        arr[4] = arr[5];
        // changing the value at index 5 with the value in temp
        arr[5] = temp;
        // outputs of the values in the array
        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
