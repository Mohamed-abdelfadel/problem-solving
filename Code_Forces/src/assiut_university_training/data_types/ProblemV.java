package assiut_university_training.data_types;

import java.util.Objects;
import java.util.Scanner;

public class ProblemV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double num1 = scanner.nextDouble();
        String expression = scanner.next();
        Double num2 = scanner.nextDouble();
        if (Objects.equals(expression, ">") && num1 > num2){
            System.out.println("Right");
        }
        else if (Objects.equals(expression, "<") && num1 < num2){
            System.out.println("Right");
        }
        else if (Objects.equals(expression, "=") && num1.equals(num2)){
            System.out.println("Right");
        }
        else {
            System.out.println("Wrong");
        }
    }
}
