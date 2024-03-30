package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1019 {
    public Ex1019() {
        Scanner scanner = new Scanner(System.in);

        int segundos = scanner.nextInt();

        int horas = segundos / 3600;
        segundos %= 3600;

        int minutos = segundos / 60;
        segundos %= 60;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1019();
    }
}
