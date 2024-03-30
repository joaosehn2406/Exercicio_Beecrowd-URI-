package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1072 {
    public Ex1072() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int dentro = 0, fora = 0;

        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            if (X >= 10 && X <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }

        System.out.println(dentro + " in");
        System.out.println(fora + " out");

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1072();
    }
}
