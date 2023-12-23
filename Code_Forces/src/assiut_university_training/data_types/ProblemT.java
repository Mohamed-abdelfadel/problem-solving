package assiut_university_training.data_types;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProblemT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num1 = scanner.nextInt();
        Integer num2 = scanner.nextInt();
        Integer num3 = scanner.nextInt();

        List<Integer> numbers = Arrays.asList(num1, num2, num3);
        numbers.stream().sorted().forEach(System.out::println);
        System.out.println("");
        numbers.stream().forEach(System.out::println);
  }
}
