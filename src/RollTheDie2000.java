public class RollTheDie2000 {
    public static void main(String[] args) {

        // we want a die with 2000 faces with outputs. when the 6 drops we stop the programm

        int die = 0;
        while (die != 6) {
            die = (int) (Math.random() * 2000 + 1);
            System.out.println(die);
        }
    }
}
