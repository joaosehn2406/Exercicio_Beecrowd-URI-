package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1017 {
    public Ex1017() {
        Scanner scanner = new Scanner(System.in);

        int tempoViagem = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();

        double distancia = tempoViagem * velocidadeMedia;
        double litrosNecessarios = distancia / 12.0;

        System.out.printf("%.3f\n", litrosNecessarios);

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1017();
    }
}
