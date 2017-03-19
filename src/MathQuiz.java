import java.util.Scanner;

public class MathQuiz {

    private Scanner scan = new Scanner(System.in);

    public boolean question1() {
        System.out.print("ile jest 3*5 = ");
        int answer = scan.nextInt();
        if (answer == 15)
            return true;
        else
            return false;
    }

    public boolean question2() {
        System.out.println("jakie jest pole kwadratu o boku 12? ");
        int answer = scan.nextInt();
        if (answer == 144)
            return true;
        else
            return false;
    }

    public boolean question3() {
        System.out.println(" jaki jest pierwiastek kwadratowy ze 15129?");
        int answer = scan.nextInt();
        if (answer == 123)
            return true;
        else
            return false;


    }

}