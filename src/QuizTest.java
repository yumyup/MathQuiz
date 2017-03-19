public class QuizTest {
    public static void main(String[] args) {
        MathQuiz mq = new MathQuiz();
        boolean q1 = mq.question1();
        boolean q2 = mq.question2();
        boolean q3 = mq.question3();

        if (q1 == mq.question1()) {
            System.out.println("odpowiedz 1 - dobrze");
        } else {
            System.out.println("odpowiedz 1- źle");
        }
        if (q2 == mq.question2()) {
            System.out.println("odpowiedz 2 - dobrze");
        } else {
            System.out.println("odpowiedz 1- źle");
        }
        if (q3 == mq.question3()) {
            System.out.println("odpowiedz 3 - dobrze");
        } else {
            System.out.println("odpowiedz 1- źle");
        }
    }
}
