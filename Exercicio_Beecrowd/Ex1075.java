package Exercicios_Beecrowd;

import java.util.Scanner;

public class Ex1075 {

    public Ex1075() {

        Scanner in = new Scanner(System.in);

        
        int N = in.nextInt();

        calc(N);

        in.close();
    }

    public static void calc(int x) {

        for (int i = 1; i < 10000; i++) {
            if (i % x == 2) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        new Ex1075();
    }
}
