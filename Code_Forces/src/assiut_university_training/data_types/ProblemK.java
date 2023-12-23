package assiut_university_training.data_types;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProblemK {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Integer num1 = scanner.nextInt();
        Integer num2 = scanner.nextInt();
        Integer num3 = scanner.nextInt();

        List<Integer> numbers = Arrays.asList(num1, num2, num3);
        Integer greatestNumber = numbers.stream().max(Integer::compareTo).get();
        Integer smallestNumber = numbers.stream().min(Integer::compareTo).get();

        System.out.println(smallestNumber + " " + greatestNumber);
    }

}
