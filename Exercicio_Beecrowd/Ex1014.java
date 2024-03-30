package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1014 {
    public Ex1014() {
        Scanner scanner = new Scanner(System.in);

        int distanciaTotal = scanner.nextInt();
        double combustivelGasto = scanner.nextDouble();

        double consumoMedio = distanciaTotal / combustivelGasto;

        System.out.printf("%.3f km/l\n", consumoMedio);

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1014();
    }
}
