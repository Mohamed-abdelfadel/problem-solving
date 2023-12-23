package assiut_university_training.data_types;

import java.util.Scanner;

public class ProblemI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number1 = scanner.nextInt();
        Integer number2 = scanner.nextInt();

        String result = number1 >= number2 ? "Yes" : "No";
        System.out.println(result);
    }
}
