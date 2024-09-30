public class VariableScope {
    public static void main(String[] args) {

        for (int i = 0; i < 101; i++) {
            int c = 3;
            System.out.println(c);
            System.out.println(i);
        }

        int a = 4;
        System.out.println(a);
        int b = 5;
        System.out.println(b);



    }

}
