package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1008 {
    public Ex1008() {
        Scanner scanner = new Scanner(System.in);

        int numeroFuncionario = scanner.nextInt();
        int horasTrabalhadas = scanner.nextInt();
        double valorPorHora = scanner.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.printf("NUMBER = %d\nSALARY = $ %.2f\n", numeroFuncionario, salario);

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1008();
    }
}
