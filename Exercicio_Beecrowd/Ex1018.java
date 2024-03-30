package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1018 {
    public Ex1018() {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();
        int notas[] = {100, 50, 20, 10, 5, 2, 1};

        System.out.println(valor);

        for (int nota : notas) {
            int quantidadeNotas = valor / nota;
            valor %= nota;
            System.out.printf("%d nota(s) de R$ %d,00\n", quantidadeNotas, nota);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1018();
    }
}
