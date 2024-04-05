package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1117 {

    public Ex1117() {

        Scanner in = new Scanner(System.in);

        float nota1 = in.nextFloat(); // 5
        float nota2 = in.nextFloat(); // 1
        float calculo = (nota1 + nota2) / 2;

        if (nota1 <= 10 && nota1 >= 0 && nota2 <= 10 && nota2 >= 0) {
            System.out.printf("media = %.2f%n", calculo);
        } else {
            while (nota1 < 0 || nota1 > 10) {
                System.out.println("nota invalida");
                nota1 = in.nextFloat();
                if (nota1 >= 0 && nota1 <= 10) {
                    calculo = (nota1 + nota2) / 2;
                    System.out.printf("media = %.2f%n", calculo);
                   
                }
                while (nota2 < 0 || nota2 > 10) {
                    System.out.println("nota invalida");
                    nota2 = in.nextFloat();
                    if (nota2 >= 0 && nota2 <= 10) {
                        calculo = (nota1 + nota2) / 2;
                        System.out.printf("media = %.2f%n", calculo);
                    }
                }
            }

        }
        in.close();
    }

    public static void main(String[] args) {
        new Ex1117();
    }
}
