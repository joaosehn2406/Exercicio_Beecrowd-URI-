package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1001 {
    
    public Ex1001() {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int X = A + B;

        System.out.println("X = " + X);

        scanner.close();
    }

    public static void main(String[] args) {
        new Ex1001();
    }
}
