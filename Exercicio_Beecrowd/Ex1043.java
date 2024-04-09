package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1043 {

    public Ex1043(){

        Scanner in = new Scanner(System.in);

        float A = in.nextFloat();
        float B = in.nextFloat();
        float C = in.nextFloat();

        if( A < B + C && B < A + C && C < A + B) {
            float perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            float area = (B + A ) * C / 2;
            System.out.printf("Area = %.1f\n", area);
        }

        in.close();
    }

    
    
    public static void main(String[] args) {
        new Ex1043();
    }
}