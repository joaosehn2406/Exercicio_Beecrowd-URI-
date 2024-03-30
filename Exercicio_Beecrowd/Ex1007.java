package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1007 {
    public Ex1007() {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int diferenca = (A * B - C * D);

        System.out.println("DIFERENCA = " + diferenca);

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1007();
    }
}
