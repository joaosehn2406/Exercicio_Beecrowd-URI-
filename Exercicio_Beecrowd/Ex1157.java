package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1157 {

    public Ex1157() {

        Scanner in = new Scanner(System.in);

        int numero = in.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }

        in.close();
    }

    public static void main(String[] args) {
        new Ex1157();
    }
}
