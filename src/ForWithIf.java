public class ForWithIf {
    public static void main(String[] args) {

        for (int i = 0; i < 21; i++) {
            System.out.println(i);

            if (i == 10) {
                System.out.println("half way ! ");
            }
            if (i == 20) {
                System.out.println("end");
            }

        }

        for (int i = 100; i > 0; i--) {
            System.out.println("Pony number " + i);
            if (i == 1) {
                for (int j = 0; j < 101; j++) {
                    System.out.println("Pony number " + j);
                }
            }
        }
    }
}
