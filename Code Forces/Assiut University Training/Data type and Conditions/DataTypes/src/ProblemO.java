import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProblemO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.next();
        if (expression.contains("-")) {
            List<String> chars = Arrays.stream(expression.split("-")).toList();

            int i = chars.stream().mapToInt(Integer::parseInt).reduce((s1, s2) -> s1 - s2).orElse(0);
            System.out.println(i);
        } else if (expression.contains("+")) {
            List<String> chars = Arrays.stream(expression.split("\\+")).toList();
            int i = chars.stream().mapToInt(Integer::parseInt).reduce(Integer::sum).orElse(0);
            System.out.println(i);
        } else if (expression.contains("/")) {
            List<String> chars = Arrays.stream(expression.split("/")).toList();
            int i = chars.stream().mapToInt(Integer::parseInt).reduce((s1, s2) -> s1 / s2).orElse(0);
            System.out.println(i);
        } else {
            List<String> chars = Arrays.stream(expression.split("\\*")).toList();
            int i = chars.stream().mapToInt(Integer::parseInt).reduce((s1, s2) -> s1 * s2).orElse(0);
            System.out.println(i);
        }


    }
}