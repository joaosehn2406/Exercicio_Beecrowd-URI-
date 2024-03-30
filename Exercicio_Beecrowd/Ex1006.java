package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1006 {
    public Ex1006() {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double MEDIA = (A * 2 + B * 3 + C * 5) / 10.0;

        System.out.printf("MEDIA = %.1f\n", MEDIA);

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1006();
    }
}
