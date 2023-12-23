package assiut_university_training.data_types;

import java.util.Scanner;

public class ProblemQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double x = scanner.nextDouble();
        Double y = scanner.nextDouble();

        if (x>0 && y>0 ){
            System.out.println("Q1");
        }
        else if (x<0 && y>0){
            System.out.println("Q2");
        }
        else if (x<0 && y<0){
            System.out.println("Q3");
        }
        else if (x>0 && y<0){
            System.out.println("Q4");
        } else if (x==0 && y!=0) {
            System.out.println("Eixo Y");
        }
        else if (x!=0 && y==0){
            System.out.println("Eixo X");
        }
        else {
            System.out.println("Origem");
        }
    }
}
