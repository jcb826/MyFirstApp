public class BubbleSortFirstExercice {
    public static void main(String[] args) {
        int arr[] = {84, 12, 1, 43, 5, 0};
        int tmp = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < (6 - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
