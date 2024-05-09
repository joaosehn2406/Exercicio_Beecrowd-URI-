package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1153 {

    public Ex1153() {

        Scanner in = new Scanner(System.in);

        
        int numero = in.nextInt(); // 3
        int num = numero - 1; // 3
        if (numero > 0 && numero < 13) {
            for (int i = numero; 1 < i; i--) {
                numero *= num; 
                num--;
            } 
        }
        System.out.println(numero);
        in.close();

    }

    public static void main(String[] args) {
        new Ex1153();
    }
}
