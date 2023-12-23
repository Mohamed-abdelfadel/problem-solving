package assiut_university_training.data_types;

import java.util.Scanner;

public class ProblemF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long firstNumber = scanner.nextLong();
        long secondNumber = scanner.nextLong();
        String s1 = Long.toString(firstNumber);
        String s2 = Long.toString(secondNumber);

        char lastNumber1 = s1.charAt(s1.length() - 1);
        char lastNumber2 = s2.charAt(s2.length()-1);

        System.out.println(Character.getNumericValue(lastNumber1)+Character.getNumericValue(lastNumber2));;
    }
}
