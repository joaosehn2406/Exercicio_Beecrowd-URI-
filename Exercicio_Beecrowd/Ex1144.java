package Exercicios_Beecrowd;

import java.util.Scanner;

public class Ex1144 {
    
    public Ex1144(){

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for( int i = 1; i <= N; i++) {

            double num1 = Math.pow(i, 2);
            double num2 = Math.pow(i, 3);
            System.out.printf("%d %.0f %.0f\n", i ,num1 , num2);
            System.out.printf("%d %.0f %.0f\n", i, num1 + 1, num2 + 1);

        }
        in.close();
    }

    
    
    public static void main(String[] args) {
        new Ex1144();
    }
}
