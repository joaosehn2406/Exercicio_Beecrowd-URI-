package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1013 {
    public Ex1013() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.printf("%d eh o maior\n", maior);

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1013();
    }
}
