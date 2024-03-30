package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1011 {
    public Ex1011() {
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();
        double pi = 3.14159;

        double volume = (4.0 / 3) * pi * Math.pow(raio, 3);

        System.out.printf("VOLUME: %.3f\n", volume);

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1011();
    }
}
