public class ForStatement {

    public static void main(String[] args) {

        for (int i = 0; i < 101; i++) {
            System.out.println(i);
        }


        // Do 1 million ponys outputs !

        for (int i = 0; i <= 1000000; i++) {
            System.out.println("pony number " + i);
        }


        // from 1 million to 1 ponys


        for (int i = 1000000; i >= 1; i--) {
            System.out.println("pony number " + i);
        }


    }
}
