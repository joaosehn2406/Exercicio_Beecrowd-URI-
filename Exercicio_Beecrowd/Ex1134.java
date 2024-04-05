package Exercicio_Beecrowd;

import java.util.Scanner;

public class Ex1134 {

    public Ex1134() {

        Scanner in = new Scanner(System.in);
        
        int escolha = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (escolha != 4) {
            System.out.println("Digite um numero: ");
            escolha = in.nextInt();
            if (escolha == 1) {
                alcool++;
            }
            if (escolha == 2) {
                gasolina++;
            }
            if (escolha == 3) {
                diesel++;
            }
           
        }
        System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", alcool, gasolina, diesel);
        in.close();
    }

    public static void main(String[] args) {
        new Ex1134();
    }
}
