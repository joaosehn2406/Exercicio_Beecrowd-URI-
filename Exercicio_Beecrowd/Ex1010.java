package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1010 {
    public Ex1010() {
        Scanner scanner = new Scanner(System.in);

        int codigoPeca1 = scanner.nextInt();
        int numeroPecas1 = scanner.nextInt();
        double valorUnitario1 = scanner.nextDouble();

        int codigoPeca2 = scanner.nextInt();
        int numeroPecas2 = scanner.nextInt();
        double valorUnitario2 = scanner.nextDouble();

        double totalPagar = (numeroPecas1 * valorUnitario1) + (numeroPecas2 * valorUnitario2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalPagar);

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1010();
    }
}

