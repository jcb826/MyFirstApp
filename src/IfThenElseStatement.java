public class IfThenElseStatement {
    public static void main(String[] args) {

        int testscore = 60;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
            System.out.println(grade);
        } else {
            System.out.println("grade is lower than A !");
        }


        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);

    }
}

