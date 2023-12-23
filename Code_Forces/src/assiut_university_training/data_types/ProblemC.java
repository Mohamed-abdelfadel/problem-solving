package assiut_university_training.data_types;

import java.util.Scanner;

public class ProblemC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long firstNumber = scanner.nextLong();
        Long secondNumber = scanner.nextLong();
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber+secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber*secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber- secondNumber));

    }
}