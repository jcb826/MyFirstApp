public class Array {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 4, 6, 2};
        int[] numbers2 = new int[5];
        System.out.println(numbers2[0]);
        numbers[0] = 4;
        numbers[1] = 2;
        System.out.println(numbers[0]);
        numbers2[4] = 9;
        System.out.println(numbers2[4]);
    }
}
