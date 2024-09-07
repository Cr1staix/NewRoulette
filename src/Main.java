import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int answering1 = random.nextInt(1, 30);
        System.out.println("На первый вопрос отвечает : " + answering1);
        int answering2 = random.nextInt(1, 30);
        if (answering2 == answering1) {
            answering2 = answering1 + 1;
            if (answering2 > 29) {
                answering2 = answering1 - 1;
            }
            System.out.println("На второй вопрос отвечает : " + answering2);
        } else {
            System.out.println("На второй вопрос отвечает : " + answering2);
        }
        int answering3 = random.nextInt(1, 30);
        if (answering3 == answering1 || answering3 == answering2) {
            int remainder = answering2 % answering1;
            answering3 = answering2 - answering1;
            if (remainder == 0) {
                answering3 = answering2 - answering1 + 1;
                System.out.println("На третий вопрос отвечает : " + Math.abs(answering3));
            } else {
                System.out.println("На третий вопрос отвечает : " + Math.abs(answering3));
            }

        } else System.out.println("На третий вопрос отвечает : " + answering3);
    }
}