import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();
        Long inputLong = scanner.nextLong();
        char inputChar = scanner.next().charAt(0);
        Float inputFloat = scanner.nextFloat();
        Double inputDouble = scanner.nextDouble();

        System.out.println(inputInt);
        System.out.println(inputLong);
        System.out.println(inputChar);
        System.out.println(inputFloat);
        System.out.println(inputDouble);

    }
}