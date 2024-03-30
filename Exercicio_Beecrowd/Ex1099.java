package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1099 {
    public Ex1099() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int somaImpares = 0;

            for (int j = Math.min(X, Y) + 1; j < Math.max(X, Y); j++) {
                if (j % 2 != 0) {
                    somaImpares += j;
                }
            }

            System.out.println(somaImpares);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1099();
    }
}
