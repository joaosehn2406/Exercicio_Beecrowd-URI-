package Exercicios_Beecrowd;

import java.util.Scanner;

public class Ex1048 {

    public Ex1048() {

        Scanner in = new Scanner(System.in);

        float salario = in.nextFloat();
        float reajuste = 0;
        int porcent = 0;
        float novoSalario = 0;

        if (salario <= 400) {
            reajuste = salario * 0.15f;
            novoSalario = reajuste + salario;
            porcent = 15;
        } else if (salario <= 800) {
            reajuste = salario * 0.12f;
            novoSalario = reajuste + salario;
            porcent = 12;
        } else if (salario <= 1200) {
            reajuste = salario * 0.1f;
            novoSalario = reajuste + salario;
            porcent = 10;
        } else if (salario <= 2000) {

            reajuste = salario * 0.07f;
            novoSalario = reajuste + salario;
            porcent = 7;
        } else {
            reajuste = salario * 0.04f;
            novoSalario = reajuste + salario;
            porcent = 4;
        }
        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %d %%\n", porcent);
        in.close();
    }

    public static void main(String[] args) {
        new Ex1048();
    }
}
