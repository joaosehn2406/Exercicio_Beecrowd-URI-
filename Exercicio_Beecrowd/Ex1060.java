package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1060 {
    public Ex1060() {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;

        for (int i = 0; i < 6; i++) {
            int valor = scanner.nextInt();
            if (valor > 0) {
                positivos++;
            }
        }

        System.out.println(positivos + " valores positivos");

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1060();
    }
}
