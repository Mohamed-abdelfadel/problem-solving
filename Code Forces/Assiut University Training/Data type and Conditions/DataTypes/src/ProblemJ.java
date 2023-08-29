import java.util.Scanner;

public class ProblemJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();

        double result1 = number1/number2;
        double result2 = number2/number1;

        if ((int) result1 == result1 || (int) result2 == result2){
            System.out.println("Multiples");
        }
        else {
            System.out.println("No Multiples");
        }
    }
}
