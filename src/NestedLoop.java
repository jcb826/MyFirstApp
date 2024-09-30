public class NestedLoop {
    public static void main(String[] args) {

        int weeks = 3;
        int days = 7;
        // Outer loop for weeks
        for (int i = 1; i <= weeks; ++i) {
            System.out.println("Week: " + i);

            // Inner loop for days
            for (int j = 1; j <= days; ++j) {
                System.out.println("  Day: " + j);
            }
        }
    }
}
