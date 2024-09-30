public class TimeIsPony {
    public static void main(String[] args) {

        long startTime;
        long endTime;
        long totalTime;
        startTime = System.currentTimeMillis();
        System.out.println(startTime);
        for ( int i=1;i<=1000000;i++) {
            System.out.println("Pony number "+i);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime);
        totalTime = endTime-startTime;
        System.out.println("It took "+totalTime+" milliseconds");
    }
}
