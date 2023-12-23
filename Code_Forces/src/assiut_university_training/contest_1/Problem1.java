package assiut_university_training.contest_1;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double discount = scanner.nextDouble();
        double priceAfter = scanner.nextDouble();

        double result = priceAfter/(1 - (discount / 100));
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        System.out.println(decimalFormat.format(result));

    }
}
