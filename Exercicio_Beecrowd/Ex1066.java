package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1066 {
    public Ex1066() {
        Scanner scanner = new Scanner(System.in);

        int pares = 0, impares = 0, positivos = 0, negativos = 0;

        for (int i = 0; i < 5; i++) {
            int valor = scanner.nextInt();

            if (valor % 2 == 0) pares++;
            else impares++;

            if (valor > 0) positivos++;
            else if (valor < 0) negativos++;
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1066();
    }
}
