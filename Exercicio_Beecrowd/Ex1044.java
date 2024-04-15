package Exercicios_Beecrowd;

import java.util.Scanner;

public class Ex1044 {

    public Ex1044() {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        if (B % A == 0 || A % B == 0 ) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        in.close();
    }

    public static void main(String[] args) {
        new Ex1044();
    }
}
