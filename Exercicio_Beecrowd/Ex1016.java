package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1016 {
    public Ex1016() {
        Scanner scanner = new Scanner(System.in);

        int distancia = scanner.nextInt();

        int tempo = distancia * 2;

        System.out.printf("%d minutos\n", tempo);

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1016();
    }
}
