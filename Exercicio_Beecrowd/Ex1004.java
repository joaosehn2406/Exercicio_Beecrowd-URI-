package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1004 {
    public Ex1004() {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int PROD = A * B;

        System.out.println("PROD = " + PROD);

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1004();
    }
}
