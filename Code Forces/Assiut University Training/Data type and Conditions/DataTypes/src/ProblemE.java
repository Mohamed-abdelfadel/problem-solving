import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double pi = 3.141592653;
        Double area = r * r * pi;
        DecimalFormat decimalFormat = new DecimalFormat("#.000000000");
        System.out.println(decimalFormat.format(area));
    }
}