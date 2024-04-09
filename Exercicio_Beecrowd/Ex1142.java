package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1142 {
    
    public Ex1142(){

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int contador = 1;
        int contador2 = 2;
        int contador3 = 3;

        for( int i = 0; i < N; i++) {
           
           System.out.printf("%d %d %d PUM%n", contador, contador2, contador3);

           contador += 4;
           contador2 += 4;
           contador3 += 4;
           
        }

        in.close();
    }

    
    
    public static void main(String[] args) {
        new Ex1142();
    }
}
