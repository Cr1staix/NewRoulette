import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int answer1 = random.nextInt(1, 30);
        System.out.println("На первый вопрос отвечает : " + answer1);
        int answer2 = random.nextInt(1, 30);
        if (answer2 == answer1) {
            answer2 = answer1 + 1;
            if (answer2 > 29) {
                answer2 = answer1 - 1;
            }
            System.out.println("На второй вопрос отвечает : " + answer2);
        } else {
            System.out.println("На второй вопрос отвечает : " + answer2);
        }
        int answer3 = random.nextInt(1, 30);
        if (answer3 == answer1 || answer3 == answer2) {
            int remainder = answer2 % answer1;
            answer3 = answer2 - answer1;
            if (remainder == 0) {
                answer3 = answer2 - answer1 + 1;
                System.out.println("На третий вопрос отвечает : " + Math.abs(answer3));
            } else {
                System.out.println("На третий вопрос отвечает : " + Math.abs(answer3));
            }
        } else System.out.println("На третий вопрос отвечает : " + answer3);
    }
}