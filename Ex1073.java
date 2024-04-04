package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1073 {

    public Ex1073() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = in.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                double resultado = Math.pow(i, 2);
                System.out.printf("%d^2 = %.0f%n", i, resultado);
            }
        }
        in.close();
    }

    public static void main(String[] args) {
        new Ex1073();
    }
}
