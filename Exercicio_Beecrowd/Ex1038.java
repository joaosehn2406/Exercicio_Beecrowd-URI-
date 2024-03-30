package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1038 {
    public Ex1038() {
        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();

        double preco;

        switch (codigo) {
            case 1:
                preco = 4.00;
                break;
            case 2:
                preco = 4.50;
                break;
            case 3:
                preco = 5.00;
                break;
            case 4:
                preco = 2.00;
                break;
            case 5:
                preco = 1.50;
                break;
            default:
                preco = 0;
                break;
        }

        double total = preco * quantidade;

        System.out.printf("Total: R$ %.2f\n", total);

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1038();
    }
}
