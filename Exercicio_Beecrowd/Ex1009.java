package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1009 {
    public Ex1009() {
        Scanner scanner = new Scanner(System.in);

        String nomeVendedor = scanner.nextLine();
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();

        double comissao = totalVendas * 0.15;
        double salarioTotal = salarioFixo + comissao;

        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1009();
    }
}
