package assiut_university_training.data_types;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double number = scanner.nextDouble();
        if (number.compareTo((double) number.intValue()) == 0 ){
            System.out.println("int " + number.intValue());
        }
        else {
            DecimalFormat decimalFormat = new DecimalFormat("0.000");
            double afterDecimals = (number - number.intValue());
            int num = number.intValue();
            System.out.println("float " + num  + " " +  decimalFormat.format(afterDecimals));

        }

    }
}
