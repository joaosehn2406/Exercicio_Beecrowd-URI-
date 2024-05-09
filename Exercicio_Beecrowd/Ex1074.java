package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1074 {

    public Ex1074() {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a quantidade de vezes: ");
        int N = in.nextInt();

        int numero = 0;

        calc(N, numero, in);

        in.close();

    }

    public static void calc(int N, int x, Scanner scanner) {

        for (int i = 0; i < N; i++) {

            x = scanner.nextInt();

            if (x > 0) {
                if (x % 2 == 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("ODD POSITIVE");
                }
            } else if (x < 0) {
                if (x % 2 == 0) {
                    System.out.println("EVEN NEGATIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }
            if (x == 0) {
                System.out.println("NULL");
            }
        }
    }

    public static void main(String[] args) {
        new Ex1074();
    }
}
