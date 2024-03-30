package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1002 {
    public Ex1002() {
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();

        double area = 3.14159 * raio * raio;

        System.out.printf("A=%.4f\n", area);

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1002();
    }
}
