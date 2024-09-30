public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the upper half of the diamond
        int i = 1;

        // Upper half of the diamond
        do {
            // Print spaces
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            // Print stars
            int k = 1;
            while (k <= 2 * i - 1) {
                System.out.print("*");
                k++;
            }
            // Move to the next line
            System.out.println();
            i++;
        } while (i <= n);

        // Lower half of the diamond
        i = n - 1;
        do {
            // Print spaces
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            // Print stars
            int k = 1;
            while (k <= 2 * i - 1) {
                System.out.print("*");
                k++;
            }
            // Move to the next line
            System.out.println();
            i--;
        } while (i > 0);
    }
}
