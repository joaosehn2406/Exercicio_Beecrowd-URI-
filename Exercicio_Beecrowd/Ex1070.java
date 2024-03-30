package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1070 {
    public Ex1070() {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int contador = 0;

        while (contador < 6) {
            if (X % 2 != 0) {
                System.out.println(X);
                contador++;
            }
            X++;
        }

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1070();
    }
}
