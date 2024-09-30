public class DieWithTime {
    public static void main(String[] args) {

        int die = 0;
        long startTime;
        long endTime;
        long totalTime;
        // couting the number of times the die is rolled
        long count = 0;
        startTime = System.currentTimeMillis();
        System.out.println(startTime);
        while (die != 6) {
            die = (int) (Math.random() * 3000 + 1);
            System.out.println(die);
            count = count + 1;
        }

        endTime = System.currentTimeMillis();

        System.out.println(endTime);

        totalTime = endTime - startTime;

        System.out.println("It took " + totalTime + " milliseconds");

        System.out.println("Die thrown " + count + " times");
    }
}
