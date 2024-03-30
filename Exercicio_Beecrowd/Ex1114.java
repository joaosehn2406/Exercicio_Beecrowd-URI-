package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1114 {

    public Ex1114() {

        Scanner in = new Scanner(System.in);

        int senha = in.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = in.nextInt();
            if (senha == 2002) {
                System.out.println("Acesso Permitido");
            }
        }

        in.close();
    }

    public static void main(String[] args) {
        new Ex1114();
    }
}
