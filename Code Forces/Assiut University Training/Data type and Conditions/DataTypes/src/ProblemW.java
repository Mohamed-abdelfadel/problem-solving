import java.util.Objects;
import java.util.Scanner;

public class ProblemW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        String expression = scanner.next();
        int num2 = scanner.nextInt();
        String equal = scanner.next();
        int num3 = scanner.nextInt();
        if (Objects.equals(expression, "+")) {
            if ((num1 + num2) == num3) {
                System.out.println("Yes");
            } else {
                System.out.println(num1 + num2);
            }
        } else if (Objects.equals(expression, "-")) {
            if ((num1 - num2) == num3) {
                System.out.println("Yes");
            } else {
                System.out.println(num1 - num2);
            }
        } else if (Objects.equals(expression, "*")) {
            if ((num1 * num2) == num3) {
                System.out.println("Yes");
            } else {
                System.out.println(num1 * num2);
            }
        }
    }
}
