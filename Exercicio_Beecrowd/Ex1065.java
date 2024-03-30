package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1065 {
    public Ex1065() {
        Scanner scanner = new Scanner(System.in);

        int pares = 0;

        for (int i = 0; i < 5; i++) {
            int valor = scanner.nextInt();
            if (valor % 2 == 0) {
                pares++;
            }
        }

        System.out.println(pares + " valores pares");

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1065();
    }
}
