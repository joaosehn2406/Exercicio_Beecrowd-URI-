package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1035 {
    public Ex1035() {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1035();
    }
}
