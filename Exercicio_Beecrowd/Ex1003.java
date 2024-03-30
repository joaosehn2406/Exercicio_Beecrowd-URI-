package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1003 {
    public Ex1003() {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1003();
    }
}
