package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1079 {
    public Ex1079() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            double valor1 = scanner.nextDouble();
            double valor2 = scanner.nextDouble();
            double valor3 = scanner.nextDouble();

            double mediaPonderada = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10;

            System.out.printf("%.1f\n", mediaPonderada);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1079();
    }
}
