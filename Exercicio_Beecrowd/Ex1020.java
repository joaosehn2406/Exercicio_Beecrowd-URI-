package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1020 {
    public Ex1020() {
        Scanner scanner = new Scanner(System.in);

        int idadeDias = scanner.nextInt();

        int anos = idadeDias / 365;
        idadeDias %= 365;

        int meses = idadeDias / 30;
        idadeDias %= 30;

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, idadeDias);

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1020();
    }
}
