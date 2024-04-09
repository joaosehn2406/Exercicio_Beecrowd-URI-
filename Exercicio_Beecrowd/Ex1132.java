package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1132 {

    public Ex1132() {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        int soma = 0;

        if (x > y) {
            for (int i = y; i <= x; i++) {
                if (i % 13 != 0) {
                    soma += i;
                }

            }
        } else {
            for (int i = x; i <= y; i++) {
                if (i % 13 != 0) {
                    soma += i;
                }
            }
        }
        System.out.println(soma);
        in.close();
    }

    public static void main(String[] args) {
        new Ex1132();
    }
}
