package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1113 {

    public Ex1113() {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        while (x != y) {
    		if (x > y) System.out.println("Decrescente");
    		else System.out.println("Crescente");
        	x = in.nextInt();
        	y = in.nextInt();
    	}

        in.close();
    }

    public static void main(String[] args) {
        new Ex1113();
    }
}
