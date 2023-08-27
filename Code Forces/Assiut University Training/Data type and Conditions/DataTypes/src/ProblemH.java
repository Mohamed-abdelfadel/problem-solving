import java.util.Map;
import java.util.Scanner;

public class ProblemH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double n1 = scanner.nextDouble();
        Double n2 = scanner.nextDouble();
        double divResult = n1/n2;
        int floor = (int) Math.floor(divResult);
        int ceil = (int) Math.ceil(divResult);
        int round = (int) Math.round(divResult);

        System.out.println("floor " + n1.intValue() + " / "+  n2.intValue() + " = " + floor);
        System.out.println("ceil " + n1.intValue() + " / "+  n2.intValue() + " = " + ceil);
        System.out.println("round " + n1.intValue() + " / "+  n2.intValue() + " = " + round);

    }
}
