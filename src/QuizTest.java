public class QuizTest {
    public static void main(String[] args) {
        int sum = 0;
        MathQuiz mq = new MathQuiz();
        boolean q1 = mq.question1();
        boolean q2 = mq.question2();
        boolean q3 = mq.question3();
        if (q1) {
            System.out.println("odpowiedz 1 - dobrze");
            sum++;
        } else {
            System.out.println("odpowiedz 1 - źle");
        }
        if (q2) {
            System.out.println("odpowiedz 2 - dobrze");
            sum++;
        } else {
            System.out.println("odpowiedz 1 - źle");
        }
        if (q3) {
            System.out.println("odpowiedz 3 - dobrze");
            sum++;
        } else {
            System.out.println("odpowiedz 1 - źle");
        }

        System.out.println("odpowiedzi dobre " + sum + "/3");
    }
}
