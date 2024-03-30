package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1115 {

    public Ex1115() {

        Scanner in = new Scanner(System.in);

        int X = 1;
        int Y = 1;

        while (X != 0 && Y != 0) {
            X = in.nextInt();
            Y = in.nextInt();

            if (X > 0 && Y > 0)
                System.out.println("primeiro");
            if (X < 0 && Y > 0)
                System.out.println("segundo");
            if (X < 0 && Y < 0)
                System.out.println("terceiro");
            if (X > 0 && Y < 0)
                System.out.println("quarto");
        }

        in.close();
    }

    public static void main(String[] args) {
        new Ex1115();
    }
}
