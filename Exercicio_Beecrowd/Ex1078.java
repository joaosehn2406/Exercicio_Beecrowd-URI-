package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1078 {
    public Ex1078() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", i, N, i * N);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1078();
    }
}
