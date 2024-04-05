package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1067 {

    public Ex1067() {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt(); // 8

        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d\n", i);
            }
        }

        in.close();
    }

    public static void main(String[] args) {
        new Ex1067();
    }
}
