package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1071 {

    public Ex1071() {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int X = in.nextInt();
        System.out.println("Digite outro numero: ");
        int Y = in.nextInt();
        int soma = 0;

        if (X > Y) {
            for (int i = Y + 1; i < X; i++) {
                if (i % 2 != 0) {
                    soma += i;
                } else {
                    for (int c = X + 1; i < Y; i++) {
                        if (i % 2 != 0) {
                            soma += c;
                        }
                    }
                }
            }
        }

        System.out.printf("%d\n", soma);
        in.close();
    }

    public static void main(String[] args) {
        new Ex1071();
    }
}
