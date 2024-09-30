public class ArrayWithScores {
    public static void main(String[] args) {
        int myArray[] = new int[100];
        int score = 0;
        float scoreAddition = 0;
        float averageScore = 0f;
        for (int i = 0; i < 100; i++) {
            score = 1 + (int) (Math.random() * 20);
            myArray[i] = score;
            System.out.println(score);
            scoreAddition = scoreAddition + score;
        }
        averageScore = scoreAddition / 100;
        System.out.println("The average score is " + averageScore);
    }
}
