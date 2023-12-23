package assiut_university_training.data_types;

import java.util.Scanner;

public class ProblemR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ageInput = scanner.nextDouble();

        double ageInYears =  ageInput/365;
        double yearsReminded =  ageInput%365;
        System.out.println((int) ageInYears + " years");

        double ageInMonths =  yearsReminded/30;
        System.out.println((int) ageInMonths + " months");

        double daysReminder = yearsReminded%30;
        System.out.println((int) daysReminder + " days");
    }
}
